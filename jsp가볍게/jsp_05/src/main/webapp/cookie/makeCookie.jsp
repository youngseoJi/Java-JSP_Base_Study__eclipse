<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

	<!--  
	쿠키 : 간단하 데이터를 저장하는 조각
	쿠키의 용도 : 서버에서 생성하고 브라우저에 응답하여 저장하도록 하는 데이터 조각	
	브라우저는 저장된 쿠키를 해당 사이트에 자원 요청시 포함하여 전송한다.
	브라우저가 사이트를 이용하면서 유지할 값이 있다면 사용한다.
	
	
	쿠키 생성 과정
	브라우저에서 서버로 자원을 요청
	
	서버에서 쿠키 생성 및 응답에 포함
	브라우저는 응답받은 쿠키를 저장소에 저장
	해당 사이트로 요청 시 쿠키를 함께 전송
	요청에서 쿠키 정보를 확인
	
	쿠키의 구성요소
	이름: 쿠키 이름
	값: 이름에 연결된 값
	유효시간: 초 단위 시간 (설정하면 해당 시간 동안 유지하도록 하고 설정하지 않으면 브라우저가 종료될 때까지 유지됨)
	도메인 : 쿠키를 생성한사이트
	경로 : 쿠키를 전송할 요청 URL (일반적으로 최상위)
	-->


<%
	/* 쿠키 셍성 */
	Cookie cookie1 = new Cookie("name", "HGD");
	Cookie cookie2 = new Cookie("age", "20");
	/* 경로 설정 */
	cookie2.setPath(request.getContextPath() + "/path1");
	
	/* age에만 경로를 지정했을때  
	http://localhost:8080/jsp_05/cookie/viewCookie.jsp 
	
	
	*/ 
	
	/* 서버에서 쿠키가 만들어 졌다는 것을 확인하기 위한 코드 -> 쿠키값 갖고오기 / 다른 메소드도 많다  */
	System.out.println("name: " + cookie1.getValue());
	System.out.println("age: " + cookie2.getValue());
	
	/* 서버에서 응답하는 내용에 쿠키를 추가하여 응답한다.
		브라우저는 이제 요청할때마다 해당 쿠키를 담아 요청해야한다.*/
	response.addCookie(cookie1);
	response.addCookie(cookie2);
%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>쿠키 생성</title>
</head>
<body>
	쿠키가 생성 되었습니다.
</body>
</html>
