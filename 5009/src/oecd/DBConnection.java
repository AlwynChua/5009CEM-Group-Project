/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oecd;
import java.sql.*;
/**
 *
 * @author User
 */
public class DBConnection {
    static final String DB_URL = "jdbc:mysql://localhost/5009_database";
    static final String USER = "root";
    static final String PASS = "";
    
    public static Connection connectDB(){
        Connection conn = null;
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            //open a connection
            conn = DriverManager.getConnection(DB_URL, USER, PASS);
            return conn;
        }catch(Exception e){
            System.out.println("There were errors while connecting to db.");
            return null;
        }
    }
}
