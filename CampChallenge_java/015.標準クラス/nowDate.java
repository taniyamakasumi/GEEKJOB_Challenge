/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package date;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author kasum
 */
public class nowDate {
     public static void main(String[] args) {
     Date d = new Date();
     SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
     System.out.print(sdf.format(d));
     }
    
}
