/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package date;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author kasum
 */
public class timeStamp_hyouji {
    public static void main(String[] args) {
     Calendar c = Calendar.getInstance();
     c.set(2016, 10, 4, 10, 0, 0);
     Date d=new Date();
     d=c.getTime();
     System.out.println(d.getTime());
     SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
     System.out.println(sdf.format(d.getTime()));
    }
}
