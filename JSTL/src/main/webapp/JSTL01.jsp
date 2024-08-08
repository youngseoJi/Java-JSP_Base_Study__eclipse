<%-- taglib 디렉티브 태그 추가 :jstl을 사용하겠다 ! core 모듈사용 --%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>taglib 디렉티브 - JSTL</title>
</head>
<body>
	<%-- WEB-INF > lib : jstl-xxx-impl.jar 라이브러리 추가 --%>

	<!-- 접두사 c: jstl
	
	
	 c:forEach  var="반복변수" begin="시작값" end="종료값" step="증감치" 
	 -->
	<c:forEach var="k" begin="1" end="10" step="1">
		<!-- for문과 동일 -->
		<%
		for (int k = 1; k <= 10; k++) {
			out.println(k + " ");
		}
		out.println("<br>");
		%>
		<c:out value="${k}" />
	</c:forEach>
</body>
</html>