<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<h2> 세션 네임 페이지</h2>

<%
	
	String name1 = (String)session.getAttribute("name1");

%>

	<h3><%=name1%> 님 반값습니다.</h3>

</body>
</html>