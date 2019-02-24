function sendajaxV(){
       var n=document.getElementById("name");
       var xmlhttp = new XMLHttpRequest();
       xmlhttp.open("GET", "validtanameadmin?n=" + n.value, true);
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
       xmlhttp.open("GET", "validtapassadmin?n=" + n.value, true);
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