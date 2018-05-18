package zaiko_kanri_system;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.sql.*;
import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpSession;

/**
 *
 * @author kasum
 */
@WebServlet(urlPatterns = {"/zaiko_kanri_system"})
public class zaiko_kanri_system extends HttpServlet {

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
        String g_id = request.getParameter("txtId");
        String getpass = request.getParameter("numPass");
        //typeはnumberに設定しても送信するとStringになる
        

        Connection db_con = null;
        PreparedStatement db_st = null;
        ResultSet db_data = null;
        
        HttpSession hs = request.getSession();
        
        
        try
        {
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            db_con=DriverManager.getConnection("jdbc:mysql://localhost:3306/Challenge_db?characterEncoding=UTF-8&serverTimezone=JST","kasumi","k5836048");
            
           
          if((g_id.equals("")||getpass.equals(""))){
              hs.setAttribute("loginId","");
          
              RequestDispatcher dispatcher = request.getRequestDispatcher("/login.jsp");
              dispatcher.forward(request, response);
                 
          }else{
              
            int g_pass = Integer.parseInt(getpass);
            
            db_st = db_con.prepareStatement("SELECT loginId,password FROM user");
            db_data=db_st.executeQuery();
           
            while(db_data.next()){
                if(db_data.getString("loginId").equals(g_id)&&db_data.getInt("password")==g_pass){
                    hs.setAttribute("loginId",g_id);
                    
                    RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/jsp/main.jsp");
                    dispatcher.forward(request, response);
                
                }
            }
            hs.setAttribute("loginId","");
              
                RequestDispatcher dispatcher = request.getRequestDispatcher("/login.jsp");
                dispatcher.forward(request, response);

          } 

        }catch(Exception e){
            out.println("接続時にエラーか発生しました："+e.toString());
        }finally{
            try{
                db_con.close();
                db_st.close();
                db_data.close();
            }catch(Exception e){
                out.println(e.getMessage());
            }
        }
        
        
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet zaiko_kanri_system</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet zaiko_kanri_system at " + request.getContextPath() + "</h1>");
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
