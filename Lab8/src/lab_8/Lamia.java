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
public class Lamia extends Hada{
    private int aletas;
    private int braqueas;

    public Lamia() {
    }

    public Lamia(int aletas, int braqueas, String nombre, int altura) {
        super(nombre, altura);
        super.setSalud(475);
        super.setPoder(57);
        this.aletas = aletas;
        this.braqueas = braqueas;
    }

    public int getAletas() {
        return aletas;
    }

    public void setAletas(int aletas) {
        this.aletas = aletas;
    }

    public int getBraqueas() {
        return braqueas;
    }

    public void setBraqueas(int braqueas) {
        this.braqueas = braqueas;
    }
    
    
    
}
