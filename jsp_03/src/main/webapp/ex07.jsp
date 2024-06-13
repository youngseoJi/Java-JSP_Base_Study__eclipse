<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<!-- pageContext
	: JSP 페이지의 컨텍스트 정보를 포함하고 있는 객체. 
	기본객체들에 대한 접근을 가능하게 한다.
	페이지 내의 모든 정보를 관리하고 접근할 수 있게 함. -->
<body>
<%
    HttpServletRequest httpRequest = (HttpServletRequest)pageContext.getRequest();
	/* 자동생성된  request 객체와 pageContext를 통해 갖고온 httpRequest객체 동하다.*/
    if (request == httpRequest) {
        System.out.println("같음");
    }
	/* getOut: 브라우저에서 서버로요청했을때 리스폰스 ,리퀘스트 객체 생성 -> 처리 -> 응답데이터 저장(리스폰) -> 응답해주는기능은 out()이다. 
		out객체를 통해출 처리해준다.
		리스폰스, 리퀘스트, 아웃 객체는 쌍으로 만들어진다.
	*/
    pageContext.getOut().println("브라우저로 부터 받은 데이터");
%>

</body>
</html>