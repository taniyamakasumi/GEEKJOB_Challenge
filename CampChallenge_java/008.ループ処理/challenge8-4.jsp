<%-- 
    Document   : challenge8-4
    Created on : 2018/03/25, 0:21:53
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
        int num=1000;
        while(!(num<100)){
        num/=2;
        }
        out.print(num);
        %>
    </body>
</html>
