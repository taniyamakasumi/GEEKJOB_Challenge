/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package blackjack;

/**
 *
 * @author kasum
 */
public class BlackJack {
    public static void main(String[] args) {
    
    Dealer d = new Dealer();
    User u = new User();
    
    //2枚の手札をセットする
    d.setCard(d.deal()); 
      System.out.println("ディーラー手札"+d.myCards);
    u.setCard(d.deal());
      System.out.println("ユーザー手札"+u.myCards);
     
      //boolean chk = d.checkSum();
      //if(chk){}
      //ifはtrueの時{}の処理がされる
    if(d.checkSum()){
     d.setCard(d.hit());
     System.out.println("ディーラー手札"+d.myCards);
    }
     
    if(u.checkSum()){
      u.setCard(d.hit());
      System.out.println("ユーザー手札"+u.myCards);
    }
   
    System.out.println("ディーラー手札"+d.open());
    System.out.println("ユーザー手札"+u.open());
    
    if( 21<d.open() && 21<u.open() ){
            System.out.print("ディーラーの勝ち");
    }else if( 21<u.open() && d.open()<=21 ){
            System.out.print("ディーラーの勝ち");
    }else if( 21<d.open() && u.open()<=21 ){
            System.out.print("ユーザーの勝ち");
    }else if( d.open()<=21 && u.open()<=21 ){
        if(u.open()<d.open()){
            System.out.print("ディーラーの勝ち");
        }else if(u.open()==d.open()){
            System.out.print("引き分け");
        }else if(d.open()<u.open()){
            System.out.print("ユーザーの勝ち");
        }
    }
    
    }
}