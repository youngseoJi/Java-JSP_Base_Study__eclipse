<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>response 내장객체</title>

<style>

  body {
   width: 100%;
   text-align: center;
   }
	table {
		width: 400px;
		border-collapse: collapse;
	}
	tr {
		height:60px;
	}
	td {
		border: 1px solid black;
	}
	
	.labelTd {
		text-align: center;
		width: 150px;
	}
	.inputTd {
		text-align: center;
		width: 300px;
	}
</style>

</head>
<body>

	<div >
		<h2>로그인 페이지</h2>
		<form action="RsponsetLoginProc.jsp" method="post">
			<table>
				<tr>
					<td class="labelTd">아이디</td>
					<td class="inputTd">
						<input type="text" name="id"></td>
				</tr>
				<tr>
					<td class="labelTd">비밀번호</td>
					<td class="inputTd">
						<input type="password" name="password">
					</td>
				</tr>
				
				<tr>
					<td colspan="2" align="center">
					<input type="submit" value="전송">
					</td>
				</tr>
			</table>
		</form>
	</div>
</body>
</html>