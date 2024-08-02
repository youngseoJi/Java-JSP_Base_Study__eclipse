<%@page import="model.BoardBean"%>
<%@page import="model.BoardDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>게시글 삭제</title>

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

section {
    display: flex;
    flex-direction: column;
    align-items: center;
}

h2 {
	margin: 10px;
}

table {
	margin-top: 20px; width : 300px;
	border-collapse: collapse;
	border: 1px solid gray;
	width: 300px;
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

.td-input {
	width: 400px;
}

input {
	width: 100%;
}

button {
	padding: 2px 10px;
	margin-left: 10px;
}
</style>
</head>
<body>

	<%
	BoardDAO boardDAO = new BoardDAO();

	int num = Integer.parseInt(request.getParameter("num"));

	// 삭제할 게시글 불러오기 
	BoardBean board = boardDAO.getOneUpdateBoard(num);
	%>

	<section>
		<h5>삭제하시겠습니까?</h5>
		<p>게시글 작성시 입력했던 비밀번호 입력시 삭제가 완료됩니다.</P>
		<p>복구할 수 없으니 확인 후 삭제해주세요.</p>
		<form action="BoardDeleteProc.jsp" method="post">
			<table>
				<tr>
					<td>비밀번호</td>
					<td class="td-input"><input type="password" name="password"></td>
				</tr>
				<tr>
					<td colspan="2"><input type="hidden" name="num"
						value="<%=num%>">
						<button type="submit" onclick="location.href='BoardDeleteProc.jsp'">삭제</button>
						<button onclick="location.href='BoardList.jsp'">목록</button></td>
				</tr>
			</table>

		</form>
	</section>


</body>
</html>
