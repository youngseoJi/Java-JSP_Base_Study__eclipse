<%@page import="model.BoardDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>게시글 삭제 기능</title>
</head>
<body>

	<%
	String password = request.getParameter("password");
	int num = Integer.parseInt(request.getParameter("num"));

	// 데이터 베이스 연결
	BoardDAO boardDAO = new BoardDAO();

	// 기존의 패스워드 값을받아온다.
	String currentPassword = boardDAO.getCurrentPassword(num);

	// 기존 패스워드와 == 입력한 패스워드가 동일하다면 삭제한다.
	if (currentPassword.equals(password)) {

		// 게시글 삭제 메소드 호출 
		boardDAO.deleteBoard(num);

		response.sendRedirect("BoardList.jsp");
	}

	/* 패스워드가 다를 경우 */
	else {
	%>

	<script type="text/javascript">
		alert("패스워드가 틀려서 삭제 할 수 없습니다. 패스워드를 확인해주세요. ")
		history.go(-1);
	</script>
	<%
	}
	%>







</body>
</html>