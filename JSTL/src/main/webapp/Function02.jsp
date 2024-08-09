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

	<h1>문자열 검섹</h1>
	<h3>Hello JSTL</h3>

	<%-- fn 함수 라이브러리 함수 사용
	- 주로 표현 언어(EL)와 함께 사용됨
	- JSP 페이지에서 데이터를 동적으로 처리하고 표시할 때 활용됨 --%>

	<h5>${fn:contains("Hello JSTLL!", "Hello") }</h5>
	<c:set var="check" value=""></c:set>

	<c:if test="${fn:contains('Hello JSTL', 'Hello') }">
	Hello 문자가 포함 되어 있다.
	</c:if>

	<!-- 자주쓰는 함수 라이브러리 사용해보기 -->

	<h1>contains() 함수</h1>

	<!--  fn:contains 함수는 특정 문자열이 다른 문자열에 포함되어 있는지 확인함 -->
	<p>문자열 포함 여부 : ${fn:contains("Hello JSTL~!", "JSTL")}</p>

	<!--  fn:containsIgnoreCase 함수는 대소문자 구분 없이 문자열 포함 여부를 확인함 -->
	<p>문자열 포함 여부(대소문자 구분X) : ${fn:containsIgnoreCase("Hello JSTL~!", "jstl")}
	</p>

	<hr>

	<h1>toUpperCase(), toLowerCase() 함수</h1>
	
	<!--  fn:toUpperCase 함수는 문자열을 대문자로 변환함 
				fn:toLowerCase 함수는 문자열을 소문자로 변환함  -->
	<p>hello jstl~! : ${fn:toUpperCase("hello jstl~!")}</p>
	<p>Hello JSTL~! : ${fn:toLowerCase("Hello JSTL~!")}</p>

	<hr>

	<h1>length() 함수</h1>
 <!--  fn:length 함수는 문자열이나 배열의 길이를 반환함 -->
	<p>글자수 : Hello JSTL~! ->${fn:length("Hello JSTL~!")} </p>


	<h1>split() 함수</h1>

	<!--   fn:split 함수는 문자열을 지정된 구분자로 나누어 배열로 반환함
	
				 ${fn:split('문자열', '구분지'} -->
	<c:set var="texts" value="${fn:split('Hello JSTL~!', ' ')}" />
	<c:forEach var="i" begin="0" end="${fn:length(texts)-1}">
		<p>texts[${i}] : ${texts[i]}</p>
	</c:forEach>

</body>
</html>