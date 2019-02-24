<%-- 
    Document   : invaliduser
    Created on : Jan 28, 2019, 10:16:11 PM
    Author     : egypt2
--%>

<%@page import="neededclasess.customer"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>user search</title>
          <link href="css/userprofilestyle.css" rel="stylesheet" type="text/css"/>
         <link href="css/bootstrap.css" rel="stylesheet" type="text/css"/>
         <link href="css/page2.css" rel="stylesheet" type="text/css"/>
         <link href="css/generalstyle.css" rel="stylesheet" type="text/css"/>
        <%
            customer c=(customer)session.getAttribute("usersra");
            session.removeAttribute("usersra");
        %>
    </head>
    <body>
             <!-- Start Header-->
 
      <section class="header">
          <nav class="navbar navbar-default">
              <div class="container">
                <!-- Brand and toggle get grouped for better mobile display -->
                <div class="navbar-header">
                  <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1" aria-expanded="false">
                    <span class="sr-only">Toggle navigation</span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                  </button>
                  <a class="navbar-brand" href="#">souQ</a>
                </div>

    <!-- Collect the nav links, forms, and other content for toggling -->
                <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
                    <ul class="nav navbar-nav navbar-right">
                    </ul>
                </div><!-- /.navbar-collapse -->
              </div><!-- /.container-fluid -->
            </nav>
          
        </section>
     <div class="clearfix"></div>
     <hr>
     <section>
         <div class="container">
             <div class="row">
                 <div >
                      <div class="each-blog">
                    <div class="col-md-4 col-xs-12 wow fadeInLeft" data-wow-duration="1s" data-wow-delay="0.5s">
                        <div class="thumbnail">
                          <img src="images/full_1.jpg">
                          <div class="caption">
                            <h3>name:-<%out.print(c.get_name());%></h3>
                             <p>this account dosn't make verify to his account</p>
                              <div class="end">
                                    
                                  <span class="glyphicon glyphicon-time" aria-hidden="true"></span>
                                  <span> registeration in <%out.print(c.get_rgtime());%></span>
                              </div>
                          </div>
                        </div>
                    </div>
                </div>
                 </div>
             </div>
         </div>
     </section>
               

    </body>
</html>
