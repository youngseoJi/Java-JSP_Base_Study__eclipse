<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="java.util.*" %>
<!-- 자바의 표준 클래스 임포 -->
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>요청헤더정보</title>
</head>
<body>

	<% 
	/* 헤더안의 정보를 받아오는 객 */
	Enumeration<String> enumData = request.getHeaderNames();
	while(enumData.hasMoreElements()){
	String headerName = (String)enumData.nextElement();
	String headerValue = request.getHeader(headerName);
	System.out.println(headerName + ":" + headerValue);
	}%>


</body>
</html>