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
	text-align: center;
	display: flex;
	justify-content: center;
	margin: 20px;
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
	height: 40px;
	border: 1px solid gray;
}

td {
	width: 100px;
	border: 1px solid gray;
	padding: 5px 20px;
}

.td-input {
	width: 400px;
}

textarea {
	width: 100%;
	height: 100px;
	padding: 10px;
	line-height: 1.5;
	border: 1px solid gray;
}

input {
	width: 100%;
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
					<td>작성자</td>
					<td class="td-input"><%= board.getWriter() %></td>
				</tr>
				<tr>
					<td>제목</td>
					<td class="td-input"> <input type="text" name="title" value="<%= board.getTitle() %>"></td>
				</tr>
				<tr>
					<td>이메일</td>
					<td class="td-input"><%= board.getEmail() %></td>
				</tr>
				<tr>
					<td>비밀번호</td>
					<td class="td-input"><%= board.getPassword() %></td>
				</tr>
				<tr>
					<td>내용</td>
				<td class="td-input">
					<textarea name="content" rows="10" cols="50"><%= board.getContent() %></textarea></td>
				</tr>
			</table>
		</form>


	</section>




</body>
</html>