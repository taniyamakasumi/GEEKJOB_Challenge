<%-- 
    Document   : form_kara_data_sonyu
    Created on : 2018/04/24, 16:00:17
    Author     : kasum
--%>

<%@page import="java.sql.*"%>
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
        int g_id = Integer.parseInt(request.getParameter("txtId"));
        String g_name = request.getParameter("txtName");
        String g_tel= request.getParameter("txtTel");
        int g_age = Integer.parseInt(request.getParameter("txtAge"));
        Date g_birthday = Date.valueOf(request.getParameter("txtBirthday"));
 
        
        Connection db_con = null;
        PreparedStatement db_st = null;
        ResultSet db_data = null;
        
        try
        {
            Class.forName("com.mysql.jdbc.Driver").newInstance();
       
            db_con=DriverManager.getConnection("jdbc:mysql://localhost:3306/Challenge_db?characterEncoding=UTF-8&serverTimezone=JST","kasumi","k5836048");
            
            db_st = db_con.prepareStatement("INSERT INTO profiles(profileID,name,tel,age,birthday)VALUE(?,?,?,?,?)");
            db_st.setInt(1,g_id);
            db_st.setString(2,g_name);
            db_st.setString(3,g_tel);
            db_st.setInt(4,g_age);
            db_st.setDate(5,g_birthday);
            
            db_st.executeUpdate();
            
            db_st = db_con.prepareStatement("SELECT * FROM profiles");
            
            db_data=db_st.executeQuery();
            while(db_data.next()){
            out.print(db_data.getInt("profileID"));
            out.print(" ");
            out.print(db_data.getString("name"));
            out.print(" ");
            out.print(db_data.getString("tel"));
            out.print(" ");
            out.print(db_data.getInt("age"));
            out.print(" ");
            out.println(db_data.getDate("birthday"));
            out.print("<br>");
            }
        }catch(Exception e){
            System.out.println("接続時にエラーか発生しました："+e.toString());
        }finally{
            try{
                db_con.close();
                db_st.close();
                db_data.close();
            }catch(Exception e){
                System.out.println(e.getMessage());
            }
        }    
        %>
    </body>
</html>
