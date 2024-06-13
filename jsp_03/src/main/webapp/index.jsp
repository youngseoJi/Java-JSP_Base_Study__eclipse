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
	<!-- a href="/jsp02/ex01,jsp"와 동일한 것  --> 
	<ol>
		<li><a href="<%=request.getContextPath()%>/ex01.jsp">Ex01</a></li>
		<li><a href="<%=request.getContextPath()%>/ex02.jsp">Ex02</a></li>
		<li><a href="<%=request.getContextPath()%>/ex03.jsp">Ex03</a></li>
		<li><a href="<%=request.getContextPath()%>/ex04.jsp">Ex04</a></li>
		<li><a href="<%=request.getContextPath()%>/ex05.jsp">Ex05</a></li>
		<li><a href="<%=request.getContextPath()%>/ex06.jsp">Ex06</a></li>
		<li><a href="<%=request.getContextPath()%>/ex06-loginForm.jsp">Ex06-loginForm</a></li>
		<li><a href="<%=request.getContextPath()%>/ex07.jsp">Ex07</a></li>
		<li><a href="<%=request.getContextPath()%>/ex08.jsp">Ex08</a></li>
		<li><a href="<%=request.getContextPath()%>/ex09.jsp">Ex09</a></li>
		<li><a href="<%=request.getContextPath()%>/ex10-1.jsp">Ex10-1</a></li>
		
	</ol>
</body>
</html>