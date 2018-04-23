/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.sql.*;

/**
 *
 * @author kasum
 */
public class zenjyoho_syutoku {
    public static void main(String[] args){
    
    Connection db_con = null;
    PreparedStatement db_st = null;
    ResultSet db_data = null;
    
        try
        {
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            db_con=DriverManager.getConnection("jdbc:mysql://localhost:3306/Challenge_db?characterEncoding=UTF-8&serverTimezone=JST","kasumi","k5836048");
            db_st = db_con.prepareStatement("select * from profiles");
            
            db_data=db_st.executeQuery();
            while(db_data.next()){
            System.out.print(db_data.getInt("profileID"));
            System.out.print(" ");
            System.out.print(db_data.getString("name"));
            System.out.print(" ");
            System.out.print(db_data.getString("tel"));
            System.out.print(" ");
            System.out.print(db_data.getInt("age"));
            System.out.print(" ");
            System.out.println(db_data.getDate("birthday"));
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
    
    }
    
}
