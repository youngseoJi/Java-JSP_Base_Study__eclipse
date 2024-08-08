<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<!-- 
	
	* 실행순서 
	HTML → CSS → JavaScript → 스크립틀릿(자바) → JSTL
	
 -->

	<!-- 스크립틀릿 변수 선언 -->
	<%
	String name = "김조은1";
	%>

	<!-- 스크립틀릿 변수 출력 -->
	<%
	out.print(name);
	%>

	<hr>

	<!-- JSTL 변수 선언 : c:set -->

	<%-- 	<c:set var="변수명" value="값" /> --%>
	<c:set var="name" value="김조은2" />
	<c:set var="number" value="10" />
	

	<!-- JSTL 변수 참조/출력 : c:out -->

	<%-- ${name} : 표현언어 사
			JSTL 선언한 변수는 표현문으로 사용불가 ex) <%= name %> 
 		--%>
	<c:out value="${name}" />
	<br>


	<!-- 단일 조건 : c:if

			 단독 조건문만 가능 (else 개념이 없음)  -->

	<c:if test="${number % 2 == 0}">
		<c:out value="${number}" /> : 짝수<br>
	</c:if>
	<c:if test="${number % 2 == 1}">
		<c:out value="${number}" /> : 홀수<br>
	</c:if>

	<!-- 
	다중 조건 : c:choose 
	
	if = when test="조건식"
	else_if = when test="조건식"
	else = otherwise 
	-->

	<c:choose>
		<c:when test="${number % 2 == 0}">
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