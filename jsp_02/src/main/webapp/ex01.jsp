<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>JSP 예제 </title>
</head>
<body>
<% 
	java.util.Random ran = new java.util.Random();
	int total = 0;
	for(int i =1; i <= ran.nextInt(10); i++){
		total +=i;
	}
	System.out.println("처리 완");
%>
	1부터 10까지의 합: <%= total %>
</body>
</html>