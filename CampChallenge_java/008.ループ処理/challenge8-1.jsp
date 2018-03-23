<%-- 
    Document   : challenge8-1
    Created on : 2018/03/23, 16:15:46
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
        long num=1;
        for (int i=0;i<20;i++){
            num*=8;
        }
        out.print(num);
        %>
    </body>
</html>
