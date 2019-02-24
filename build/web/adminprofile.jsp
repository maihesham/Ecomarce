<%-- 
    Document   : adminprofile
    Created on : Jan 28, 2019, 2:26:22 AM
    Author     : egypt2
--%>

<%@page import="neededclasess.getorderall"%>
<%@page import="java.util.ArrayList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
          <title>profile</title>
            <link href="css/adminstyle.css" rel="stylesheet" type="text/css"/>
         <link href="css/bootstrap.css" rel="stylesheet" type="text/css"/>
         <link href="css/generalstyle.css" rel="stylesheet" type="text/css"/>
         <link href="css/userprofilestyle.css" rel="stylesheet" type="text/css"/>
         <link href="css/page2.css" rel="stylesheet" type="text/css"/>
           
    </head>
    <body>
        <%
             ArrayList<getorderall> verify=new ArrayList<getorderall>();
              verify=(ArrayList<getorderall> ) session.getAttribute("ver");
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
                        <li><a  href="#"><button type="button" class="btn btn-default"></button></a></li>
                        <li><a  href="#"><button type="button" class="btn btn-default"></button></a></li>
                        <li><a  href="#"><button type="button" class="btn btn-default"></button></a></li>
                    </ul>
                </div><!-- /.navbar-collapse -->
              </div><!-- /.container-fluid -->
            </nav>
          
        </section>
     <div class="clearfix"></div>
     <hr>
     
      <div class="clearfix"></div>   
    <section>
       <div class="container">
	<div class="row">
                        <div class="col-lg-4  minue"><!-- start minue -->
                                 <div class="span12">
                                          <div id="tab" class="btn-group" data-toggle="buttons-radio">
                                               <ul>   
                                                    <li><a href="#def" class="btn active" data-toggle="tab">defult</a></li>
                                                   <li><a href="#addpr" class="btn active" data-toggle="tab">Add Productt</a></li>
                                                    <li> <a href="#verfiy" class="btn" data-toggle="tab">Verify orders</a></li>
                                                    <li> <a href="#suser" class="btn" data-toggle="tab">Search user</a></li>
                                                    <li> <a href="#sprod" class="btn"  data-toggle="tab">Search Product</a></li>
                                                  
                                                </ul>     
                                            </div>
                                         </div>
        </div>
    <div class="tab-content"><!-- tabs  -->
          <div class="tab-pane active" id="def">
                    <div class="col-lg-6 tabscont"><!-- statrt home-->
                         <button type="check"  class="btn btn-default toclean">Clean Database</button>
                           </div><!-- statrt home-->
        </div>
              <div class="tab-pane " id="addpr">
                    <div class="col-lg-6 tabscont infouser"><!-- statrt home-->
                        
                        <form  class="fortoadd" action="savePr" method="Post"enctype="multipart/form-data">
                            <div class="form-group">
                              <label>Product-Name</label>
                              <input type="text" name="nameP" required class="form-control" id="nameP" placeholder="Enter Name">
                              
                            </div>
                           <div class="form-group">
                              <label>Product-Type</label>
                              <input type="text" name="type"    required class="form-control" id="type" placeholder="Enter Type">
                              
                            </div>
                            <div class="form-group">
                              <label>Avalible sizes (spces using / )</label>
                              <input type="text" name="sizes"    required class="form-control" id="sizes" placeholder="Enter avalible sizes">
                            </div> 
                            <div class="form-group">
                              <label>Product-count-in-stock</label>
                              <input type="number" name="ninstock"    required class="form-control" id="ninstock" placeholder="Enter number in stock">
                            </div> 
                            <div class="form-group">
                              <label>Product-price</label>
                              <input type="text" name="price"    required class="form-control" id="price" placeholder="Enter peice">
                            </div> 
                           <div class="form-group">
                              <label>Product-description</label>
                              <textarea rows="3" cols="55"  required class="form-control" name="description" id="description" ></textarea>
                           </div>
                            <div class="form-group">
                              <label>Product-photo1(will be main photo)</label>
                              <input type="file" name="p1"   required class="form-control" id="p1">
                            </div> 
                              <div class="form-group">
                              <label>Product-photo2</label>
                              <input type="file" name="p2"    required class="form-control" id="p2">
                            </div> 
                              <div class="form-group">
                              <label>Product-photo3</label>
                              <input type="file" name="p3"    class="form-control" id="p3">
                            </div> 
                            <button type="submit"  class="btn btn-default">Submit</button>
                         </form>
                   
                 </div><!-- statrt home-->
        </div>
        <div class="tab-pane" id="verfiy">
                  <div class="col-lg-6 tabscont"><!-- statrt about us-->
                       
                        <div class="row">
                          <div>
                              <%if(verify.size()>0){%>
                                        <%for(int i=0;i<verify.size();i++){%>
                                                <div>
                                                    <div  class="col-lg-6 oneblog" id=<%=verify.get(i).get_orderid()%>>
                                                   <!--srat one p  -->
                                                   <div class="thumbnail">

                                                       <img alt="img" src="images/person_1.jpg"/>
                                                     <div class="caption">
                                                         <h3>order /<%= verify.get(i).get_orderid() %></h3>
                                                         <h4>name of customer <%= verify.get(i).getname() %></h4>
                                                         <div class="end">
                                                             <span class="glyphicon glyphicon-time" aria-hidden="true"> addTime :- <% out.print(verify.get(i).getDate());  %> </span>
                                                             <br>
                                                             <span> TotalPrice <%= verify.get(i).get_Pr() %></span>
                                                             <br>
                                                             <button type="button" id="forsendorder" class="btn btn-info btn-lg">send order /<%= verify.get(i).get_orderid() %></button>
   
                                                         </div>
                                                     </div>
                                                   </div>
                                                     <!--endt one p  -->
                                               </div>
                                  </div>
                          <%}%>
                     <%}else{%>
                     <p>NO Orders Here </p>
                     <%}%>
                          </div>
                      </div>
                   </div>          
               </div> 
        <div class="tab-pane" id="suser">
            <div class="col-lg-6 tabscont"><!-- statrt about us-->
              
                <form action="getuserbyname" method="Post" >
                            <div class="form-group">
                              <label>Name</label>
                              <input type="text" name="name" onblur="sendajaxV()"   required class="form-control" id="name" placeholder="Enter Name">
                            </div>
                           
                            <button type="submit"  class="btn btn-default">submit</button>
                       </form>
        </div>
    </div>
         <div class="tab-pane" id="sprod">
            <div class="col-lg-6 tabscont"><!-- statrt about us-->
             
                 <form action="getproductbyid" method="Post" >
                            <div class="form-group">
                              <label>Name/Type</label>
                              <input type="text" name="tproduct"   required class="form-control" id="tproduct" placeholder="Enter Name">
                            </div>
                           
                            <button type="submit"  class="btn btn-default">submit</button>
                       </form>
                   
        </div>
    </div>
    </div><!-- tabs -->
       </div><!-- row -->
    </div><!-- contaner-->
    </section>
    
      <script src="jquery-3.2.0.min.js" type="text/javascript"></script>
      <script src="jsvalidation/fordimnconfermorder.js" type="text/javascript"></script>
      <script src="jsvalidation/savepr.js" type="text/javascript"></script>
      <script src="jsvalidation/validatecustomer.js" type="text/javascript"></script>
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
    <!-- Include all compiled plugins (below), or include individual files as needed -->
    <script src="jsvalidation/bootstrap.min.js"></script>

   
       
    </body>
</html>
