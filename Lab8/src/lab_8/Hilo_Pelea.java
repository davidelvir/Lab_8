/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab_8;

import javax.swing.JProgressBar;

/**
 *
 * @author David
 */
public class Hilo_Pelea extends Thread{
    private Hada h1;
    private Hada h2;
    private JProgressBar pb1;
    private JProgressBar pb2;
    private boolean vive;
    private int turno;

    public Hilo_Pelea(Hada h1, Hada h2) {
        vive = true;
        this.h1 = h1;
        this.h2 = h2;
    }
    
    
    public void run(){
        turno = 1;
        while(vive){
            while(vive){
                if (turno == 1) {
                    if (h1 instanceof Salamandras && h2 instanceof Hamadriades) {
                        h2.setSalud2(h2.getSalud() - (h1.getPoder() + (h1.getPoder() * 0.37)));
                        if(h2.getSalud()==0){
                            vive = false;
                        }
                        turno = 2;
                    }

                    if ((h1 instanceof Silfides || h1 instanceof Lamia) && h2 instanceof Salamandras) {
                        if (h1 instanceof Silfides) {
                            h2.setSalud2(h2.getSalud() - (h1.getPoder() + (h1.getPoder() * 0.37)));
                            if(h2.getSalud()==0){
                            vive = false;
                        }
                            turno = 2;
                        }
                        if (h1 instanceof Lamia) {
                            h2.setSalud2(h2.getSalud() - (h1.getPoder() + (h1.getPoder() * 0.42)));
                            if(h2.getSalud()==0){
                            vive = false;
                        }
                            turno = 2;
                        }
                    }
                    else{
                        h2.setSalud2(h2.getSalud()-h1.getPoder());
                        if(h2.getSalud()==0){
                            vive = false;
                        }
                        turno = 2;
                    }
                }
                if(turno == 2){
                    if ((h2 instanceof Silfides || h2 instanceof Lamia) && h1 instanceof Salamandras) {
                        if (h1 instanceof Silfides) {
                            h1.setSalud2(h1.getSalud() - (h2.getPoder() + (h2.getPoder() * 0.37)));
                            if(h1.getSalud()==0){
                                vive = false;
                            }
                            turno = 1;
                        }
                        if (h1 instanceof Lamia) {
                            h1.setSalud2(h1.getSalud() - (h2.getPoder() + (h2.getPoder() * 0.42)));
                            if(h1.getSalud()==0){
                                vive = false;
                            }
                            turno = 1;
                        }
                    }
                    if (h2 instanceof Salamandras && h1 instanceof Hamadriades) {
                        h1.setSalud2(h1.getSalud() - (h2.getPoder() + (h2.getPoder() * 0.37)));
                        if(h1.getSalud()==0){
                                vive = false;
                            }
                        turno = 1;
                    }
                    else{
                        h1.setSalud2(h1.getSalud()-h2.getPoder());
                        if(h1.getSalud()==0){
                                vive = false;
                            }
                        turno = 1;
                    }
                    System.out.println(h1.getSalud());
                    System.out.println(h2.getSalud());
                }
            }
        }
    }
}
