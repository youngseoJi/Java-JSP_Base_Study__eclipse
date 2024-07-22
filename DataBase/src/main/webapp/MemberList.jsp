<%@page import="model.MemberBean"%>
<%@page import="java.util.Vector"%>
<%@page import="model.MemberDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>MemberList</title>

<style>
body {
	width: 100%;
	text-align: center;
	display: flex;
	justify-content: center;
}

table {
	border: 1px solid black;
}

td {
	text-align: center;
}
</style>
</head>
<body>

	<!-- 1. 데이터베이스에서 전체 회원의 정보 갖고오기 -->

	<%
	MemberDAO mdao = new MemberDAO();

	/* 회원들의 정보가 얼마나 저장되어있는지 모르기에 가변길이인 vector을 이용하여 데이터를 저장한다. */
	/* MemberBean 회원 데이터만 Vector에 저장한다.*/
	Vector<MemberBean> vec = mdao.allSelectMember();
	
	%>

	<!-- 2. table태그를 이용하여 화면에 회원들의 정보를 출력 -->

	<section>

		<h2>전체 회원목록</h2>
		<table style="width: 800px">
			<tr height="50">
				<td style="width: 150px">아이디</td>
				<td style="width: 250px">이메일</td>
				<td style="width: 200px">전화번호</td>
				<td style="width: 200px">취미</td>
			</tr>
			<%
			for (int i = 0; i < vec.size(); i++) {
				MemberBean bean = vec.get(i); // 백터에 담긴 빈클래스를 하나씩 추출
			%>
			<tr height="50">
			<!-- 3. 상세보기 기능 생성하기 
							- 아이디를 누르면 상세보기로 넘어간다.
							- 특정 아이디 값에 해당하는 상세보기 창으로 가기 위
							  p_k키 id값 넘겨줘야한다.
				 -->
				<td style="width: 150px">
				<a href="MemberInfo.jsp?id=<%=bean.getId()%>"> <%=bean.getId()%></a>
				</td>
				<td style="width: 250px"><%=bean.getEmail()%></td>
				<td style="width: 200px"><%=bean.getTel()%></td>
				<td style="width: 200px"><%=bean.getHobby()%></td>
			</tr>
			<%
			}
			%>
		</table>
	</section>
</body>
</html>


<!-- 리스트 인터페이스 : 배열처럼 생기고, 인덱스가 있다.  
			 배열과 다른 점은 고정길이가 아닌 가변길이다.  
			 자동으로 데이터가 늘어남에따라 저장공간이 증가되고, 데이터가 줄면 감소한다. 메모리를 효율적으로 사용할수있다.
	-->


