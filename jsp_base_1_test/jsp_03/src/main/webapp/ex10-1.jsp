<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	<!-- 중요  -->
	
	<!-- 요청을 했을때 받아지는  -->
<%
	/* 1. 저장 : 객체들을 이용하여 데이터를 따로 저장해 둘 수 있다. 각 객체에 각 이름을 지정하여 저장  */
	pageContext.setAttribute("name", "page scope");
	request.setAttribute("name", "request scope");
	session.setAttribute("name", "session scope");
	application.setAttribute("name", "application scope");
	/* 2. 출력: 각 객체에 담았던 속성중 name이라는 데이터를 갖고와 출력한다.*/
	System.out.println("현재 범위 페이지:");
	System.out.println("페이지범위: " + pageContext.getAttribute("name"));
	System.out.println("요청범위: " + request.getAttribute("name"));
	System.out.println("세션범위: " + session.getAttribute("name"));
	System.out.println("애플리케이션범위: " + application.getAttribute("name"));
	
	/* 3. 전달 : 현재 요청(request)과 응답(response)을 다른 JSP로 전달 */

	/* 출력 후 요청 정보 안에 요청의 흐름을 조작할수있는 객체를 사용하여 ex10-2.jsp 
		 생성된 요청-응답 객체를(데이터를) 그대로 전달해준다.
		 
		 -> 그다음 ex10-2가처리가되는 것 */
	request.getRequestDispatcher("ex10-2.jsp").forward(request, response);
	 %>


<!-- 
	페이지범위: page scope
	요청범위: request scope
	세션범위: session scope
	애플리케이션범위: application scope -->
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title></title>
</head>
<body>

</body>
</html>