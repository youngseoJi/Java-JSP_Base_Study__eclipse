<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>세 번째 페이지 </title>

<!-- 세번째 페이지는 포워딩, 전달된게 아닌 새로웅 페이지여서 url도 다르고 객체의 값도 다름 
		(세션값, 애플리케이션은 동일 -> 브라우저가 동일해)
		 http://localhost:8080/jsp_03/ex10-3.jsp-->
		 
		 <!-- 다른 브라우저로키거나하면 세션은 날라간다.새로 새션은만든다. 하지만 어플리케이션은서버 자체이기 떄문에 브라우저와 관계없이 유지된다. -->
		
</head>
<body>
	하나의 페이지 범위: <%= pageContext.getAttribute("name") %><br>
	하나의 요청 범위: <%= request.getAttribute("name") %><br>
	하나의 세션 범위: <%= session.getAttribute("name") %><br>
	하나의 애플리케이션 범위: <%= application.getAttribute("name") %><br>
	
	<a href="<%= request.getContextPath() %>">처음으로 </a>
	
	<!-- 하나의 페이지 범위: null
			 하나의 요청 범위: null
			 하나의 세션 범위: session scope (같은 브라우저기에 저장된값)
			 하나의 애플리케이션 범위: application scope (같은 서) -->
			 
 	<!-- 다른브라우저로 킬 경우 
 	
 			 하나의 페이지 범위: null
			 하나의 요청 범위: null
			 하나의 세션 범위: null
			 하나의 애플리케이션 범위: application scope -->

<!--  서버를 껐다 키면 모두 null! 서버에 저장해둔 값도 날라가니

-->
</body>
</html>