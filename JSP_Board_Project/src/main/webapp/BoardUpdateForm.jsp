<%@page import="model.BoardBean"%>
<%@page import="model.BoardDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>게시글 수정 페이지</title>

<style>
* {
	box-sizing: border-box;
	margin: 0;
	padding: 0;
}


body {
	width: 100%;
	height:auto;
	text-align: center;
	display: flex;
	justify-content: center;
	margin: 20px;
}

section {
    display: flex;
    flex-direction: column;
    align-items: center;
     justify-content: center;
}

h2 {
	margin: 10px;
}

table {
	width: 600px;
	border-collapse: collapse;
	border: 1px solid gray;
}

tr {
	height: 50px;
	border: 1px solid gray;
}

td {
	width: 100px;
	border: 1px solid gray;
	padding: 5px 20px;
}

input {
	width: 100%;
	padding: 5px 10px;
}


.board-content {
	text-align: left;
	width: 200px;
}

.content {
	height: 300px;
	width: 100%;
	padding: 5px 10px; 
}

.board-title {
	width: 100px;
}


button {
	padding: 2px 10px;
	margin-left: 10px;
}

td-btn {
	text-align: right;
	width: 100%;
	display: flex;
	justify-content: flex-end;
}


</style>
</head>
<body>
	<!-- 수정할 항목

		1. 게시글 제목 
		2. 게시글 내용
		-->
	<section>
		<h2>게시글 수정하기</h2>

		<%
		// 게시글 번호를 이용하여 선택한 게시글을 수정
		int num = Integer.parseInt(request.getParameter("num").trim());

		// 수정하기위해 선택한 특정 게시글에 대한 정보를 갖고온다.
		BoardDAO boardDAO = new BoardDAO();
		BoardBean board = boardDAO.getOneUpdateBoard(num);
		%>
		<form action="BoardUpdateProc.jsp" method="post">

			<table>
				<tr>
					<td class="board-title">번호</td>
					<td class="board-content"><%=board.getNum()%></td>
					<td class="board-title">조회수</td>
					<td class="board-content"><%=board.getRead_count()%></td>
				</tr>
				<tr>
					<td class="board-title">작성자</td>
					<td class="board-content"><%=board.getWriter()%></td>
					<td class="board-title">작성일</td>
					<td class="board-content"><%=board.getReg_date()%></td>
				</tr>
				<tr>
					<td class="board-title">제목</td>
					<td colspan="3"><input type="text"
						name="title" value="<%=board.getTitle()%>"></td>
				</tr>

				<tr>
					<td class="board-title">내용</td>
					<td colspan="3"><textarea class="board-content content" name="content"
							rows="10" cols="50"><%=board.getContent()%></textarea></td>
				</tr>
				<tr>
					<td class="board-title">비밀번호</td>
					<td colspan="3">
						<input type="password" name="password">
					</td>
				</tr>
				<tr >
					<td colspan="4">
						<button type="submit">수정</button>
						<button onclick="location.href='BoardList.jsp'">목록</button>
						
						<input type="hidden" name="num" value="<%=board.getNum()%>">
					</td>
				</tr>
			</table>
		</form>


	</section>




</body>
</html>