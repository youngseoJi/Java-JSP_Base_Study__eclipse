<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="model.MemberDAO"%>
<%@ page import="model.MemberBean"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

<style>
  body {
  margin : 0px;
  padding: 0px;
 	box-sizing: content-box;
  display: flex;
  justify-content: center;
  }
  
  section{
    text-align: center;
    }

	table {
		border-collapse: collapse;
	}
	
	td {
		text-align: center;
	}
	tr {
	height : 50px;
	}
	
	td {
		border: 1px solid black;
	}
</style>
</head>
<body>


	<!--  수정  
			- 수정 폼 화면 구현 : 실제 보여주는 칸 아이디, 이메일, 전화, 패스워드
			- 조건1 : 패스워드 입력이 동일해야지 수정가능
			- 조건2 : 이메일과 전화번호만 수정가능  
			*  -->


	<%
	/* 1. memberInfo 유저 상세정보 보기창 에서 넘어온 id 받기*/
	String id = request.getParameter("id");
	// 데이터베이스 객체 생성
	MemberDAO mdao = new MemberDAO();
	// 2. 데이터 베이스에서 회원 한 명의 정보를 갖고온다.
	MemberBean mbean = mdao.oneSelectMember(id); // 해당하는 id의 회원정보를 리턴
	%>

	<section>
		<h2>회원 정보 수정하기</h2>


		<table style="width: 400px">

	<!-- form 데이터 보내기 -->
			<form action="MemberUpdateProc.jsp" method="post">
			<tr>
				<td style="width: 150px">아이디</td>
				<td style="width: 250px"><%=mbean.getId()%></td>
			</tr>
			<tr>
				<td style="width: 150px">이메일</td>
				<td style="width: 250px"><input type="email" name="email"
					value="<%=mbean.getEmail()%>"></td>
			</tr>
			<tr>
				<td style="width: 150px">전화</td>
				<td style="width: 250px"><input type="tel" name="tel"
					value="<%=mbean.getTel()%>"></td>
			</tr>
			<tr>
				<td style="width: 150px">비밀번호</td>
				<td style="width: 250px"><input type="password" name="password"
					value="<%=mbean.getPassword()%>">
			</tr>

			<!-- 버튼
					1. 수정버튼 
					2. 회원 전체보기 
			 -->
			<tr>
				<td colspan="2"><input type="submit" value="회원 수정하기">
					</form>
					
					<button onClick="location.href='MemberList.jsp'">회원 전체 보기</button>
				</td>
			</tr>


		</table>

	</section>
</body>
</html>