/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package neededclasess;

import java.io.InputStream;
import java.util.ArrayList;

/**
 *
 * @author egypt2
 */
public class product {
    private String name;
    private String type;
    private int numberbuythis;
    private int id;
    private double price;
    private String discription;
    private int rate;
    private int numberinstock;
    private String sizes;
    private String addtime;
  private String p1;
     private String p2;
     private String p3;
   private  ArrayList<comment> com;
    public product(){
        this.addtime="";
        this.discription="";
        this.id=0;
        this.name="";
        this.numberbuythis=0;
        this.numberinstock=0;
        this.price=0.0;
        this.rate=0;
        this.type="";p1="";
        p2="";
        p3="";
        com=new ArrayList<comment>();
    }
    public void Set_com1(ArrayList<comment> t){this.com=t;}
     public ArrayList<comment> get_coom(){return this.com;}
     public void Set_p1(String t){this.p1=t;}
     public void Set_p2(String t){this.p2=t;}
     public void Set_p3(String t){this.p3=t;}
     public String get_p1(){return this.p1;}
      public String get_p2(){return this.p2;}
       public String get_p3s(){return this.p3;}
    public String get_sizes(){return this.sizes;}
    public String get_name(){return this.name;}
     public String get_type(){return this.type;}
      public String get_discription(){return this.discription;}
       public String get_addtime(){return this.addtime;}
       public double get_price(){return  this.price;}
       public int get_id(){return  this.id;}
       public int get_rate(){return  this.rate;}
       public int get_numberinstock(){return  this.numberinstock;}
       public int get_numberbuthis(){return this.numberbuythis;}
      public void set_name(String t){this.name=t;}
     public void Set_type(String t){this.type=t;}
     public void set_discription(String t){this.discription=t;}
     public void set_addtime(String t){this.addtime=t;}
     public void set_price(double t){this.price=t;}
     public void set_id(int t){this.id=t;}
     public void set_sizes(String t){this.sizes=t;}
       public void set_rate(int t){this.rate=t;}
       public void set_numberinstock(int t){this.numberinstock=t;}
       public void set_numberbuthis(int t){this.numberbuythis=t;}
    
       
}
