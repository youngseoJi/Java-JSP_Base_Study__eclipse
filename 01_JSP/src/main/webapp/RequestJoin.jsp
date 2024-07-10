<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Request 내장객체 </title>
<!-- Request 요청에 적절한 데이터 넘기기 -->

<style>
body {
	margin: 0;
	width: 100%;
	text-align: center;
	display: flex;
	justify-content: center;
}

table {
	width: 400px;
	border-collapse: collapse;
	border: 1px solid black;
}

tr {
	height: 50px;
	border: 1px solid black;
}

td {
	border: 1px solid black;
}

/* 라벨용 TD 스타일 */
.labelTd {
	width: 150px;
}
/* 입력 필드용 TD 스타일 */
.inputTd {
	/* width: 300px; */
	
}

.inputTd textarea {
	width: 95%; 
	height: 100px; 
	border: 1px solid #ccc;
	padding: 5px; 
}
</style>

</head>
<body>

	<section>
		<h2>회원가입</h2>
		<form action="RequestJoinProc.jsp" method="post">
			<table>
				<tr>
					<td class="labelTd">아이디</td>
					<td class="inputTd">
						<input type="text" name="id">
					</td>
				</tr>
				<tr>
					<td class="labelTd">패스워드</td>
					<td class="inputTd">
						<input type="password" name="password">
					</td>
				</tr>
				<tr>
					<td class="labelTd">패스워드 확인</td>
					<td class="inputTd">
						<input type="password" name="passwordConfirm">
					</td>
				</tr>
				<tr>
					<td class="labelTd">이메일</td>
					<td class="inputTd">
						<input type="email" name="email">
					</td>
				</tr>
				<tr>
					<td class="labelTd">전화번호</td>
					<td class="inputTd">
						<input type="tel" name="tel">
					</td>
				</tr>
				<tr>
				<td class="labelTd">취미</td>
					<td class="inputTd">
						<input type="checkbox" name="hobby" value="캠핑"> 캠핑
						<input type="checkbox" name="hobby" value="영화"> 영화
						<input type="checkbox" name="hobby" value="운동"> 운동
						<input type="checkbox" name="hobby" value="독서"> 독서
					</td>
				</tr>
						<tr>
				<td class="labelTd">연</td>
					<td class="inputTd">
						<input type="radio" name="hobby" value="10"> 10대
						<input type="radio" name="hobby" value="20"> 20대
						<input type="radio" name="hobby" value="30"> 30대
						<input type="radio" name="hobby" value="40"> 40대
					</td>
				</tr>
					<tr>
					<td class="labelTd">직업</td>
					<td class="inputTd">
						<select name="job">
							<option value="개발자">개발자</option>
							<option value="의사">의사</option>
							<option value="기술사">기술사</option>
							<option value="변호사">변호사</option>
						</select>
					</td>
				</tr>
				
					<tr>
					<td colspan="2">
						<button type="submit">회원가입</button>
						<button type="reset">취소</button>
					</td>

					<!-- 		<td colspan_="2">
						<input type="submit" value="회원가입">
						<input type="reset" value="취소">
					</td> -->
				</tr>
				
				
			</table>
		</form>
	</section>

</body>
</html>