/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab_8;

import java.io.Serializable;
import javax.swing.JOptionPane;

/**
 *
 * @author David
 */
public class Hada implements Serializable{
    private String nombre;
    private int altura;
    private double salud;
    private double poder;

    public Hada() {
    }

    public Hada(String nombre, int altura) {
        this.nombre = nombre;
        setAltura(altura);
    }

    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        while(altura > 15){
            altura = Integer.parseInt(JOptionPane.showInputDialog("La altura debe ser menor o igual a 15"));
            
        }
        this.altura = altura;
    }

    public double getSalud() {
        return salud;
    }

    public void setSalud(double salud) {
        this.salud = salud;
    }
    public void setSalud2(double salud){
        if(salud < 0){
            this.salud = 0;
        }
        else{
            this.salud = salud;
        }
    }
    public double getPoder() {
        return poder;
    }

    public void setPoder(double poder) {
        this.poder = poder;
    }
    
    
}
