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
import model.productinsystem;
import neededclasess.getproduct;
import neededclasess.product;

/**
 *
 * @author egypt2
 */
@WebServlet(name = "addtocar", urlPatterns = {"/addtocar"})
public class addtocar extends HttpServlet {

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
           String si=request.getParameter("siz");
           String num=request.getParameter("num");
           String id=request.getParameter("id");
           System.out.print(id+" "+si+" "+num);
           ArrayList<getproduct> cc=new  ArrayList<getproduct>();
           HttpSession session = request.getSession(true);
           cc=( ArrayList<getproduct>) session.getAttribute("car");
           System.out.print("frist]]]"+cc.size());
           session.removeAttribute("car");
           String number="";
           int j=0;
           for(int i=0;i<id.length();i++){
               if(id.charAt(i)==','){
                   j=i+1;
                   break;
               }
           }
           for(int i=j;i<id.length();i++){
              number+=id.charAt(i);
           }
           int res = Integer.parseInt(number);
           System.out.print("current id"+res);
           int n=Integer.parseInt(num);
            product onep=new product();
            productinsystem l=new productinsystem();
            onep=l.getPbyID(res);
            getproduct z=new getproduct();
            z.p=onep;
            z.set_cou(n);
            z.set_size(si);
            cc.add(z);
         session.setAttribute("car", cc);
         System.out.print("succefully"+cc.size());
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(addtocar.class.getName()).log(Level.SEVERE, null, ex);
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
