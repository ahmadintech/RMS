/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Rampoly_RMS;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author ahmadintech
 */

public class ConnectMe {
 
    
    public static Connection SQL (){
        try {
            //src/Rampoly_RMS/Rampoly.db  C:\\Users\\ahmadintech\\Documents\\NetBeansProjects\\Ramat_Polytechnic_Maiduguri\\src\\Rampoly_RMS\\Rampoly.db
            Class.forName("org.sqlite.JDBC");
            Connection conn = DriverManager.getConnection("jdbc:sqlite:Rampoly.db");
            return conn;
        } catch (ClassNotFoundException | SQLException e) {
            System.err.println(e);
        }
    
  return null;  
}
    public static void mytime(){
        Date now = new Date();
        SimpleDateFormat sd12= new SimpleDateFormat("YYYY");
       Add_new_Student.setSession.setSelectedItem(sd12.format(now));
      
    }
    public static void main(String[] args) {
        Connection connect = ConnectMe.SQL();
        try {
            ResultSet rr;
            try (Statement pp = connect.createStatement()) {
                rr = pp.executeQuery("SELECT first_lunch FROM Settings");
                if("true".equals(rr.getString(1))){
                Add_new_Student.main(args);
                Starter frame2 = new Starter();
                frame2.setVisible(false);
                }else{
                    Starter.main(args);
                }      
            }  
        } catch (Exception e) {
        }
        
        
    }
}
