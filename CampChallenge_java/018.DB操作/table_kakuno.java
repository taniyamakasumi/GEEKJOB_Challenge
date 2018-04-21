/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.sql.*;

/**
 *
 * @author 谷山香澄
 */
public class table_kakuno {
    public static void main(String[] args){
    
    Connection db_con = null;
    PreparedStatement db_st = null; 
    //実行した結果が欲しければ、
    //SELECTならデータ全て返ってくるのでResultSet 変数で宣言する
    //UPDATE, INSERT, DELETEなら何個変更されたか返ってくるのでint 変数で宣言する
    
        try
        {
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            db_con =DriverManager.getConnection("jdbc:mysql://localhost:3306/Challenge_db","kasumi","k5836048");
            
            db_st = db_con.prepareStatement("INSERT INTO profiles(profileID,name,tel,age,birthday)VALUES(?,?,?,?,?)");
            db_st.setInt(1,3);
            db_st.setString(2,"谷山　香澄");
            db_st.setString(3,"093-583-6048");
            db_st.setInt(4,29);
            Date sql_date = Date.valueOf("1988-07-01");
            db_st.setDate(5,sql_date);
            
            //UPDATE, INSERT, DELETE,ストアドを実行する
            db_st.executeUpdate();
            
            db_con.close();
        
        
        }catch(Exception e){
            System.out.println("接続時にエラーが発生しました:"+e.toString());
            
        }finally{
            try{
                db_con.close();
            }catch(Exception e){
                System.out.println(e.getMessage());
            }
        }
    }
}
