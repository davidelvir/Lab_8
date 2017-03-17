/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab_8;

/**
 *
 * @author David
 */
public class Salamandras extends Hada{
    private int alas;

    public Salamandras() {
    }

    public Salamandras(int alas, String nombre, int altura) {
        super(nombre, altura);
        super.setSalud(683);
        super.setPoder(71);
        this.alas = alas;
    }

    public int getAlas() {
        return alas;
    }

    public void setAlas(int alas) {
        this.alas = alas;
    }
    
}
