/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zaiko_kanri_system;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author kasum
 */
@WebServlet(name = "syohin_toroku", urlPatterns = {"/syohin_toroku"})
public class syohin_toroku extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            
        request.setCharacterEncoding("UTF-8");
        int syohinNumber = Integer.parseInt(request.getParameter("syohinNum"));
        String syohinmei = request.getParameter("textSyohinmei");
        int kingaku = Integer.parseInt(request.getParameter("numKingaku"));
        int zaikosu = Integer.parseInt(request.getParameter("numZaikosu"));
        
        HttpSession hs = request.getSession();
        hs.setAttribute("syohinmei",syohinmei);
        
        Connection db_con = null;
        PreparedStatement db_st = null;
        
        try
        {
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            db_con=DriverManager.getConnection("jdbc:mysql://localhost:3306/Challenge_db?characterEncoding=UTF-8&serverTimezone=JST","kasumi","k5836048");
            
            db_st = db_con.prepareStatement("INSERT INTO zaiko(syohinNumber,syohinmei,kingaku,zaikosu)VALUES(?,?,?,?)");
            db_st.setInt(1,syohinNumber);
            db_st.setString(2,syohinmei);
            db_st.setInt(3,kingaku);
            db_st.setInt(4,zaikosu);
            db_st.executeUpdate();
            
            RequestDispatcher dispatcher = request.getRequestDispatcher("WEB-INF/jsp/toroku_kanryo.jsp");
            dispatcher.forward(request, response);
           

        }catch(Exception e){
            out.println("接続時にエラーか発生しました："+e.toString());
        }finally{
            try{
                db_con.close();
                db_st.close();
            }catch(Exception e){
                out.println(e.getMessage());
            }
        }
        
   
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
