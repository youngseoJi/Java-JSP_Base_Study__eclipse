<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>구구단을 외자!</title>
</head>
<body>

<h2>구구단 출력하기!</h2>


<%
	for (int i = 2; i <= 10; i++) {
		for (int j = 1; j <= 10; j++) {
		/* 메서드를 사용하는 방법 */
				out.write(i+ " * " + j + " = " + i*j);
			
		}
	}
%>


<%
	for(int i = 2; i <= 10; i++) {
		for(int j = 1; j <= 10; j ++) {
%>
<!--  표현식 사용: 화면에 보여줄 부분  -->
			<%= i %> * <%= j %> = <%= i*j %> <br>
<%
		}
%>
		<br>
<%
	}

%> 
</body>
</html>