<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>두번째 페이지 </title>
</head>
<!--  그래서 url은 http://localhost:8080/jsp_03/ex10-1.jsp 로 유지된다.-->
<!-- 10-1.jsp 다 처리하고 전달한 response, request객체를 전달받아 처리하는 페이지    -->
<body>
<!-- 10-1 에서 전달받은 객체의 요소 값을 확인해보면 같은 값이 출력된다! -->
	하나의 페이지 범위: <%= pageContext.getAttribute("name") %><br>
	하나의 요청 범위: <%= request.getAttribute("name") %><br>
	하나의 세션 범위: <%= session.getAttribute("name") %><br>
	하나의 애플리케이션 범위: <%= application.getAttribute("name") %><br>
	
	<a href="ex10-3.jsp">세 번째 페이지 요청 </a>
	
	
	
<!-- 10-1과 동일한 객체/데이터 출력 - 포워딩받은
	페이지범위: page scope
	요청범위: request scope
	세션범위: session scope
	애플리케이션범위: application scope -->
	
	
</body>
</html>