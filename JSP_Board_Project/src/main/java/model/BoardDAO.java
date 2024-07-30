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
			e.printStackTrace();
		}
	}

}
