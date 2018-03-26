<%-- 
    Document   : challenge8-3
    Created on : 2018/03/24, 23:32:25
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
        int num=0;
        for (int i=0;i<101;i++){
        num+=i;
        }
        out.print(num);
        %>
    </body>
</html>
