<%-- 
    Document   : userprofilesearch
    Created on : Jan 28, 2019, 10:34:14 PM
    Author     : egypt2
--%>



<%@page import="neededclasess.getorderall"%>
<%@page import="java.util.ArrayList"%>
<%@page import="neededclasess.customer"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>user search</title>
          <link href="css/userprofilsearchestyle.css" rel="stylesheet" type="text/css"/>
         <link href="css/bootstrap.css" rel="stylesheet" type="text/css"/>
         <link href="css/page2.css" rel="stylesheet" type="text/css"/>
         <link href="css/generalstyle.css" rel="stylesheet" type="text/css"/>
        <%
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
        %>
        <style></style>
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
                                                <li><a  href="adminprofile.jsp"><button type="button" class="btn btn-default">profile</button></a></li>

                    </ul>
                </div><!-- /.navbar-collapse -->
              </div><!-- /.container-fluid -->
            </nav>
          
        </section>
     <div class="clearfix"></div>
     <hr>
     <section class="us">
         <div class="container">
             <div class="row">
                 <div >
                      <div class="each-blog">
                    <div class="col-md-4 col-xs-12 wow fadeInLeft" data-wow-duration="1s" data-wow-delay="0.5s">
                        <div class="thumbnail">
                          <img src="images/full_1.jpg">
                          <div class="caption">
                              <h3 class="na">name:-<%out.print(c.get_name());%></h3>
                            <p>this account make <%out.print(old.size());%> order , and current wait <%out.print(cur.size());%></p>
                              <div class="end">
                                    
                                  <span class="glyphicon glyphicon-time" aria-hidden="true"></span>
                                  <span> registeration in <%out.print(c.get_rgtime());%></span>
                                  <button type="button" class="btn btn-default" id="reove">remove/<%out.print(c.get_name());%></button>
                                  
                              </div>
                          </div>
                        </div>
                    </div>
                </div>
                 </div>
             </div>
         </div>
                                                  
     </section>
                              <section class="order">
                                  <div class="container">
                                      <div class="row">
                                  <div class="col-lg-5 col-lg-offset-2">
                                      <h3>old orders <%out.print(old.size());%></h3>
                                      <table class="table table-striped">
                                                    <thead>
                                                      <tr>
                                                        <th scope="col">number</th>
                                                        <th scope="col">orderid</th>
                                                       <th scope="col">Totalprice</th>
                                                      </tr>
                                                    </thead>
                                                    <tbody>
                                                   
                                             <%for(int i=0;i<old.size();i++){%>   
                                                        <tr>  
                                                        <th scope="row">1</th>
                                                        <td><%out.print(old.get(i).get_orderid());%></td>
                                                        <td><%out.print(old.get(i).get_Pr());%></td>
                                                      </tr>
                                                 <%}%>     
                                                    </tbody>
                                                  </table>
                                  </div>
                              </div>   
                           </div>
                              </section> 
                                      <hr>
                                      <hr>
                     <section class="order">
                         
                 <div class="container">
                                      <div class="row">
                                  <div class="col-lg-5 col-lg-offset-2">
                                      <h3>current orders <%out.print(cur.size());%></h3>
                                      <table class="table table-striped">
                                                    <thead>
                                                      <tr>
                                                       <th scope="col">number</th>
                                                        <th scope="col">orderid</th>
                                                       <th scope="col">Totalprice</th>
                                                       
                                                       
                                                      </tr>
                                                    </thead>
                                                    <tbody>
                                                      <%for(int i=0;i<cur.size();i++){%>   
                                                        <tr>  
                                                        <th scope="row">1</th>
                                                        <td><%out.print(cur.get(i).get_orderid());%></td>
                                                        <td><%out.print(cur.get(i).get_Pr());%></td>
                                                      </tr>
                                                 <%}%>  
                                                      
                                                    </tbody>
                                                  </table>
                                  </div>
                              </div>   
                           </div>
                              </section> 
                        <script src="jquery-3.2.0.min.js" type="text/javascript"></script>
                        <script src="jsvalidation/removeuser.js" type="text/javascript"></script>
          <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
    <!-- Include all compiled plugins (below), or include individual files as needed -->
                    <script src="jsvalidation/bootstrap.min.js"></script>                 
    </body>
    
</html>
