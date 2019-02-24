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
import neededclasess.getproduct;
import neededclasess.order;
import neededclasess.product;

/**
 *
 * @author egypt2
 */
@WebServlet(name = "userprofile", urlPatterns = {"/userprofile"})
public class userprofile extends HttpServlet {

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
           String name=request.getParameter("name");
           String phone=request.getParameter("pass");
           customer c=new customer();
           customerinmodel x=new customerinmodel();
           c=x.createuser(name);
           HttpSession session = request.getSession(true);
           if(c.get_staues()==1){
                 response.sendRedirect("gotovrify.html");
           }else{
               orderinsystem xx=new orderinsystem();
               session.removeAttribute("user");
                  session.removeAttribute("car");
                 session.removeAttribute("oldorders");
                 session.removeAttribute("currorders");
                 session.removeAttribute("learn");
                 ArrayList<getorderall> old=new ArrayList<getorderall>();
                 ArrayList<getorderall> cur=new ArrayList<getorderall>();
                 ArrayList<String> Learn=new ArrayList<String>();
                 System.out.print("curent user is "+c.get_name());
                 ArrayList<getproduct> car=new  ArrayList<getproduct>();
                 old=xx.getoldorders(name);
                 cur=xx.getcurrentorder(name);
                 Learn=x.getlearn(name); 
                 session.setAttribute("user", c);
                  session.setAttribute("car", car);
                 session.setAttribute("oldorders", old);
                 session.setAttribute("currorders", cur);
                 session.setAttribute("learn", Learn);
                 response.sendRedirect("userprofile.jsp");
           }
            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(userprofile.class.getName()).log(Level.SEVERE, null, ex);
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
