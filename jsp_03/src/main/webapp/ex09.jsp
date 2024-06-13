<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>out 객체의 역할</title>
</head>
<body>
	<!-- out 객체의 역할 : 리퀘스트 객체에서 처리된후 리스폰스 객체에 준비된 데이터를 브라우저에 내보내는 역할을 한다.
버퍼 : out객체는 버퍼가 있어서 효율적으로 데이터를 전송할 수 있다. -->
	<%
	int bufferSize = out.getBufferSize();
	int remainSize = out.getRemaining();
	int usedSize = bufferSize - remainSize;
	System.out.println("전체 버퍼의 크기: " + bufferSize + "byte");
	System.out.println("사용한 버퍼의 크기: " + usedSize + "byte");
	System.out.println("남은 버퍼의 크기: " + remainSize + "byte");
	%>
	버퍼예제 <br>
	남은 버퍼: <% out.println(remainSize); %>byte
	
</body>
</html>
