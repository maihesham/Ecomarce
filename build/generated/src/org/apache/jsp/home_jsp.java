package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.Base64;
import java.io.ByteArrayOutputStream;
import neededclasess.product;
import neededclasess.getorderall;
import java.util.ArrayList;
import neededclasess.customer;

public final class home_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>home</title>\n");
      out.write("        <link href=\"css/product.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        <link href=\"css/generalstyle.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("         <link href=\"css/bootstrap.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("         <link href=\"css/animate.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("         <link href=\"css/page2.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("         <style>\n");
      out.write("           \n");
      out.write("         </style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("         ");

           
             ArrayList<product> p=new ArrayList<product>();
             p=(ArrayList<product>)session.getAttribute("pro");
          
               int O=3;
                   
        
      out.write("\n");
      out.write("             <div class=\"clearfix\"></div>   \n");
      out.write("    <!-- Start Header-->\n");
      out.write(" \n");
      out.write("      <section class=\"header\">\n");
      out.write("          <nav class=\"navbar navbar-default\">\n");
      out.write("              <div class=\"container\">\n");
      out.write("                <!-- Brand and toggle get grouped for better mobile display -->\n");
      out.write("                <div class=\"navbar-header\">\n");
      out.write("                  <button type=\"button\" class=\"navbar-toggle collapsed\" data-toggle=\"collapse\" data-target=\"#bs-example-navbar-collapse-1\" aria-expanded=\"false\">\n");
      out.write("                    <span class=\"sr-only\">Toggle navigation</span>\n");
      out.write("                    <span class=\"icon-bar\"></span>\n");
      out.write("                    <span class=\"icon-bar\"></span>\n");
      out.write("                    <span class=\"icon-bar\"></span>\n");
      out.write("                  </button>\n");
      out.write("                  <a class=\"navbar-brand\" href=\"#\">souQ</a>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("    <!-- Collect the nav links, forms, and other content for toggling -->\n");
      out.write("                <div class=\"collapse navbar-collapse\" id=\"bs-example-navbar-collapse-1\">\n");
      out.write("                    <ul class=\"nav navbar-nav navbar-right\">\n");
      out.write("                        <li><a  href=\"userprofile.jsp\"><button type=\"button\" class=\"btn btn-default\">profile</button></a></li>\n");
      out.write("                        <li><a  href=\"car.jsp\"><button type=\"button\" class=\"btn btn-default\">current_car</button></a></li>\n");
      out.write("                    </ul>\n");
      out.write("                </div><!-- /.navbar-collapse -->\n");
      out.write("              </div><!-- /.container-fluid -->\n");
      out.write("            </nav>  \n");
      out.write("        </section>\n");
      out.write("   \n");
      out.write("        <div class=\"clearfix\"></div>\n");
      out.write("        <hr>\n");
      out.write("        <section class=\"Blog\">\n");
      out.write("            <div class=\"container\">\n");
      out.write("                <div class=\"row each-blog\">\n");
      out.write("                    ");
for(int i=0;i<p.size();i++){
      out.write("\n");
      out.write("                    <div>\n");
      out.write("                       <div class=\"col-lg-4 oneblog\">\n");
      out.write("                        <!--srat one p  -->\n");
      out.write("                        <div class=\"thumbnail\">\n");
      out.write("                            ");

                              
                                String x=p.get(i).get_p1();
                                String s="images/"+x;  
                               String n="http://localhost:8080/ecomerce/images/full_1.jpg";
                               
                            
      out.write("\n");
      out.write("                            <img alt=\"img\" src=\"images/10.PNG\"/>\n");
      out.write("                          <div class=\"caption\">\n");
      out.write("                              <h3>name:-");
out.print(p.get(i).get_name());
      out.write("</h3>\n");
      out.write("                              <div class=\"end\">\n");
      out.write("                                  <span class=\"glyphicon glyphicon-time\" aria-hidden=\"true\"> addTime :- ");
 out.print(p.get(i).get_addtime());  
      out.write(" </span>\n");
      out.write("                                  <br>\n");
      out.write("                                  <span> Avalabile in Stock :- ");
 out.print(p.get(i).get_numberinstock());  
      out.write("</span>\n");
      out.write("                                  <br>\n");
      out.write("                                  <span> Avalabile Sizes :- ");
 out.print(p.get(i).get_sizes());  
      out.write("</span>\n");
      out.write("                                  <br>\n");
      out.write("                                  <span> price :- ");
 out.print(p.get(i).get_price()); 
      out.write("</span>\n");
      out.write("                                  <br>\n");
      out.write("                                  <span> id:- ");
out.print(p.get(i).get_id());
      out.write("</span>\n");
      out.write("                                  ");
 String XX="#"; XX+=p.get(i).get_id();
      out.write("\n");
      out.write("                                  <br>\n");
      out.write("                                  <button type=\"button\" class=\"btn btn-info btn-lg\" data-toggle=\"modal\" data-target=");
      out.print(XX);
      out.write(" >show</button>\n");
      out.write("                              </div>\n");
      out.write("                          </div>\n");
      out.write("                        </div>\n");
      out.write("                          <!--endt one p  -->\n");
      out.write("                    </div>\n");
      out.write("                                  <!-- Modal -->\n");
      out.write("                                  <div   class=\"modal fade\" role=\"dialog\" id=");
      out.print(p.get(i).get_id());
      out.write(" >\n");
      out.write("                                  <div class=\"modal-dialog modal-lg\">\n");
      out.write("\n");
      out.write("                                    <!-- Modal content-->\n");
      out.write("                                    <div class=\"modal-content\">\n");
      out.write("                                      <div class=\"modal-header\">\n");
      out.write("                                        <button type=\"button\" class=\"close\" data-dismiss=\"modal\">&times;</button>\n");
      out.write("                                         <h1 class=\"modal-title\">");
      out.print( p.get(i).get_name() );
      out.write(" </h1>\n");
      out.write("                                         \n");
      out.write("                                      </div>\n");
      out.write("                                      <div class=\"modal-body\">\n");
      out.write("                                          <h2>type:- ");
      out.print( p.get(i).get_type() );
      out.write("</h2>\n");
      out.write("                                          <p>dicription:- ");
      out.print( p.get(i).get_discription() );
      out.write("</p>\n");
      out.write("                                          <p> Avalabile in Stock :- ");
 out.print(p.get(i).get_numberinstock());  
      out.write("</p>\n");
      out.write("                                          <p> Avalabile Sizes :- ");
 out.print(p.get(i).get_sizes());  
      out.write("</p>\n");
      out.write("                                          <p> price :- ");
 out.print(p.get(i).get_price()); 
      out.write("</p>\n");
      out.write("                                          <p>number sell it ");
      out.print( p.get(i).get_numberbuthis() );
      out.write("</p>\n");
      out.write("                                          <p>rate ");
      out.print( p.get(i).get_rate() );
      out.write("</p>\n");
      out.write("                                          <div class=\"row vieww\">\n");
      out.write("                                              <div class=\"col-lg-3  iminmo\"> <img  class=\"img-responsive\" alt=\"img\" src=\"images/10.PNG\"/></div>\n");
      out.write("                                            <div class=\"col-lg-3 iminmo\"> <img  class=\"img-responsive\" alt=\"img\" src=\"images/1.PNG\"/></div>\n");
      out.write("                                            <div class=\"col-lg-3  iminmo\"> <img  class=\"img-responsive\" alt=\"img\" src=\"images/5.PNG\"/></div>\n");
      out.write("                                          </div>\n");
      out.write("                                          <div class=\"clearfix\"></div>\n");
      out.write("                                         \n");
      out.write("                                          <div>\n");
      out.write("                                              <h3>Comments</h3>\n");
      out.write("                                              ");
for(int j=0;j<p.get(i).get_coom().size();j++){ 
      out.write("\n");
      out.write("                                              <div>\n");
      out.write("                                                  <span class=\"glyphicon glyphicon-time\" aria-hidden=\"true\">  ");
 out.print(p.get(i).get_coom().get(j).getda());
      out.write(" </span>\n");
      out.write("                                                   <span > / ");
 out.print(p.get(i).get_coom().get(j).getuser());
      out.write(" </span>\n");
      out.write("                                                    <span > /\" ");
 out.print(p.get(i).get_coom().get(j).getcomm());
      out.write(" \" </span>\n");
      out.write("                                              </div>\n");
      out.write("                                                  \n");
      out.write("                                              ");
}
      out.write("       \n");
      out.write("                                          </div>\n");
      out.write("                                      </div>\n");
      out.write("                                          \n");
      out.write("                                      <div class=\"modal-footer\">\n");
      out.write("                                          <div class=\"row\">\n");
      out.write("                                              <div class=\"col-lg-3\">\n");
      out.write("                                                  <span id=");
      out.print(p.get(i).get_rate());
      out.write(" ></span>\n");
      out.write("                                                  <span id=");
      out.print(p.get(i).get_id());
      out.write(" ></span>\n");
      out.write("                                                  <input type=\"text\" name=\"comm\"   required class=\"form-control\" id=\"comm\" placeholder=\"Enter enter comment\">\n");
      out.write("                                                   <input type=\"number\" name=\"rate\"   min=\"1\" max=\"5\"  step=\"5\" required class=\"form-control\" id=\"rate\" placeholder=\"Enter rate\">\n");
      out.write("                                                   <button type=\"button\" class=\"btn btn-default torate\" >add</button> \n");
      out.write("                                              </div>\n");
      out.write("                                                   \n");
      out.write("                                          </div>\n");
      out.write("                                           <div class=\"clearfix\"></div>\n");
      out.write("                                          <div class=\"row\">  \n");
      out.write("                                               <input type=\"text\" name=\"size\"   required class=\"form-control\" id=\"size\" placeholder=\"Enter size\">  \n");
      out.write("                                               <input type=\"number\" name=\"num\"   min=\"1\" max=");
      out.print(p.get(i).get_numberinstock() );
      out.write(" required class=\"form-control\" id=\"num\" placeholder=\"Enter number of pice\">\n");
      out.write("                                              <button type=\"button\" class=\"btn btn-default aaddtocar\" >add_to_car,");
      out.print(p.get(i).get_id());
      out.write("</button>\n");
      out.write("                                       </div>\n");
      out.write("                                           <div class=\"clearfix\"></div>\n");
      out.write("                                          \n");
      out.write("                                           \n");
      out.write("                                       \n");
      out.write("                                      </div>\n");
      out.write("                                    </div>\n");
      out.write("\n");
      out.write("                                  </div>\n");
      out.write("                                </div>\n");
      out.write("                                  \n");
      out.write("                    </div>\n");
      out.write("                   \n");
      out.write("                    ");
}
      out.write("\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </section>\n");
      out.write("                 <div class=\"clearfix\"></div>\n");
      out.write("                <!-- Trigger the modal with a button -->\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("        <script src=\"jquery-3.2.0.min.js\" type=\"text/javascript\"></script>\n");
      out.write("        <script src=\"jsvalidation/getonePr.js\" type=\"text/javascript\"></script>\n");
      out.write("          <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js\"></script>\n");
      out.write("    <!-- Include all compiled plugins (below), or include individual files as needed -->\n");
      out.write("                    <script src=\"jsvalidation/bootstrap.min.js\"></script>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
