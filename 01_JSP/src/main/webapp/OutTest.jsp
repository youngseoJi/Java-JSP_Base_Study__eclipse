<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Out 내장객체</title>
<!-- 데이터의 내용을 화면에 출력하기 위해 사용된다. -->
</head>
<body>


	<%
	String name = "알리미 어플";
	%>

	<!-- html내에서 즉 스크립트릿 바깥에서는 표현식이 사용하는게 편하다.   -->
	스크립트로 표현시
	
	<%=name%>
	
	화면에 출력된다.

	<p>
		<!-- 스크립트릿 내에서 즉 자바코드 내에서 사용할떄는 out 이 편하다 -->

		<%
		out.write(name + "이 출력된다. write");
		out.println(name + "이 출력된다. println");
		%>
	
</body>
</html>