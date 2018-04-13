<%-- 
    Document   : HTML_nyuryokuData_hyoji
    Created on : 2018/04/13, 11:11:48
    Author     : kasum
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%
            request.setCharacterEncoding("UTF-8");
            out.print(request.getParameter("txtName"));
            out.print("<br>");
            out.print(request.getParameter("gender"));
            out.print("<br>");
            out.print(request.getParameter("hobby"));
        %>
    </body>
</html>
