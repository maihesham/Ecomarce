/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Base64;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import neededclasess.comment;
import neededclasess.getproduct;
import neededclasess.product;
import sun.misc.IOUtils;

/**
 *
 * @author egypt2
 */
public class productinsystem {
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
     
    public ArrayList<product> gitallLearn(ArrayList<String> le) throws ClassNotFoundException {
       ArrayList<product> p=new ArrayList<product>();
       Class.forName("org.gjt.mm.mysql.Driver");
               try {
                Con=(Connection) DriverManager.getConnection(url, user, password);
                  String query ="SELECT * FROM product ";
                  Statement   st1 = (Statement) Con.createStatement();
                  ResultSet   rs2 = st1.executeQuery(query);
                   while(rs2.next()){
                             String C=rs2.getString("typeo");
                                for(int i=0;i<le.size();i++){
                                   String Z=le.get(i);
                                   if(C.contains(Z)){
                                       if(rs2.getInt("numbero")>0){
                                            product onep=new product();
                                            onep.set_id(rs2.getInt("id"));
                                            onep.Set_type(rs2.getString("typeo"));
                                            onep.set_addtime(rs2.getString("addtime"));;
                                            onep.set_discription(rs2.getString("discribtion"));
                                            onep.set_name(rs2.getString("nameo"));
                                            onep.set_numberbuthis(rs2.getInt("nsall"));
                                            onep.set_numberinstock(rs2.getInt("numbero"));
                                            onep.set_price(rs2.getDouble("price"));
                                            onep.set_rate(rs2.getInt("rate"));
                                            onep.set_sizes(rs2.getString("avsize"));
                                          onep.Set_p1(rs2.getString("photo1"));
                                           onep.Set_p2(rs2.getString("photo2"));
                                           onep.Set_p3(rs2.getString("photo3"));
                                              System.out.println("addes"+rs2.getString("typeo"));
                                            p.add(onep);
                                       }
                                        
                                    }
                                }
                   }
                   
                   System.out.println(p.size()+"size of learn");
                   for(int i=0;i<p.size();i++){
                       System.out.println(i+"cu "+p.get(i).get_type()+" "+p.get(i).get_name());
                   }
                   return  p;
               } catch (SQLException ex) {
             Logger.getLogger(customerinmodel.class.getName()).log(Level.SEVERE, null, ex);
         }
       return p;
    }   
public ArrayList<String> getcat(ArrayList<String> le) throws ClassNotFoundException{
    Class.forName("org.gjt.mm.mysql.Driver");
    ArrayList<String> l=new ArrayList<>();
    try{
                   Con=(Connection) DriverManager.getConnection(url, user, password);
                    Statement st = (Statement) Con.createStatement();
                    ResultSet rs = st.executeQuery("SELECT * FROM categ");
                    while(rs.next()){
                        String x=rs.getString("c1");
                        boolean c=false;
                        for(int i=0;i<le.size();i++){
                               if(le.get(i).contains(x)){
                                   c=true;
                                   break;
                               }
                          }
                        if(c==false){
                            System.out.println("add "+x);
                            l.add(x);
                        }
                    }
                    System.out.println("size pluse is "+l.size());
                    Con.close();
    }    catch (SQLException ex) {
             Logger.getLogger(productinsystem.class.getName()).log(Level.SEVERE, null, ex);
         }
    return l;
}
    public ArrayList<product> getpluspro(ArrayList<String> le) throws ClassNotFoundException {
      ArrayList<String> l=new ArrayList<>();
       ArrayList<product> p=new ArrayList<product>();
       l=getcat(le);
       Class.forName("org.gjt.mm.mysql.Driver");
               try {
                Con=(Connection) DriverManager.getConnection(url, user, password);
                  String query ="SELECT * FROM product ";
                  Statement   st1 = (Statement) Con.createStatement();
                  ResultSet   rs2 = st1.executeQuery(query);
                   while(rs2.next()){
                             String C=rs2.getString("typeo");
                                for(int i=0;i<l.size();i++){
                                   String Z=l.get(i);
                                   if(C.contains(Z)){
                                       if(rs2.getInt("numbero")>0){
                                         product onep=new product();
                                        onep.Set_type(rs2.getString("typeo"));
                                          onep.set_id(rs2.getInt("id"));
                                          onep.set_addtime(rs2.getString("addtime"));;
                                            onep.set_discription(rs2.getString("discribtion"));
                                            onep.set_name(rs2.getString("nameo"));
                                            onep.set_numberbuthis(rs2.getInt("nsall"));
                                            onep.set_numberinstock(rs2.getInt("numbero"));
                                            onep.set_price(rs2.getDouble("price"));
                                            onep.set_rate(rs2.getInt("rate"));
                                            onep.set_sizes(rs2.getString("avsize"));
                                           onep.Set_p1(rs2.getString("photo1"));
                                           onep.Set_p2(rs2.getString("photo2"));
                                           onep.Set_p3(rs2.getString("photo3"));
                                            System.out.println("addes"+rs2.getString("typeo"));
                                            p.add(onep);
                                       }
                                    }
                                }
                                  
                
                }
              
                      
                             
                   } catch (SQLException ex) {
             Logger.getLogger(productinsystem.class.getName()).log(Level.SEVERE, null, ex);
         } 
                  
       return p;
       
    }
   public void addp(product p) throws ClassNotFoundException{
        Class.forName("org.gjt.mm.mysql.Driver");
               try {
                   Con=(Connection) DriverManager.getConnection(url, user, password);
                   String q="insert into  product(nameo,typeo,price,discribtion,photo1,photo2,photo3,addtime,numbero,avsize)" + " values (?,?,?,?,?,?,?,?,?,?)";
                   PreparedStatement statement = (PreparedStatement) Con.prepareStatement(q);
                   statement.setString(1,p.get_name());
                   statement.setString(2,p.get_type());
                   statement.setDouble(3,p.get_price());
                   statement.setString(4,p.get_discription());
                   statement.setString(5,p.get_p1());
                   statement.setString(6,p.get_p2());
                   statement.setString(7,p.get_p3s());
                    statement.setDate(8, sDate);
                       statement.setInt(9, p.get_numberinstock());
                       statement.setString(10, p.get_sizes());
                         statement.execute();
                    Con.close();; 
                    createcate(p.get_type());
               } catch (SQLException ex) {
             Logger.getLogger(productinsystem.class.getName()).log(Level.SEVERE, null, ex);
         }
   }   

    public void createcate(String _type) throws ClassNotFoundException {
       
     Class.forName("org.gjt.mm.mysql.Driver");
        
               try {
                   Con=(Connection) DriverManager.getConnection(url, user, password);
                   String q="insert into  categ(c1)" + " values (?)";
                   PreparedStatement statement = (PreparedStatement) Con.prepareStatement(q);
                  statement.setString(1, _type);
                   statement.execute();
                    Con.close();; 
               } catch (SQLException ex) {
             Logger.getLogger(productinsystem.class.getName()).log(Level.SEVERE, null, ex);
         }
}

    public ArrayList<product> getPrsbycatorname(String ca) throws ClassNotFoundException {
         Class.forName("org.gjt.mm.mysql.Driver");
         ArrayList<product> p=new ArrayList<product>();
         try {
            Con=(Connection) DriverManager.getConnection(url, user, password);
                   String query ="SELECT * FROM product ";
                  Statement   st1 = (Statement) Con.createStatement();
                  ResultSet   rs2 = st1.executeQuery(query);
                   while(rs2.next()){
                             String C=rs2.getString("typeo");
                             String nn=rs2.getString("nameo");
                                   if(C.contains(ca)||nn.contains(ca) ){
                                       if(rs2.getInt("numbero")>0){
                                         product onep=new product();
                                        onep.Set_type(rs2.getString("typeo"));
                                          onep.set_id(rs2.getInt("id"));
                                          onep.set_addtime(rs2.getString("addtime"));;
                                            onep.set_discription(rs2.getString("discribtion"));
                                            onep.set_name(rs2.getString("nameo"));
                                            onep.set_numberbuthis(rs2.getInt("nsall"));
                                            onep.set_numberinstock(rs2.getInt("numbero"));
                                            onep.set_price(rs2.getDouble("price"));
                                            onep.set_rate(rs2.getInt("rate"));
                                            onep.set_sizes(rs2.getString("avsize"));
                                           onep.Set_p1(rs2.getString("photo1"));
                                           onep.Set_p2(rs2.getString("photo2"));
                                           onep.Set_p3(rs2.getString("photo3"));
                                            System.out.println("addes"+rs2.getString("typeo"));
                                            p.add(onep);
                                    }
                                   }
                                  
                
                }
                
            Con.close();; 
               return p;
               } catch (SQLException ex) {
             Logger.getLogger(productinsystem.class.getName()).log(Level.SEVERE, null, ex);
         }
         return p;
    }

    public product getPbyID(int res) throws ClassNotFoundException {
        product onep=new product();
         Class.forName("org.gjt.mm.mysql.Driver");
               try {
                   Con=(Connection) DriverManager.getConnection(url, user, password);
                   String selectSQL = "SELECT * FROM product WHERE id=?";
                   PreparedStatement pstmt = Con.prepareStatement(selectSQL);
                   pstmt.setInt(1, res);
                   ResultSet rs2 = pstmt.executeQuery();
                   while(rs2.next()){
                                        onep.Set_type(rs2.getString("typeo"));
                                          onep.set_id(rs2.getInt("id"));
                                          onep.set_addtime(rs2.getString("addtime"));;
                                            onep.set_discription(rs2.getString("discribtion"));
                                            onep.set_name(rs2.getString("nameo"));
                                            onep.set_numberbuthis(rs2.getInt("nsall"));
                                            onep.set_numberinstock(rs2.getInt("numbero"));
                                            onep.set_price(rs2.getDouble("price"));
                                            onep.set_rate(rs2.getInt("rate"));
                                            onep.set_sizes(rs2.getString("avsize"));
                                           onep.Set_p1(rs2.getString("photo1"));
                                           onep.Set_p2(rs2.getString("photo2"));
                                           onep.Set_p3(rs2.getString("photo3"));
                   }
               } catch (SQLException ex) {
             Logger.getLogger(productinsystem.class.getName()).log(Level.SEVERE, null, ex);
         }
               return onep;
    }

    public void modifyproducts(ArrayList<getproduct> cc) throws ClassNotFoundException {
          Class.forName("org.gjt.mm.mysql.Driver");
               try {
                   Con=(Connection) DriverManager.getConnection(url, user, password);
                   for(int i=0;i<cc.size();i++){
                            int nu=cc.get(i).get_cou();
                            int getcurrentnum=getnuminSt(cc.get(i).p.get_id());
                            updatenumsell(cc.get(i).p.get_id(),cc);
                            String query = "update product set numbero = ?  WHERE id = ?";
                            PreparedStatement preparedStmt = Con.prepareStatement(query);
                            preparedStmt.setInt(1, getcurrentnum-nu);//verify
                            preparedStmt.setInt(2, cc.get(i).p.get_id());//verify
                            preparedStmt.executeUpdate();
                             preparedStmt.close();
                   }
                   
               } catch (SQLException ex) {
             Logger.getLogger(customerinmodel.class.getName()).log(Level.SEVERE, null, ex);
         }
    }

    public int getnuminSt(int id) throws ClassNotFoundException {
         Class.forName("org.gjt.mm.mysql.Driver");
         int cu=0;
               try {
                   Con=(Connection) DriverManager.getConnection(url, user, password);
                   
                   String selectSQL = "SELECT * FROM  product WHERE id=?";
                        PreparedStatement pstmt = Con.prepareStatement(selectSQL);

                        pstmt.setInt(1, id);
                        ResultSet rs = pstmt.executeQuery();
                        while(rs.next()){
                            if(rs.getInt("id")==id){
                                return rs.getInt("numbero");
                            }
                        }
               } catch (SQLException ex) { 
             Logger.getLogger(productinsystem.class.getName()).log(Level.SEVERE, null, ex);
         } 
               return  cu;
    }

    public void updatenumsell(int id , ArrayList<getproduct> cc) throws ClassNotFoundException {
         Class.forName("org.gjt.mm.mysql.Driver");
               try {
                   Con=(Connection) DriverManager.getConnection(url, user, password);
                   for(int i=0;i<cc.size();i++){
                           
                            int getnuse=getnumsellnow(id);
                            String query = "update product set nsall = ?  WHERE id = ?";
                            PreparedStatement preparedStmt = Con.prepareStatement(query);
                            preparedStmt.setInt(1, getnuse+1);//verify
                            preparedStmt.setInt(2, cc.get(i).p.get_id());//verify
                            preparedStmt.executeUpdate();
                             preparedStmt.close();
                   }
                   
               } catch (SQLException ex) { 
             Logger.getLogger(productinsystem.class.getName()).log(Level.SEVERE, null, ex);
         } 
    }

    private int getnumsellnow(int id) throws ClassNotFoundException {
         Class.forName("org.gjt.mm.mysql.Driver");
         int cu=0;
               try {
                   Con=(Connection) DriverManager.getConnection(url, user, password);
                   
                   String selectSQL = "SELECT * FROM  product WHERE id=?";
                        PreparedStatement pstmt = Con.prepareStatement(selectSQL);

                        pstmt.setInt(1, id);
                        ResultSet rs = pstmt.executeQuery();
                        while(rs.next()){
                            if(rs.getInt("id")==id){
                                return rs.getInt("nsall");
                            }
                        }
               } catch (SQLException ex) { 
             Logger.getLogger(productinsystem.class.getName()).log(Level.SEVERE, null, ex);
         } 
               return  cu;
    }

    public ArrayList<comment> getcommentsofpr(int id) throws ClassNotFoundException {
         Class.forName("org.gjt.mm.mysql.Driver");
         ArrayList<comment>  x=new ArrayList<comment> ();
         try {
                   Con=(Connection) DriverManager.getConnection(url, user, password);
                   String selectSQL = "SELECT * FROM  comment WHERE pid=?";
                   PreparedStatement pstmt = Con.prepareStatement(selectSQL);
                   pstmt.setInt(1, id);
                  ResultSet rs = pstmt.executeQuery();
                   while(rs.next()){
                       comment c=new comment(rs.getString("comm"),rs.getString("username"),rs.getString("dateorder"));
                       x.add(c);
                   }     
               } catch (SQLException ex) { 
             Logger.getLogger(productinsystem.class.getName()).log(Level.SEVERE, null, ex);
         }
         return x;
    }

    public void updaterate(int idd, int rr, int cur) throws ClassNotFoundException {
       Class.forName("org.gjt.mm.mysql.Driver");
               try {
                   Con=(Connection) DriverManager.getConnection(url, user, password);
                           int X=(rr+cur)*10/5;
                           X+=10;
                            String query = "update product set rate = ?  WHERE id = ?";
                            PreparedStatement preparedStmt = Con.prepareStatement(query);
                            preparedStmt.setInt(1,X );//verify
                            preparedStmt.setInt(2, idd);//verify
                            preparedStmt.executeUpdate();
                             preparedStmt.close();
                   
                   
               } catch (SQLException ex) { 
             Logger.getLogger(productinsystem.class.getName()).log(Level.SEVERE, null, ex);
         } 
    }

    public void addcomment(String com, int idd,String us) throws ClassNotFoundException {
       Class.forName("org.gjt.mm.mysql.Driver");
               try {
                   Con=(Connection) DriverManager.getConnection(url, user, password);
                      String q="insert into  comment(comm,pid,username,dateorder)" + "values (?,?,?,?)";
                   PreparedStatement statement = (PreparedStatement) Con.prepareStatement(q);
                  statement.setString(1, com);
                  statement.setInt(2, idd);
                  statement.setString(3, us);
                  statement.setDate(4, sDate);
                   statement.execute();
                    Con.close();;      
                   
               } catch (SQLException ex) { 
             Logger.getLogger(productinsystem.class.getName()).log(Level.SEVERE, null, ex);
         } 
    }

    public String detlterpr(int n) throws ClassNotFoundException {
       ArrayList<Integer>ch=getordersID(n);
        System.err.println("rrrrrrrrrrrr"+ch.size());
       boolean chcurrent=checkidordersarecurent(ch);
       if(chcurrent==true){
           return "can't delete it ";
       }else{
               //orders
               orderinsystem x=new orderinsystem();
               x. deletOrdersbyID(ch);
               //delete any oneorder(ch)
               x.deleteoneorderbyname(ch);
               //delet procudt
         //     deleteprbyid(n);
               return "will delete";
       }
    }
 private void deleteprbyid(int ne) throws ClassNotFoundException {
         Class.forName("org.gjt.mm.mysql.Driver");
        
               try {
                   Con=(Connection) DriverManager.getConnection(url, user, password);
                   String query = "delete from product where id = ?";
                            PreparedStatement preparedStmt = Con.prepareStatement(query);
                           preparedStmt.setInt(1, ne);
                           preparedStmt.execute();

                           Con.close(); 
                  
               } catch (SQLException ex) { 
             Logger.getLogger(customerinmodel.class.getName()).log(Level.SEVERE, null, ex);
         } 
    }
    private  ArrayList<Integer> getordersID(int n) throws ClassNotFoundException {
           Class.forName("org.gjt.mm.mysql.Driver");
           ArrayList<Integer> i=new ArrayList<>();
               try {
                   Con=(Connection) DriverManager.getConnection(url, user, password);
                  
                            String selectSQL = "SELECT  * FROM orders WHERE pid=?";
                            PreparedStatement pstmt = Con.prepareStatement(selectSQL);
                            pstmt.setInt(1,n);
                            ResultSet rs = pstmt.executeQuery();
                            while(rs.next()){
                                i.add(rs.getInt("orderid"));
                            }
                           Con.close(); 
                  
               } catch (SQLException ex) { 
             Logger.getLogger(productinsystem.class.getName()).log(Level.SEVERE, null, ex);
         } 
               return i;
    }

   public boolean checkidordersarecurent(ArrayList<Integer> ch) throws ClassNotFoundException {
        Class.forName("org.gjt.mm.mysql.Driver");
        try {
            for(int i=0;i<ch.size();i++){
                            Con=(Connection) DriverManager.getConnection(url, user, password);
                            String selectSQL = "SELECT  * FROM orderone WHERE orderid=?";
                            PreparedStatement pstmt = Con.prepareStatement(selectSQL);
                            pstmt.setInt(1,ch.get(i));
                            ResultSet rs = pstmt.executeQuery();
                            while(rs.next()){
                                if(rs.getInt("statueS")==0){
                                    System.out.print("gg"+rs.getInt("orderid"));
                                    return true;
                                }
                            }
                           Con.close(); 
            }
                  
               } catch (SQLException ex) { 
             Logger.getLogger(productinsystem.class.getName()).log(Level.SEVERE, null, ex);
         } 
        return  false;
    }

   

}
