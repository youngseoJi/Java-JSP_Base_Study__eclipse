<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>계산 요청에 대한 응답</title>
</head>
<body>
	<%
	String n1Str = request.getParameter("n1");
	String n2Str = request.getParameter("n2");
	
	/* 전달받은 데이터 정수형으로 변환하여 계산 */
	int n1 = Integer.parseInt(n1Str);
	int n2 = Integer.parseInt(n2Str);
	int result = n1 + n2; 
	%>
	
	<h3>계산 결과</h3>
	<h2><%= n1 %> + <%= n2 %> = <%= result %></h2>
	
</body>
</html>