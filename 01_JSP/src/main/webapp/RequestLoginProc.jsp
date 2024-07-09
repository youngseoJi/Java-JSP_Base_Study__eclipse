<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>request 내장객체</title>
</head>
<body>

<!-- 	request 내장객체 사용하여 RequestLogin에서 넘어온 아이디와 패스워드를 읽어오자 -->


<!-- 스크립트릿 내 자바코드 -->
<% 
	/* 사용자의 정보가 저장되어잉ㅆ는 객페 request의 getParameter() 사용자의 정보를 추출 */
	
	String id = request.getParameter("id"); /* 사용자의 name="id"로 지정한 값을 읽어서 ->  변수 id에 저장 */
	String password = request.getParameter("password");

%>
		<h1>
		아이디는 <%= id %> 이고 패스워드는 <%= password %>다.
		</h1>

</body>
</html>