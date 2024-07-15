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

	// 취미는 별도록 읽어드려서 다시 빈클래스에 저장해야한다. 여러개의 데이터가 들어올 수 있기 때문이다.
	// 배열에 취미 선택값을 불러온다.
	String[] hobby = request.getParameterValues("hobby");
	// 배열의 데이터를 하나의 문자열타입, 문자로 저장한다.
	String textHobby="";
	
	for(int i= 0; i< hobby.length; i++){
		textHobby += hobby[i]+" ";
	}
	
%>

<!-- usebean_을 이용하여 한번에 데이터 받아오기 -->

<jsp:useBean id="mbean" class="model.MemberBean">
	<jsp:setProperty name="mbean" property="*"/> <!-- 매핑 -->
</jsp:useBean>


<%
/* 기존 매핑했던 값에는, 취미에 체크한 주소들이 저장되기에
	 위의 배열의 내용을 하나의 문자열로 저장한 변수를 다시 저장해준다. */
	mbean.setHobby(textHobby);

%>

	<h2>아이디 = <%=mbean.getId() %></h2>
	<h2>취미 = <%=mbean.getHobby() %></h2>


</body>
</html>