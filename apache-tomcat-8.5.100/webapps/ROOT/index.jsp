<%@ page session="false" pageEncoding="UTF-8" contentType="text/html; charset=UTF-8" %> 

<% 
java.text.SimpleDateFormat sdf = new java.text.SimpleDateFormat("yyyy");
request.setAttribute("year", sdf.format(new java.util.Date()));
request.setAttribute("tomcatUrl","https://tomcat.apache.org/");
request.setAttribute("tomcatDocUrl", "/docs/");
request.setAttribute("tomcatExamplesUrl", "/examples/");

int n1 = Integer.parseInt(request.getParameter("n1"));
int n2 = Integer.parseInt(request.getParameter("n2"));
 
%>
<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="UTF-8" />
    <title><%=request.getServletContext().getServerInfo() %></title>
    <link href="favicon.ico" rel="icon" type="image/x-icon" />
    <link href="tomcat.css" rel="stylesheet" type="text/css" />
  </head>

  <body>
    Hello JSP! Now Date is <%= new java.util.Date() %>!
    <br />
    <br />
    <%= n1 + n2 %>
  </body>
</html>
