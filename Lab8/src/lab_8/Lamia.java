/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab_8;

import javax.swing.JOptionPane;

/**
 *
 * @author David
 */
public class Lamia extends Hada{
    private int aletas;
    private int braqueas;

    public Lamia() {
    }

    public Lamia(int aletas, int braqueas, String nombre, int altura) {
        super(nombre, altura);
        super.setSalud(475);
        super.setPoder(57);
        setAletas(aletas);
        setBraqueas(braqueas);
    }

    public int getAletas() {
        return aletas;
    }

    public void setAletas(int aletas) {
        while(aletas > 5){
            aletas = Integer.parseInt(JOptionPane.showInputDialog("La longitud debe ser menor a 5"));
        }
        this.aletas = aletas;
    }

    public int getBraqueas() {
        return braqueas;
    }

    public void setBraqueas(int braqueas) {
        while(braqueas > 8){
            braqueas = Integer.parseInt(JOptionPane.showInputDialog("No pueden haber mas de 8 braqueas"));
        }
        this.braqueas = braqueas;
    }
    
    
    
}
