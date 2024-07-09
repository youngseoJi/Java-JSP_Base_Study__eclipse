<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<!-- 하지만 선언문(디클레이션)은 거의 쓰지않는다. 외부의 자바클래스에 별도로만들고 갖고온다. 선언문이 뭔지만 알고 넘어가는것 -->

<!-- 멤버/전역 메소드 클래스 레벨! -->
<%!
	public void inCrement(){
	
	}
%>

<!-- 멤버/ 전역 변수 -->
<%!
	int a= 10;
%>

<!-- 서비스 /지역변 -->
<%
	int a= 100;
%>

<!-- 같은 지역변수 중복 에 -->
<%-- <%
	int a = 1000;
%> --%>
</body>
</html>