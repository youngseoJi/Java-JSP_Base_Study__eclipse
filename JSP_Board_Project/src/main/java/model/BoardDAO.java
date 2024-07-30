package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

public class BoardDAO {

	// 데이터베이스에 접근할 수 있도록 설정
	Connection con;
	// 데이터 베이스에서 쿼리를 실행시켜주는 객체
	PreparedStatement pstmt;
	// 데이터베이스의 테이블의 결과를 리턴받아 자바에 저장해주는 객체
	ResultSet rs;

	// 데이터 베이스의 커넷션풀을 사용하도록 설정하는 메소드

	public void getCon() {

		try {
			 // JNDI 초기 컨텍스트를 얻는다.
            Context initctx = new InitialContext();
            
            // 톰캣 서버에 정보를 담아놓은 곳으로 이동
            Context envctx = (Context) initctx.lookup("java:comp/env");
            
            // 데이터 소스 객체 선언
            DataSource ds = (DataSource) envctx.lookup("jdbc/pool");
            
            // 데이터 소스를 기준으로 커넥션을 연결하기
			con = ds.getConnection();

		} catch (Exception e) {
            System.out.println("DB 연결 실패: " + e.getMessage());

			e.printStackTrace();
		}
	}
	
	// 새로운 게시글 생성하기 (저장하기)
	// 입력폼에 입력한 게시글 데이터 저장하기
	
	public void insertBoard(BoardBean bean) {
		
		getCon();
		
		// 빈클래스에 넘어오지 않았던 데이터 초기화 작업
		int ref=0; // 글그룹 : 쿼리를 실행시켜서 가장큰 ref 값을 갖고와 ref+1을 더해줘야함.
		int re_step=1; // 새글 : 부모글
		int re_level=1;
	
		
		try {
//			가장큰 ref 값 갖고오는 쿼리 
			String refsql ="select max(ref) from board";
			
			// 쿼리 실행 후 결과 리턴하기
			pstmt = con.prepareStatement(refsql);
			rs = pstmt.executeQuery();
			
			if(rs.next()) {// 결과값이 있다
				ref  = rs.getInt(1)+1; // 최대값에 +1을 더해서 글그룹을 설정한다.
			}
			
			// 실제로 게시글 전체값을 테이블에 저장 

			
			/** 자동 설정되는 필드값 설정
			 * num : board_seq.NEXTVA 각 게시글에 고유한 번호를 부여하는데 사용 / 시퀀스는 데이터베이스에서 자동으로 증가하는 숫자를 생성하는데 사용
			 * read_data: systata 게시글이 데이터베이스에 삽입되는 순간의 시간을 자동으로 기록 현재 시스템에 저장된 시간의 값 / 데이터베이스 서버의 현재 날짜와 시간을 반환
			 * read_count : 새 게시글의 조회수는 0으로 초기화 / 게시글이 처음 작성되었을 때 아직 조회되지 않았다는 의미
			 * */
		
			String sql = "insert into board (num, writer, email, title, password, reg_date, ref, re_step, re_level, read_count, content) "
						+ "values (board_seq.NEXTVAL, ?, ?, ?, ?, sysdate, ?, ?, ?, 0, ?)";

			
			
			pstmt = con.prepareStatement(sql);
			
			pstmt.setString(1, bean.getWriter());
			pstmt.setString(2, bean.getEmail());
			pstmt.setString(3, bean.getTitle());
			pstmt.setString(4, bean.getPassword());
			pstmt.setInt(5, ref);
			pstmt.setInt(6, re_step);
			pstmt.setInt(7, re_level);
			pstmt.setString(8, bean.getContent());
	
			//쿼리실행
			pstmt.executeUpdate();
			// 자원반납
			con.close();
			
		} catch (Exception e) {
			   System.out.println("데이터베이스 삽입 에러: " + e.getMessage());
		          
			e.printStackTrace();
			
		}
}

}
