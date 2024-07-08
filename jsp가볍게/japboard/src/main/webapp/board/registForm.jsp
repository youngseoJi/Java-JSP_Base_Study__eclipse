<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<!--게시글 등록창  -->
<title>게시글 작성하기</title>
</head>
<body>

<!-- 폼 입력값이 -> 한글깨짐현상 해결이 안되는 상황-->
<% request.setCharacterEncoding("UTF-8"); %>

	<form action="regist.jsp" method="post" accept-charset="utf-8">
		<input type="text" name="title" placeholder="제목" required><br>
		<input type="text" name="writer" placeholder="작성자" required><br>
		<textarea rows="15" cols="16" name="content" placeholder="내용을 입력해주세요"></textarea><br>
		<input type="submit" value="등록">
	</form>

</body>
</html> 