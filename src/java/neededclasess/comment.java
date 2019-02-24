/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package neededclasess;

/**
 *
 * @author egypt2
 */
public class comment {
    
    private  String comm;
   private String user;
    private String da;
    public comment(){
        this.comm="";
        this.user="";
    }
    public  comment(String commnett,String userr,String d){
        this.comm=commnett;
        this.user=userr;
        this.da=d;
    }

    public String getcomm(){return this.comm;}
     public String getuser(){return this.user;}
    
     public String getda(){return this.da;}
}
