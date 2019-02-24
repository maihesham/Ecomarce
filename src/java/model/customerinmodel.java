/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.Period;
import java.util.ArrayList;
import java.util.Date;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import static jdk.nashorn.api.scripting.ScriptUtils.convert;
import neededclasess.customer;
import neededclasess.getorderall;
import neededclasess.product;

/**
 *
 * @author egypt2
 */
public class customerinmodel {
     String url = "jdbc:mysql://localhost:3306/ecomerce";
     String user = "root";
     String password = "";
     public Connection Con =null;
       SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");  
        Date date = new Date(); 
        java.sql.Date sDate = convertUtilToSql(date);
     private java.sql.Date convertUtilToSql(java.util.Date uDate) {
        java.sql.Date sDate = new java.sql.Date(uDate.getTime());
        return sDate;

    }    
    public void add_customer_notverify(customer c) throws ClassNotFoundException{
         Class.forName("org.gjt.mm.mysql.Driver");
        
               try {
                   Con=(Connection) DriverManager.getConnection(url, user, password);
                    String q="insert into  customer(username,pass,phone,address,country,stute,email,regtime)" + " values (?,?,?,?,?,?,?,?)";
                   PreparedStatement statement = (PreparedStatement) Con.prepareStatement(q);
                   statement.setString(1, c.get_name());
                    statement.setString(2, c.get_pass());
                     statement.setString(3, c.get_Phone());
                      statement.setString(4, c.get_address());
                       statement.setString(5,c.get_country());
                        statement.setInt(6,1);//not verify
                        statement.setString(7, c.get_emaul());
                         statement.setDate(8, sDate);
                         statement.execute();
                    Con.close();;    
               } catch (SQLException ex) {
             Logger.getLogger(customerinmodel.class.getName()).log(Level.SEVERE, null, ex);
         }
    }
    public boolean checkusernametogeg(String n) throws ClassNotFoundException{
         Class.forName("org.gjt.mm.mysql.Driver");
        
               try {
                   Con=(Connection) DriverManager.getConnection(url, user, password);
                    System.out.print("444444444444 enter");
                   String query = "SELECT *  FROM customer ";
                   Statement st = (Statement) Con.createStatement();
                   System.out.print("444444444444 enter"+n);
                   ResultSet rs =st.executeQuery(query);
                  while(rs.next()){
                      String V=rs.getString("username");
                      if(V.equals(n))
                               return false;
                  }
               } catch (SQLException ex) {
             Logger.getLogger(customerinmodel.class.getName()).log(Level.SEVERE, null, ex);
         }
               return true;
    }
    public boolean checkuseremailtogeg(String n) throws ClassNotFoundException{
          Class.forName("org.gjt.mm.mysql.Driver");
        
               try {
                   Con=(Connection) DriverManager.getConnection(url, user, password);
                    System.out.print("444444444444 enter");
                   String query = "SELECT *  FROM customer ";
                   Statement st = (Statement) Con.createStatement();
                   System.out.print("444444444444 enter"+n);
                   ResultSet rs =st.executeQuery(query);
                  while(rs.next()){
                      String V=rs.getString("email");
                      if(V.equals(n))
                               return false;
                  }
        
    }    catch (SQLException ex) {
             Logger.getLogger(customerinmodel.class.getName()).log(Level.SEVERE, null, ex);
         }
               return  true;
    }

    public boolean checkuserpasstogeg(String n) throws ClassNotFoundException {
          Class.forName("org.gjt.mm.mysql.Driver");
        
               try {
                   Con=(Connection) DriverManager.getConnection(url, user, password);
                    System.out.print("444444444444 enter");
                   String query = "SELECT *  FROM customer ";
                   Statement st = (Statement) Con.createStatement();
                   ResultSet rs =st.executeQuery(query);
                  while(rs.next()){
                      String V=rs.getString("pass");
                      if(V.equals(n))
                               return false;
                  }
        
    }    catch (SQLException ex) {
             Logger.getLogger(customerinmodel.class.getName()).log(Level.SEVERE, null, ex);
         }
               return  true;
    }

    public void changeuserstaues(String name) throws ClassNotFoundException {
          Class.forName("org.gjt.mm.mysql.Driver");
         String nn="";
               try {
                   Con=(Connection) DriverManager.getConnection(url, user, password);
                    String query = "update customer set stute = ? where username = ?";
                    PreparedStatement preparedStmt = Con.prepareStatement(query);
                    preparedStmt.setInt(1, 2);//verify
                    preparedStmt.setString(2, name);
                    preparedStmt.executeUpdate();
                    preparedStmt.close();
               } catch (SQLException ex) {
             Logger.getLogger(customerinmodel.class.getName()).log(Level.SEVERE, null, ex);
         }
    }

    public customer createuser(String name) throws ClassNotFoundException {
         Class.forName("org.gjt.mm.mysql.Driver");
         customer c=new customer();
        try{
            Con=(Connection) DriverManager.getConnection(url, user, password);
            String query ="SELECT * FROM customer where username= '"+name+"'";
            Statement st = (Statement) Con.createStatement();
            ResultSet rs = st.executeQuery(query);
            while(rs.next()){
                c.set_Phone(rs.getString("phone"));
                c.set_address(rs.getString("address"));
                c.set_country(rs.getString("country"));
                c.set_emaul(rs.getString("email"));
                c.set_name(name);
                c.set_statues(rs.getInt("stute"));
                c.set_regtime(rs.getString("regtime"));
                return c;
                
            }
        } catch (SQLException ex) {
             Logger.getLogger(customerinmodel.class.getName()).log(Level.SEVERE, null, ex);
         }
        return c;
    }
    public void updatecountry(String x,String n) throws ClassNotFoundException {
         Class.forName("org.gjt.mm.mysql.Driver");
               try {
                   Con=(Connection) DriverManager.getConnection(url, user, password);
                    String query = "update customer set country = ? where username = ?";
                    PreparedStatement preparedStmt = Con.prepareStatement(query);
                    preparedStmt.setString(1, x);//verify
                    preparedStmt.setString(2, n);
                    preparedStmt.executeUpdate();
                    preparedStmt.close();
               } catch (SQLException ex) {
             Logger.getLogger(customerinmodel.class.getName()).log(Level.SEVERE, null, ex);
         }
    }

    public void updatephone(String x, String name) throws ClassNotFoundException {
        Class.forName("org.gjt.mm.mysql.Driver");
               try {
                   Con=(Connection) DriverManager.getConnection(url, user, password);
                    String query = "update customer set phone = ? where username = ?";
                    PreparedStatement preparedStmt = Con.prepareStatement(query);
                    preparedStmt.setString(1, x);//verify
                    preparedStmt.setString(2, name);
                    preparedStmt.executeUpdate();
                    preparedStmt.close();
               } catch (SQLException ex) {
             Logger.getLogger(customerinmodel.class.getName()).log(Level.SEVERE, null, ex);
         }
    }

    public void updateaddress(String x, String name) throws ClassNotFoundException {
         Class.forName("org.gjt.mm.mysql.Driver");
               try {
                   Con=(Connection) DriverManager.getConnection(url, user, password);
                    String query = "update customer set address = ? where username = ?";
                    PreparedStatement preparedStmt = Con.prepareStatement(query);
                    preparedStmt.setString(1, x);//verify
                    preparedStmt.setString(2, name);
                    preparedStmt.executeUpdate();
                    preparedStmt.close();
               } catch (SQLException ex) {
             Logger.getLogger(customerinmodel.class.getName()).log(Level.SEVERE, null, ex);
         }
    }

    public void ddtolearn(String ca, String name) throws ClassNotFoundException {
       Class.forName("org.gjt.mm.mysql.Driver");
               try {
                   Con=(Connection) DriverManager.getConnection(url, user, password);
                    String query = "insert into  learn(keysar,usern)" + " values (?,?)";
                    PreparedStatement preparedStmt = Con.prepareStatement(query);
                    preparedStmt.setString(1, ca);//verify
                     preparedStmt.setString(2, name);
                    preparedStmt.executeUpdate();
                    preparedStmt.close();
                    Con.close();;
               } catch (SQLException ex) {
             Logger.getLogger(customerinmodel.class.getName()).log(Level.SEVERE, null, ex);
         }
    }

     public ArrayList<String> getlearn(String name) throws ClassNotFoundException {
         ArrayList<String> l=new ArrayList<String>();
          Class.forName("org.gjt.mm.mysql.Driver");
               try {
                   Con=(Connection) DriverManager.getConnection(url, user, password);
                   String selectSQL = "SELECT * FROM learn WHERE usern=?";
                    PreparedStatement pstmt =Con.prepareStatement(selectSQL);
                    pstmt.setString(1,name);
                    ResultSet rs = pstmt.executeQuery();
                    while (rs.next()) {
                       l.add(rs.getString("keysar"));
                       
                   }
                    Con.close();;
                    return l;
               } catch (SQLException ex) {
             Logger.getLogger(customerinmodel.class.getName()).log(Level.SEVERE, null, ex);
         }
               return l;
    }

    public void deleteuser(String ne) throws ClassNotFoundException {
       ArrayList<Integer> ordersid=new ArrayList<Integer>();
       orderinsystem X=new orderinsystem();
        ArrayList<getorderall> p=new ArrayList<getorderall>();
         ArrayList<getorderall> p2=new ArrayList<getorderall>();
       p=X.getcurrentorder(ne);
       p2=X.getoldorders(ne);
       for(int i=0;i<p.size();i++){
           ordersid.add(p.get(i).get_orderid());
       }
       for(int i=0;i<p2.size();i++){
           ordersid.add(p2.get(i).get_orderid());
       }
       X.deletOrdersbyID(ordersid);
       X.deleteordersbyuser(ne);
       deleteCommnt(ne);
       deletelearn(ne);
      deleteuserbyn(ne);
       
    }

    private void deletelearn(String ne) throws ClassNotFoundException {
         Class.forName("org.gjt.mm.mysql.Driver");
        
               try {
                   Con=(Connection) DriverManager.getConnection(url, user, password);
                   
                       //delete from orders
                          String query = "delete from comment where username = ?";
                            PreparedStatement preparedStmt = Con.prepareStatement(query);
                           preparedStmt.setString(1, ne);
                           preparedStmt.execute();

                           Con.close(); 
                  
               } catch (SQLException ex) { 
             Logger.getLogger(customerinmodel.class.getName()).log(Level.SEVERE, null, ex);
         } 
    }

    private void deleteCommnt(String ne) throws ClassNotFoundException {
          Class.forName("org.gjt.mm.mysql.Driver");
        
               try {
                   Con=(Connection) DriverManager.getConnection(url, user, password);
                   
                       //delete from orders
                          String query = "delete from learn where usern = ?";
                            PreparedStatement preparedStmt = Con.prepareStatement(query);
                           preparedStmt.setString(1, ne);
                           preparedStmt.execute();

                           Con.close(); 
                  
               } catch (SQLException ex) { 
             Logger.getLogger(customerinmodel.class.getName()).log(Level.SEVERE, null, ex);
         } 
    }

    private void deleteuserbyn(String ne) throws ClassNotFoundException {
         Class.forName("org.gjt.mm.mysql.Driver");
        
               try {
                   Con=(Connection) DriverManager.getConnection(url, user, password);
                   String query = "delete from customer where username = ?";
                            PreparedStatement preparedStmt = Con.prepareStatement(query);
                           preparedStmt.setString(1, ne);
                           preparedStmt.execute();

                           Con.close(); 
                  
               } catch (SQLException ex) { 
             Logger.getLogger(customerinmodel.class.getName()).log(Level.SEVERE, null, ex);
         } 
    }

    public void deleteuseruptofivedays() throws ClassNotFoundException {
        ArrayList<customer> l=new ArrayList<>();
        l=getuserwithfiveday();
        for(int i=0;i<l.size();i++){
            deleteuser(l.get(i).get_name());
        }
    }

    private ArrayList<customer> getuserwithfiveday() throws ClassNotFoundException {
         Class.forName("org.gjt.mm.mysql.Driver");
          ArrayList<customer> l=new ArrayList<>();
         try{
             Con=(Connection) DriverManager.getConnection(url, user, password);
                      String selectSQL = "SELECT * FROM   customer WHERE  stute=? ";
                      PreparedStatement pstmt = Con.prepareStatement(selectSQL);
                      pstmt.setInt(1, 1);
                      ResultSet rs = pstmt.executeQuery();
                      while(rs.next()){
                          Date d=rs.getDate("regtime");
                         int diffInDays = (int)( (sDate.getTime() - d.getTime()) / (1000 * 60 * 60 * 24) );
                          if(diffInDays>=5){
                              customer c=new customer();
                              c.set_name(rs.getString("username"));
                              c.set_regtime(rs.getString("regtime"));
                              l.add(c);
                          }
                          
                      }
                      Con.close();
                      return  l;
         } catch (SQLException ex) {
             Logger.getLogger(customerinmodel.class.getName()).log(Level.SEVERE, null, ex);
         }
         return l;
    }

   
    }

 
