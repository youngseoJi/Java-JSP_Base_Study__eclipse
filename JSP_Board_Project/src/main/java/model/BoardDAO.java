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
	Connection conn = null;
	// 데이터 베이스에서 쿼리를 실행시켜주는 객체
	PreparedStatement pstmt = null;
	// 데이터베이스의 테이블의 결과를 리턴받아 자바에 저장해주는 객체
	ResultSet rs = null;

	// 데이터 베이스의 커넥션풀을 사용하도록 설정하는 메소드
	public void getConnection() {

		try {
			// JNDI 초기 컨텍스트를 얻는다.
			Context initCtx = new InitialContext();

			// 톰캣 서버에 정보를 담아놓은 곳으로 이동
			Context envCtx = (Context) initCtx.lookup("java:comp/env");

			// 데이터 소스 객체 선언
			DataSource ds = (DataSource) envCtx.lookup("jdbc/pool");

			// 데이터 소스를 기준으로 커넥션을 연결하기
			conn = ds.getConnection();

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
			pstmt = conn.prepareStatement(refSql);
			rs = pstmt.executeQuery();

			if (rs.next()) { // 결과값이 있다
				ref = rs.getInt(1) + 1; // 최대값에 +1을 더해서 글그룹을 설정한다.
			}

			// 실제로 게시글 전체값을 테이블에 저장
			/**
			 * 자동 설정되는 필드값 설정 num : board_seq.NEXTVAL 각 게시글에 고유한 번호를 부여하는데 사용 / 시퀀스는
			 * 데이터베이스에서 자동으로 증가하는 숫자를 생성하는데 사용 read_data: sysdate 게시글이 데이터베이스에 삽입되는 순간의 시간을
			 * 자동으로 기록 현재 시스템에 저장된 시간의 값 / 데이터베이스 서버의 현재 날짜와 시간을 반환 read_count : 새 게시글의 조회수는
			 * 0으로 초기화 / 게시글이 처음 작성되었을 때 아직 조회되지 않았다는 의미
			 */
			String sql = "insert into board (num, writer, email, title, password, reg_date, ref, re_step, re_level, read_count, content) "
					+ "values (board_seq.NEXTVAL, ?, ?, ?, ?, sysdate, ?, ?, ?, 0, ?)";

			pstmt = conn.prepareStatement(sql);

			pstmt.setString(1, boardBean.getWriter());
			pstmt.setString(2, boardBean.getEmail());
			pstmt.setString(3, boardBean.getTitle());
			pstmt.setString(4, boardBean.getPassword());
			pstmt.setInt(5, ref);
			pstmt.setInt(6, reStep);
			pstmt.setInt(7, reLevel);
			pstmt.setString(8, boardBean.getContent());

			// 쿼리실행
			pstmt.executeUpdate();
			// 자원반납
			conn.close();

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
			pstmt = conn.prepareStatement(sql);

			// 쿼리 실행 후 결과 저장
			rs = pstmt.executeQuery();

			// 반복문을 이용하여 데이터를 추출 : 데이터가 몇개인지 모르기 때문에
			while (rs.next()) {
				// 데이터 패키징 (BoardBean 클래스 이용)
				BoardBean boardBean = new BoardBean();
				boardBean.setNum(rs.getInt(1));
				boardBean.setWriter(rs.getString(2));
				boardBean.setEmail(rs.getString(3));
				boardBean.setTitle(rs.getString(4));
				boardBean.setPassword(rs.getString(5));
				boardBean.setReg_date(rs.getDate(6).toString());
				boardBean.setRef(rs.getInt(7));
				boardBean.setRe_step(rs.getInt(8));
				boardBean.setRe_level(rs.getInt(9));
				boardBean.setRead_count(rs.getInt(10));
				boardBean.setContent(rs.getString(11));

				// 패키징한 데이터 백터에 저장
				boardList.add(boardBean);
			}
			conn.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return boardList;
	}

	// 특정 게시물 조회하기
	public BoardBean getOneBoard(int num) {
		// 리턴 타입 선언 / 결과를 저장할 BoardBean 객체 생성
		BoardBean board = new BoardBean();
		getConnection();

		try {
			// 조회수 증가 쿼리 : 게시글을 클릭하면 조회수가 +1 씩증가한다. 
			String readCountSql = "update board set read_count = read_count+1 where num=?";
			
			pstmt = conn.prepareStatement(readCountSql);
			pstmt.setInt(1, num);
			
			pstmt.executeUpdate();
			
			
			// 특정 게시글 조회 쿼리 : 번호 num인 특정 게시글 1개를 조회
			String readSql = "select * from board where num=?";

			// 쿼리 실행 객체
			pstmt = conn.prepareStatement(readSql);
			pstmt.setInt(1, num);

			// 쿼리 실행 결과 리턴
			rs = pstmt.executeQuery();

			if (rs.next()) {
				board.setNum(rs.getInt(1));
				board.setWriter(rs.getString(2));
				board.setEmail(rs.getString(3));
				board.setTitle(rs.getString(4));
				board.setPassword(rs.getString(5));
				board.setReg_date(rs.getDate(6).toString());
				board.setRef(rs.getInt(7));
				board.setRe_step(rs.getInt(8));
				board.setRe_level(rs.getInt(9));
				board.setRead_count(rs.getInt(10));
				board.setContent(rs.getString(11));
			}
			conn.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}

		// 조회한 게시물 정보가 담긴 BoardBean 객체 반환
		return board;
	}
}
