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
public class customer {
    private  String name;
    private String phone;
    private String address;
    private  String country;
    private String pass;
    private String email;
    private  String rdtime;
    private int st;
    public customer(){
        this.address="";
        this.country="";
        this.email="";
        this.name="";
        this.pass="";
        this.phone="";
        st=0;
    }
    public void set_regtime(String n){this.rdtime=n;}
    public void set_statues(int n){this.st=n;}
    public void set_name(String n){this.name=n;}
    public void set_Phone(String n){this.phone=n;}
    public void set_address(String n){this.address=n;}
    public void set_country(String c){this.country=c;}
    public void set_pass(String p){this.pass=p;}
    public void set_emaul(String e){this.email=e;}
    public String get_name(){return this.name;}
    public String get_Phone(){return this.phone;}
    public String get_address(){return this.address;}
    public String get_country(){return this.country;}
    public String get_pass(){return this.pass;}
    public String get_emaul(){return this.email;} 
     public String get_rgtime(){return this.rdtime;} 
    public int get_staues(){return this.st;}  
}
