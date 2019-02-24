<%-- 
    Document   : home
    Created on : Jan 27, 2019, 11:56:06 AM
    Author     : egypt2
--%>

<%@page import="java.util.Base64"%>
<%@page import="java.io.ByteArrayOutputStream"%>
<%@page import="neededclasess.product"%>
<%@page import="neededclasess.getorderall"%>
<%@page import="java.util.ArrayList"%>
<%@page import="neededclasess.customer"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>home</title>
        <link href="css/product.css" rel="stylesheet" type="text/css"/>
        <link href="css/generalstyle.css" rel="stylesheet" type="text/css"/>
         <link href="css/bootstrap.css" rel="stylesheet" type="text/css"/>
        
         <link href="css/page2.css" rel="stylesheet" type="text/css"/>
         <style>
           
         </style>
    </head>
    <body>
         <%
           
             ArrayList<product> p=new ArrayList<product>();
             p=(ArrayList<product>)session.getAttribute("adminsearchproduct");
      
                   
        %>
             <div class="clearfix"></div>   
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
        <section class="Blog">
            <div class="container">
                <div class="row each-blog">
                    <%for(int i=0;i<p.size();i++){%>
                    <div>
                       <div class="col-lg-4 oneblog">
                        <!--srat one p  -->
                        <div class="thumbnail">
                            <%
                               String x=p.get(i).get_p1();
                                String s="images/"+x;  
                               String s3="images/"+p.get(i).get_p2();
                               String s2="images/"+p.get(i).get_p3s();
                               
                            %>
                            <img alt="img" src="<%= s %>" />
                          <div class="caption">
                              <h3>name:-<%out.print(p.get(i).get_name());%></h3>
                              <div class="end">
                                  <span class="glyphicon glyphicon-time" aria-hidden="true"> addTime :- <% out.print(p.get(i).get_addtime());  %> </span>
                                  <br>
                                  <span> Avalabile in Stock :- <% out.print(p.get(i).get_numberinstock());  %></span>
                                  <br>
                                  <span> Avalabile Sizes :- <% out.print(p.get(i).get_sizes());  %></span>
                                  <br>
                                  <span> price :- <% out.print(p.get(i).get_price()); %></span>
                                  <br>
                                  <span> id:- <%out.print(p.get(i).get_id());%></span>
                                  <br>
                                  <br>
                                  <button type="button" class="btn btn-info btn-lg re" id="<%=p.get(i).get_id()%>" >remove/<%=p.get(i).get_id()%></button>
                              </div>
                          </div>
                        </div>
                          <!--endt one p  -->
                    </div>
                                 
                    <%}%>
                </div>
            </div>
        </section>
                 <div class="clearfix"></div>
                <!-- Trigger the modal with a button -->
           <%if( p.size() ==0 ){%>
                 <section class="login_as_user">
                    <div class="container ">
                     <div class="row">
                          <div class="col-md-6 col-md-offset-3 col-xs-6 col-xs-offset-0">  
                              <h2>not found match products/try again</h2>
                          </div></div></div></section>
           <%}%>


      <script src="jquery-3.2.0.min.js" type="text/javascript"></script>
        <script src="jsvalidation/getonePr.js" type="text/javascript"></script>
          <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
    <!-- Include all compiled plugins (below), or include individual files as needed -->
                    <script src="jsvalidation/bootstrap.min.js"></script>
    </body>
</html>
