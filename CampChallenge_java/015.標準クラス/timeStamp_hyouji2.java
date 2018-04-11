/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package date;

import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author kasum
 */
public class timeStamp_hyouji2 {
    public static void main(String[] args){
    Calendar c1 = Calendar.getInstance();
     c1.set(2015, 0, 1, 0, 0, 0);
     Date d1=new Date();
     d1=c1.getTime();
     
     Calendar c2 = Calendar.getInstance();
     c2.set(2015, 11, 31, 23, 59, 59);
     Date d2=new Date();
     d2=c2.getTime();
     
     //getTimeすることでタイムスタンプになる。
     System.out.println(d2.getTime()-d1.getTime());
    }
    
}
