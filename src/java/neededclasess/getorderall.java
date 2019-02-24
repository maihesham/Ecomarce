/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package neededclasess;

import java.util.ArrayList;

/**
 *
 * @author egypt2
 */
public class getorderall {
   private ArrayList<product> p=new ArrayList<product>();
    private int oderId;
   private double TotalPrice;
   private  int sC;
   private  int sS;
   private  String date;
   private String nameofuser;
   public void setname(String x){this.nameofuser=x;}
   public String  getname(){return  this.nameofuser;}
    public getorderall() {
         p=new ArrayList<product>();
         oderId=0;
          TotalPrice=0;

    }
    public String getDate(){return  this.date;}
    public void setDate(String d){this.date=d;}
    public int get_cs(){
       return this.sC;
    }
    public int get_ss(){
       return this.sS;
    }
      public void set_SC( int s){
        this.sC=s;
    }
       public void set_SS( int s){
        this.sS=s;
    }
    public void set_products( ArrayList<product> p){
        this.p=p;
    }
     public void set_orderid( int p){
        this.oderId=p;
    }
    public void set_Pr( double p){
        this.TotalPrice=p;
    }
    public ArrayList<product> get_products( ){
        return  this.p;
    }
    public int get_orderid(){
       return this.oderId;
    }
     public double get_Pr(){
       return this.TotalPrice;
    }
    
}
