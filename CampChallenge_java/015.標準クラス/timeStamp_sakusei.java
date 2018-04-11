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
public class timeStamp_sakusei {
    public static void main(String[] args) {
     Calendar c = Calendar.getInstance();
     c.set(2016, 1, 1, 0, 0, 0);
     Date d=new Date();
     d=c.getTime();
     System.out.print(d.getTime());
     }
}
