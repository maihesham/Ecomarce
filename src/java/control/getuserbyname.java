/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import model.customerinmodel;
import model.orderinsystem;
import neededclasess.customer;
import neededclasess.getorderall;

/**
 *
 * @author egypt2
 */
@WebServlet(name = "getuserbyname", urlPatterns = {"/getuserbyname"})
public class getuserbyname extends HttpServlet {

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
           String n=request.getParameter("name");
           if(n.length()==0){
                                response.sendRedirect("adminprofile.jsp");

           }
            customerinmodel x=new customerinmodel();
            customer c=new customer();
            HttpSession session = request.getSession(true);
            session.removeAttribute("oldordersser");
             session.removeAttribute("currordersser");
              session.removeAttribute("usersra");
            c=x.createuser(n);
             session.setAttribute("usersra", c);
            if(c.get_staues()==1){
                 response.sendRedirect("invaliduser.jsp");
            }else{
                 orderinsystem xx=new orderinsystem();
                 ArrayList<getorderall> old=new ArrayList<getorderall>();
                 ArrayList<getorderall> cur=new ArrayList<getorderall>();
                 ArrayList<String> Learn=new ArrayList<String>();
                  System.out.print("current "+n+" "+old.size()+cur.size());
                 old=xx.getoldorders(n);
                 cur=xx.getcurrentorder(n);
                 System.out.print("after "+n+" "+old.size()+cur.size());
                 session.setAttribute("oldordersser", old);
                 session.setAttribute("currordersser", cur);
                 response.sendRedirect("userprofilesearch.jsp");
            }
            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(getuserbyname.class.getName()).log(Level.SEVERE, null, ex);
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
