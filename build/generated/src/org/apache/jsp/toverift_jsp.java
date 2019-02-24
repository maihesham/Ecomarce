package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class toverift_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Verift</title>\n");
      out.write("         <link href=\"font-awesome-4.5.0/css/font-awesome.min.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        <link href=\"css/bootstrap.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        <link href=\"css/animate.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        <link href=\"css/page2.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("         <link href=\"css/generalstyle.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("         <link href=\"css/reg.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("            \n");
      out.write("   <div class=\"clearfix\"></div>   \n");
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
      out.write("                       \n");
      out.write("                    </ul>\n");
      out.write("                </div><!-- /.navbar-collapse -->\n");
      out.write("              </div><!-- /.container-fluid -->\n");
      out.write("            </nav>\n");
      out.write("          \n");
      out.write("        </section>\n");
      out.write("        <section class=\"login_as_user\">\n");
      out.write("          <div class=\"container \">\n");
      out.write("              <div class=\"row\">\n");
      out.write("                   <div class=\"col-md-6 col-md-offset-3 col-xs-6 col-xs-offset-0\">  \n");
      out.write("                       <form action=\"saveuserasverify\" method=\"Post\">\n");
      out.write("                            <div class=\"form-group\">\n");
      out.write("                              <label>Name</label>\n");
      out.write("                              <input type=\"text\" name=\"name\" onblur=\"sendajaxV()\"   required class=\"form-control\" id=\"name\" placeholder=\"Enter Name\">\n");
      out.write("                            </div>\n");
      out.write("                           <div class=\"form-group\">\n");
      out.write("                              <label >Password</label>\n");
      out.write("                              <input type=\"password\" name=\"pass\"   onblur=\"sendajaxVP()\" required pattern=\"(?=.*\\d)(?=.*[a-z])(?=.*[A-Z]).{6,}\"  class=\"form-control\" id=\"pass\" placeholder=\"Enter Password\">\n");
      out.write("                            </div>\n");
      out.write("                            <button type=\"submit\"  class=\"btn btn-default\">Verify</button>\n");
      out.write("                       </form>\n");
      out.write("                   </div></div></div>\n");
      out.write("        </section>\n");
      out.write("    <script src=\"jquery-3.2.0.min.js\" type=\"text/javascript\"></script>\n");
      out.write("    <script src=\"jsvalidation/validatecustomer.js\" type=\"text/javascript\"></script>\n");
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
