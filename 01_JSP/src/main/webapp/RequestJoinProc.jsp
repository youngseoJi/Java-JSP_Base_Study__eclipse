<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Request 내장객체</title>
<!-- - form태그로 전달받은 데이터 불러와 출력하기 -->
</head>
<body>
<section>
	<h2>회원 방식</h2>
	
	<!-- post 방식으로 데이터가 넘어올떄 한글이 깨지는 거 방지 -->
<% request.setCharacterEncoding("UTF-8"); 
	 /* 각족 사용자로부터 넘어온 데이터를 저장해준다. */
	String id = request.getParameter("id");
	String password = request.getParameter("password");
	String passwordConfirm = request.getParameter("passwordConfirm");
	String email = request.getParameter("email");
	String tel = request.getParameter("tel");
	
	/* checkbox 데이터럼 여러개의 값이 있을 수 있는 경우 
	   getParameterValues 이용하여 여러개 값을 []배열 타입으로 리턴 */
	String [] hobby = request.getParameterValues("hobby");
	
	String job = request.getParameter("job");
	String age = request.getParameter("age");
	String info = request.getParameter("info");
%>

</section>

</body>
</html>