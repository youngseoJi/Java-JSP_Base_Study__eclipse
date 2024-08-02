<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>


<style>
* {
	box-sizing: border-box;
	margin: 0;
	padding: 0;
}

body {
	width: 100%;
	height: 100vh;
	text-align: center;
	display: flex;
	justify-content: center;
	align-items: center;
	margin: 0;
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
	width: 400px;
}

.content {
	height: 300px;
	width: 100%;
	padding: 5px 10px;
}

button {
	padding: 2px 10px;
	margin-left: 10px;
}



/* .all-btn {
	width: 100px;
} */
</style>
</head>
<body>

	<section>
		<h2>게시글 쓰기</h2>

		<form action="BoardWriteProc.jsp" method="post">
			<table>
				<tr>
					<td>작성자</td>
					<td class="board-content"><input type="text" name="writer"></td>
				</tr>
				<tr>
					<td>제목</td>
					<td class="board-content"><input type="text" name="title"></td>
				</tr>
				<tr>
					<td>이메일</td>
					<td class="board-content"><input type="email" name="email"></td>
				</tr>
				<tr>
					<td>비밀번호</td>
					<td class="board-content"><input type="password"
						name="password"></td>
				</tr>
				<tr>
					<td>내용</td>
					<td><textarea class="board-content content" name="content"
							rows="10" cols="50"></textarea></td>
				</tr>
				<tr>

					<td class="td-btn" colspan="2">
						<button type="submit">완료</button>
						<button onclick="location.href='BoardList.jsp'">목록</button>
					</td>
				</tr>
			</table>
		</form>

	</section>

</body>
</html>