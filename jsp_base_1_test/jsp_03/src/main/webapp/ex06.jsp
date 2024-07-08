<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>리다이렉트</title>
</head>
<body>
구글로 슝 이동!

<!-- response : 브라우저에서 서버로 request를 하면 request객체가 생성되고 여기에요청정보, 파라미터 등이 저장된다. 해당 정보를 get등을 하여활용할수있다.
response : request 요청을 받으면 반드시 response객체가 함께 생성된다. http프로토콜은 요청과 응답으로 총신하는 것이기때문에 두 객체가 자동생성딘다.
브라우저에 응답하기 위한 데이터를 저장하기 위한 객체 -->


<!-- sendRedirect : 브라우저에서서버에 요청했을때 보여줄 결과값이없을때, 처리만하고 끝나는 거라  브라우저에 응답을 줄때 다른곳으로요청을 하도록 위치, 링크를답아 브라우저에 응답해주

브라우저는 리다이랙트로 전달된 값으로 다시 요청을 한다.-->
 
<%response.sendRedirect("https://www.google.com/"); %> 
</body>
</html>