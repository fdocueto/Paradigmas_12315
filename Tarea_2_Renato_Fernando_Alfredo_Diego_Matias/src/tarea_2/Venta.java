/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tarea_2;

/**
 *
 * @author ferna
 */
public class Venta {
    int id;
    int vendedorId;
    String fecha;
    int montoVenta;

    public Venta() {
    }

    public Venta(int id, int vendedorId, String fecha, int montoVenta) {
        this.id = id;
        this.vendedorId = vendedorId;
        this.fecha = fecha;
        this.montoVenta=montoVenta;
    }

    public int getMontoVenta() {
        return montoVenta;
    }

    public void setMontoVenta(int montoVenta) {
        this.montoVenta = montoVenta;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getVendedorId() {
        return vendedorId;
    }

    public void setVendedorId(int vendedorId) {
        this.vendedorId = vendedorId;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }
    
    
    
    
}
