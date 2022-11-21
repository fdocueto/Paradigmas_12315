/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tarea_2;

import java.sql.*;


/**
 *
 * @author ferna
 */
public class VentaDao {
    Connection con;
    Conexion cn = new Conexion();
    PreparedStatement ps;
    ResultSet rs;
    
    public String idVent() {
        String idv="";
        String sql = "select max(idVenta) from venta";
        try {
            con = cn.getConection();
            ps=con.prepareStatement(sql);
            rs = ps.executeQuery();
            while(rs.next()) {
                idv = rs.getString(1);
            }
        } catch (Exception e) {
        }
        return idv;
    };
    public int guardarVenta(Venta v) {
        int r=0;
        //Venta venta = new Venta();
        String sql = "insert into venta (vendedorId,fechaCompra, montoVenta) values (?,?,?)";
        try {
            con = cn.getConection();
            ps = con.prepareStatement(sql);
            
            ps.setInt(1, v.getVendedorId());
            ps.setString(2, v.getFecha());
            ps.setInt(3, v.getMontoVenta());
            r = ps.executeUpdate();

        } catch (SQLException e ) {
            System.out.println("Error"+e.getMessage());
        
        }
        return r;
    }
    
    public int GuardarDetalleVenta(DetalleVenta dv) {
        int r=0;
        String sql = "insert into detalle_ventas(idVenta, idProducto, Cantidad, PrecioVenta) values(?,?,?,?)";
        try {
            con = cn.getConection();
            ps = con.prepareStatement(sql);
            ps.setInt(1, dv.getIdVenta());
            ps.setInt(2, dv.getIdProducto());
            ps.setInt(3, dv.getCantidad());
            r = ps.executeUpdate();
        } catch (SQLException e) {
        }
        return r;
    }
            
}
