<%-- 
    Document   : soinsubunkai
    Created on : 2018/04/13, 19:59:41
    Author     : kasum
--%>

<%@page import="java.util.ArrayList"%>
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
        request.getParameter("str_num");
        
        if(request.getParameter("str_num").equals("")){
            out.print("入力してください");
        }else{
            out.print(request.getParameter("str_num"));
            int num=(Integer.parseInt(request.getParameter("str_num")));
        
            ArrayList<String> bunkai = new ArrayList<String>();
        
            //2か3か5か7で割れたか判定する。
            boolean flag = false;
        
            if(num%2!=0&&num%3!=0&&num%5!=0&&num%7!=0){
            out.print(" この数は素数です。");
            //ここで処理を終わらせたいのでreturn;を使う。
            //break;はループ処理のときだけ
            return;
        
            }else{
                bunkai.add("=");
            
                //==は右辺と左辺が同じという意味
                //=は右辺を左辺に代入する
                if(num%2==0){
                   while(num%2==0){
                   num/=2;
                   bunkai.add("2*");
                   flag=true;
                   }
                                      
                }if(num%3==0){
                   while(num%3==0){
                   num/=3;
                   bunkai.add("3*");
                   flag=true;
                   }
               
                }if(num%5==0){
                   while(num%5==0){
                   num/=5;
                   bunkai.add("5*");
                   flag=true;
                   }
               
                }if(num%7==0){
                   while(num%7==0){
                   num/=7;
                   bunkai.add("7*");
                   flag=true;
                   }
                }
            
                }if(flag=true){
                   String endlist = bunkai.get(bunkai.size()-1);
                   bunkai.set(bunkai.size()-1,endlist.substring(0,1));
               
                }if(flag=true&&num==1){
                    //処理なし
                
                }else if(num!=0){
                   bunkai.add("あまり"+num);
               
                }else{
                    //処理なし
                }
            
            for(int i=0;i<bunkai.size();i++){
            out.print(bunkai.get(i));
            }
        }
               
        %>
    </body>
</html>
