/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mojiretu;

/**
 *
 * @author kasum
 */
public class mojisu_syutoku {
    public static void main(String[] args) {
    String myMailAdress="kasumi1234@gmail.com";
    //@の文字位置の取得
    int num=myMailAdress.indexOf("@");
    //@以降の文字を取得
    String atDomain=myMailAdress.substring(num);
    //@以降の文字数を取得
    System.out.print("文字数は"+atDomain.length()+"です。");
    }   
}
