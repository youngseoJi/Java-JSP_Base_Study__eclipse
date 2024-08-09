<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<%@ taglib prefix="sql" uri="http://java.sun.com/jsp/jstl/sql"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>JSTL Function 라이브러리</title>
</head>
<body>
	<c:set var="texts"
		value="${fn:split('Hello, Java Server Pages!', ' ' }" />

	<!-- end="${fn:length(texts)-1}" : 반복의 끝 인덱스 (배열 길이 - 1) -->
	<c:forEach var="i" begin="0" end="${fn:length(texts)-1}">
		<p>text[${i}]=${texts[i]}</p>
	</c:forEach>
	
	<p>
		<!-- fn:join 함수는 배열의 요소들을 지정된 구분자로 이어서 하나의 문자열로 반환함
         ${fn:join(배열, '구분자')} -->
		<c:out value="${fn:join(texts,'-')}" />
	</p>
</body>
</html>