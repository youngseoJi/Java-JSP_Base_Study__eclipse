<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="java.util.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>application 객체</title>
<!-- 프로젝트를 톰캣을통해서 실행될떄 최초로 생성되는 기본객체가 application이다.
 서버가 실행될때 만들어져서 서버가 종료될떄까지 남아있는 , 서비스 하고자 하는 서비스자체 application이다. 
 
 applicatio이 실행될때 필요한데이터가 있으면 톰캣에 미리 초기화 파람미터를 설정 해두고 
 이름으로 값을 꺼내 필요한 곳에 사용할수있도록한다. -->
</head>
<body>
	<%
	Enumeration enumData = application.getInitParameterNames();
	while (enumData.hasMoreElements()) {
		String initParamName = (String) enumData.nextElement();
		String initparamValue = application.getInitParameter(initParamName);
		System.out.println(initParamName + ":" + initparamValue);
	}
	%>
	application 정보 예제
	<br> 서버 정보 파라미터 확인하는!
	<br> 서버정보: <%=application.getServerInfo()%><br> 
	서버 주요 버전: <%=application.getMajorVersion()%><br> 
	서버의 마이너 버전: <%=application.getMinorVersion()%>

</body>
</html>