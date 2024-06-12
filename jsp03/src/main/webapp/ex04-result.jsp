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

	Map paramMap = request.getParameterMap();
	String[] paramName = (String[])paramMap.get("pet");
	/* for(String param : paramName) {
		
	} */
	    for(String param : paramName) {
	    	System.out.println("param:" + param); 
    }
	%>
	
	전송이 완료되었습니다.
</body>
</html>