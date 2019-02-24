
function sendajax(){
       var n=document.getElementById("name");
       var xmlhttp = new XMLHttpRequest();
       xmlhttp.open("GET", "validtaname?n=" + n.value, true);
       xmlhttp.send();
       var x="1";
       xmlhttp.onreadystatechange = function () {
       if (xmlhttp.readyState === 4 && xmlhttp.status === 200){
                  var f=String(xmlhttp.responseText);
                   if(f==="n"){
                        alert("invalid name is taken , change it now ");
                        document.getElementById("name").value = "";
                        x="0";        
                        return false;
                   }
                if(x==="0"){return false;}                                                
                                                
                                        
           } };
      }
function send2ajax(){
 var n=document.getElementById("email");
       var xmlhttp = new XMLHttpRequest();
       xmlhttp.open("GET", "validtaemail?n=" + n.value, true);
       xmlhttp.send();
       var x="1";
       xmlhttp.onreadystatechange = function () {
       if (xmlhttp.readyState === 4 && xmlhttp.status === 200){
                  var f=String(xmlhttp.responseText);
                   if(f==="n"){
                        alert("invalid email is taken , change it now ");
                        document.getElementById("email").value = "";
                        x="0";        
                        return false;
                   }
                if(x==="0"){return false;}                                                
                                                
                                        
           } };
      }
function sendajaxV(){
       var n=document.getElementById("name");
       var xmlhttp = new XMLHttpRequest();
       xmlhttp.open("GET", "validtaname?n=" + n.value, true);
       xmlhttp.send();
       var x="1";
       xmlhttp.onreadystatechange = function () {
       if (xmlhttp.readyState === 4 && xmlhttp.status === 200){
                  var f=String(xmlhttp.responseText);
                   if(f==="0"){
                        alert("invalid name  , change it now ");
                        document.getElementById("name").value = "";
                        x="0";        
                        return false;
                   }
                if(x==="0"){return false;}                                                                            
           } };
      } 
 function sendajaxVP(){
       var n=document.getElementById("pass");
       var xmlhttp = new XMLHttpRequest();
       xmlhttp.open("GET", "validtapass?n=" + n.value, true);
       xmlhttp.send();
       var x="1";
       xmlhttp.onreadystatechange = function () {
       if (xmlhttp.readyState === 4 && xmlhttp.status === 200){
                  var f=String(xmlhttp.responseText);
                   if(f==="0"){
                        alert("invalid pass  , change it now ");
                        document.getElementById("pass").value = "";
                        x="0";        
                        return false;
                   }
                if(x==="0"){return false;}                                                
                                                
                                        
           } };
      }  