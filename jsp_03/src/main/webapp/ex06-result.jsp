<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>로그인에 대한 응답</title>
</head>
<body>

<!-- sendRedirect사용예-->
	<%
	
	String userid = request.getParameter("userid");
	String userpw = request.getParameter("userpw");

	/* 데이터가 현재 없으니 임시로 비교 */
	if (userid.equals(userpw)) {
		System.out.println(userid + "님이 로그인하셨습니다.");
		response.sendRedirect(request.getContextPath()); /* 최상위 요청으로 리다이렉트 */
	} else {
		System.out.println(userid + "로그인이 실패하였습니다. 아이디와 패스워드를 확인해주세요.");
		response.sendRedirect("ex06-loginForm.jsp"); /* 로그인폼으로 리다이렉트 */
	}
	%>
</body>
</html>