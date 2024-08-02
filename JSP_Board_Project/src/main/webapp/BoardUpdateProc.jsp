<%@page import="model.BoardDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<%
	request.setCharacterEncoding("UTF-8");
	%>

	<!-- bean클래스 : 사용데이터 bean에 저장하기 -->
	<jsp:useBean id="boardbean" class="model.BoardBean">
		<jsp:setProperty name="boardbean" property="*" />
	</jsp:useBean>

	<%
	// 데이터 베이스 연결 
	BoardDAO boardDAO = new BoardDAO();

	//  수정할 수 있는 권한 확인방법 
	/*  게시글 번호로 조회하여 수정할 게시글의 기존 비밀번호 갖고오기 : 해당글 수정권한이 있는 사람인지 확인하기 위해 	*/
	String password = boardDAO.getCurrentPassword(boardbean.getNum());

	/* 기존 패스워드 값과 수정할때 작성한 password 의 값과 동일한지 비교  */
	if (password.equals(boardbean.getPassword())) {

		// 게시글 수정 메소드 호출 
		boardDAO.updateBoard(boardbean);

		// 수정이 완료되면 목록보기로 이동 
		response.sendRedirect("BoardList.jsp");

	}
	/* 패스워드가 다를 경우 */
	else {
	%>

	<script type="text/javascript">
		alert("패스워드가 일치하지않습니다. 다시 확인 후 수정해주세요.");
		history.go(-1);
	</script>
	<%
	}
	%>
</body>
</html>