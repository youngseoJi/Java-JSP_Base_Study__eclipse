<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" import="board.*, java.util.List"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%
    BoardDao dao = new BoardDao();
    List<BoardVo> ls = dao.selectAll();
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
<c:forEach var="board" items="${ls}">
    <p>${board.title}, ${board.writer}, ${board.content}, ${board.regdate}, ${board.cnt}</p>
</c:forEach>
</body>
</html>
