$(document).ready(function (){
   $("button").click(function (){
       //
       var Z=$(this).attr('id');
       if(Z==="forconferm"){
              var t=$(this).text();
                var x="";
                var j;
                for(i=0;i<t.length;i++){
                    if(t[i]==='/'){
                        j=i;
                    }
                }
               for(i=j+1;i<t.length;i++){
                   x+=t[i];
               } 
              var hi="#";hi+=x;
              $(hi).hide("slow");
               var xmlhttp = new XMLHttpRequest();
               xmlhttp.open("GET", "verifyorderbyuser?n=" + x, true);
               xmlhttp.send();
               xmlhttp.onreadystatechange = function () {
               if (xmlhttp.readyState === 4 && xmlhttp.status === 200){
                          var f=String(xmlhttp.responseText);

                   } };
       }
       
   });
});