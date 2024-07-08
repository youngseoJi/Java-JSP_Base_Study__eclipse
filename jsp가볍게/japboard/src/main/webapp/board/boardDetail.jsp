<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" import="board.*"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!-- 액션태그로 객체생성 
		 -> 객체 생성을 JSP 컨테이너에 위임 
		 
		 조회된 게시글 정보를 pageContext에 저장합니다. --> 

<jsp:useBean id="dao" class="board.BoardDao" />
	<%
	int num = Integer.parseInt(request.getParameter("num"));
	BoardVo vo = dao.selectOne(num);
	pageContext.setAttribute("vo", vo);
   
%>


<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>게시글 상세보기</title>
</head>
<body>
	<h3>게시글 상세보기</h3>
	<p>번호: ${vo.num}</p>
	<p>제목: ${vo.title}</p>
	<p>작성자: ${vo.writer}</p>
	<p>내용: ${vo.content}</p>
	<p>등록일자: ${vo.regdate}</p>
	<p>조회수: ${vo.cnt}</p>
</body>
</html>