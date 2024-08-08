<%@page import="DTO.Board"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<%@ taglib prefix="sql" uri="http://java.sun.com/jsp/jstl/sql"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>게시글 목록</title>
</head>
<body>

<!-- 스크립틀릿에서 초기화된 boardList를 JSTL로 전달하는 방법
		c:set 태그를 사용
		JSP 페이지에서 표현 언어 (EL)를 사용하여 데이터를 참조할 수 있다. -->


	<%
	List<Board> boardList = new ArrayList<Board>();

	boardList.add(new Board("제목01", "작성자01", "내용01"));
	boardList.add(new Board("제목02", "작성자02", "내용02"));
	boardList.add(new Board("제목03", "작성자03", "내용03"));
	%>

	<h2>게시글 목록</h2>
	<table border="1">

		<tr>
			<th>제목</th>
			<th>작성자</th>
			<th>내용</th>
		</tr>

		<%-- 비추천 방법 : 자바 표현식으로 boardList 갖고오기
		<c:forEach var="board" items="<%=boardList}%>"> --%>


		<%-- 1.자바 변수를 JSTL 표현언어에서 사용하기 위해 c:set으로 설정 --%>
		<c:set var="boardList" value="<%=boardList%>" />
		
		 <!--  2. 표현언어로 boardList 가져오기 -->
		<c:forEach var="board" items="${boardList}">
		<%-- <c:forEach> var ="변수" items="${반복할 리스트}"  --%>
		
			<tr>
				<td><c:out value="${board.title}" /></td>
				<td><c:out value="${board.writer}" /></td>
				<td><c:out value="${board.content}" /></td>

			</tr>
		</c:forEach>
	</table>
</body>
</html>