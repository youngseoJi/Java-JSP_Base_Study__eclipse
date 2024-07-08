<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<!-- 스크립트릿 : 로직, 자바코드 -->
<% 
	/* 1-10까지의 숫자를 출력하기 */
	
	for(int i = 1; i <= 10; i++){
%>

<!--  표현식 : 화면에 표시할 부분  -->

<%= i %><br>

<%
	} 
	
%>
</body>
</html>