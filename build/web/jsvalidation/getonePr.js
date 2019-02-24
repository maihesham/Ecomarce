$(document).ready(function (){  
  $(".aaddtocar").click(function (){
       
       var r=$(this).prev("input").val();
       var t=$(this).prev("input").prev("input").val();
       var l=$(this).text();
     
       if(r==="" || t===""){
            alert("enter values");
       }else{
            //add to car
            
            var xmlhttp = new XMLHttpRequest();
            xmlhttp.open("GET", "addtocar?siz="+t+"&num="+r+"&id="+l, true);
                    xmlhttp.send();
                    xmlhttp.onreadystatechange = function () {
                        if (xmlhttp.readyState === 4 && xmlhttp.status === 200){
                                  alert(XMLHttpRequest.responseText);
                    } };
       }
   });
 $(".torate").click(function (){
    var y=$(this).prev().val();//rate
    var comment=$(this).prev().prev().val();//comment
    var id=$(this).prev().prev().prev().attr('id');//id
    var curr=$(this).prev().prev().prev().prev().attr('id');//courrent rate
   
      $(this).prev().hide("slow");
    $(this).prev().prev().hide("slow");
    $(this).hide("slow");
     var xmlhttp = new XMLHttpRequest();
     xmlhttp.open("GET", "saverate?rate="+y+"&id="+id+"&c="+curr+"&com="+comment, true);
                    xmlhttp.send();
                    xmlhttp.onreadystatechange = function () {
                        if (xmlhttp.readyState === 4 && xmlhttp.status === 200){
                          
                    } };    
   });
   $(".re").click(function (){
        var t=$(this).text();
        var xmlhttp = new XMLHttpRequest();
       xmlhttp.open("GET", "deleteP?n=" + t, true);
       xmlhttp.send();
        alert("send");
       xmlhttp.onreadystatechange = function () {
       if (xmlhttp.readyState === 4 && xmlhttp.status === 200){
                alert(xmlhttp.responseText);
           } };
       $(this).hide();
     
   });    
   
});
