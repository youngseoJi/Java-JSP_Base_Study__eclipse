package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Vector;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

public class BoardDAO {

    // 데이터베이스에 접근할 수 있도록 설정
    Connection connection = null;
    // 데이터 베이스에서 쿼리를 실행시켜주는 객체
    PreparedStatement preparedStatement = null;
    // 데이터베이스의 테이블의 결과를 리턴받아 자바에 저장해주는 객체
    ResultSet resultSet = null;

    // 데이터 베이스의 커넷션풀을 사용하도록 설정하는 메소드
    public void getConnection() {

        try {
            // JNDI 초기 컨텍스트를 얻는다.
            Context initContext = new InitialContext();

            // 톰캣 서버에 정보를 담아놓은 곳으로 이동
            Context envContext = (Context) initContext.lookup("java:comp/env");

            // 데이터 소스 객체 선언
            DataSource dataSource = (DataSource) envContext.lookup("jdbc/pool");

            // 데이터 소스를 기준으로 커넥션을 연결하기
            connection = dataSource.getConnection();

        } catch (Exception e) {
            System.out.println("DB 연결 실패: " + e.getMessage());
            e.printStackTrace();
        }
    }

    // 새로운 게시글 생성하기 (저장하기)
    // 입력폼에 입력한 게시글 데이터 저장하기
    public void insertBoard(BoardBean boardBean) {

        getConnection();

        // 빈클래스에 넘어오지 않았던 데이터 초기화 작업
        int ref = 0; // 글그룹 : 쿼리를 실행시켜서 가장큰 ref 값을 갖고와 ref+1을 더해줘야함.
        int reStep = 1; // 새글 : 부모글
        int reLevel = 1;

        try {
            // 가장큰 ref 값 갖고오는 쿼리 
            String refSql = "select max(ref) from board";

            // 쿼리 실행 후 결과 리턴하기
            preparedStatement = connection.prepareStatement(refSql);
            resultSet = preparedStatement.executeQuery();

            if (resultSet.next()) { // 결과값이 있다
                ref = resultSet.getInt(1) + 1; // 최대값에 +1을 더해서 글그룹을 설정한다.
            }

            // 실제로 게시글 전체값을 테이블에 저장 
            /** 자동 설정되는 필드값 설정
             * num : board_seq.NEXTVAL 각 게시글에 고유한 번호를 부여하는데 사용 / 시퀀스는 데이터베이스에서 자동으로 증가하는 숫자를 생성하는데 사용
             * read_data: systata 게시글이 데이터베이스에 삽입되는 순간의 시간을 자동으로 기록 현재 시스템에 저장된 시간의 값 / 데이터베이스 서버의 현재 날짜와 시간을 반환
             * read_count : 새 게시글의 조회수는 0으로 초기화 / 게시글이 처음 작성되었을 때 아직 조회되지 않았다는 의미
             * */
            String sql = "insert into board (num, writer, email, title, password, reg_date, ref, re_step, re_level, read_count, content) "
                    + "values (board_seq.NEXTVAL, ?, ?, ?, ?, sysdate, ?, ?, ?, 0, ?)";

            preparedStatement = connection.prepareStatement(sql);

            preparedStatement.setString(1, boardBean.getWriter());
            preparedStatement.setString(2, boardBean.getEmail());
            preparedStatement.setString(3, boardBean.getTitle());
            preparedStatement.setString(4, boardBean.getPassword());
            preparedStatement.setInt(5, ref);
            preparedStatement.setInt(6, reStep);
            preparedStatement.setInt(7, reLevel);
            preparedStatement.setString(8, boardBean.getContent());

            //쿼리실행
            preparedStatement.executeUpdate();
            // 자원반납
            connection.close();

        } catch (Exception e) {
            System.out.println("데이터베이스 삽입 에러: " + e.getMessage());
            e.printStackTrace();
        }
    }

    // 모든 게시글 조회하기 
    public Vector<BoardBean> getAllBoard() {
        // BoardBean 타입의 객체들을 저장할 Vector 타입 인스턴스를 생성합니다.
        Vector<BoardBean> boardList = new Vector<>();
        getConnection();

        try {
            // 쿼리 준비 : 
            String sql = "select * from board order by ref desc, re_step asc";

            // 쿼리 실행할 객체 선언
            preparedStatement = connection.prepareStatement(sql);

            // 쿼리 실행 후 결과 저장
            resultSet = preparedStatement.executeQuery();

            // 반복분을 이용하여 데이터를 추출 : 데이터가 몇개인지 모르기떄문 
            while (resultSet.next()) {
                // 데이터 패키징 (BoardBean 클래스이용)
                BoardBean boardBean = new BoardBean();
                boardBean.setNum(resultSet.getInt(1));
                boardBean.setWriter(resultSet.getString(2));
                boardBean.setEmail(resultSet.getString(3));
                boardBean.setTitle(resultSet.getString(4));
                boardBean.setPassword(resultSet.getString(5));
                boardBean.setReg_date(resultSet.getDate(6).toString());
                boardBean.setRef(resultSet.getInt(7));
                boardBean.setRe_step(resultSet.getInt(8));
                boardBean.setRe_level(resultSet.getInt(9));
                boardBean.setRead_count(resultSet.getInt(10));
                boardBean.setContent(resultSet.getString(11));

                // 패키징한 데이터 백터 저
                boardList.add(boardBean);
            }
            connection.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return boardList;
    }
}
