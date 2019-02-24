<%-- 
    Document   : reg
    Created on : Jan 26, 2019, 10:47:10 AM
    Author     : egypt2
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Rigestration as customer</title>
         <link href="font-awesome-4.5.0/css/font-awesome.min.css" rel="stylesheet" type="text/css"/>
        <link href="css/bootstrap.css" rel="stylesheet" type="text/css"/>
        <link href="css/animate.css" rel="stylesheet" type="text/css"/>
        <link href="css/page2.css" rel="stylesheet" type="text/css"/>
         <link href="css/generalstyle.css" rel="stylesheet" type="text/css"/>
         <link href="css/reg.css" rel="stylesheet" type="text/css"/>
    </head>
    <body>
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
                       
                    </ul>
                </div><!-- /.navbar-collapse -->
              </div><!-- /.container-fluid -->
            </nav>
          
        </section> 
        <section class="login_as_user">
          <div class="container ">
              <div class="row">
                   <div class="col-md-6 col-md-offset-3 col-xs-6 col-xs-offset-0">  
                       <form action="saveuserasnotverify" method="Post">
                            <div class="form-group">
                              <label>Name</label>
                              <input type="text" name="name" onblur="sendajax()"   required class="form-control" id="name" placeholder="Enter Name">
                            </div>
                            <div class="form-group">
                              <label>Phone</label>
                              <input  name ="phone" required type="number"  class="form-control" id="phone" placeholder="Enter phone">
                            </div>
                           <div class="form-group">
                              <label >Password</label>
                              <input type="password" name="pass"  required pattern="(?=.*\d)(?=.*[a-z])(?=.*[A-Z]).{6,}"  class="form-control" id="pass" placeholder="Enter Password">
                            </div>
                            <div class="form-group">
                              <label>E-mail</label>
                              <input type="email"  name="email" required onblur="send2ajax()" class="form-control" id="email" placeholder="Enter E-mail">
                            </div>
                           
                             <div class="form-group">
                              <label>Address</label>
                              <input type="text" name="address" required class="form-control" id="addres" placeholder="Enter Address">
                            </div>
                           <div class="form-group">
                              <label>Country</label>
                              
                              <div class="custom-select"  >
                                  <select name="country" id="country" style="width:550px; height: 30px; border-radius: 5px; border:1px solid #ccc; " >
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
                              
                            </div> 
                            <button type="submit"  class="btn btn-default">Submit</button>
                  </form>
                   </div>
              </div>
                  
             </div>
        </section>
       <script src="jquery-3.2.0.min.js"></script>
       <script src="jsvalidation/validatecustomer.js" type="text/javascript"></script>
    </body>
</html>
