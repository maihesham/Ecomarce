<%-- 
    Document   : car
    Created on : Jan 29, 2019, 10:11:11 AM
    Author     : egypt2
--%>

<%@page import="neededclasess.getproduct"%>
<%@page import="neededclasess.product"%>
<%@page import="java.util.ArrayList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>car</title>
        <link href="css/generalstyle.css" rel="stylesheet" type="text/css"/>
         <link href="css/bootstrap.css" rel="stylesheet" type="text/css"/>
         <link href="css/animate.css" rel="stylesheet" type="text/css"/>
         <link href="css/page2.css" rel="stylesheet" type="text/css"/>
    </head>
    <body>
        <%
           
             ArrayList<getproduct> p=new ArrayList<getproduct>();
             p=(ArrayList<getproduct>)session.getAttribute("car");
               
                   
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
                        <li><a  href="userprofile.jsp"><button type="button" class="btn btn-default">profile</button></a></li>
                        <li><a  href="hometohome"><button type="button" class="btn btn-default">home</button></a></li>
                        <%if(p.size()>0){%>
                        <li><a  href="conermorder"><button type="button" class="btn btn-default">confirm_order</button></a></li>
                        <%}%>
                    </ul>
                </div><!-- /.navbar-collapse -->
              </div><!-- /.container-fluid -->
            </nav>  
        </section>
        <div class="clearfix"></div>
        <% if(p.size()<=0){%>
          <section class="login_as_user">
             <div class="container ">
              <div class="row">
                   <div class="col-md-6 col-md-offset-3 col-xs-6 col-xs-offset-0">  
                       <h2>car is empty go to home to make order</h2>
                   </div></div></div></section>
        <%}%>
          <section class="Blog">
            <div class="container">
                <div class="row each-blog">
                    <%for(int i=0;i<p.size();i++){%>
                    <div>
                       <div class="col-lg-4 oneblog">
                        <!--srat one p  -->
                        <div class="thumbnail">
                            <%
                              
                                String x=p.get(i).p.get_p1();
                                String s="images/"+x;  
                               String n="http://localhost:8080/ecomerce/images/full_1.jpg";
                               
                            %>
                            <img alt="img" src="<%= s %>" class="img-responsive"/>
                          <div class="caption">
                              <h3>name:-<%out.print(p.get(i).p.get_name());%></h3>
                              <div class="end">
                                  <span class="glyphicon glyphicon-time" aria-hidden="true"> addTime :- <% out.print(p.get(i).p.get_addtime());  %> </span>
                                  <br>
                                   <span> order number:- <% out.print(p.get(i).get_cou());  %></span>
                                   <br>
                                    <span> size:- <% out.print(p.get(i).get_size());  %></span>
                                  <span> Avalabile in Stock :- <% out.print(p.get(i).p.get_numberinstock());  %></span>
                                  <br>
                                  <span> Avalabile Sizes :- <% out.print(p.get(i).p.get_sizes());  %></span>
                                  <br>
                                  <span> price :- <% out.print(p.get(i).p.get_price()); %></span>
                                  <br>
                                  <span> id:- <%out.print(p.get(i).p.get_id());%></span>
                                 
                              </div>
                          </div>
                        </div>
                          <!--endt one p  -->
                    </div>
                    </div><%}%></div></div></section>
                     <script src="jquery-3.2.0.min.js" type="text/javascript"></script>
        <script src="jsvalidation/getonePr.js" type="text/javascript"></script>
          <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
    <!-- Include all compiled plugins (below), or include individual files as needed -->
                    <script src="jsvalidation/bootstrap.min.js"></script>
    </body>
</html>
