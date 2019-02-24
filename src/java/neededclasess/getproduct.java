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
public class getproduct {
    private String si;
    private  int nu;
    public product p;

    public getproduct() {
        this.si="";
        this.nu=0;
        p=new product();
    }
    public String get_size(){return  this.si;}
    public int get_cou(){return  this.nu;}
    public void set_size(String t){  this.si=t;}
    public void set_cou(int y){ this.nu=y;}
    
}
