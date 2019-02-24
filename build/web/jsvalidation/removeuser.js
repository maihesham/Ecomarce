$(document).ready(function (){
    $("button").click(function (){
       var t=$(this).text();
              var xmlhttp = new XMLHttpRequest();

       xmlhttp.open("GET", "deleteuser?n=" + t, true);
       xmlhttp.send();
        alert("send");
       xmlhttp.onreadystatechange = function () {
       if (xmlhttp.readyState === 4 && xmlhttp.status === 200){
           } };
        $(".us").hide();
        $(".order").hide();
        alert("done");
    });
});