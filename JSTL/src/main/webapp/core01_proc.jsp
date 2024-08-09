<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>JSTL CORE PROC</title>
</head>
<body>

	<%
	String number = request.getParameter("number");
	%>

	<%--JSTL 변수 선언 : <c:set> 

	<c:set var="변수명" value="값" /> --%>

	<c:set var="number" value="<%=number%>" />

	<%-- 
	다중 조건 : <c:choose> 
	
	if = when test="조건식"
	else_if = when test="조건식"
	else = otherwise 
	--%>

	<c:choose>
		<c:when test="${number % 2 == 0}">

			<%-- 
			JSTL 변수 참조/출력 : <c:out> 
			
			${number} : 표현언어 
			JSTL 선언한 변수는 표현문으로 사용불가 -> <%= name %> 
 			--%>

			<c:out value="${number}" /> : 짝수<br>
		</c:when>
		<c:when test="${number % 2 == 1 }">
			<c:out value="${number}" /> : 홀수 <br>
		</c:when>
		<c:otherwise>
			숫자가 아니다.<br>
		</c:otherwise>
	</c:choose>
	
</body>
</html>