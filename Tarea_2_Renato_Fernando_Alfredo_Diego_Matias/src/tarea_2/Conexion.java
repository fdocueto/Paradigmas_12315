/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tarea_2;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;


/**
 *
 * @author ferna
 */
public class Conexion {
    public static final String URL= "jdbc:mysql://localhost:3306/Paradigmas";
    public static final String USERNAME= "tester";
    public static final String PASSWORD= "12345";
    
    public Connection getConection(){
        Connection con = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = (Connection) DriverManager.getConnection(URL,USERNAME,PASSWORD);
            //JOptionPane.showMessageDialog(null, "Conexión exitosa");
        } catch (Exception e) {
            System.out.println("Error: "+ e.getMessage());
        }
        return con;
    };
}
