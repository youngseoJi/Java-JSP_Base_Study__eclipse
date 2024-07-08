<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>요청에 대한 응답</title>
</head>
<body>
	<%
	String name = request.getParameter("name");
	/* request 객체의 파라미터로 저장된다. 저장된 파리미터 중 name라는 값을 꺼내는 것 */
	System.out.println("전송받은 값:" + name);

	if (name.equals("강다니엘")) {
	%>
	"<%=name%>" 환영합니다.
	<%
	} else {
	%>
	"<%=name%>" 님은, 누구세요?
	<br> 강다니엘만 입장가능합니다.
	<%
	}
	%>
</body>
</html>