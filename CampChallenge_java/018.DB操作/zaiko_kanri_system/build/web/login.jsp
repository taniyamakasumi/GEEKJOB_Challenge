<%-- 
    Document   : zaiko_kanri_system_login
    Created on : 2018/05/07, 13:04:12
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
            String loginId=(String)hs.getAttribute("loginId");
            
            if(loginId==null){
            loginId="";
            }else if(hs.getAttribute("loginId").equals("")){
                out.print("ログインできませんでした");
            }else{
                //処理なし
            }
        %>
        <!--    サーブレットに飛ばす時は.javaはいらない-->
        <form action="/zaiko_kanri_system/zaiko_kanri_system" method="post">
            <p>ログインID：<input type="text" name="txtId"></p>
            <p>パスワード：<input type="number" name="numPass"></p>
            
            <p><input type="submit" name="sent" value="送信"></p>
        </form>
    </body>
</html>
