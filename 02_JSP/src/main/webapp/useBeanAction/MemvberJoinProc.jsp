<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원 가입 처리</title>
</head>
<body>

<%
    request.setCharacterEncoding("UTF-8");
%>

<jsp:useBean id="mbean" class="bean.MemberBean" scope="request">
    <jsp:setProperty name="mbean" property="*"/>
</jsp:useBean>

<section>
    <h2>회원 정보보기</h2>
    <h3>아이디: <jsp:getProperty name="mbean" property="id"/></h3>
    <h3>비밀번호: <jsp:getProperty name="mbean" property="password"/></h3>
    <h3>이메일: <jsp:getProperty name="mbean" property="email"/></h3>
    <h3>전화번호: <jsp:getProperty name="mbean" property="tel"/></h3>
    <h3>주소: <jsp:getProperty name="mbean" property="address"/></h3>
</section>

</body>
</html>
