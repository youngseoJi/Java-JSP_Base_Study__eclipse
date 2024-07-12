<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login Success</title>
</head>
<body>

<!--
	(사실 세션을 사용한다.) 

	Forward 액션태그 사용하는 이유
	리퀘스트 객체의 데이터를 유시키기거나 값을임의적으로 변경하고 싶을때
	Forward 액션태그로 흐름제어를 하면 request내의 데이터가 그대로 유지되어 response.sendRedirect쪽, 다른 페이지 로 데이터를 넘길 수 있다. 
	
	request는 response.sendRedirect 다른 페이지로 리다이랙트 하면 -> 데이터가 날라간다. 
 -->


	<h3>로그인 시 입력된 로그인 정보가 넘어오는 페이지 입니다</h3>

<% 
 	request.setCharacterEncoding("UTF-8");
 
 	String id = request.getParameter("id"); // request 객체에 담겨진 사용자 정보중 id만 추출하여 갖고온다.
 	
 	/* request는 redirect 다른 페이지로 리다이랙트 하면 -> 데이터가 날라간다. */
 	/* response.sendRedirect("ResponseRedirect.jsp"); */
 	
 	/* 해당 방식으로 보내면 데이터를 유지시킬 수 있다. (중요한 데이터아닐경우만)
 		-> response.sendRedirect("ResponseRedirect.jsp?id="+id); */ 
%>

<!--JSP 액션태그 forward -->
<jsp:forward page="ResponseRedirect.jsp"/> <!--객체의 데이터유지 -->
<%-- 
    <jsp:param name="id" value="023334444"/>
 
</jsp:forward> --%>
<!-- 임의적 데이터 변경 -->
    <%-- <jsp: name="phone" value="023334444"/> <!-- 임의적 데이터 추가 --> --%>
<%-- </jsp:forward> --%>

 <!-- 흐름제어 -->
<h3> <%=id %></h3>
</body>
</html>