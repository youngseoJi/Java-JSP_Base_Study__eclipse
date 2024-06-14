<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%
String code = request.getParameter("code");
String url = "";

if (code != null) {
    if (code.equals("A")) {
        url = "/forward2/a.jsp";
    } else if (code.equals("B")) {
        url = "/forward2/b.jsp";
    } else if (code.equals("C")) {
        url = "/forward2/c.jsp";
    }
}

/* forward */
if (!url.isEmpty()) {
    RequestDispatcher dispatcher = request.getRequestDispatcher(url);
    dispatcher.forward(request, response);
} else {
    // url이 비어있는 경우 에러 메시지 출력 또는 다른 처리
    out.println("Invalid code parameter or code parameter is missing.");
}
%>
