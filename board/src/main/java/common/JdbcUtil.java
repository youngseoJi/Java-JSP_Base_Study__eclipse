package common;

import java.sql.Connection;
import java.sql.SQLException;

import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;


//  이 클래스는 JNDI를 통해 데이터베이스 커넥션 풀을 설정하고, 데이터베이스 연결을 제공하는 기능을 수행함.

public class JdbcUtil {
	
	// 싱글톤 인스턴스
    private static JdbcUtil instance = new JdbcUtil();
    
    // DataSource 객체, 커넥션 풀을 관리
	private static DataSource ds;
	
	
	static {		
		try {
		      // Oracle JDBC 드라이버 클래스를 로드
			Class.forName("oracle.jdbc.OracleDriver");
			System.out.println("드라이버 로딩성");
			
			InitialContext ctx = new InitialContext();	
			//  'java:comp/env/jdbc/myOracle'은 데이터 소스에 대한 경로
			//  해당 경로의 자원을 갖고와서 데이터 소스를 생성한다. (DataSource 으로 타입변경)
			ds = (DataSource)ctx.lookup("java:comp/env/jdbc/myOracle");
			System.out.println("Connection pool 생성!");
	
			
		} catch(ClassNotFoundException e) {
			// 드라이버 클래스를 찾지 못했을 때 에러
			e.printStackTrace();
		} catch(NamingException e) {
			// 조회 실패시 에러
			e.printStackTrace();
		}
	}
	  // private 생성자로 외부에서 인스턴스 생성을 제한
	private JdbcUtil() {}
	
	// 객체가 필요할경우 호출하여 JdbcUtil 인스턴스 반환 	   
	public JdbcUtil getinstance() {
		return instance;
	}
	
//	  커넥션 풀에서 데이터베이스 커넥션을 가져와 반환
	public Connection getConnection() throws SQLException{
		return ds.getConnection(); 
		
	} 
}