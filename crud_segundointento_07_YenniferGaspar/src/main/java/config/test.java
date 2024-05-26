/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package config;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author 51944
 */
public class test {
    /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

    public static void main(String[] args) throws ClassNotFoundException {
        
    String jdbcUrl = "jbbc:mysql://localhost:3306/registro?characterEncoding-UFT-8";
    String username = "root";
    String password = "ADMIN";

    Connection connection = null;
        
        try {
            Class.forName("com.mysql.jdbc.Driver");
            
            //conexion
            connection = DriverManager.getConnection(jdbcUrl,username,password);
            
            if(connection != null){
                System.out.print("Conexion exitosa");
            }
        } catch (SQLException e) {
            System.out.println("Error conexion base de datos:" + e );
        }
    }

}


