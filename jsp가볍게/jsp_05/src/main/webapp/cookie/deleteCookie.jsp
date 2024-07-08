<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%
 
	Cookie[] cookies = request.getCookies();
   /* 쿠키 수정 : 동일한 이름의 속성의 쿠키를 찾아 값을 대체하여 변경한다. */ 
	if(cookies != null && cookies.length > 0){
		for(int i = 0; i < cookies.length; i++ ) {
			if(cookies[i].getName().equals("name")){
					Cookie cookie = new Cookie("name", "");
					/* 쿠키 삭제 : 쿠키의 유효시간을 0으로 변경한다. 
					->수정처럼 그리고 값을 대체하면 쿠키가 삭제되는 것이다.*/
					cookie.setMaxAge(0);
					response.addCookie(cookie);
			}
		}
	}
%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>쿠키 삭제 </title>
</head>
<body>
	쿠키가 삭제되었습니다.
</body>
</html>