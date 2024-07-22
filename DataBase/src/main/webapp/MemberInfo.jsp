<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="model.MemberDAO"%>
<%@ page import="model.MemberBean"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<!-- 1. memberList에서 선택하면서 넘긴 id를 받아준다.
		 2. 데이터 베이스에서 회원 한 명의 정보를 갖고온다.
		 3. table 태그를 이용하여 화면에 회원 한 명의 정보를 출력한다. 
  -->

	<%
	/* 1. memberlist 에서 넘어온 id 받기*/
	String id = request.getParameter("id");
	// 데이터베이스 객체 생성
	MemberDAO mdao = new MemberDAO();
	// 2. 데이터 베이스에서 회원 한 명의 정보를 갖고온다.
	MemberBean mbean = mdao.oneSelectMember(id); // 해당하는 id의 회원정보를 리턴
	%>

	<section>
		<h2>회원 정보 보기</h2>

		<table style="width: 400px; border: 1;">
			<tr style="height: 50px">
				<td style="align-content: center; width: 150px">아이디</td>
				<td style="width: 250px">
			  	<%= mbean.getId() %>
				</td>
			</tr>
			<tr style="height: 50px">
				<td style="align-content: center; width: 150px">이메일</td>
				<td style="width: 250px">
					<%= mbean.getEmail() %>
				</td>
			</tr>
			<tr style="height: 50px">
				<td style="align-content: center; width: 150px">전화</td>
				<td style="width: 250px">
					<%= mbean.getTel() %>
				</td>
			</tr>
			<tr style="height: 50px">
				<td style="align-content: center; width: 150px">취미</td>
				<td style="width: 250px">
					<%= mbean.getHobby() %>
				</td>
			</tr>
			<tr style="height: 50px">
				<td style="align-content: center; width: 150px">직업</td>
				<td style="width: 250px">
					<%= mbean.getJob() %>
				</td>
			</tr>
			<tr style="height: 50px">
				<td style="align-content: center; width: 150px">나이</td>
				<td style="width: 250px">
					<%= mbean.getAge() %>
				</td>
			</tr>
			<tr style="height: 50px">
				<td style="align-content: center; width: 150px">정보</td>
				<td style="width: 250px">
					<%= mbean.getInfo() %>
				</td>
			</tr>
		</table>

	</section>
</body>
</html>