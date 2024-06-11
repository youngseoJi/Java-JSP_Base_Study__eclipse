<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>계산 입력 폼</title>
</head>
<body>
<!-- post 방식 : 데이터의 길이. 용량에 제한없이 전달할 수 있다. url이 아닌 body안에 데이터가 담겨 전달된다. -->
	<form action="ex03-result.jsp" method="post">
	<input type="text" name="n1"> +<input type="text" name="n2">
	<input type="submit" value="계산">
		<input>
	</form>
</body>
</html>