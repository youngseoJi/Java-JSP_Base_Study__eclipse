<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Request 내장객체</title>
<!-- - form태그로 전달받은 데이터 불러와 출력하기 -->

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
</style>
</head>
<body>
<section>
	<h2>회원 방식</h2>
	
	<!-- post 방식으로 데이터가 넘어올떄 한글이 깨지는 거 방지 -->
<% request.setCharacterEncoding("UTF-8"); 
	 /* 각족 사용자로부터 넘어온 데이터를 저장해준다. */
	String id = request.getParameter("id");
	String password = request.getParameter("password");
	String passwordConfirm = request.getParameter("passwordConfirm");
	String email = request.getParameter("email");
	String tel = request.getParameter("tel");
	
	/* checkbox 데이터럼 여러개의 값이 있을 수 있는 경우 
	   getParameterValues 이용하여 여러개 값을 []배열 타입으로 리턴 */
	String [] hobby = request.getParameterValues("hobby");
	
	String job = request.getParameter("job");
	String age = request.getParameter("age");
	String info = request.getParameter("info");
	
	/* 비밀번호 확인 */
	if(!password.equals(passwordConfirm)){		
%>
	<script type="text/javascript">
		alert("비밀번호가 다릅니다. 확인 후 다시 입력해주세요.")
		history.go(-1); // 이전페이지로 이동
	</script>
<%} %>

<!-- 데이터 출력 -->
		<table>
			<tr>
				<td class="labelTd">아이디</td>
				<td class="inputTd"><%=id%></td>
			</tr>
			<tr>
				<td class="labelTd">패스워드</td>
				<td class="inputTd"><%=password%></td>
			</tr>
			<tr>
				<td class="labelTd">이메일</td>
				<td class="inputTd"><%=email%></td>
			</tr>
			<tr>
				<td class="labelTd">전화번호</td>
				<td class="inputTd"><%=tel%></td>
			</tr>
			
			<!-- 배열로 갖고온 데이터 출력하는 방법 -->
			<tr>
				<td class="labelTd">취미</td>
				<td class="inputTd">
					<%
					for (int i = 0; i < hobby.length; i++) {
						/* 메소드 사용방법 */
					/* 	out.write(hobby[i]); */
					%> 
					<!-- 표현식 사용방법 -->
						<%=hobby[i] + " "%>
					<%
 					}
 					%>
				</td>
			</tr>
			<tr>
				<td class="labelTd">연령</td>
				<td class="inputTd"><%=tel%></td>
			</tr>
			<tr>
				<td class="labelTd">직업</td>
				<td class="inputTd"><%=job%></td>
			</tr>
				<tr>
				<td class="labelTd">하고싶은 말</td>
				<td class="inputTd"><%=info%></td>
			</tr>
			
		</table>

	</section>

</body>
</html>