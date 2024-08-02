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
	public void insertBoard(BoardBean boardbean) {

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

			pstmt.setString(1, boardbean.getWriter()); // writer
			pstmt.setString(2, boardbean.getEmail()); // email
			pstmt.setString(3, boardbean.getTitle()); // title
			pstmt.setString(4, boardbean.getPassword()); // password
			pstmt.setInt(5, ref);
			pstmt.setInt(6, reStep); // re_step
			pstmt.setInt(7, reLevel); // re_level
			pstmt.setString(8, boardbean.getContent()); // content

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
				boardBean.setNum(rs.getInt("num"));
				boardBean.setWriter(rs.getString("writer"));
				boardBean.setEmail(rs.getString("email"));
				boardBean.setTitle(rs.getString("title"));
				boardBean.setPassword(rs.getString("password"));
				boardBean.setReg_date(rs.getDate("reg_date").toString());
				boardBean.setRef(rs.getInt("ref"));
				boardBean.setRe_step(rs.getInt("re_step"));
				boardBean.setRe_level(rs.getInt("re_level"));
				boardBean.setRead_count(rs.getInt("read_count"));
				boardBean.setContent(rs.getString("content"));

				// 패키징한 데이터 백터에 저장
				boardList.add(boardBean);
			}
			conn.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return boardList;
	}

	// BoardInfo 특정 게시물 조회하기
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
				board.setNum(rs.getInt("num"));
				board.setWriter(rs.getString("writer"));
				board.setEmail(rs.getString("email"));
				board.setTitle(rs.getString("title"));
				board.setPassword(rs.getString("password"));
				board.setReg_date(rs.getDate("reg_date").toString());
				board.setRef(rs.getInt("ref"));
				board.setRe_step(rs.getInt("re_step"));
				board.setRe_level(rs.getInt("re_level"));
				board.setRead_count(rs.getInt("read_count"));
				board.setContent(rs.getString("content"));
			}
			conn.close();

		} catch (Exception e) {
			e.printStackTrace();
		}

		// 조회한 게시물 정보가 담긴 BoardBean 객체 반환
		return board;
	}

	// 답글 생성하기
	public void reWriteBoard(BoardBean boardbean) {
		// 부모 게시글 그룹 글레벨 그스텝을 갖고옴
		int ref = boardbean.getRef();
		int re_step = boardbean.getRe_step();
		int re_level = boardbean.getRe_level();

		getConnection();

		try {
			// 부모 글 보다 큰 re_level의 값을 전부 1씩 증가
			// 조건 동일한 그룹내의 글 이며,현재 level이 현재 _level보다 높은 글만

			// 기존 답글의 re_level을 증가시키기 위해 쿼리 실행
			String levelsql = "upatate board set re_level = re_level+1 where ref=? and re_level > ?";

			pstmt = conn.prepareStatement(levelsql);

			// 새 답글 추가
//			String sql = "insert into board values (board_seq.NEXTVAL, ?, ?, ?, ?, sysdate, ?, ?, ?, 0, ?)";
			String sql = "insert into board (num, writer, email, title, password, reg_date, ref, re_step, re_level, read_count, content) "
					+ "values (board_seq.NEXTVAL, ?, ?, ?, ?, sysdate, ?, ?, ?, 0, ?)";

			pstmt = conn.prepareStatement(sql);

			// ? 값 대입
			pstmt.setString(1, boardbean.getWriter());
			pstmt.setString(2, boardbean.getEmail());
			pstmt.setString(3, boardbean.getTitle());
			pstmt.setString(4, boardbean.getPassword());
			pstmt.setInt(5, boardbean.getRef()); // 부모의 글그룹 ref 값
			pstmt.setInt(6, boardbean.getRe_step() + 1); // 답글의 스텝 값: 부모의 step 값 + 1
			pstmt.setInt(7, boardbean.getRe_level() + 1);// 답글의 레벨 값: 부모의 level 값 + 1
			pstmt.setString(8, boardbean.getContent());

			pstmt.executeUpdate();

			conn.close();

		} catch (Exception e) {
			e.printStackTrace();

		}
	}

	// BoardUpdate/ delete 수정 및 삭제할 특정 게시물 조회하기
	public BoardBean getOneUpdateBoard(int num) {
		// 리턴 타입 선언 / 결과를 저장할 BoardBean 객체 생성
		BoardBean board = new BoardBean();
		getConnection();

		try {
			// 특정 게시글 조회 쿼리 : 번호 num인 특정 게시글 1개를 조회
			String readSql = "select * from board where num=?";

			// 쿼리 실행 객체
			pstmt = conn.prepareStatement(readSql);
			pstmt.setInt(1, num);

			// 쿼리 실행 결과 리턴
			rs = pstmt.executeQuery();

			if (rs.next()) {
				board.setNum(rs.getInt("num"));
				board.setWriter(rs.getString("writer"));
				board.setEmail(rs.getString("email"));
				board.setTitle(rs.getString("title"));
				board.setPassword(rs.getString("password"));
				board.setReg_date(rs.getDate("reg_date").toString());
				board.setRef(rs.getInt("ref"));
				board.setRe_step(rs.getInt("re_step"));
				board.setRe_level(rs.getInt("re_level"));
				board.setRead_count(rs.getInt("read_count"));
				board.setContent(rs.getString("content"));
			}
			conn.close();

		} catch (Exception e) {
			e.printStackTrace();
		}

		// 조회한 게시물 정보가 담긴 BoardBean 객체 반환
		return board;
	}

	// 기존 패스워드 값을 리턴하기
	// 수정 or 삭제할 글의 패스워드 값을 갖고와서 입력한 패스워드와 비교하기위한 것
	public String getCurrentPassword(int num) {

		// 변수 객체 선언 (반환 값)
		String password = "";

		getConnection();

		try {
			// 쿼리 준비 : 수정할 num번 게시글의 비밀번호
			String sql = "select password from board where num=?";

			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, num);
			rs = pstmt.executeQuery();

			// 패스워드
			if (rs.next()) {
				password = rs.getString(1);
			}

			conn.close();

		} catch (Exception e) {
			e.printStackTrace();
		}
		return password;
	}

	// 게시글 수정하기
	public void updateBoard(BoardBean board) {

		getConnection();

		try {
			// 쿼리 : 선택한 num번 게시글의 수정한 항목의 데이터 제목, 내용을 기존 데이터를 수정한다.
			String UpdateSql = "update board set title=?, content=? where num=?";
			pstmt = conn.prepareStatement(UpdateSql);

			// ? 값 대입
			pstmt.setString(1, board.getTitle());
			pstmt.setString(2, board.getContent());
			pstmt.setInt(3, board.getNum());

			pstmt.executeUpdate();

			conn.close();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	
	// 게시글 삭제하기
	
	public void deleteBoard(int num) {
		
		getConnection();
		
		
		try {
			// 쿼리 : num번의 게시글을 삭제한다.
			String deleteSql = "delete from board where num = ?";

			pstmt = conn.prepareStatement(deleteSql);
			
			
			// ?값 대입 
			pstmt.setInt(1, num);
			
			pstmt.executeUpdate();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}
