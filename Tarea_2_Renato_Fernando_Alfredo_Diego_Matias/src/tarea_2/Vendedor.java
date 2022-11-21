/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tarea_2;

/**
 *
 * @author ferna
 */
public class Vendedor {
    int id;
    String nom;
    String rut;
    double comMine;
    double comCod;
    double comFort;
    double totalCom;

    public Vendedor() {
    }

    public Vendedor(int id, String nom, String rut ,double comMine, double comCod, double comFort, double totalCom) {
        this.id = id;
        this.nom = nom;
        this.rut = rut;
        this.comMine = comMine;
        this.comCod = comCod;
        this.comFort = comFort;
        this.totalCom = totalCom;
    }

    public String getRut() {
        return rut;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public double getComMine() {
        return comMine;
    }

    public void setComMine(double comMine) {
        this.comMine = comMine;
    }

    public double getComCod() {
        return comCod;
    }

    public void setComCod(double comCod) {
        this.comCod = comCod;
    }

    public double getComFort() {
        return comFort;
    }

    public void setComFort(double comFort) {
        this.comFort = comFort;
    }

    public double getTotalCom() {
        return totalCom;
    }

    public void setTotalCom(double totalCom) {
        this.totalCom = totalCom;
    }
    
    
    
}
