package board;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import common.JdbcUtil;

/**
 * 데이터베이스에 게시판 관련 데이터 접근을 담당하는 DAO 클래스입니다.
 * CRUD (생성, 조회, 수정, 삭제) 기능을 제공하여 데이터베이스 테이블과 상호작용합니다.
 */
public class BoardDao {
	private JdbcUtil ju;
	
	public BoardDao() {
		ju = JdbcUtil.getInstance();
	}
	public int insert(BoardVo vo) {
		Connection con = null;
	    PreparedStatement pstmt = null;
	    String query = "insert into \"BOARD\" (\"NUM\", \"TITLE\", \"WRITER\", \"CONTENT\", \"REGDATE\", \"CNT\") VALUES (BOARD_SEQ.nextval, ?, ?, ?, SYSDATE, 0)";
	    int ret = -1;
	    try {
	        con = ju.getConnection();
	        pstmt = con.prepareStatement(query);
	        pstmt.setString(1, vo.getTitle());
	        pstmt.setString(2, vo.getWriter());
	        pstmt.setString(3, vo.getContent());
	        ret = pstmt.executeUpdate();
	        return ret;
	    }  catch (SQLException e) {
            e.printStackTrace();  // 예외 처리
        } finally {
            if (pstmt != null) {
                try {
                    pstmt.close();  // 자원 해제
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if (con != null) {
                try {
                    con.close();  // 커넥션 닫기
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
        return ret;  // 결과 반환
    }

	// 수정
	public List<BoardVo> selectAll() {
	    Connection con = null;
	    Statement stmt = null;
	    ResultSet rs = null;
	    String query = "select \"NUM\", \"TITLE\", \"WRITER\", \"CONTENT\", \"REGDATE\", \"CNT\" from BOARD";
	    ArrayList<BoardVo> ls = new ArrayList<BoardVo>();
	    try {
	        con = ju.getConnection();
	        stmt = con.createStatement();
	        rs = stmt.executeQuery(query);
	        while (rs.next()) {
	            BoardVo vo = new BoardVo(
	                rs.getInt(1),    // NUM
	                rs.getString(2), // TITLE
	                rs.getString(3), // WRITER
	                rs.getString(4), // CONTENT
	                new Date(rs.getDate(5).getTime()),   // REGDATE
	                rs.getInt(6)     // CNT
	            );
	            ls.add(vo);
	            System.out.println(vo); // 객체의 상태를 출력
	        
	        }
	        System.out.println("Loaded " + ls.size() + " entries."); // 로드된 데이터의 수 출력
	    } catch (SQLException e) {
	        e.printStackTrace();
	    } finally {
	        if (rs != null) {
	            try {
	                rs.close();
	            } catch (SQLException e) {
	                e.printStackTrace();
	            }
	        }
	        if (stmt != null) {
	            try {
	                stmt.close();
	            } catch (SQLException e) {
	                e.printStackTrace();
	            }
	        }
	        }
	    return ls;

        
	}

	
	

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


	// 삭제
}
