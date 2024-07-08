<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title> 사용자 입력 폼 </title>
</head>
<body>
입력창에 데이터를 입력 후 전송해주세요.
<form action="ex04-result.jsp" method="post">
	<input type="text" name="name" placeholder="이름"><br>
	<input type="text" name="address" placeholder="주소"><br>
	<input type="checkbox" name="pet" value="dog">강아지 <br>
	<input type="checkbox" name="pet" value="cat">고양이 <br>
	<input type="checkbox" name="pet" value="shark">상어 <br>
	<input type="submit" value="전송"><br>
</form>
</body>
</html>