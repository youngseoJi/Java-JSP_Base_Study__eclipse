<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>ex01</title>
</head>
<body>
<!-- 기본 내장 객체 알아보 -->

<!-- jsp 코드 부분은 -> 서버에서 처리되어 -> 처리된 결과물이 브라우저로 돌아와 출력된다. -->
	
	클라이언트 IP : <%= request.getRemoteAddr() %><br>
	요청정보 길이 : <%= request.getContentLength() %><br>
	요청정보 인코딩 : <%= request.getCharacterEncoding() %><br>
	요청정보 문서타입 : <%= request.getContentType() %><br>
	요청정보 전송방법 : <%= request.getMethod() %><br>
	요청 URL : <%= request.getRequestURL() %><br>
	요청 URI : <%= request.getRequestURI() %><br>
	컨텍스트 경: <%= request.getContextPath() %><br>
	서버이름 : <%= request.getServerName() %><br>
	서버포트 : <%= request.getServerPort() %><br>
</body>
</html>