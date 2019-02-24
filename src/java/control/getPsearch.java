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
import model.productinsystem;
import neededclasess.comment;
import neededclasess.customer;
import neededclasess.product;

/**
 *
 * @author egypt2
 */
@WebServlet(name = "getPsearch", urlPatterns = {"/getPsearch"})
public class getPsearch extends HttpServlet {

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
          String ca=request.getParameter("cat");
           HttpSession session = request.getSession(true);
            productinsystem c=new productinsystem();
            ArrayList<product> p=new ArrayList<product>();
            p=c.getPrsbycatorname(ca);
            customerinmodel XX=new customerinmodel();
            customer f=new customer();
            f=(customer)session.getAttribute("user");
            XX.ddtolearn(ca,f.get_name());
            for(int i=0;i<p.size();i++){
                ArrayList<comment> XXz=new ArrayList<comment>();
                XXz=c.getcommentsofpr(p.get(i).get_id());
                p.get(i).Set_com1(XXz);
            }
            session.setAttribute("search", p);
            response.sendRedirect("search.jsp");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(getPsearch.class.getName()).log(Level.SEVERE, null, ex);
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
