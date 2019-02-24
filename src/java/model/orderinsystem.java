/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import neededclasess.getorderall;
import neededclasess.getproduct;

public class orderinsystem {
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
    public void addorder(ArrayList<getproduct> cc, String name) throws ClassNotFoundException {
               Class.forName("org.gjt.mm.mysql.Driver");
               double pr=gettotalprice(cc);
               int id=createoder(name,pr);
             System.out.print(id+"thisid");
               try{
                    Con=(Connection) DriverManager.getConnection(url, user, password);
                    for(int i=0;i<cc.size();i++){
                         String q="insert into  orders(orderid,pid,csize,number)" + " values (?,?,?,?)";
                         PreparedStatement statement = (PreparedStatement) Con.prepareStatement(q);
                         statement.setInt(1, id);
                         statement.setInt(2, cc.get(i).p.get_id());
                         statement.setString(3, cc.get(i).get_size());
                         statement.setInt(4, cc.get(i).get_cou());
                         statement.execute();
                    }
                     
                    Con.close();;
                    
                    System.out.println("end process");
               } catch (SQLException ex) {
         Logger.getLogger(orderinsystem.class.getName()).log(Level.SEVERE, null, ex);
     }
    }

   public double gettotalprice(ArrayList<getproduct> cc) {
       double d=0;
       for(int i=0;i<cc.size();i++){
           d+=(cc.get(i).get_cou()*cc.get(i).p.get_price());
       }
       return d;
    }

    public int createoder(String name, double pr) throws ClassNotFoundException {
         Class.forName("org.gjt.mm.mysql.Driver");
         int id=0;
       
               try{
                      Con=(Connection) DriverManager.getConnection(url, user, password);
                      String q="insert into  orderone(namec,priceTotal,dateorder)" + " values (?,?,?)";
                      PreparedStatement statement = (PreparedStatement) Con.prepareStatement(q);
                      statement.setString(1, name);
                      statement.setDouble(2, pr);
                      statement.setDate(3, sDate);
                      statement.execute();
                      Con.close();; 
                      
               } catch (SQLException ex) {
         Logger.getLogger(orderinsystem.class.getName()).log(Level.SEVERE, null, ex);
     }
               return getid(name);
    }

    public int getid(String name) throws ClassNotFoundException {
        int id=0;
        Class.forName("org.gjt.mm.mysql.Driver");
       
               try{
                      Con=(Connection) DriverManager.getConnection(url, user, password);
                      String selectSQL = "SELECT * FROM   orderone WHERE  orderid=(SELECT MAX(orderid) FROM orderone) AND namec=?";
                      PreparedStatement pstmt = Con.prepareStatement(selectSQL);
                      pstmt.setString(1, name);
                      ResultSet rs = pstmt.executeQuery();
                      while(rs.next()){
                          System.out.print("ids "+rs.getString("orderid"));
                          if(id<rs.getInt("orderid")){
                              id=rs.getInt("orderid");
                          }
                      }
                      Con.close();; 
                      
               } catch (SQLException ex) {
         Logger.getLogger(orderinsystem.class.getName()).log(Level.SEVERE, null, ex);
     }
               return id;
    }

    public ArrayList<getorderall> getcurrentorder(String name) throws ClassNotFoundException {
         Class.forName("org.gjt.mm.mysql.Driver");
       ArrayList<getorderall> p=new ArrayList<getorderall>();
               try{
                   System.out.print("current namr from curret order "+name);
                      Con=(Connection) DriverManager.getConnection(url, user, password);
                      String selectSQL = "SELECT * FROM   orderone WHERE   namec=? AND statueC=? ";
                      PreparedStatement pstmt = Con.prepareStatement(selectSQL);
                      pstmt.setString(1, name);
                      pstmt.setInt(2, 0);
                      ResultSet rs = pstmt.executeQuery();
                      while(rs.next()){
                          getorderall c=new getorderall();
                          c.set_Pr(rs.getDouble("priceTotal"));
                          c.set_orderid(rs.getInt("orderid"));
                          c.set_SC(rs.getInt("statueC"));
                          c.set_SS(rs.getInt("statueS"));
                          //dateorder
                          c.setDate(rs.getString("dateorder"));
                          p.add(c);
                      }
                      Con.close();; 
                      return p;
               } catch (SQLException ex) {
         Logger.getLogger(orderinsystem.class.getName()).log(Level.SEVERE, null, ex);
     }
      return  p;
    }

    public ArrayList<getorderall> getnotverifyorders() throws ClassNotFoundException {
          Class.forName("org.gjt.mm.mysql.Driver");
       ArrayList<getorderall> p=new ArrayList<getorderall>();
               try{
                      Con=(Connection) DriverManager.getConnection(url, user, password);
                      String selectSQL = "SELECT * FROM   orderone WHERE statueS=?";
                      PreparedStatement pstmt = Con.prepareStatement(selectSQL);
                      pstmt.setInt(1, 0);
                      ResultSet rs = pstmt.executeQuery();
                      while(rs.next()){
                          getorderall c=new getorderall();
                          c.set_Pr(rs.getDouble("priceTotal"));
                          c.set_orderid(rs.getInt("orderid"));
                          c.set_SC(rs.getInt("statueC"));
                          c.set_SS(rs.getInt("statueS"));
                          //dateorder
                          c.setDate(rs.getString("dateorder"));
                          c.setname(rs.getString("namec"));
                          p.add(c);
                      }
                      Con.close();; 
                      return p;
               } catch (SQLException ex) {
         Logger.getLogger(orderinsystem.class.getName()).log(Level.SEVERE, null, ex);
     }
      return  p;
        
    }

    public void veriftorder(int id) throws ClassNotFoundException {
          Class.forName("org.gjt.mm.mysql.Driver");
        
               try {
                   Con=(Connection) DriverManager.getConnection(url, user, password);
                    String query = "update orderone set statueS = ? where orderid = ?";
                    PreparedStatement preparedStmt = Con.prepareStatement(query);
                    preparedStmt.setInt(1, 1);//verify
                    preparedStmt.setInt(2, id);
                    preparedStmt.executeUpdate();
                    preparedStmt.close();
                    Con.close();
               } catch (SQLException ex) { 
         Logger.getLogger(orderinsystem.class.getName()).log(Level.SEVERE, null, ex);
     } 
    }

    public void veriftorderbyuser(int id) throws ClassNotFoundException {
         Class.forName("org.gjt.mm.mysql.Driver");
        
               try {
                   Con=(Connection) DriverManager.getConnection(url, user, password);
                    String query = "update orderone set statueC = ? where orderid = ?";
                    PreparedStatement preparedStmt = Con.prepareStatement(query);
                    preparedStmt.setInt(1, 1);
                    preparedStmt.setInt(2, id);
                    preparedStmt.executeUpdate();
                    preparedStmt.close();
                    Con.close();
               } catch (SQLException ex) { 
         Logger.getLogger(orderinsystem.class.getName()).log(Level.SEVERE, null, ex);
     } 
    }
    public ArrayList<getorderall> getoldorders(String name) throws ClassNotFoundException {
        Class.forName("org.gjt.mm.mysql.Driver");
       ArrayList<getorderall> p=new ArrayList<getorderall>();
               try{
                      Con=(Connection) DriverManager.getConnection(url, user, password);
                      String selectSQL = "SELECT * FROM   orderone WHERE statueS=? AND statueC=? AND namec=?";
                      PreparedStatement pstmt = Con.prepareStatement(selectSQL);
                      pstmt.setInt(1, 1);
                      pstmt.setInt(2, 1);
                      pstmt.setString(3,name);
                      ResultSet rs = pstmt.executeQuery();
                      while(rs.next()){
                          getorderall c=new getorderall();
                          c.set_Pr(rs.getDouble("priceTotal"));
                          c.set_orderid(rs.getInt("orderid"));
                          c.set_SC(rs.getInt("statueC"));
                          c.set_SS(rs.getInt("statueS"));
                          //dateorder
                          c.setDate(rs.getString("dateorder"));
                          c.setname(rs.getString("namec"));
                          p.add(c);
                      }
                      Con.close();; 
                      return p;
               } catch (SQLException ex) {
         Logger.getLogger(orderinsystem.class.getName()).log(Level.SEVERE, null, ex);
     }
      return  p;
    }

    public void deletOrdersbyID(ArrayList<Integer> ordersid) throws ClassNotFoundException {
         Class.forName("org.gjt.mm.mysql.Driver");
        
               try {
                   for(int i=0;i<ordersid.size();i++){
                          Con=(Connection) DriverManager.getConnection(url, user, password);

                       //delete from orders
                          String query = "delete from orders where orderid = ?";
                            PreparedStatement preparedStmt = Con.prepareStatement(query);
                           preparedStmt.setInt(1, ordersid.get(i));
                           preparedStmt.execute();
                           Con.close(); 

                   }
               } catch (SQLException ex) {
         Logger.getLogger(orderinsystem.class.getName()).log(Level.SEVERE, null, ex);
     }
    }
    public void deleteordersbyuser(String n) throws ClassNotFoundException{
         Class.forName("org.gjt.mm.mysql.Driver");
        
               try {
                   Con=(Connection) DriverManager.getConnection(url, user, password);
                   
                       //delete from orders
                          String query = "delete from orderone where namec = ?";
                            PreparedStatement preparedStmt = Con.prepareStatement(query);
                           preparedStmt.setString(1, n);
                           preparedStmt.execute();

                           Con.close(); 
                  
               } catch (SQLException ex) {
         Logger.getLogger(orderinsystem.class.getName()).log(Level.SEVERE, null, ex);
     }
        
    }

   public void deleteoneorderbyname(ArrayList<Integer> ch) throws ClassNotFoundException {
         Class.forName("org.gjt.mm.mysql.Driver");
        
               try {
                   for(int i=0;i<ch.size();i++){
                          Con=(Connection) DriverManager.getConnection(url, user, password);

                       //delete from orders
                         String query = "delete from orderone where orderid= ?";
                         PreparedStatement preparedStmt = Con.prepareStatement(query);
                         preparedStmt.setInt(1, ch.get(i));
                         preparedStmt.execute();
                         Con.close(); 

                   }
               } catch (SQLException ex) { 
         Logger.getLogger(orderinsystem.class.getName()).log(Level.SEVERE, null, ex);
     } 
    }

   
}
