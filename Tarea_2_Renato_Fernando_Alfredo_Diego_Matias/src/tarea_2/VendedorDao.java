/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tarea_2;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ferna
 */
public class VendedorDao implements CRUD{
    Connection con;
    Conexion cn = new Conexion();
    PreparedStatement ps;
    ResultSet rs;

    public Vendedor listarId(String rut) {
        Vendedor v = new Vendedor();
        String sql = "select idVendedor, Nombre from vendedor where rut=?";
        try {
            con = cn.getConection();
            ps=con.prepareStatement(sql);
            ps.setString(1, rut);
            rs = ps.executeQuery();
            while(rs.next()) {
                v.setId(rs.getInt(1));
                v.setNom((rs.getString(2)));
            }
        } catch (Exception e) {
            System.out.println("Error:"+e.getMessage());
        }
        return v;
    };
    @Override
    public List listar() {
        List<Vendedor> lista = new ArrayList<>();
        String sql = "select * from vendedor";
        
        try {
            con = cn.getConection();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while(rs.next()) {
                Vendedor  v = new Vendedor();
                v.setId(rs.getInt(1));
                v.setNom((rs.getString(2)));
                v.setRut(rs.getString(3));
                v.setComCod(Double.parseDouble(rs.getString(4)));
                v.setComFort(Double.parseDouble(rs.getString(5)));
                v.setComMine(Double.parseDouble(rs.getString(6)));
                v.setTotalCom(Double.parseDouble(rs.getString(7)));
                lista.add(v);
                
            }
        } catch (Exception e) {
            System.out.println("Error:"+e.getMessage());
        }
        return lista;
    }

    @Override
    public int add(Object[] o) {
        int r=0;
        String sql="insert into vendedor(Nombre, rut, ComCod,  ComFort, ComMine,ComTotal) values(?,?,?,?,?,?)";
        try {
            con = cn.getConection();
            ps = con.prepareStatement(sql);
            ps.setObject(1, o[0]);
            ps.setObject(2, o[1]);
            ps.setObject(3, o[2]);
            ps.setObject(4, o[3]);
            ps.setObject(5, o[4]);
            ps.setObject(6, o[5]);
            r = ps.executeUpdate();
        } catch (Exception e) {
            System.out.println("Error:"+e.getMessage());
        }

        return r;
    }

    @Override
    public void eliminar(int id) {
        
    }

    @Override
    public int actualizar(Object[] o) {
        int r=0;
        String sql = "update vendedor set ComCod=?, ComFort=?, ComMine=?, ComTotal=?";
        
        try {
            con = cn.getConection();
            ps = con.prepareStatement(sql);
            ps.setObject(4, o[3]);
            ps.setObject(5, o[4]);
            ps.setObject(6, o[5]);
            ps.setObject(7, o[6]);
            r = ps.executeUpdate();
        } catch (Exception e) {
            System.out.println("Error:"+e.getMessage());
        }
        
        return r;
    }
}
