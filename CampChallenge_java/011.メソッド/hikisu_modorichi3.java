/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.camp.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author kasum
 */
public class hikisu_modorichi3 extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    
    ArrayList prof(String str_num){
        ArrayList<String> user1 = new ArrayList<>();
        user1.add("1234");
        user1.add("2000年1月1日");
        user1.add("東京都世田谷区");
        
        ArrayList<String> user2 = new ArrayList<>();
        user2.add("5678");
        user2.add("1985年4月18日");
        user2.add(null);
        
        ArrayList<String> user3 = new ArrayList<>();
        user3.add("9012");
        user3.add("1977年7月9日");
        user3.add("東京都杉並区");
        
        if(user1.get(0).equals(str_num)){
        return user1;
        }else if(user2.get(0).equals(str_num)){
        return user2;
        }
        else if(user3.get(0).equals(str_num)){
        return user3;
        }
        return null;      
    }
    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            
            ArrayList<String> returnUser1 = prof("1234");
            ArrayList<String> returnUser2 = prof("5678");
            ArrayList<String> returnUser3 = prof("9012");
            
            ArrayList<ArrayList<String>> allUser = new ArrayList<>();
            allUser.add(returnUser1);
            allUser.add(returnUser2);
            allUser.add(returnUser3);
            
            int limit=2;
            
            for(int i=0;i<limit;i++){
              ArrayList<String> member=allUser.get(i);
                for(String data:member){
                  if(data == null){
                    continue;
                  }
                out.println(data+"<br>");
                }
            out.print("<br>");
            }
            
//            for(ArrayList<String> member : allUser){
//                for(String data:member){
//                  if(data == null){
//                    continue;
//                  }
//                out.println(data+"<br>");
//                }
//            }

            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet hikisu_modorichi3_1</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet hikisu_modorichi3_1 at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
