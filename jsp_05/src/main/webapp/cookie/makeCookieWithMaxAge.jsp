<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<!-- 쿠키는 유효시간이 지나면 다시 사용되지 못한다. 
		 브라우저에 저장되는 쿠키는 유효시간이 존재한다.
		 시간이 지정되지 않느면 '세션쿠키'라고 하며 브라우저가 종료되면 삭제된다. 
		 시간 을 지정하면 해당 시간동안 브라우저에서 유지 (닫아도 유지)
			-->
<%
	Cookie cookie3 = new Cookie("oneH", "oneH");
	cookie3.setMaxAge(60 * 60); // 초단위
	response.addCookie(cookie3);
%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">

<title>유효시간이 지정된 쿠키 생성</title>
</head>
<body>
	유효시간이 1시간인 쿠키가 생성되었습니다.
</body>
</html>