<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<h2>세션 연습</h2>

<%

	String name = "Ji";

	// 세션을 이용하여 데이터를 유지하여 다른 페이지로 보내준다.

	/* setAttribute("키", 값)) : name1이라는 이름으로 name을 저장해준다. */
	session.setAttribute("name1", name);
	
	/* 세션 유지시간 */
	session.setMaxInactiveInterval(10); // 10초간 세션 유지

%>

<h3> 세션에 저장된 이름 : <%= name %></h3>

	<a href="SessionName.jsp"> 세션이 잘 유지되는지 확인 -> 세션 네임 페이지로 이동</a>
</body>
</html>