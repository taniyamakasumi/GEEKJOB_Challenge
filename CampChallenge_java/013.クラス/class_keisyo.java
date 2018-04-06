/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.camp.servlet;

/**
 *
 * @author kasum
 */
public class class_keisyo {
    public static void main(String[] args) {
        coutomer menu1 = new coutomer();
        menu1.setSyokuji("オムライス",600);
        menu1.clear();
        System.out.print(menu1.name +menu1.kingaku);
    }
}

class coutomer extends syokuji {
public void clear() {
    this.name="";
    this.kingaku=0;
}
}