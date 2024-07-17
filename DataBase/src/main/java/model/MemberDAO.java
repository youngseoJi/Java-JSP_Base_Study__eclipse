package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Vector;

// 오라클 데이터 베이스에 연결하고 select, insert , update, delete 작업을 실행해주는 클래스
public class MemberDAO {

	/* 오라클 접속하는 소스 */
	String id = "system"; // 접속 아이디
	String pass = "pass"; // 비
	String url = "jdbc:oracle:thin:@localhost:1521/xe"; // 접속 url

	// 데이터베이스에 접근할 수 있도록 설정
	Connection con = null;

	// 데이터 베이스에서 쿼리를 실행시켜주는 객체
	PreparedStatement pstmt = null;

	// 데이터베이스의 테이블의 결과를 리턴받아 자바에 저장해주는 객체
	ResultSet rs = null;

	// 데이터 베이스에 접근할 수 있도록 도와주는 메소드
	public Void getCon() {

		try {
			/* 1. 해당 데이터 베이스르 사용한다고 선언 (클래스를 등록 = 오라클용을 사용) */
			Class.forName("oracle.jdbc.driver.OracleDriver");

			/* 2. 해당 데이터 베이스에 접속 */
			con = DriverManager.getConnection(url, id, pass);

		} catch (Exception e) {

		}
		return null;

	}
	
	
	// 데이터 베이스에 한사람의 회원 정보를 저장해주는 메소드
	public void insertMember(MemberBean mbean) {

		  try {
			  getCon();
			  /* 3. 접속 후 쿼리준비하여 쿼리를 사용하도록 설정 */
			 	String sql="insert into member values(?,?,?,?,?,?,?,?)";
			  
			  /* 쿼리를 사용하도록 설정 */
			  pstmt = con.prepareStatement(sql);
			  
			  /* ?에 맞게 데이터를 맵핑 */
			  pstmt.setString(1,mbean.getId());
			  pstmt.setString(2,mbean.getPassword());
			  pstmt.setString(3,mbean.getEmail());
			  pstmt.setString(4,mbean.getTel());
			  pstmt.setString(5,mbean.getHobby());
			  pstmt.setString(6,mbean.getJob());
			  pstmt.setString(7,mbean.getAge());
			  pstmt.setString(8,mbean.getInfo());
			  
			  /* 4. 오라클에서 쿼리를 실행하기 */
			  pstmt.executeUpdate(); /* insert, update, delete 시 사용하는 메소드 */
			  
			  /* 5.자원 반납 */
			  con.close();
			  
		  } catch(Exception e){
			  e.printStackTrace();
		  }
		  
	}
	
	
	// 모든 회원의 정보를 리턴해주는 메소드 
	//return type : Vector<MemberBean> 
	
	public Vector<MemberBean> allSelectMember() {
		
		Vector<MemberBean> v = new Vector<>();
		
		return v;
	}
	
}
