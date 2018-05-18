<%-- 
    Document   : logout
    Created on : 2018/05/08, 17:29:36
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
            //ログアウトする時はセッションを消す
            hs.invalidate();
        %>
        <p>ログアウトしました</p>
        <A Href="login.jsp">ログイン画面へ</A>
    </body>
</html>
