/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Embedded;

import java.sql.*;
import javax.swing.*;
/**
 *
 * @author LongTran
 */
public class Connect {
   public static Connection con = null;
    public static Connection connect(){
       try{  
//            Class.forName("com.mysql.jdbc.Driver");  
            con = DriverManager.getConnection("jdbc:mysql://172.16.176.224:3306/qltbn","long","");   
            Statement st = con.createStatement();
//            ResultSet rs = st.executeQuery("Select * from account");
//            if (rs.next()){
//                System.out.println(rs.getString(2));
//            }
            }catch(Exception e){ 
                System.out.println(e);
            }  
       return con;
    }  
    
   
    }
    
