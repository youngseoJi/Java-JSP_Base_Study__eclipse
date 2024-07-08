<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%
String code = request.getParameter("code");
String url = "";

/* select.jsp에서 view.jsp에 code 값을 전달 
code에 따라 페이지 경로가 지정된다.*/

if (code != null) {
    if (code.equals("A")) {
        url = "/forward2/a.jsp";
    } else if (code.equals("B")) {
        url = "/forward2/b.jsp";
    } else if (code.equals("C")) {
        url = "/forward2/c.jsp";
    }
}
/* forward 
  이동할 경로 셋 
	dispatcher 을 이용하여 request, response객체를 유지하여 갖고 해당페에지 로 이동해라 */

/* 
    RequestDispatcher dispatcher = request.getRequestDispatcher(url);   
    dispatcher.forward(request, response);
    
    request.getRequestDispatcher(url).forward(request, response);
    
 */

/*! 중요한점 :실제 응답받은 페이지는 뷰가아니라 포워딩된 결과값이다. */
%>
<!--  jsp:로 시작하는 것은 액션태그
액션태그를 사용하면 간단하게 포워딩 할수있다. -->


<jsp:forward page="<%= url %>" />
