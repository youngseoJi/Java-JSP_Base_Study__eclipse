<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">

<title>Insert title here</title>

<style>
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
	
	/* 라벨용 TD 스타일 */
	.labelTd {
		text-align: center;
		width: 150px;
	}
	/* 입력 필드용 TD 스타일 */
	.inputTd {
		text-align: center;
		width: 300px;
	}
</style>

</head>
<body style="text-align: center; width: 100%;">

	<div >
		<h2>로그인 페이지</h2>

		<!-- form 
				action : 현재 페이지에서 작성한 정보를 넘겨주는 파일명  
				method : 전송방식 
				
			  request 범위 RequestLoginProc.jsp 해당 페이지 까지만 사용할수있다.
				-->

		<form action="RequestLoginProc.jsp" method="post">
			<table>
				<tr>
					<td class="labelTd">아이디</td>
					<td class="inputTd">
					<!-- input 에 name을 제공해야지 -> 서버에서 읽고 데이터를 갖고 올수있다. -->
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
					<!-- submit 을 누르면! 
							 action이 시작되며 form내에 작성한 데이터가 넘어간다.  -->
							
					<input type="submit" value="전송">
					</td>
				</tr>
			</table>
		</form>
	</div>
</body>
</html>