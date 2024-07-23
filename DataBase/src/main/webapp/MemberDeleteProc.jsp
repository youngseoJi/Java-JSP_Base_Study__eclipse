<%@page import="model.MemberDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원 탈퇴</title>
</head>
<body>
	
	<jsp:useBean id="mbean" class="model.MemberBean">
		<jsp:setProperty name="mbean" property="*" />
	</jsp:useBean>

	<%
	MemberDAO mdao = new MemberDAO();

	// 스트링 타입으로 저장되어있는 패스워드를 가져옴 (데이터 베이스에서 가져온 password 값 저장 )
	String password = mdao.getPass(mbean.getId());


	
	// 삭제하기 위해 작성한 패스워드 값과 기존 데이터 베이스에서 갖고 온 패스워드 값을 비교한다.

	// 삭제하기 위해 입력한 패스워드가 기존 데이터 베이스 저장된 password랑 같다면 ?
	if (mbean.getPassword().equals(password)) {
		
		//  member 테이블을 해당 id를 가진 회원을 삭제한다.
		mdao.deleteMember(mbean.getId()) ;
		
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