<%@page import="model.MemberDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원정보</title>
</head>
<body>

	<!-- useBean을 사용하여 수정된 회원정보를 받아온다. -->

	<%
	/* request.setCharacterEncoding("UTF-8"); */
	%>

	<!-- 
		id: 페이지 내에서 사용할 빈(Bean)의 이름을 지정합니다.
		class: 빈의 클래스명을 전체 패키지 경로와 함께 명시합니다.
 -->

	<jsp:useBean id="mbean" class="model.MemberBean">
		<jsp:setProperty name="mbean" property="*" />
	</jsp:useBean>

	<%
	String id = request.getParameter("id");

	MemberDAO mdao = new MemberDAO();

	// 스트링 타입으로 저장되어있는 패스워드를 가져옴 (데이터 베이스에서 가져온 password 값 저장 )
	String password = mdao.getPass(id);


	
	// 수정하기 위해 작성한 패스워드 값과 기존 데이터 베이스에서 갖고 온 패스워드 값을 비교한다.

	// 수정하기 위해 입력한 패스워드가 기존 데이터 베이스 저장된 password랑 같다면 ? member 테이블을 수정한다.
	if (mbean.getPassword().equals(password)) {
		
		//  member 테이블을 수정한다. -> memberDao 클래스의 회원수정 메소드 호출 
		mdao.updateMember(mbean); // mbean안에 수정할 내용이 담겨있다.
		
		response.sendRedirect("MemberList.jsp");
		
		
		
	}
	// 다르다면? 알림창과 함께 재입력 창으로 이동한다.
	else {
	%>
	<script type="text/javascript">
		alert("패스워드가 틀렸습니다. 다시 확인하신 후 입력해주세요.")
		history.go(-1);
	</script>
	<%
	}
	%>

</body>
</html>