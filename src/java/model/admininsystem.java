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
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import neededclasess.order;

/**
 *
 * @author egypt2
 */
public class admininsystem {
  String url = "jdbc:mysql://localhost:3306/ecomerce";
     String user = "root";
     String password = "";
     public Connection Con =null;
    public boolean checkusernametogeg(String name) throws ClassNotFoundException {
       Class.forName("org.gjt.mm.mysql.Driver");
        
               try {
                   Con=(Connection) DriverManager.getConnection(url, user, password);
                   String query = "SELECT *  FROM adminW";
                   Statement st = (Statement) Con.createStatement();
                   ResultSet rs =st.executeQuery(query);
                  while(rs.next()){
                      String V=rs.getString("username");
                      if(V.equals(name))
                               return false;
                  }
               } catch (SQLException ex) {
          Logger.getLogger(admininsystem.class.getName()).log(Level.SEVERE, null, ex);
      }
               return true;
    }

    public boolean checkuserpasstogeg(String name) throws ClassNotFoundException {
        Class.forName("org.gjt.mm.mysql.Driver");
        
               try {
                   Con=(Connection) DriverManager.getConnection(url, user, password);
                   String query = "SELECT *  FROM adminW ";
                   Statement st = (Statement) Con.createStatement();
                   ResultSet rs =st.executeQuery(query);
                  while(rs.next()){
                      String V=rs.getString("pass");
                      if(V.equals(name))
                               return false;
                  }
        
    } catch (SQLException ex) {    
          Logger.getLogger(admininsystem.class.getName()).log(Level.SEVERE, null, ex);
      }
               return  true;
    }

    public ArrayList<order> findordersnotsended() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
