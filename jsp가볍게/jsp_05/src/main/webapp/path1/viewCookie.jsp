<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>쿠키 목록</title>
</head>
<body>
	<!-- -->
	<h2>쿠키 목록</h2>

	<%
	Cookie[] cookies = request.getCookies();

	for (Cookie cookie : cookies) {
	%>
	<%= cookie.getName() %> : <%= cookie.getValue() %><br>
	<%
	}
	%>

</body>
</html>