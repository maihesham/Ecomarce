<%-- 
    Document   : toverift
    Created on : Jan 27, 2019, 11:03:18 AM
    Author     : egypt2
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Verift</title>
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
                       <form action="saveuserasverify" method="Post">
                            <div class="form-group">
                              <label>Name</label>
                              <input type="text" name="name" onblur="sendajaxV()"   required class="form-control" id="name" placeholder="Enter Name">
                            </div>
                           <div class="form-group">
                              <label >Password</label>
                              <input type="password" name="pass"   onblur="sendajaxVP()" required pattern="(?=.*\d)(?=.*[a-z])(?=.*[A-Z]).{6,}"  class="form-control" id="pass" placeholder="Enter Password">
                            </div>
                            <button type="submit"  class="btn btn-default">Verify</button>
                       </form>
                   </div></div></div>
        </section>
    <script src="jquery-3.2.0.min.js" type="text/javascript"></script>
    <script src="jsvalidation/validatecustomer.js" type="text/javascript"></script>
    </body>
</html>
