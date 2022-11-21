/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tarea_2;

import java.sql.*;
import java.util.*;

/**
 *
 * @author ferna
 */
public class ProductoDao {
    int r;
    Connection con;
    Conexion cn = new Conexion();
    PreparedStatement ps;
    ResultSet rs;
    Producto p = new Producto();
    
    public Producto listarID(int id) {
        Producto pro = new Producto();
        String sql ="select * from producto where idProducto=?";
        
        try {
            con = cn.getConection();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while(rs.next()) {
                pro.setId(rs.getInt(1));
                pro.setNombre((rs.getString(2)));
                pro.setStock(Integer.parseInt(rs.getString(3)));
                pro.setPrecio(Integer.parseInt(rs.getString(4)));


                }
        } catch (Exception e) {
        }
        return pro;
    }
    
    public List listarProducto() {
        String sql = "select* from producto";
        List<Producto> listaJuegos = new ArrayList<>();
        try {
            con = cn.getConection();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while(rs.next()) {
                p.setId(rs.getInt(1));
                p.setNombre((rs.getString(2)));
                p.setStock(Integer.parseInt(rs.getString(3)));
                p.setPrecio(Integer.parseInt(rs.getString(4)));

                listaJuegos.add(p);
                }
               
        } catch (SQLException e) {
                System.out.println("Error:"+e.getMessage());
                
        }
        return listaJuegos;
    }
    
}
