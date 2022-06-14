/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package qlksk57;

import java.sql.DriverManager;

/**
 *
 * @author khoa
 */
public class MyConnection {
    public static java.sql.Connection getConnection() {
        java.sql.Connection conn = null;
        try {
            String url = "jdbc:sqlserver://localhost:1433;databaseName=QL_KHACHSAN";
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver").newInstance();
            String username = "sa";
            String password = "123456789";
            conn = DriverManager.getConnection(url, username, password);
        } catch (Exception e) {
            e.printStackTrace();// TODO: handle exception
        }
        return conn;
    }

    public static void closeConnection(java.sql.Connection c) {
        try {
            c.close();
        } catch (Exception e) {
            e.printStackTrace();
            // TODO: handle exception
        }
    }
    
}
