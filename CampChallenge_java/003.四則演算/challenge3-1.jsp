<%-- 
    Document   : challenge3-1
    Created on : 2018/03/20, 14:55:29
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
            
                int num = 200;
                final int BASE = 5;
                
                int tasu = num + BASE;
                int hiku = num - BASE;
                int kake = num * BASE;
                int wari = num / BASE;
                int amari = num % 3;
                
                out.print(num + "＋" + BASE + "＝" + tasu + "<br>");
                out.print(num + "－" + BASE + "＝" + hiku + "<br>");
                out.print(num + "×" + BASE + "＝" + kake + "<br>");
                out.print(num + "÷" + BASE + "＝" + wari + "<br>");
                out.print(num + "÷3の余りは" +amari + "<br>");
                
        %>
    </body>
</html>
