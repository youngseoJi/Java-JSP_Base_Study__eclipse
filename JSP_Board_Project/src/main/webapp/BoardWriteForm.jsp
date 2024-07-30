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
	text-align: center;
	display: flex;
	justify-content: center;
	margin:20px;
}

h2 {
margin:10px;
}
table {
	width: 500px;
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
					<td class="td-input"><input type="text" name="writer"></td>
				</tr>
				<tr>
					<td>제목</td>
					<td class="td-input"><input type="text" name="title"></td>
				</tr>
				<tr>
					<td>이메일</td>
					<td class="td-input"><input type="email" name="email"></td>
				</tr>
				<tr>
					<td>비밀번호</td>
					<td class="td-input"><input type="password" name="password"></td>
				</tr>
				<tr>
					<td>내용</td>
					<td class="td-input"><textarea name="content" rows="10"
							cols="50"></textarea></td>
				</tr>
				<tr>

					<td class="td-btn" colspan="2">
						<button type="submit">작성하기</button>
						<button type="reset">수정하기</button>
						<button class="all-btn" onclick="location.href='BoardList.jsp'">전체
							게시글</button>
					</td>
				</tr>
			</table>
		</form>

	</section>

</body>
</html>