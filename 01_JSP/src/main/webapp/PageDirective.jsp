<!-- page 페이지 디렉티드 : jsp_ 페이지를 구성하는 요소 정의

		language :JSP 스크립트 코드에서 사용되는 프로그해밍 언어 지정 (기본값 :java)
		contentType : JSP가 생성할 문서의 타입 지정 (기본값 : text/html_)
		import : JSP 페이지에서 사용할 자바 클래스 지정
		session : JSP 페이지가 세션을 사용할지 여부 지정 true(기본값) /false
		- 개녕 : 페이지가 바뀌어도 정보를 계속해서 저장하는 것
		buffer : JSP 페이지의 출력 버퍼크기 지정 최소 8kb 
		- : 네트워크라든가 어떤 특별한 문제가 생겼을때 를 비하여버퍼를만들어둠 
		autoFlush : 출력 버퍼가 다 찼을 경우 자동으로 버퍼에 있는 데이터를 출력 스트림에 보내고 비울지 여부, 버퍼의 내용이 가득 파지 않아도 강제출력하게 해준다.
		  true(기본)/false(에러발생)
		  
		  요약 : 페이지 양이 많지 않다 하더라도 결과를 사용하자 볼수있돌곡 해놓는게 버퍼와 오토플러쉬 속성이다.
		info :JSP 페이지에 대한 설명, 선언 
		
		errorPage : JSP 페이지를 실행하는 도중 에러가 발생할때 보여줄 페이지 지정
		"에러가 났을 경우 보여줄 페이지" 
		isErrorPage : 현재페이지가 에러가 발생되면 지정한 에러페이지를 보여주는 것의 여부를 지정  / true (에러 보여줌) false 기본값
-->
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="java.util.Date" errorPage="Error.jsp" isErrorPage="true" %> 
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

정상 화면이다!
<!-- 스크립트 릿-->
<%
 int sum = 10/0;
// 에러 발생 코드 작성 테스트 -> Error.jsp 실행 

%>
</body>
</html>