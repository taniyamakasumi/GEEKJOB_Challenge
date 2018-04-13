/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package File_sosa;

import java.io.*;

/**
 *
 * @author kasum
 */
public class File_kakidasi_hozon {
    public static void main(String[] args) throws IOException {
    try{
        File fp = new File("test.txt");
    FileWriter fw = new FileWriter(fp,true);
    fw.write("谷山香澄です。福岡県出身です。よろしくお願いします。");
    fw.close();
    }catch(IOException e){
        System.out.println(e);}
    }
    
}
