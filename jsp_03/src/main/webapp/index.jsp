<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>INDEX</title>
</head>
<body>
	<!-- 기본 객체 알아보기 -->
	<ol>
	<li> 
	<!-- ="/jsp02/ex01,jsp"와 동일한 것  -->
		<a href="<%= request.getContextPath() %>/ex01.jsp">Ex01</a>
	</li>
	<li> 
		<a href="<%= request.getContextPath() %>/ex02.jsp">Ex02</a>
	</li>
	<li> 
		<a href="<%= request.getContextPath() %>/ex03.jsp">Ex03</a>
	</li>
	<li> 
		<a href="<%= request.getContextPath() %>/ex04.jsp">Ex04</a>
	</li>
	<li> 
		<a href="<%= request.getContextPath() %>/ex05.jsp">Ex05</a>
	</li>
</ol>
</body>
</html>