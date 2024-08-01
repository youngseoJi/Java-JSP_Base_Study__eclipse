<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>답글입력 페이지</title>

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
</style>
</head>


<body>

	<section>

		<h2>답글작성</h2>

		<%
		// 게시글 상세정보 답글 버튼 클릭 -> 파라미터로 넘어오는 데이터 갖고오기 
		int num = Integer.parseInt(request.getParameter("num"));
		int ref = Integer.parseInt(request.getParameter("num"));
		int re_step = Integer.parseInt(request.getParameter("num"));
		int re_level = Integer.parseInt(request.getParameter("num"));
		%>

		<!-- form에 입력한 데이터가 post방식으로 보호한다.
		 		 BoardReWriteProc.jsp에서 데이터를 처러히도록 넘겨준다.  -->
		<form action="BoardReWriteProc.jsp" method="post">
			<table>
				<tr>
					<td>작성자</td>
					<td class="td-input"><input type="text" name="writer">
					</td>
				</tr>
				<tr>
					<td>제목</td>
					<td><input type="text" name="title" value="[답변]"></td>
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

				<!-- form에서 입력받지 않은 데이터를 넘김
						 type 을 hidden값을 이용!			
						 
						 num은 넘기면 안되고, 글이 생성될때마다 +1 자동증가한다.
				 -->
				<tr>
					<td colspan="2">
						<input type="hidden" name="ref" value="<%=ref%>">
						<input type="hidden" name="re_step" value="<%=re_step%>">
						<input type="hidden" name="re_level" value="<%=re_level%>">
						<button type="submit">완료</button>
						<button type="reset">취소</button>
						<button onclick="location.href='BoardList.jsp'">목록</button>
					<td>
				</tr>


			</table>
		</form>

	</section>


</body>
</html>

