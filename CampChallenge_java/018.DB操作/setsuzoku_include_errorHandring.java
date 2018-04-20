
import java.sql.*;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 谷山香澄
 */
public class setsuzoku_include_errorHandring {
    public static void main(String[] args) {
        
        Connection db_con = null;
        
        try
        {
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            db_con =DriverManager.getConnection("jdbc:mysql://localhost/Challenge_db:3306","root","");
                    
            db_con.close();
        
        }catch(SQLException e_sql){
            System.out.println("接続時にエラーが発生しました:"+e_sql.toString());
        
        //下記は何のエラーでも対応できる
        //変数名は何でもいいが、eが一般的
        }catch(Exception e){
            System.out.println(e.toString());
        
        }finally{
            System.out.println("finallyが実行されました");
        }
        
        
    } 
    
}
