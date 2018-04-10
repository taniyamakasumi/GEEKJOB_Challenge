/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package blackjack;

import java.util.ArrayList;

/**
 *
 * @author kasum
 */
public class User extends Human {
    
    public void setCard(ArrayList<Integer> x){
       for(Integer num:x){ 
           this.myCards.add(num);
    
                   }
    }
    
    public boolean checkSum(){
                if(open()<18){
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
