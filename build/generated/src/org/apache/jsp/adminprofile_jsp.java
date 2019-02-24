package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import neededclasess.getorderall;
import java.util.ArrayList;

public final class adminprofile_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("          <title>profile</title>\n");
      out.write("            <link href=\"css/adminstyle.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("         <link href=\"css/bootstrap.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("         <link href=\"css/animate.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("         <link href=\"css/generalstyle.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("         <link href=\"css/userprofilestyle.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("         <link href=\"css/page2.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("           \n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        ");

             ArrayList<getorderall> verify=new ArrayList<getorderall>();
              verify=(ArrayList<getorderall> ) session.getAttribute("ver");
        
      out.write("\n");
      out.write("         <div class=\"clearfix\"></div>   \n");
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
      out.write("                        <li><a  href=\"#\"><button type=\"button\" class=\"btn btn-default\"></button></a></li>\n");
      out.write("                        <li><a  href=\"#\"><button type=\"button\" class=\"btn btn-default\"></button></a></li>\n");
      out.write("                        <li><a  href=\"#\"><button type=\"button\" class=\"btn btn-default\"></button></a></li>\n");
      out.write("                    </ul>\n");
      out.write("                </div><!-- /.navbar-collapse -->\n");
      out.write("              </div><!-- /.container-fluid -->\n");
      out.write("            </nav>\n");
      out.write("          \n");
      out.write("        </section>\n");
      out.write("     <div class=\"clearfix\"></div>\n");
      out.write("     <hr>\n");
      out.write("     \n");
      out.write("      <div class=\"clearfix\"></div>   \n");
      out.write("    <section>\n");
      out.write("       <div class=\"container\">\n");
      out.write("\t<div class=\"row\">\n");
      out.write("                        <div class=\"col-lg-4  minue\"><!-- start minue -->\n");
      out.write("                                 <div class=\"span12\">\n");
      out.write("                                          <div id=\"tab\" class=\"btn-group\" data-toggle=\"buttons-radio\">\n");
      out.write("                                               <ul>   \n");
      out.write("                                                    <li><a href=\"#def\" class=\"btn active\" data-toggle=\"tab\">defult</a></li>\n");
      out.write("                                                   <li><a href=\"#addpr\" class=\"btn active\" data-toggle=\"tab\">Add Productt</a></li>\n");
      out.write("                                                    <li> <a href=\"#verfiy\" class=\"btn\" data-toggle=\"tab\">Verify orders</a></li>\n");
      out.write("                                                    <li> <a href=\"#suser\" class=\"btn\" data-toggle=\"tab\">Search user</a></li>\n");
      out.write("                                                    <li> <a href=\"#sprod\" class=\"btn\"  data-toggle=\"tab\">Search Product</a></li>\n");
      out.write("                                                  \n");
      out.write("                                                </ul>     \n");
      out.write("                                            </div>\n");
      out.write("                                         </div>\n");
      out.write("        </div>\n");
      out.write("    <div class=\"tab-content\"><!-- tabs  -->\n");
      out.write("          <div class=\"tab-pane active\" id=\"def\">\n");
      out.write("                    <div class=\"col-lg-6 tabscont\"><!-- statrt home-->\n");
      out.write("                         def\n");
      out.write("                           </div><!-- statrt home-->\n");
      out.write("        </div>\n");
      out.write("              <div class=\"tab-pane \" id=\"addpr\">\n");
      out.write("                    <div class=\"col-lg-6 tabscont infouser\"><!-- statrt home-->\n");
      out.write("                        \n");
      out.write("                        <form  class=\"fortoadd\" action=\"savePr\" method=\"Post\"enctype=\"multipart/form-data\">\n");
      out.write("                            <div class=\"form-group\">\n");
      out.write("                              <label>Product-Name</label>\n");
      out.write("                              <input type=\"text\" name=\"nameP\" required class=\"form-control\" id=\"nameP\" placeholder=\"Enter Name\">\n");
      out.write("                              \n");
      out.write("                            </div>\n");
      out.write("                           <div class=\"form-group\">\n");
      out.write("                              <label>Product-Type</label>\n");
      out.write("                              <input type=\"text\" name=\"type\"    required class=\"form-control\" id=\"type\" placeholder=\"Enter Type\">\n");
      out.write("                              \n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"form-group\">\n");
      out.write("                              <label>Avalible sizes (spces using / )</label>\n");
      out.write("                              <input type=\"text\" name=\"sizes\"    required class=\"form-control\" id=\"sizes\" placeholder=\"Enter avalible sizes\">\n");
      out.write("                            </div> \n");
      out.write("                            <div class=\"form-group\">\n");
      out.write("                              <label>Product-count-in-stock</label>\n");
      out.write("                              <input type=\"number\" name=\"ninstock\"    required class=\"form-control\" id=\"ninstock\" placeholder=\"Enter number in stock\">\n");
      out.write("                            </div> \n");
      out.write("                            <div class=\"form-group\">\n");
      out.write("                              <label>Product-price</label>\n");
      out.write("                              <input type=\"text\" name=\"price\"    required class=\"form-control\" id=\"price\" placeholder=\"Enter peice\">\n");
      out.write("                            </div> \n");
      out.write("                           <div class=\"form-group\">\n");
      out.write("                              <label>Product-description</label>\n");
      out.write("                              <textarea rows=\"3\" cols=\"55\"  required class=\"form-control\" name=\"description\" id=\"description\" ></textarea>\n");
      out.write("                           </div>\n");
      out.write("                            <div class=\"form-group\">\n");
      out.write("                              <label>Product-photo1(will be main photo)</label>\n");
      out.write("                              <input type=\"file\" name=\"p1\"   required class=\"form-control\" id=\"p1\">\n");
      out.write("                            </div> \n");
      out.write("                              <div class=\"form-group\">\n");
      out.write("                              <label>Product-photo2</label>\n");
      out.write("                              <input type=\"file\" name=\"p2\"    required class=\"form-control\" id=\"p2\">\n");
      out.write("                            </div> \n");
      out.write("                              <div class=\"form-group\">\n");
      out.write("                              <label>Product-photo3</label>\n");
      out.write("                              <input type=\"file\" name=\"p3\"    class=\"form-control\" id=\"p3\">\n");
      out.write("                            </div> \n");
      out.write("                            <button type=\"submit\"  class=\"btn btn-default\">Submit</button>\n");
      out.write("                         </form>\n");
      out.write("                   \n");
      out.write("                 </div><!-- statrt home-->\n");
      out.write("        </div>\n");
      out.write("        <div class=\"tab-pane\" id=\"verfiy\">\n");
      out.write("                  <div class=\"col-lg-6 tabscont\"><!-- statrt about us-->\n");
      out.write("                       \n");
      out.write("                        <div class=\"row\">\n");
      out.write("                          <div>\n");
      out.write("                              ");
if(verify.size()>0){
      out.write("\n");
      out.write("                                        ");
for(int i=0;i<verify.size();i++){
      out.write("\n");
      out.write("                                                <div>\n");
      out.write("                                                    <div  class=\"col-lg-6 oneblog\" id=");
      out.print(verify.get(i).get_orderid());
      out.write(">\n");
      out.write("                                                   <!--srat one p  -->\n");
      out.write("                                                   <div class=\"thumbnail\">\n");
      out.write("\n");
      out.write("                                                       <img alt=\"img\" src=\"images/person_1.jpg\"/>\n");
      out.write("                                                     <div class=\"caption\">\n");
      out.write("                                                         <h3>order /");
      out.print( verify.get(i).get_orderid() );
      out.write("</h3>\n");
      out.write("                                                         <h4>name of customer ");
      out.print( verify.get(i).getname() );
      out.write("</h4>\n");
      out.write("                                                         <div class=\"end\">\n");
      out.write("                                                             <span class=\"glyphicon glyphicon-time\" aria-hidden=\"true\"> addTime :- ");
 out.print(verify.get(i).getDate());  
      out.write(" </span>\n");
      out.write("                                                             <br>\n");
      out.write("                                                             <span> TotalPrice ");
      out.print( verify.get(i).get_Pr() );
      out.write("</span>\n");
      out.write("                                                             <br>\n");
      out.write("                                                             <button type=\"button\" id=\"forsendorder\" class=\"btn btn-info btn-lg\">send order /");
      out.print( verify.get(i).get_orderid() );
      out.write("</button>\n");
      out.write("   \n");
      out.write("                                                         </div>\n");
      out.write("                                                     </div>\n");
      out.write("                                                   </div>\n");
      out.write("                                                     <!--endt one p  -->\n");
      out.write("                                               </div>\n");
      out.write("                                  </div>\n");
      out.write("                          ");
}
      out.write("\n");
      out.write("                     ");
}else{
      out.write("\n");
      out.write("                     <p>NO Orders Here </p>\n");
      out.write("                     ");
}
      out.write("\n");
      out.write("                          </div>\n");
      out.write("                      </div>\n");
      out.write("                   </div>          \n");
      out.write("               </div> \n");
      out.write("        <div class=\"tab-pane\" id=\"suser\">\n");
      out.write("            <div class=\"col-lg-6 tabscont\"><!-- statrt about us-->\n");
      out.write("              \n");
      out.write("                <form action=\"getuserbyname\" method=\"Post\" >\n");
      out.write("                            <div class=\"form-group\">\n");
      out.write("                              <label>Name</label>\n");
      out.write("                              <input type=\"text\" name=\"name\" onblur=\"sendajaxV()\"   required class=\"form-control\" id=\"name\" placeholder=\"Enter Name\">\n");
      out.write("                            </div>\n");
      out.write("                           \n");
      out.write("                            <button type=\"submit\"  class=\"btn btn-default\">submit</button>\n");
      out.write("                       </form>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("         <div class=\"tab-pane\" id=\"sprod\">\n");
      out.write("            <div class=\"col-lg-6 tabscont\"><!-- statrt about us-->\n");
      out.write("             \n");
      out.write("                 <form action=\"getproductbyid\" method=\"Post\" >\n");
      out.write("                            <div class=\"form-group\">\n");
      out.write("                              <label>Name/Type</label>\n");
      out.write("                              <input type=\"text\" name=\"tproduct\"   required class=\"form-control\" id=\"tproduct\" placeholder=\"Enter Name\">\n");
      out.write("                            </div>\n");
      out.write("                           \n");
      out.write("                            <button type=\"submit\"  class=\"btn btn-default\">submit</button>\n");
      out.write("                       </form>\n");
      out.write("                   \n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("    </div><!-- tabs -->\n");
      out.write("       </div><!-- row -->\n");
      out.write("    </div><!-- contaner-->\n");
      out.write("    </section>\n");
      out.write("    \n");
      out.write("      <script src=\"jquery-3.2.0.min.js\" type=\"text/javascript\"></script>\n");
      out.write("      <script src=\"jsvalidation/fordimnconfermorder.js\" type=\"text/javascript\"></script>\n");
      out.write("      <script src=\"jsvalidation/savepr.js\" type=\"text/javascript\"></script>\n");
      out.write("      <script src=\"jsvalidation/validatecustomer.js\" type=\"text/javascript\"></script>\n");
      out.write("    <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js\"></script>\n");
      out.write("    <!-- Include all compiled plugins (below), or include individual files as needed -->\n");
      out.write("    <script src=\"jsvalidation/bootstrap.min.js\"></script>\n");
      out.write("\n");
      out.write("   \n");
      out.write("       \n");
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
