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
		/*   width: 400px; */
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

		<table style="width: 400px;">
			<tr>
				<td style="width: 150px;">아이디</td>
				<td style="width: 250px"><%=mbean.getId()%></td>
			</tr>
			<tr>
				<td style="width: 150px">이메일</td>
				<td style="width: 250px"><%=mbean.getEmail()%></td>
			</tr>
			<tr>
				<td style="width: 150px">전화</td>
				<td style="width: 250px"><%=mbean.getTel()%></td>
			</tr>
			<tr>
				<td style="width: 150px">취미</td>
				<td style="width: 250px"><%=mbean.getHobby()%></td>
			</tr>
			<tr>
				<td style="width: 150px">직업</td>
				<td style="width: 250px"><%=mbean.getJob()%></td>
			</tr>
			<tr>
				<td style="width: 150px">나이</td>
				<td style="width: 250px"><%=mbean.getAge()%></td>
			</tr>
			<tr>
				<td style="width: 150px">정보</td>
				<td style="width: 250px"><%=mbean.getInfo()%></td>
			</tr>
			
			<!-- 버튼 
			* 수정  
			- 수정 폼 화면 구현 : 실제 보여주는 칸 아이디, 이메일, 전화, 패스워드
			- 조건1 : 패스워드 입력이 동일해야지 수정가능
			- 조건2 : 이메일과 전화번호만 수정가능  
			*  -->
			<tr>
				<td colspan="2"> 
				<!-- 1. 수정 버튼 : 버튼 수정을 누르면  - 수정 폼 화면 불러오기 
						 수정할 작성자의 아이디 값을 넘겨준다. 
						 2. 회원 탈퇴버튼
						 3. 회원 전체 목록조회 버튼 
						 4. 회원 가입
						 -->
				<button onclick="location.href='MemberUpdateForm.jsp?id=<%=mbean.getId()%>'"> 수정 </button>
				<button onclick="location.href='MemberDeleteForm.jsp?id=<%=mbean.getId()%>'"> 회원탈퇴 </button>
				<button onclick="location.href='MemberList.jsp'"> 회원목록 조회 </button>
				<button onclick="location.href='MembeJoinForm.jsp?id=<%=mbean.getId()%>'"> 회원가입 </button> 
				</td>
			</tr>
			
		</table>

	</section>
</body>
</html>