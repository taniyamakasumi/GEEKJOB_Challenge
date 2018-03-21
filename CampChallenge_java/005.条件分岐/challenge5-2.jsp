<%-- 
    Document   : challenge5-2
    Created on : 2018/03/21, 20:16:26
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
            switch(num){
            case 1:
            out.print("one");
            break;
            case 2:
            out.print("two");
            break;
            default:
            out.print("想定外");
            break;
        }
        %>
    </body>
</html>
