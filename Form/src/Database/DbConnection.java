/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Database;
//  import the required packages for database connectivity
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Siddhanta
 */
public class DbConnection {
    
    public Connection CreateDBConnection() {
        try {
            // Step-1: Load the database Driver
            Class.forName("com.mysql.cj.jdbc.Driver");
            // Step-2 : Establish Connection
            String url = "jdbc:mysql://localhost:3306/practice_sid70";
            String username = "root";
            String password = "";
            try {
                Connection conn = DriverManager.getConnection(url,username,password);
                if (conn.isClosed())
                {
                    System.out.println("Connection Failed");
                }
                else
                {
                    System.out.println("Connected Successfuly!");
                }
                return conn;
            } catch (SQLException ex) {
                Logger.getLogger(DbConnection.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(DbConnection.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
}