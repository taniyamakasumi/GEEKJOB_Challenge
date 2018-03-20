<%-- 
    Document   : challenge2-1
    Created on : 2018/03/20, 11:25:58
    Author     : kasumi
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
            
            String name;
            name="谷山香澄";
            
            int age;
            age=29;
            
            out.print("私の名前は"+name+"、"+age+"歳です。");
           
        %>
    </body>
</html>
