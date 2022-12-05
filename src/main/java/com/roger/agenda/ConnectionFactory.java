package com.roger.agenda;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class ConnectionFactory {
    public static Connection getConnection() throws SQLException{
        
        try{
            
            Class.forName("com.mysql.jdbc.Driver");
            return DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/agenda?useSSL=false", "root", "");
            
        } catch(ClassNotFoundException ex){
            
            throw new SQLException(ex.getMessage());
        }
    }
}