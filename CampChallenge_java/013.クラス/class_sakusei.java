/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.camp.servlet;


/**
 *
 * @author kasum
 */
public class class_sakusei {
     public static void main(String[] args) {
    // Syokujiクラスのインスタンス生成}
    syokuji gohan = new syokuji();
    
   // ごはんインスタンスのsetHumanメソッドを利用
   gohan.setSyokuji("オムライス", 600);
   System.out.print(gohan.name+"は"+gohan.kingaku+"円です。");
    }   
}

// syokujiクラスの宣言
class syokuji{
    // フィールドの宣言
    public String name = "";
    public int kingaku = 0;
    // メソッドの宣言
    
    public void setSyokuji(String n, int a){
        // 引数をフィールドへ設定
        this.name = n;
        this.kingaku = a;
    } 

   
}



    

