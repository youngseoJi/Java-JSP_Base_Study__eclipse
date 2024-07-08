<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<titl>사용자 입력 폼
</title>
</head>
<body>
	<!-- 브라우저가 서버에 보낸데이터 무엇이냐에 따라서 서버에서는 처리된 결과 이후 결과물이 브라우저에 나오게한다. -->
	<form action="ex02-result.jsp">
		<input type="text" name="name" placeholder="문자를 입력해주세요."> <input
			type="submit" value="전송">
		<!--submit : form에 있는 모든 데이터를 묶어서 지정된 곳으로 요청하는 것이다.
  	요청하는 url 뒤에 name이라는 이름으로 값이 전달이된다.
  	http://localhost:8080/jsp03/ex02.jsp?name=%EC%9B%90%EB%B9%88 (원빈)  -->
	</form>
</body>
</html>