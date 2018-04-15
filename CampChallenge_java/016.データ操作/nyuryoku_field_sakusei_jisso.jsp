<%-- 
    Document   : nyuryoku_field_sakusei_jisso
    Created on : 2018/04/14, 20:22:46
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
        //入力フォームを作るときは基本HTMLファイルでいいが、session等Javaを使うときはJSPに書く。
       HttpSession hs = request.getSession();
       String str_name = (String)hs.getAttribute("txtName");
       String str_gender = (String)hs.getAttribute("gender");
       String str_hobby = (String)hs.getAttribute("hobby");
       //nullだとエラーが出てしまうので、nullを文字列に変える。
       if(str_name==null){
           str_name="";
       }if(str_gender==null){
           str_gender="";
       }if(str_hobby==null){
           str_hobby="";
       }
       
        %>
         <form action="./nyuryoku_field_sakusei_jisso" method="post">
      
<!--         //Javaの中でHTMLを使う時はout.printして、HTMLに返す。-->
             <p>氏名：<input type="text" name="txtName" value=<%out.print(str_name);%>></p>
             <p>性別：<input type="radio" name="gender" value="男" <%if(str_gender.equals("男")){out.print("checked");}%>> 男
                          <input type="radio" name="gender" value="女"<%if(str_gender.equals("女")){out.print("checked");}%>> 女</p>
<!--         //textareaは下記のように表記する。
             //<textarea>ここに表記(ここがvalueのような感じ)</textarea>-->
             <p>趣味：<textarea name="hobby"><%out.print(str_hobby);%></textarea></p>
    
            <p><input type="submit" name="sent" value="送信"></p>
        </form>
    </body>
</html>
