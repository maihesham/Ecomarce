<%-- 
    Document   : userprofile
    Created on : Jan 27, 2019, 11:48:52 AM
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
         <title>profile</title>
         <link href="css/product.css" rel="stylesheet" type="text/css"/>
           <link href="css/userprofilestyle.css" rel="stylesheet" type="text/css"/>
         <link href="css/bootstrap.css" rel="stylesheet" type="text/css"/>
         <link href="css/page2.css" rel="stylesheet" type="text/css"/>
         <link href="css/generalstyle.css" rel="stylesheet" type="text/css"/>
    </head>
    
    <body>
        <%
            customer c=(customer)session.getAttribute("user");
              ArrayList<getorderall> cur=new ArrayList<getorderall>();
              cur=(  ArrayList<getorderall>) session.getAttribute("currorders");
              ArrayList<getorderall> old=new ArrayList<getorderall>();
              old=(  ArrayList<getorderall>) session.getAttribute("oldorders");
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
                        <li><a  href="hometohome"><button type="button" class="btn btn-default">Home</button></a></li>
                        <li><a  href="car.jsp"><button type="button" class="btn btn-default">current_car</button></a></li>
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
                        <div class="col-lg-4  minue"><!-- start minue -->
                                 <div class="span12">
                                          <div id="tab" class="btn-group" data-toggle="buttons-radio">
                                               <ul>   
                                                   <li><a href="#info" class="btn active" data-toggle="tab">user Account</a></li>
                                                    <li> <a href="#Currentorder" class="btn" data-toggle="tab">Current order</a></li>
                                                    <li> <a href="#Oldorders" class="btn" data-toggle="tab">Old orders</a></li>
                                                    <li> <a href="#Search" class="btn"  data-toggle="tab">Search</a></li>
                                                  
                                                </ul>     
                                            </div>
                                         </div>
        </div>
    <div class="tab-content"><!-- tabs  -->
              <div class="tab-pane active" id="info">
                    <div class="col-lg-6 tabscont infouser"><!-- statrt home-->
                        <h3>Name :- <span class="userinfo"><%out.print(c.get_name());%></span> </h3> 
                        <h3>Email :- <span class="userinfo"><%out.print(c.get_emaul());%></span></h3>
                        <h3>Country :- <span class="userinfo Cinfo"><%out.print(c.get_country());%></span><button  class="btn btn-default" id="country" >update</button></h3>
                        <div class="countrychoose">
                             <div class="custom-select"  >
                                  <select name="country" id="country2" style="width:550px; height: 30px; border-radius: 5px; border:1px solid #ccc; " >
                                        <option value="Eygpt" selected>Eygpt</option>
                                        <option value="Afghanistan">Afghanistan</option>
                                        <option value="Åland Islands">Åland Islands</option>
                                        <option value="Albania">Albania</option>
                                        <option value="Algeria">Algeria</option>
                                        <option value="American Samoa">American Samoa</option>
                                        <option value="Andorra">Andorra</option>
                                        <option value="Angola">Angola</option>
                                        <option value="Anguilla">Anguilla</option>
                                        <option value="Antarctica">Antarctica</option>
                                        <option value="Antigua and Barbuda">Antigua and Barbuda</option>
                             </select>
                              </div>
                             <button  class="btn btn-default savecountry">save changes</button>
                        </div>
                        <h3>Phone :- <span class="userinfo Puser"><%out.print(c.get_Phone());%></span><button  class="btn btn-default" id="updatephone" >update</button></h3>
                        <div class="phoneupdate">
                           <div class="form-group">
                              <input  name ="phone" required type="number"  class="form-control" id="phone" placeholder="Enter phone">
                            </div>
                            <button  class="btn btn-default makeupdatephone">save changes</button>
                        </div>
                        <h3>Address :- <span class="userinfo Auser"><%out.print(c.get_address());%></span><button  class="btn btn-default" id="updateaddress">update</button></h3>
                          <div class="upaddress">
                           <div class="form-group">
                              <input  name ="address" required type="text"  class="form-control" id="address" placeholder="Enter address">
                            </div>
                            <button  class="btn btn-default saveadd">save changes</button>
                        </div>
                           </div><!-- statrt home-->
        </div>

        <div class="tab-pane" id="Currentorder">
                  <div class="col-lg-6 tabscont"><!-- statrt about us-->
                      <div class="row">
                          <div>
                              <%if(cur.size()>0){%>
                                        <%for(int i=0;i<cur.size();i++){%>
                                                <div>
                                                  <div class="col-lg-6 col-md-3 col-sm-2 oneblog" id=<%=cur.get(i).get_orderid()%> >
                                                   <!--srat one p  -->
                                                   <div class="thumbnail">

                                                       <img alt="img" src="images/person_1.jpg"/>
                                                     <div class="caption">
                                                         <h3>order /<%= cur.get(i).get_orderid() %></h3>
                                                         <div class="end">
                                                             <span class="glyphicon glyphicon-time" aria-hidden="true"> addTime :- <% out.print(cur.get(i).getDate());  %> </span>
                                                             <br>
                                                             <span> TotalPrice <%= cur.get(i).get_Pr() %></span>
                                                             <br>
                                                             <span> <%if(cur.get(i).get_ss()==0){out.print("ORder IS NOT Sended ");}else{out.print("ORder isSended ");}%></span>
                                                             <br>
                                                             <%if(cur.get(i).get_ss()==1){%>
                                                                  <button type="button" id="forconferm" class="btn btn-info btn-lg">conferm order /<%=cur.get(i).get_orderid()%></button>
                                                            <%}%>
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

        <div class="tab-pane" id="Oldorders">
            <div class="col-lg-6 tabscont"><!-- statrt about us-->
                <div class="row">
                          <div>
                              <%if( old.size()>0 ){%>
                                        <%for(int i=0;i<old.size();i++){%>
                                                <div>
                                                  <div class="col-lg-6 oneblog" >
                                                   <!--srat one p  -->
                                                   <div class="thumbnail">

                                                       <img alt="img" src="images/person_1.jpg"/>
                                                     <div class="caption">
                                                         <h3>order /<%= old.get(i).get_orderid() %></h3>
                                                         <div class="end">
                                                             <span class="glyphicon glyphicon-time" aria-hidden="true"> addTime :- <% out.print(old.get(i).getDate());  %> </span>
                                                             <br>
                                                             <span> TotalPrice <%= old.get(i).get_Pr() %></span>
                                                             <br>
                                                             <br>
                                                            
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
         <div class="tab-pane" id="Search">
            <div class="col-lg-6 tabscont"><!-- statrt about us-->
                    <form action="getPsearch" method="Post" >
                            <div class="form-group">
                              <label>Type/name</label>
                              <input type="text" name="cat"  required class="form-control" id="cat" placeholder="Enter type/name">
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
    <script src="jsvalidation/forconferm.js" type="text/javascript"></script>
     <script src="jsvalidation/updateuserinfo.js" type="text/javascript"></script>
         <script src="jsvalidation/bootstrap.min.js"></script>

    <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
    <!-- Include all compiled plugins (below), or include individual files as needed -->
     
     <script>
         
     </script>
    </body>
</html>
