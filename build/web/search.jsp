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
         <link href="css/animate.css" rel="stylesheet" type="text/css"/>
         <link href="css/page2.css" rel="stylesheet" type="text/css"/>
         <style>
           
         </style>
    </head>
    <body>
         <%
           
             ArrayList<product> p=new ArrayList<product>();
             p=(ArrayList<product>)session.getAttribute("search");
          
               int O=3;
                   
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
                        <li><a  href="car.jsp"><button type="button" class="btn btn-default">current_car</button></a></li>
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
                            <img alt="img" src="<%= s %>" class="img-responsive"/>
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
                                  <% String XX="#"; XX+=p.get(i).get_id();%>
                                  <button type="button" class="btn btn-info btn-lg" data-toggle="modal" data-target=<%=XX%> >show</button>
                              </div>
                          </div>
                        </div>
                          <!--endt one p  -->
                    </div>
                                  <!-- Modal -->
                                  <div   class="modal fade" role="dialog" id=<%=p.get(i).get_id()%> >
                                  <div class="modal-dialog modal-lg">

                                    <!-- Modal content-->
                                    <div class="modal-content">
                                      <div class="modal-header">
                                        <button type="button" class="close" data-dismiss="modal">&times;</button>
                                         <h1 class="modal-title"><%= p.get(i).get_name() %> </h1>
                                         
                                      </div>
                                      <div class="modal-body">
                                          <h2>type:- <%= p.get(i).get_type() %></h2>
                                          <p>dicription:- <%= p.get(i).get_discription() %></p>
                                          <p> Avalabile in Stock :- <% out.print(p.get(i).get_numberinstock());  %></p>
                                          <p> Avalabile Sizes :- <% out.print(p.get(i).get_sizes());  %></p>
                                          <p> price :- <% out.print(p.get(i).get_price()); %></p>
                                          <p>number sell it <%= p.get(i).get_numberbuthis() %></p>
                                          <p>rate <%= p.get(i).get_rate() %></p>
                                          <div class="row vieww">
                                             <div class="col-lg-3  iminmo"> <img  class="img-responsive" alt="img" src="<%= s %>"/></div>
                                            <div class="col-lg-3 iminmo"> <img  class="img-responsive" alt="img" src="<%= s2 %>" /></div>
                                            <div class="col-lg-3  iminmo"> <img  class="img-responsive" alt="img" src="<%= s3 %>" /></div>
                                          </div>
                                          <div class="clearfix"></div>
                                           <div>
                                              <h3>Comments</h3>
                                              <%for(int j=0;j<p.get(i).get_coom().size();j++){ %>
                                              <div>
                                                  <span class="glyphicon glyphicon-time" aria-hidden="true">  <% out.print(p.get(i).get_coom().get(j).getda());%> </span>
                                                   <span > / <% out.print(p.get(i).get_coom().get(j).getuser());%> </span>
                                                    <span > /" <% out.print(p.get(i).get_coom().get(j).getcomm());%> " </span>
                                              </div>
                                                  
                                              <%}%>       
                                          </div>
                                      </div>
                                          
                                      <div class="modal-footer">
                                          <div class="row">
                                              <div class="col-lg-3">
                                                  <span id=<%=p.get(i).get_rate()%> ></span>
                                                  <span id=<%=p.get(i).get_id()%> ></span>
                                                  <input type="text" name="comm"   required class="form-control" id="comm" placeholder="Enter enter comment">
                                                   <input type="number" name="rate"   min="1" max="5"  step="5" required class="form-control" id="rate" placeholder="Enter rate">
                                                   <button type="button" class="btn btn-default torate" >add</button> 
                                              </div>
                                                   
                                          </div>
                                           <div class="clearfix"></div>
                                                 <input type="text" name="size"   required class="form-control" id="size" placeholder="Enter size">
                                                 <input type="number" name="num"   min="1" max=<%=p.get(i).get_numberinstock() %> required class="form-control" id="num" placeholder="Enter number of pice">
                                                 <button type="button" class="btn btn-default aaddtocar" >add_to_car,<%=p.get(i).get_id()%></button> 
                                           
                                        <button type="button" class="btn btn-default" data-dismiss="modal">Close</button>
                                      </div>
                                    </div>

                                  </div>
                                </div>
                                  
                    </div>
                   
                    <%}%>
                </div>
            </div>
        </section>
                 <div class="clearfix"></div>
                <!-- Trigger the modal with a button -->



        <script src="jquery-3.2.0.min.js" type="text/javascript"></script>
        <script src="jsvalidation/getonePr.js" type="text/javascript"></script>
          <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
    <!-- Include all compiled plugins (below), or include individual files as needed -->
                    <script src="jsvalidation/bootstrap.min.js"></script>
    </body>
</html>
