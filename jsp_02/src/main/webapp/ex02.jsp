<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>JSP 기본문법</title>
</head>
<body>
<h2>JSP 기본 문법 예</h2>	
<%
	/* Scriptlet : 자바 코드를 작성할 수 있는 영역 (연산, 처리 기능정의 ) - 서버에서 처리한다.  */
	
	String str = "스크립플릿 이다.";
	String comment = "주석";
%>

<!-- 표현식 : 값을 출력(처리, 산코드 사용불가)  - 브라우저에 출력할 값들을 표시해준다. -->
선언문 : <%= declration %><br> 
스크립틀릿 :<%= str %> <br>

<!-- html 주석이라, jsp가 출력 -->
<!-- <%= comment %> -->
<!--  jsp 주석이라, js 출력X -->
<%-- <%= comment %>  --%>

<%! // 선언문은 안쓸
    // 선언문(멤버 필드, 멤버 메서드 정의)
    String declration = "선언문";
%>
</body>

</html>