/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tarea_2;

/**
 *
 * @author ferna
 */
public class DetalleVenta {
    int id;
    int idVenta;
    int idProducto;
    int cantidad;


    public DetalleVenta() {
    }

    public DetalleVenta(int id, int idVenta, int idProducto, int cantidad) {
        this.id = id;
        this.idVenta = idVenta;
        this.idProducto = idProducto;
        this.cantidad = cantidad;

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdVenta() {
        return idVenta;
    }

    public void setIdVenta(int idVenta) {
        this.idVenta = idVenta;
    }

    public int getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(int idProducto) {
        this.idProducto = idProducto;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    
    
}
