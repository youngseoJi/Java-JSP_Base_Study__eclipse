<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>JSTL CORE</title>
</head>
<body>

	<c:set var="number" value="10" />


	<%-- 단일 조건 : <c:if>

			 단독 조건문만 가능 (else 개념이 없음)   --%>

	<c:if test="${number % 3 == 0}">
		<c:out value="${number} : 3의 배수" />
		<br>
	</c:if>
	<c:if test="${number % 2 == 0}">
		<c:out value="${number} : 2의 배수" />
		<br>
	</c:if>
	<c:if test="${number % 3 != 0}">
		<c:out value="${number} : 3의 배수가 아님" /> 
		<br>
	</c:if>
	
</body>
</html>