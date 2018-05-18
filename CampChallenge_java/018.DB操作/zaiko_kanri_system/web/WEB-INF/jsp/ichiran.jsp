<%-- 
    Document   : ichiran
    Created on : 2018/05/10, 10:33:02
    Author     : kasum
--%>

<%@page import="java.util.ArrayList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        在庫一覧<br>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%
        HttpSession hs =request.getSession();
        ArrayList<ArrayList<String>> list = (ArrayList)hs.getAttribute("zaiko");
        
        out.print("商品No.　商品名　金額　在庫数<br>");
        
        for(int i=0;i<list.size();i++){
            ArrayList<String> record=list.get(i);
               for(int j=0;j<record.size();j++){
                  out.print(record.get(j));
                     if(j==2){
                     out.print("円");
                     }else if(j==3){
                     out.print("個");
                     } 
                  out.print("　");
            }
                  out.print("<br>");
        }
        %>
        
  
    <form action="/zaiko_kanri_system/modoru">
        <input type="submit" value="戻る">
    </form>
    
    <form action="./logout.jsp">
        <input type="submit" value="ログアウト">
    </form>
       
        
    </body>
</html>
