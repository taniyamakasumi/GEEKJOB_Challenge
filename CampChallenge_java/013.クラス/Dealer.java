package blackjack;


import java.util.ArrayList;
import java.util.Random;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author kasum
 */
public class Dealer extends Human{
    
     ArrayList<Integer> cards=new ArrayList<Integer>();
       
    public Dealer(){  
       
      for(int i=0;i<4;i++){
    
          for(int j=1;j<14;j++){
              
              if(j==11||j==12||j==13){
                  //手札に10を加える
                  //j=10にすると無限ループになる
                  cards.add(10);
              }
              
          cards.add(j);
             
          }
      }  
      this.myCards=new ArrayList<Integer>();
    }

    public ArrayList<Integer> deal(){
    
        ArrayList<Integer> dealList=new ArrayList<Integer>();
        Random rand = new Random();

        for(int i=0;i<2;i++){
        //乱数所得
        int index = rand.nextInt(cards.size());

        dealList.add(cards.get(index));
        cards.remove(cards.get(index));
        }

        return dealList;
    }
    
    public ArrayList<Integer> hit(){
    
        ArrayList<Integer> hitList=new ArrayList<Integer>();
        Random rand = new Random();
    
        //乱数所得
        int index = rand.nextInt(cards.size());

        hitList.add(cards.get(index));
        cards.remove(cards.get(index));

        return hitList;
    }

    public void setCard(ArrayList<Integer> x){
       for(Integer num:x){ 
       this.myCards.add(num);
       }
    }
        
    public boolean checkSum(){
                if(open()<17){
                return true;
                }else{
                return false;
                }
     }

    public int open(){
    int total=0;
    
       for(int z=0;z<this.myCards.size();z++){
       total += myCards.get(z);
       }
    
   return total;
}

}

        
        
