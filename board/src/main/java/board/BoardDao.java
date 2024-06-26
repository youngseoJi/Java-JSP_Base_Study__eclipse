package board;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import common.JdbcUtil;

public class BoardDao {
	private  JdbcUtil ju;
	
	// 삽입 : 데이터베이스에 새로운 게시글을 삽입하는 기능
    public int insert(BoardVo vo) {
    	
    	// 데이터베이스에 연결하기 위해 사용하는 객체
    	Connection con;
    	// PreparedStatement는 SQL 쿼리를 미리 컴파일하고, 실행하기 전에 입력 파라미터를 쉽게 설정할 수 있도록 해주는 기능
    	PreparedStatement pstmt;
    	
    	// 쿼리문  BoardVo 객체를 매개변수로 받아, 전달받는 값으로 셋팅되야 하는 부분 바인딩 변수 ?로 표기 
        String query = "INSERT INTO BOARD (NUM, TITLE, WRITER, CONTENT, REGDATE, CNT) VALUES (BOARD_SEQ.nextval, ?, ?, ?, SYSDATE, 0)";
       int result = -1;
    	try {
    		// 데이터 베이스 커넥션 획
    		con = ju.getConnection();
    		//sql 쿼리 준비
    		pstmt = con.prepareStatement(query);
    		
    		
    		// PreparedStatement를 사용하여 SQL 파라미터 설정
    		// pstmt.setString(index, value) 메서드를 사용하여 각 ? 위치에 적절한 값을 설정
            pstmt.setString(1, vo.getTitle());
            pstmt.setString(2, vo.getWriter());
            pstmt.setString(3, vo.getContent());
            
//          // 쿼리 실행과 결과 반환 -> 새로운 게시글이 성공적으로 삽입되면 result는 1이 됨 (한 행 추)
            result = pstmt.executeUpdate();
    		
    	}catch(SQLException e) {
    		e.printStackTrace();
    		
    	}

        return result;
    	
    } 
	
	// 조회 
	
	// 수정
	
	// 삭제
}
