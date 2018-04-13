<%-- 
    Document   : queryString_riyo
    Created on : 2018/04/13, 15:48:32
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
            request.setCharacterEncoding("UTF-8");
            request.getParameter("total");
            
            request.getParameter("count");
            
            out.print((request.getParameter("syubetsu"))+"を購入しました。<BR>");

            //受け取ったデータは文字列なのでint型に型変換する
            int tanka = (Integer.parseInt(request.getParameter("total"))) / (Integer.parseInt(request.getParameter("count")));
            out.print("単価は"+tanka+"円です。<br>");

            int sogaku = (Integer.parseInt(request.getParameter("total")));
            int point;

            if (sogaku < 3000) {
                out.print("0ポイントです。");
            } else if (3000 <= sogaku && sogaku < 5000) {
                point = (int)Math.floor(sogaku * 0.04);
                out.print(point+"ポイントです。");
            } else if (5000 <= sogaku) {
                point = (int)Math.floor(sogaku * 0.05);
                out.print(point+"ポイントです。");
            }

        %>
    </body>
</html>
