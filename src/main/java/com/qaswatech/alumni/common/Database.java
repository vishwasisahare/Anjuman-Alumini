/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.qaswatech.alumni.common;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Amit
 */
public class Database {
    
    
    
    private static final String DATABASE = "alumni";

    private static final String DBURL = "jdbc:mysql://localhost:3306/" + DATABASE + "?allowPublicKeyRetrieval=true&useSSL=false";
   //  private static final String DBURL = "jdbc:mysql://103.159.239.52:3306/" + DATABASE + "?allowPublicKeyRetrieval=true&useSSL=false";
   private static final String LOCAL_DB_USER = "root";
   private static final String LOCAL_DB_PASS = "1234";
 //   private static final String LOCAL_DB_USER = "alumni-manager";
 //   private static final String LOCAL_DB_PASS = "Azher@3377";


    public static Connection connectDb() {
        Connection con = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection(DBURL, LOCAL_DB_USER, LOCAL_DB_PASS);
          //  System.out.println("done db");
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println("com.qaswatech.alumni.common.Database.connectDb()" + e.getMessage());
        }
        return con;
    }

    public static void main(String[] args) throws SQLException {
        connectDb();
    }

}
