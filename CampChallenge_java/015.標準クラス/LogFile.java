/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package File_sosa;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.TimeZone;

/**
 *
 * @author kasum
 */
public class LogFile {
    public static void main(String[] args)throws IOException{
    File fp = new File("test.txt");
    FileWriter fw = new FileWriter(fp,true);
    
    Calendar c = Calendar.getInstance();
    c.set(2016, 10, 4, 0, 0, 0);
    
    SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy年MM月dd日");
    fw.write(sdf1.format(c.getTime()));
    
//    int year = c.get(Calendar.YEAR);
//    int month = c.get(Calendar.MONTH) + 1;
//    int day = c.get(Calendar.DATE);
//    
//    fw.write(year+"年"+month+"月"+day+"日");
//    
    String word = "天気：くもり";
    
    fw.write(word.replace("くもり", "晴れ")+"\r\n");    
    
    Calendar start_c = Calendar.getInstance();
    start_c.set(2016, 10, 4, 9, 0, 0);
    SimpleDateFormat start_sdf = new SimpleDateFormat("HH:mm 始業時間");
    System.out.print(start_c.getTime());
    fw.write(start_sdf.format(start_c.getTime())+"\r\n");
    
    Calendar end_c = Calendar.getInstance();
    end_c.set(2016, 10, 4, 18, 0, 0);
    SimpleDateFormat end_sdf = new SimpleDateFormat("HH:mm 就業時間");
    fw.write(end_sdf.format(end_c.getTime())+"\r\n"+"\r\n");
    
    
    TimeZone tz = TimeZone.getTimeZone("Asia/Tokyo");
    Calendar cal = Calendar.getInstance(tz);
    fw.write(tz.getDisplayName());
    fw.write(cal.get(Calendar.HOUR_OF_DAY)+":"+cal.get(Calendar.MINUTE)+":"+cal.get(Calendar.SECOND));
    
    fw.close();
    }
    
}
