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
public class order {
    private int orderId;
    private String nameCus;
    private String date;
   public order(){
          orderId=0;
          nameCus="";
          date="";
    }
    public void set_orderID(int n){this.orderId=n;}
    public int get_orderId(){return this.orderId;}
  
    public void set_nameC(String n){this.nameCus=n;}
    public String get_nameC(){return this.nameCus;}
     /////////////
    public void set_date(String n){this.date=n;}
    public String get_date(){return this.date;}
     ///////
  
    
}
