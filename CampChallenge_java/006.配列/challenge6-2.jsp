<%-- 
    Document   : challenge6-2
    Created on : 2018/03/22, 13:41:03
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
            
    String[] data = {"10","100","soeda","hayashi","-20","118","END"};
     data[2] = "33";
    out.print(data[0] + "<br>");
    out.print(data[1] + "<br>");
    out.print(data[2] + "<br>");
    out.print(data[3] + "<br>");
    out.print(data[4] + "<br>");
    out.print(data[5] + "<br>");
    out.print(data[6] + "<br>");
    
%>
    </body>
</html>
