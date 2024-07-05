<%@ page language="java" contentType="text/html; charset=UTF-8" 
pageEncoding="UTF-8" import="board.*, java.util.List"%>


<!--  지시어: JSTL 코어 라이브러리를 사용하기 위해 선언합니다. 
		 JSTL 태그는 반복, 조건문 등을 처리할 때 유용하게 사용됩니다. -->
		 
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<%
	/* 
		자바 코드를 사용하여 DAO 객체를 생성
		selectAll() 메소드를 통해 게시글 목록조회 */
    BoardDao dao = new BoardDao();
    List<BoardVo> ls = dao.selectAll();
    
    /*  불러온 게시글 리스트를 페이지 컨텍스트의 속성으로 설정 */
    pageContext.setAttribute("ls", ls);
    
    if (ls.isEmpty()) {
        out.println("<p>No data found!</p>"); // 데이터가 없을 경우 출력
    } else {
        out.println("<p>Loaded " + ls.size() + " entries.</p>"); // 로드된 데이터의 수 출력
    }
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>목록</title>
</head>
<body>
<h2>게시글 목록</h2>
<table>
<tr>
	<th>번호</th>
		<th>제목</th>
		<th>작성자</th>
		<th>내용</th>
		<th>등록일</th>
		<th>조회수</th>
	</tr>
<c:forEach var="board" items="${ls}">
	<tr>
		<td>${board.num}</td>
		<td>
		
		<!-- 일반적인 HTML 하이퍼링크 사용 
		${pageContext.request.contextPath}는 애플리케이션의 루트 경로를 동적으로 가져옴!
		-->
		<a href="${pageContext.request.contextPath}/board/boardDetail.jsp?num=${board.num}">${board.title}</a>
		
		</td>
		<td>${board.writer}</td>
		<td>${board.content}</td>
		<td>${board.regdate}</td>
		<td>${board.cnt}</td>
	</tr>
</c:forEach>
</table>

<!-- 게시글 등록버튼 -->
<!-- JSTL c: 태그를 사용 -->

<a href="<c:url value="/board/registForm.jsp"/>"><button>게시글 등록</button></a>
</body>
</html>
