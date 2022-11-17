/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oecd;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author User
 */
public class Create_Table {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        // TODO code application logic here
        getConnection();
        createTable();
    }

    public static Connection getConnection() throws Exception {

        try {
            String driver = "com.mysql.cj.jdbc.Driver";
            String url = "jdbc:mysql://localhost/5009_database";
            String username = "root";
            String password = "";
            Class.forName(driver);

            Connection conn = DriverManager.getConnection(url, username, password);
            System.out.println("Connected");
            return conn;
        } catch (Exception e) {
            System.out.println(e);
        }

        return null;
    }

    public static void createTable() throws Exception {

        try {
            Connection conn = getConnection();
            PreparedStatement create = conn.prepareStatement("CREATE TABLE IF NOT EXISTS companyinfo(id int NOT NULL AUTO_INCREMENT, companyName varchar(255), address varchar(255), city varchar(255), state varchar(255), zipcode int(100), service varchar(255), email varchar(255), password varchar(255), PRIMARY KEY(id))");
            create.executeUpdate();
        } catch (Exception e) {
            System.out.println(e);
        } finally {
            System.out.println("companyinfo table created.");
        }

        try {
            Connection conn = getConnection();
            PreparedStatement create = conn.prepareStatement("CREATE TABLE IF NOT EXISTS companyregister(id int NOT NULL AUTO_INCREMENT, companyName varchar(255), address varchar(255), city varchar(255), state varchar(255), zipcode int(100), service varchar(255), email varchar(255), password varchar(255), PRIMARY KEY(id))");
            create.executeUpdate();
        } catch (Exception e) {
            System.out.println(e);
        } finally {
            System.out.println("companyregister table created.");
        }

        try {
            Connection conn = getConnection();
            PreparedStatement create = conn.prepareStatement("CREATE TABLE IF NOT EXISTS user(uid int NOT NULL AUTO_INCREMENT, fname varchar(255), lname varchar(255), ic varchar(255), email varchar(255), contact varchar(255), password varchar(255), PRIMARY KEY(uid))");
            create.executeUpdate();
        } catch (Exception e) {
            System.out.println(e);
        } finally {
            System.out.println("user table created.");
        }

        try {
            Connection conn = getConnection();
            PreparedStatement create = conn.prepareStatement("CREATE TABLE IF NOT EXISTS userRequest(urid int NOT NULL AUTO_INCREMENT PRIMARY KEY, uid int, uname varchar(255), ic varchar(255), contact varchar(255), email varchar(255), companyID varchar(255))");
            create.executeUpdate();
        } catch (Exception e) {
            System.out.println(e);
        } finally {
            System.out.println("userRequest table created.");
        }
        
        try {
            Connection conn = getConnection();
            PreparedStatement create = conn.prepareStatement("CREATE TABLE IF NOT EXISTS feedbackform(fid int NOT NULL AUTO_INCREMENT PRIMARY KEY, uid varchar(255), uname varchar(255), subject varchar(255), context text(10000))");
            create.executeUpdate();
        } catch (Exception e) {
            System.out.println(e);
        } finally {
            System.out.println("feedbackform table created.");
        }
        
        try {
            Connection conn = getConnection();
            PreparedStatement create = conn.prepareStatement("CREATE TABLE IF NOT EXISTS accepteduser(aid int NOT NULL AUTO_INCREMENT PRIMARY KEY, uname varchar(255), ic varchar(255), contact varchar(255), email varchar(255))");
            create.executeUpdate();
        } catch (Exception e) {
            System.out.println(e);
        } finally {
            System.out.println("accepteduser table created.");
        }
        
        try {
            Connection conn = getConnection();
            PreparedStatement create = conn.prepareStatement("CREATE TABLE IF NOT EXISTS rejecteduser(rid int NOT NULL AUTO_INCREMENT PRIMARY KEY, uname varchar(255), ic varchar(255), contact varchar(255), email varchar(255))");
            create.executeUpdate();
        } catch (Exception e) {
            System.out.println(e);
        } finally {
            System.out.println("rejecteduser table created.");
        }

    }

}
