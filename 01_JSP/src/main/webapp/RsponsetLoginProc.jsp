<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>response 내장객체 로그인페이지</title>
</head>
<body>


<!-- response 가 시작되면 해당 페이지의 html이 사라짐 -->
<h2> 로그인 처리 페이지</h2>

<%
	request.setCharacterEncoding("UTF-8");

	/* 임의적으로 id와 pass설정 */
	
	String dbId = "estell";
	String dbPassword = "1234a";
	
	/* 사용자로 부터 넘어온 데이터를 입력 받기 */
	String id = request.getParameter("id");
	String password = request.getParameter("password");
	
	if(dbId.equals(id) && dbPassword.equals(password)){
		
		// 아이디 패스워드가 일치할 경우 -> 메인페이지 보여준다.
		/* sendRedirect : 어떤 결과를 처리해서 그 결과가 만족하면 다른 페이지를 보여주는 기능 */
		response.sendRedirect("ResponseMain.jsp?id="+id);	
	} else {
		
%>		
	<script>
		alert("아이디와 패스워드가 일치하지 않습니다.")
		history.go(-1);
	</script>
		
<%
	}
%>

</body>
</html>