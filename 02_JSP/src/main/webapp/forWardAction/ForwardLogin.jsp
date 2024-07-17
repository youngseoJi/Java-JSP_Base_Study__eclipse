<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
/* 공통만 지정해두기 */
* {
	margin: 0px;
	padding: 0px;
}

body {
	display: flex;
	justify-content: center;
	align-content: center;
}

td {
	text-align: center;
}

.selectBtn {
	display: flex;
	justify-content: center;
	gap: 10px;
}
</style>
</head>


<body>

	<form action="ResponseProc.jsp" method="post">
		<table style="width: 400px;" border="1">
			<tr height="50px">
				<td width="150px">아이디</td>
				<td width="250px"><input type="text" name="id"></td>
			</tr>
			<tr height="50px">
				<td width="150px">패스워드</td>
				<td width="250px"><input type="password" name="password"></td>
			</tr>
			
			<!--로그인 / 취소버튼 -->
			<tr height="50px">
				<td colspan="2">
					<input type="submit" value="로그인"> &nbsp;&nbsp;
					<input type="reset" value="취소">
				</td>
			</tr>
		</table>
	</form>
</body>
</html>