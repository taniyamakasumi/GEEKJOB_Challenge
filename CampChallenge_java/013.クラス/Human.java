package blackjack;


import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author kasum
 */
public abstract class Human {
    
    public ArrayList<Integer> myCards = new ArrayList<>() ;
           
     public abstract int open();
     public abstract void setCard(ArrayList<Integer> x);
     public abstract boolean checkSum();
     
}
