/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tarea_2;

import java.util.List;

/**
 *
 * @author ferna
 */
public interface CRUD {
    public List listar();
    public int add(Object[] o);
    public int actualizar(Object[] o);
    public void eliminar(int id);
}
