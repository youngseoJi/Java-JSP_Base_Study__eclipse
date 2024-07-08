<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" import="java.util.*" %>
	<!--java.util.Map 패키지 사용하기 위해 임포  -->
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>데이터 전송완료에 대한 응답 </title>
</head>
<body>

	<%
	
	/*  getParameter : 단일 파라미터 불러오는 것 
		getParameterValues : 여러개의 파라미터를 갖고오기 위해 사용 */
	request.setCharacterEncoding("utf-8");
	String name = request.getParameter("name");
	String address = request.getParameter("address");
	String[] pets = request.getParameterValues("pet");
	
	System.out.println("name:" + name);
	System.out.println("address:" + address);
	for(String pet : pets) {
		System.out.println("pet:" + name);
	}
	

	
	/* Map paramMap = request.getParameterMap();
	String[] paramName = (String[])paramMap.get("pet");
	    for(String param : paramName) {
	    	System.out.print,ln("param:" + param); 
    } */
	%>
	
	전송이 완료되었습니다.
</body>
</html>