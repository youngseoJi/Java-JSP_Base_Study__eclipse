<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login Success sendRedirect</title>
</head>
<body>

	<h3>ResponseRedirect.jsp 페이지 입니다</h3>

<% 
 	request.setCharacterEncoding("UTF-8");
 
 	String id = request.getParameter("id");
/*  	String phone = request.getParameter("phone");  */
%>

<h3> ID = <%=id %> phone =<%--  <%=phone %>  --%>
</h3>
</body>
</html>