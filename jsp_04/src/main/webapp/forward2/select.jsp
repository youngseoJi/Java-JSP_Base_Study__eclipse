<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>옵션 선택</title>
</head>
<body>
    <!-- 최상위 경로를 갖고오고  /forward2/view.jsp로 요청하도록 함-->
    <form action="<%=request.getContextPath()%>/forward2/view.jsp">
        페이지 선택 : <select name="code">
            <option value="A">A 페이지</option>
            <option value="B">B 페이지</option>
            <option value="C">C 페이지</option>
        </select>
        <input type="submit" value="이동">
    </form>
</body>
</html>
