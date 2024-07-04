package board;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import common.JdbcUtil;


/**
 * 데이터베이스에 게시판 관련 데이터 접근을 담당하는 DAO 클래스입니다.
 * CRUD (생성, 조회, 수정, 삭제) 기능을 제공하여 데이터베이스 테이블과 상호작용합니다.
 */
public class BoardDao {
	private JdbcUtil ju;
	
	public BoardDao() {
	  ju = JdbcUtil.getinstance();
	} 

	   /**
     * 새로운 게시글을 데이터베이스에 삽입합니다.
     * @param vo 게시글 정보를 담은 BoardVo 객체
     * @return 삽입된 행의 수
     */
	public int insert(BoardVo vo) {

		// 데이터베이스에 연결하기 위해 사용하는 객체
		Connection con = null;
		// PreparedStatement는 SQL 쿼리를 미리 컴파일하고, 실행하기 전에 입력 파라미터를 쉽게 설정할 수 있도록 해주는 기능
		PreparedStatement pstmt = null; 

		// 쿼리문 BoardVo 객체를 매개변수로 받아, 전달받는 값으로 셋팅되야 하는 부분 바인딩 변수 ?로 표기
		String query = "INSERT INTO BOARD (NUM, TITLE, WRITER, CONTENT, REGDATE, CNT) VALUES (BOARD_SEQ.nextval, ?, ?, ?, SYSDATE, 0)";
		int result = -1;
		try {
			// 데이터 베이스 커넥션 획
			con = ju.getConnection();
			// sql 쿼리 준비
			pstmt = con.prepareStatement(query);

			// PreparedStatement를 사용하여 SQL 파라미터 설정
			// pstmt.setString(index, value) 메서드를 사용하여 각 ? 위치에 적절한 값을 설정
			pstmt.setString(1, vo.getTitle());
			pstmt.setString(2, vo.getWriter());
			pstmt.setString(3, vo.getContent());

//          // 쿼리 실행과 결과 반환 -> 새로운 게시글이 성공적으로 삽입되면 result는 1이 됨 (한 행 추)
			result = pstmt.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if(pstmt != null) {
				try {
					pstmt.close();
				} catch(SQLException e) {
					e.printStackTrace();
				}
				
			}
			if (con != null) {
				try {
					con.close(); // Connection 닫기, 커넥션 풀에 반환
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
		return result;

	}

	/**
     * 데이터베이스에서 모든 게시글을 조회합니다.
     * @return 게시글 정보를 담은 BoardVo 객체 리스트4
     */

	public List<BoardVo> selectAll(){
    	Connection con = null;
    	Statement pstmt = null;
    	ResultSet rs =null;
    	
       String query = "SELECT NUM, TITLE, WRITER, CONTENT, REGDATE, CNT FROM BOARD";
    	ArrayList<BoardVo> ls = new ArrayList<BoardVo>();
    	try {
    		con = ju.getConnection();
    		pstmt = con.createStatement();
    		rs = pstmt.executeQuery(query);// 쿼리를 담아 전송
    		
    		
    		// VO 생성 : 전송 결과값을 순서대로 반복하여 BoardVo 에 값을 담아 객체를 만든.
    		 while (rs.next()) {
    		  BoardVo vo =  new BoardVo(
    				  // 자료혀엥 맞춰 꺼내서 담아주
    				  rs.getInt(1),// NUM
    				  rs.getString(2), // TITLE ~
    				  rs.getString(3),
    				  rs.getString(5),
    				  new Date(rs.getDate(5).getTime()),
    				  rs.getInt(6) 
    				  );
    		  //  list 반복적으로 생성 객체를 담는다.
    		  ls.add(vo);
    		 
    		}
    	}catch(SQLException e) {
    		e.printStackTrace();
    	}finally {
			if(rs != null) {
				try {
					rs.close();
				} catch(SQLException e) {
					e.printStackTrace();
				}
				
			}
			if(pstmt != null) {
				try {
					pstmt.close();
				} catch(SQLException e) {
					e.printStackTrace();
				}
				
			}
			if (con != null) {
				try {
					con.close(); // Connection 닫기, 커넥션 풀에 반환
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
    	}
    	return ls;
    }
	
	/*
	 * rs.next()의 역할과 사용 방법 커서 이동: ResultSet의 초기 상태에서 커서는 첫 번째 행 앞에 위치합니다.
	 * rs.next()를 호출할 때마다 커서는 다음 행으로 이동합니다. 행의 존재 여부 확인: rs.next()는 커서가 다음 행으로 이동했을
	 * 때 그 행에 데이터가 존재하면 true를, 더 이상 데이터가 없으면 false를 반환합니다. 이는 일반적으로 while 루프나 if 조건문
	 * 내에서 호출되어 데이터가 더 있을 때까지 처리를 반복합니다.
	 */

	/**
     * 지정된 번호의 게시글을 데이터베이스에서 조회합니다.
     * @param num 조회할 게시글의 번호
     * @return 조회된 게시글의 정보를 담은 BoardVo 객체, 없을 경우 null
     */

	public BoardVo selectOne(int num){
    	Connection con = null;
    	PreparedStatement pstmt = null;
    	ResultSet rs =null;
    	
       String query = "SELECT NUM, TITLE, WRITER, CONTENT, REGDATE, CNT FROM BOARD WHERE NUM = ?";
       
       BoardVo vo = null;
      
    	try {
    		con = ju.getConnection();
    		pstmt = con.prepareStatement(query);
    		pstmt.setInt(1, num);
    		rs = pstmt.executeQuery(query);// 쿼리를 담아 전송
    		
    		
    		// 값이 있다면/결과가 있다면 BoardVo 객체 생성 
    		 if (rs.next()) {
    		   vo =  new BoardVo(
    				  rs.getInt(1),
    				  rs.getString(2), 
    				  rs.getString(3),
    				  rs.getString(5),
    				  new Date(rs.getDate(5).getTime()),
    				  rs.getInt(6) 
    				  );
    		 
    		}
    	}catch(SQLException e) {
    		e.printStackTrace();
    	}finally {
			if(rs != null) {
				try {
					rs.close();
				} catch(SQLException e) {
					e.printStackTrace();
				}
				
			}
			if(pstmt != null) {
				try {
					pstmt.close();
				} catch(SQLException e) {
					e.printStackTrace();
				}
				
			}
			if (con != null) {
				try {
					con.close(); // Connection 닫기, 커넥션 풀에 반환
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
    	}
    	return vo;
    }


	// 수정

	// 삭제
}
