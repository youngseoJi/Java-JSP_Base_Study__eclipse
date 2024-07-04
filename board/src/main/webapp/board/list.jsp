<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import = "board.*, java.util.List"%>
    
     <!-- JSTL 라이브러리를 추가하여 JSP에서 사용할 수 있게 설정. 'c'라는 접두어(prefix)를 사용해 태그를 식별 -->
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
    <%
    	BoardDao dao = new BoardDao();
    	List<BoardVo> ls = dao.selectAll();
    	pageContext.setAttribute("ls", ls);
    	%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>게시글 목록</title>
</head>
<body>
<h2>게시글 목록</h2>
<c:forEach var="board" items="${ls}">
    <p>${board.title}, 작성자: ${board.writer}, 내용: ${board.content}</p>
</c:forEach>

</body>
</html>



<!-- JSTL 사용 이유 및 설명

코드의 단순화 및 가독성 향상: JSTL을 사용하면 복잡한 Java 코드 없이 HTML 내에서 직접 조건문, 반복문 등을 처리할 수 있습니다. 이로 인해 코드가 더 간결하고 읽기 쉬워집니다.
재사용 및 유지보수 용이: 공통의 작업들을 태그 형식으로 간단하게 반복 사용할 수 있으므로 코드의 재사용성이 증가하고, 유지보수가 용이해집니다.
플랫폼 독립적: JSTL은 순수하게 태그 기반의 로직을 제공하므로, Java 코드와 HTML 코드가 섞이는 것을 최소화하여 JSP 파일을 더욱 플랫폼 독립적으로 만듭니다.

JSTL의 주요 기능
Core: 변수 지원, 흐름 제어, URL 처리 등을 포함합니다.
Formatting: 숫자, 날짜, 시간 포맷 변경 및 다국어 지원.
SQL: 데이터베이스 쿼리 실행.
XML: XML 데이터 처리. -->