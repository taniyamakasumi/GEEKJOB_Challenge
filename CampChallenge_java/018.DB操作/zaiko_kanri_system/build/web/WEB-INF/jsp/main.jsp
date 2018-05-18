<%-- 
    Document   : zaiko_kanri_system_main
    Created on : 2018/04/27, 14:46:19
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
        String str_id = (String)hs.getAttribute("loginId");
        
        out.print("ログイン中<br>");
        %>
        
        <form action="/zaiko_kanri_system/zaiko_data" method="post">
            <p><input type="submit" name="ichiran" value="在庫一覧"></p>
            </form>
        
    <form action="/zaiko_kanri_system/syohin_toroku" method="post">
        <p>商品No：<input type="number" name="syohinNum"></p>
        <p>商品名：<input type="text" name="textSyohinmei"></p>
        <p>金額：<input type="number" name="numKingaku"></p>
        <p>在庫数：<input type="number" name="numZaikosu"></p>
        
        <p><input type="submit" name="toroku" value="登録"></p>
    </form>
        
    <form action="./logout.jsp">
        <input type="submit" value="ログアウト">
    </form>
 
        
    </body>
</html>
