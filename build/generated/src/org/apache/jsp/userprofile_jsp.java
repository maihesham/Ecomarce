package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import neededclasess.customer;

public final class userprofile_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>home</title>\n");
      out.write("         <link href=\"font-awesome-4.5.0/css/font-awesome.min.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("         <link href=\"css/bootstrap.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("         <link href=\"css/animate.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("         <link href=\"css/generalstyle.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("         <link href=\"css/userprofilestyle.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("         <style>\n");
      out.write("           \n");
      out.write("         </style>\n");
      out.write("    </head>\n");
      out.write("    \n");
      out.write("    <body>\n");
      out.write("        ");

            customer c=(customer)session.getAttribute("user");
        
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
      out.write("                        <li><a  href=\"home.jsp\"><button type=\"button\" class=\"btn btn-default\">Home</button></a></li>\n");
      out.write("                    </ul>\n");
      out.write("                </div><!-- /.navbar-collapse -->\n");
      out.write("              </div><!-- /.container-fluid -->\n");
      out.write("            </nav>\n");
      out.write("          \n");
      out.write("        </section>\n");
      out.write("     <div class=\"clearfix\"></div>\n");
      out.write("     <hr>\n");
      out.write("    <section>\n");
      out.write("       <div class=\"container\">\n");
      out.write("\t<div class=\"row\">\n");
      out.write("                        <div class=\"col-lg-4  minue\"><!-- start minue -->\n");
      out.write("                                 <div class=\"span12\">\n");
      out.write("                                          <div id=\"tab\" class=\"btn-group\" data-toggle=\"buttons-radio\">\n");
      out.write("                                               <ul>   \n");
      out.write("                                                   <li><a href=\"#info\" class=\"btn active\" data-toggle=\"tab\">user Account</a></li>\n");
      out.write("                                                    <li> <a href=\"#Currentorder\" class=\"btn\" data-toggle=\"tab\">Current order</a></li>\n");
      out.write("                                                    <li> <a href=\"#Oldorders\" class=\"btn\" data-toggle=\"tab\">Old orders</a></li>\n");
      out.write("                                                    <li> <a href=\"#Search\" class=\"btn\"  data-toggle=\"tab\">Search</a></li>\n");
      out.write("                                                  \n");
      out.write("                                                </ul>     \n");
      out.write("                                            </div>\n");
      out.write("                                         </div>\n");
      out.write("        </div>\n");
      out.write("    <div class=\"tab-content\"><!-- tabs  -->\n");
      out.write("              <div class=\"tab-pane active\" id=\"info\">\n");
      out.write("                    <div class=\"col-lg-6 tabscont infouser\"><!-- statrt home-->\n");
      out.write("                        <h3>Name :- <span class=\"userinfo\">");
out.print(c.get_name());
      out.write("</span> </h3> \n");
      out.write("                        <h3>Email :- <span class=\"userinfo\">");
out.print(c.get_emaul());
      out.write("</span></h3>\n");
      out.write("                        <h3>Country :- <span class=\"userinfo\">");
out.print(c.get_country());
      out.write("</span></h3>\n");
      out.write("                        <h3>Phone :- <span class=\"userinfo\">");
out.print(c.get_Phone());
      out.write("</span></h3>\n");
      out.write("                        <h3>Address :- <span class=\"userinfo\">");
out.print(c.get_address());
      out.write("</span></h3>\n");
      out.write("                           </div><!-- statrt home-->\n");
      out.write("        </div>\n");
      out.write("        <div class=\"tab-pane\" id=\"Currentorder\">\n");
      out.write("                  <div class=\"col-lg-6 tabscont\"><!-- statrt about us-->\n");
      out.write("                       aboutus         \n");
      out.write("                   </div>          \n");
      out.write("               </div> \n");
      out.write("        <div class=\"tab-pane\" id=\"Oldorders\">\n");
      out.write("            <div class=\"col-lg-6 tabscont\"><!-- statrt about us-->\n");
      out.write("              \n");
      out.write("                   \n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("         <div class=\"tab-pane\" id=\"Search\">\n");
      out.write("            <div class=\"col-lg-6 tabscont\"><!-- statrt about us-->\n");
      out.write("             \n");
      out.write("                \n");
      out.write("                   \n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("    </div><!-- tabs -->\n");
      out.write("       </div><!-- row -->\n");
      out.write("    </div><!-- contaner-->\n");
      out.write("    <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js\"></script>\n");
      out.write("    <!-- Include all compiled plugins (below), or include individual files as needed -->\n");
      out.write("    <script src=\"jsvalidation/bootstrap.min.js\"></script>\n");
      out.write("\n");
      out.write("   \n");
      out.write("        <script src=\"jquery-3.2.0.min.js\" type=\"text/javascript\"></script>\n");
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
