<%@page import="model.BoardDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>답글처리</title>
</head>
<body>


	<%
	request.setCharacterEncoding("UTF-8");//한글처리
	%>
	
	
	<!-- bean 클래스 사용 - 답글 한번에 받아오기 -->
	<jsp:useBean id="boardbean" class="model.BoardBean">
		<jsp:setProperty name="boardbean" property="*" />
	</jsp:useBean>

	<%
	// 데이터베이스 객체 생성
	BoardDAO boardDAO = new BoardDAO();

	boardDAO.reWriteBoard(boardbean);

	// 답글 데이터를 모두 저장 되면 -> 게시글 목록 페이지로 이동
	response.sendRedirect("BoardList.jsp");
	%>

</body>
</html>