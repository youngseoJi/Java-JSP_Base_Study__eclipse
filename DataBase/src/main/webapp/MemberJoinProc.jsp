<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@ page import="java.sql.PreparedStatement" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<%
	request.setCharacterEncoding("UTF-8");

	// 취미는 별도록 읽어드려서 다시 빈클래스에 저장해야한다. 여러개의 데이터가 들어올 수 있기 때문이다.
	// 배열에 취미 선택값을 불러온다.
	String[] hobby = request.getParameterValues("hobby");
	// 배열의 데이터를 하나의 문자열타입, 문자로 저장한다.
	String textHobby="";
	
	for(int i= 0; i< hobby.length; i++){
		textHobby += hobby[i]+" ";
	}
	
%>

<!-- usebean_을 이용하여 한번에 데이터 받아오기 -->

<jsp:useBean id="mbean" class="model.MemberBean">
	<jsp:setProperty name="mbean" property="*"/> <!-- 매핑 -->
</jsp:useBean>


<%
/* 기존 매핑했던 값에는, 취미에 체크한 주소들이 저장되기에
	 위의 배열의 내용을 하나의 문자열로 저장한 변수를 다시 저장해준다. */
	mbean.setHobby(textHobby);

  /* 오라클 접속 소스 */
  String id ="system"; // 접속 아이디
  String pass = "pass"; // 비
  String url = "jdbc:oracle:thin:@localhost:1521/xe"; //접속 url

  Connection con = null;
  PreparedStatement pstmt = null;
  
  try {
	  /* 1. 해당 데이터 베이스르 사용한다고 선언 (클래스를 등록 = 오라클용을 사용) */
	  Class.forName("oracle.jdbc.driver.OracleDriver");
	  
	  /* 2. 해당 데이터 베이스에 접속 */
	 	con = DriverManager.getConnection(url,id,pass);
	  
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
	  pstmt.setString(8,mbean.getJob());
	  
	  /* 4. 오라클에서 쿼리를 실행하기 */
	  pstmt.executeUpdate(); /* insert, updte, delete 시 사용하는 메소드 */
	  
	  /* 5.자원 반납 */
	  con.close();
	  
  } catch(Exception e){
	  e.printStackTrace();
  }
  
%>

<%-- 	<h2>아이디 = <%=mbean.getId() %></h2>
	<h2>취미 = <%=mbean.getHobby() %></h2>
 --%>
<h3>오라클에 완료</h3>

</body>
</html>