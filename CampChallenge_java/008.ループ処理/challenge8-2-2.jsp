<%-- 
    Document   : challenge8-2-2
    Created on : 2018/03/24, 23:25:08
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
        String text="";
        for (int i=0;i<30;i++){
        text+="A";
        }
        out.print(text);
        %>
    </body>
</html>
