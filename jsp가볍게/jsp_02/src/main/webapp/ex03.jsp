<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>JSP 라이프 사이클</title>
</head>
<body>

<!--톰캣은 jsp 코드를 자바코드로 만들고 컴파일하고 객체를 생성한다.  -->
<%! /* 선언문  */
	private int num1 = 0;
	public void jspInit(){ /* 오버라이딩  */
		System.out.println("jspInt() 호출 ");
	}
	public void jspDestroy(){ /* 오버라이딩  */
		System.out.println("jspDestroy() 호출 ");
	}
%>

<%  /* 스크립플릿  */
	int num2 = 0;
	num1++;
	num2++;
	
/* 	System.out.println("num1: " + num1);
	System.out.println("num2: " + num1); */
%>

<ul>
	<!-- 표현식  -->
	<li> num1: <%= num1 %></li>
	<li> num2: <%= num2 %></li>
</ul>
</body>
</html>