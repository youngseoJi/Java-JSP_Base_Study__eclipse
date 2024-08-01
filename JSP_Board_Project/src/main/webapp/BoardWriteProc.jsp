<%@page import="model.BoardDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<!-- 글쓰기 처리 -->
<title>Insert title here</title>
</head>
<body>

	<%-- <% 
	request.setCharacterEncoding("UTF-8;");//한글처리
	
%> --%>

	<!-- useBean 사용하여 게시글 작성한 데이터를 한번에 갖고와 읽어드리기 
		 id: 해당 빈클래스를 지칭하는 레퍼런스 변수명 역할 
-->

	<jsp:useBean id="boardbean" class="model.BoardBean">
		<!-- name : 현재 사용하는 bean클래스 이름  
  		 property : 데이터를 1:1 매핑 시키기, 입력받지 않은 에이터는 null값으로 매핑된다.
  		 						또한 초기값을 데이터베이스에 지정해두면 해당 데이터로 매핑된다. 
  		 -->
		<jsp:setProperty name="boardbean" property="*" />
	</jsp:useBean>

	<%
	// 데이터 베이스 쪽으로 빈클래스 넘겨
	BoardDAO boardDAO = new BoardDAO();

	// 데이터 저장 메소드를 호출
	boardDAO.insertBoard(boardbean);
	%>
</body>
</html>