/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.nio.file.Paths;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;
import model.productinsystem;
import neededclasess.product;

/**
 *
 * @author egypt2
 */
@WebServlet(name = "savePr", urlPatterns = {"/savePr"})
@MultipartConfig(fileSizeThreshold = 1024 * 1024 * 2, // 2MB
        maxFileSize = 1024 * 1024 * 10, // 10MB
        maxRequestSize = 1024 * 1024 * 50) // 50MB
public class savePr extends HttpServlet {

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
           InputStream p1 =null;
           InputStream p3 =null;
           InputStream p2 =null;
           InputStream inputStream  =null;
          String imageName = request.getPathInfo();
            System.out.println(imageName);
            Part filePart = request.getPart("p1");
             System.out.println("lllllllll   "+Paths.get(filePart.getSubmittedFileName()).getFileName().toString());
              if (filePart != null) {
                    p1= filePart.getInputStream();
                    System.out.print("her");
              }
           String ph1= Paths.get(filePart.getSubmittedFileName()).getFileName().toString();   
           Part filePart2 = request.getPart("p2");
              if (filePart2 != null) {
                    p2 = filePart2.getInputStream();
                    System.out.print("her");
              } 
          String ph2= Paths.get(filePart2.getSubmittedFileName()).getFileName().toString();     
           Part filePart3 = request.getPart("p3");
              if (filePart3 != null) {
                    p3 = filePart3.getInputStream();
                    System.out.print("her");
              }  
          String ph3= Paths.get(filePart3.getSubmittedFileName()).getFileName().toString();     
           product p=new product(); 
           p.Set_p1(ph1);
           p.Set_p2(ph2);
           p.Set_p3(ph3);
           String size=request.getParameter("sizes");
           String name=request.getParameter("nameP");
           String type=request.getParameter("type");
           String pr=request.getParameter("price");
           String nS=request.getParameter("ninstock");
           String des=request.getParameter("description");
              p.Set_type(type);
              p.set_discription(des);
              p.set_name(name);
              double pri = Double.parseDouble(pr);
              int numinst= Integer.parseInt(nS);;
             p.set_numberinstock(numinst);
             p.set_price(pri);
             p.set_sizes(size);
              System.out.print(p.get_name());
            productinsystem pp=new productinsystem();
             pp.addp(p);
             response.sendRedirect("adminprofile.jsp");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(savePr.class.getName()).log(Level.SEVERE, null, ex);
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
