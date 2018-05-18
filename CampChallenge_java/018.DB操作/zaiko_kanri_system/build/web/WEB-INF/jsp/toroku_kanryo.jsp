<%-- 
    Document   : toroku_kanryo
    Created on : 2018/05/11, 14:55:20
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
            HttpSession hs = request.getSession();
            String g_syohinmei = (String)hs.getAttribute("syohinmei");
            out.print(g_syohinmei);
        %>
        
        登録しました
        
    <form action="/zaiko_kanri_system/modoru">
        <input type="submit" value="戻る">
    </form>
    </body>
</html>
