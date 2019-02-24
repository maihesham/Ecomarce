 $(document).ready(function (){
                $("#country").click(function(){
                 //hide button country 
                 // sow class countrychoose
                 $(this).hide("slow");
                 $(".countrychoose").show("slow");
                });
                $(".savecountry").click(function (){
                    //hiden class countrychoose
                    //show button country 
                    //send data using ajax 
                    // update Cinfo
                    $(".countrychoose").hide("slow");
                    $("#country").show("slow");
                    var newcountry=$("#country2").val();
                    var xmlhttp = new XMLHttpRequest();
                    xmlhttp.open("GET", "savenewcountry?newcountry=" + newcountry, true);
                    xmlhttp.send();
                    xmlhttp.onreadystatechange = function () {
                        if (xmlhttp.readyState === 4 && xmlhttp.status === 200){
                                   $( ".Cinfo" ).text( newcountry ); 
                    } };
                        
                });
                //////////////////////////////////////////////////////////////////////////////////

                  $("#updatephone").click(function(){
                        //hide country 
                        // sow class phoneupdate
                        $("#updatephone").hide("slow");
                        $(".phoneupdate").show("slow");
                });
                $(".makeupdatephone").click(function (){
                        $("#updatephone").show("slow");
                        $(".phoneupdate").hide("slow");
                          var p=document.getElementById("phone").value;
                            var xmlhttp = new XMLHttpRequest();
                            xmlhttp.open("GET", "savenewphone?p=" + p, true);
                            xmlhttp.send();
                            xmlhttp.onreadystatechange = function () {
                                if (xmlhttp.readyState === 4 && xmlhttp.status === 200){
                                    
                                           $( ".Puser" ).text(p); 
                            } };
                        
                });
                $("#updateaddress").click(function (){
                     $("#updateaddress").hide("slow");
                     $(".upaddress").show("slow");
                });
                 $(".saveadd").click(function (){
                     $("#updateaddress").show("slow");
                     $(".upaddress").hide("slow");
                       var p=document.getElementById("address").value;
                            var xmlhttp = new XMLHttpRequest();
                            xmlhttp.open("GET", "savenewAddress?p=" + p, true);
                            xmlhttp.send();
                            xmlhttp.onreadystatechange = function () {
                                if (xmlhttp.readyState === 4 && xmlhttp.status === 200){
                                    
                                           $( ".Auser" ).text(p); 
                            } };
                });
});