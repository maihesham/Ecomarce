package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import neededclasess.getorderall;
import java.util.ArrayList;
import neededclasess.customer;

public final class userprofilesearch_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>user search</title>\n");
      out.write("          <link href=\"css/userprofilsearchestyle.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("         <link href=\"css/bootstrap.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("         <link href=\"css/page2.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("         <link href=\"css/generalstyle.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        ");

            customer c=(customer)session.getAttribute("usersra");
            session.removeAttribute("usersra");
             ArrayList<getorderall> old=new ArrayList<getorderall>();
             ArrayList<getorderall> cur=new ArrayList<getorderall>();
             old=(ArrayList<getorderall>)session.getAttribute("oldordersser");
             cur=(ArrayList<getorderall>)session.getAttribute("currordersser");
             session.removeAttribute("oldordersser");
             session.removeAttribute("currordersser");
             if(session.getAttribute("oldordersser")==null){
                 
             }
        
      out.write("\n");
      out.write("        <style>.ordr{\n");
      out.write("    margin-bottom: 20px;\n");
      out.write("}</style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("             <!-- Start Header-->\n");
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
      out.write("                                                <li><a  href=\"adminprofile.jsp\"><button type=\"button\" class=\"btn btn-default\">profile</button></a></li>\n");
      out.write("\n");
      out.write("                    </ul>\n");
      out.write("                </div><!-- /.navbar-collapse -->\n");
      out.write("              </div><!-- /.container-fluid -->\n");
      out.write("            </nav>\n");
      out.write("          \n");
      out.write("        </section>\n");
      out.write("     <div class=\"clearfix\"></div>\n");
      out.write("     <hr>\n");
      out.write("     <section>\n");
      out.write("         <div class=\"container\">\n");
      out.write("             <div class=\"row\">\n");
      out.write("                 <div >\n");
      out.write("                      <div class=\"each-blog\">\n");
      out.write("                    <div class=\"col-md-4 col-xs-12 wow fadeInLeft\" data-wow-duration=\"1s\" data-wow-delay=\"0.5s\">\n");
      out.write("                        <div class=\"thumbnail\">\n");
      out.write("                          <img src=\"images/full_1.jpg\">\n");
      out.write("                          <div class=\"caption\">\n");
      out.write("                              <h3 class=\"na\">name:-");
out.print(c.get_name());
      out.write("</h3>\n");
      out.write("                            <p>this account make ");
out.print(old.size());
      out.write(" order , and current wait ");
out.print(cur.size());
      out.write("</p>\n");
      out.write("                              <div class=\"end\">\n");
      out.write("                                    \n");
      out.write("                                  <span class=\"glyphicon glyphicon-time\" aria-hidden=\"true\"></span>\n");
      out.write("                                  <span> registeration in ");
out.print(c.get_rgtime());
      out.write("</span>\n");
      out.write("                                  <button type=\"button\" class=\"btn btn-default\" id=\"reove\">remove_user</button>\n");
      out.write("                                  \n");
      out.write("                              </div>\n");
      out.write("                          </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                 </div>\n");
      out.write("             </div>\n");
      out.write("         </div>\n");
      out.write("                                                  \n");
      out.write("     </section>\n");
      out.write("                              <section class=\"order\">\n");
      out.write("                                  <div class=\"container\">\n");
      out.write("                                      <div class=\"row\">\n");
      out.write("                                  <div class=\"col-lg-5 col-lg-offset-2\">\n");
      out.write("                                      <h3>old orders ");
out.print(old.size());
      out.write("</h3>\n");
      out.write("                                      <table class=\"table table-striped\">\n");
      out.write("                                                    <thead>\n");
      out.write("                                                      <tr>\n");
      out.write("                                                        <th scope=\"col\">number</th>\n");
      out.write("                                                        <th scope=\"col\">orderid</th>\n");
      out.write("                                                       <th scope=\"col\">Totalprice</th>\n");
      out.write("                                                      </tr>\n");
      out.write("                                                    </thead>\n");
      out.write("                                                    <tbody>\n");
      out.write("                                                   \n");
      out.write("                                             ");
for(int i=0;i<old.size();i++){
      out.write("   \n");
      out.write("                                                        <tr>  \n");
      out.write("                                                        <th scope=\"row\">1</th>\n");
      out.write("                                                        <td>");
out.print(old.get(i).get_orderid());
      out.write("</td>\n");
      out.write("                                                        <td>");
out.print(old.get(i).get_Pr());
      out.write("</td>\n");
      out.write("                                                      </tr>\n");
      out.write("                                                 ");
}
      out.write("     \n");
      out.write("                                                    </tbody>\n");
      out.write("                                                  </table>\n");
      out.write("                                  </div>\n");
      out.write("                              </div>   \n");
      out.write("                           </div>\n");
      out.write("                              </section> \n");
      out.write("                                      <hr>\n");
      out.write("                                      <hr>\n");
      out.write("                     <section class=\"order\">\n");
      out.write("                         \n");
      out.write("                 <div class=\"container\">\n");
      out.write("                                      <div class=\"row\">\n");
      out.write("                                  <div class=\"col-lg-5 col-lg-offset-2\">\n");
      out.write("                                      <h3>current orders ");
out.print(cur.size());
      out.write("</h3>\n");
      out.write("                                      <table class=\"table table-striped\">\n");
      out.write("                                                    <thead>\n");
      out.write("                                                      <tr>\n");
      out.write("                                                       <th scope=\"col\">number</th>\n");
      out.write("                                                        <th scope=\"col\">orderid</th>\n");
      out.write("                                                       <th scope=\"col\">Totalprice</th>\n");
      out.write("                                                       \n");
      out.write("                                                       \n");
      out.write("                                                      </tr>\n");
      out.write("                                                    </thead>\n");
      out.write("                                                    <tbody>\n");
      out.write("                                                      ");
for(int i=0;i<cur.size();i++){
      out.write("   \n");
      out.write("                                                        <tr>  \n");
      out.write("                                                        <th scope=\"row\">1</th>\n");
      out.write("                                                        <td>");
out.print(cur.get(i).get_orderid());
      out.write("</td>\n");
      out.write("                                                        <td>");
out.print(cur.get(i).get_Pr());
      out.write("</td>\n");
      out.write("                                                      </tr>\n");
      out.write("                                                 ");
}
      out.write("  \n");
      out.write("                                                      \n");
      out.write("                                                    </tbody>\n");
      out.write("                                                  </table>\n");
      out.write("                                  </div>\n");
      out.write("                              </div>   \n");
      out.write("                           </div>\n");
      out.write("                              </section> \n");
      out.write("                        <script src=\"jquery-3.2.0.min.js\" type=\"text/javascript\"></script>\n");
      out.write("                        <script src=\"jsvalidation/removeuser.js\" type=\"text/javascript\"></script>\n");
      out.write("          <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js\"></script>\n");
      out.write("    <!-- Include all compiled plugins (below), or include individual files as needed -->\n");
      out.write("                    <script src=\"jsvalidation/bootstrap.min.js\"></script>                 \n");
      out.write("    </body>\n");
      out.write("    \n");
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
