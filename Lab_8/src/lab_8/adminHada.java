/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab_8;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

/**
 *
 * @author David
 */
public class adminHada {
    private ArrayList<Hada>listaHadas = new ArrayList();
    private File archivo = null;
    
    public adminHada(String path){
        archivo = new File(path);
    }

    public ArrayList<Hada> getListaHadas() {
        return listaHadas;
    }

    public void setListaHadas(ArrayList<Hada> listaHadas) {
        this.listaHadas = listaHadas;
    }

    public File getArchivo() {
        return archivo;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }
    public void setHada(Hada a){
        listaHadas.add(a);
    }
    public void cargarArchivo(){
        try {
            listaHadas = new ArrayList();
            Hada temp;
            if(archivo.exists()){
                FileInputStream entrada = new FileInputStream(archivo);
                ObjectInputStream objeto = new ObjectInputStream(entrada);
                try {
                    while((temp = (Hada)objeto.readObject())!=null){
                        listaHadas.add(temp);
                    }
                } catch (EOFException e) {
                }
                objeto.close();
                entrada.close();
            }
            
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
    public void escribirArchivo(){
        FileOutputStream fw = null;
        ObjectOutputStream bw = null;
        try {
            fw = new FileOutputStream(archivo);
            bw = new ObjectOutputStream(fw);
            for(Hada t : listaHadas){
                bw.writeObject(t);
            }
            bw.flush();
        } catch (Exception e) {
        }finally{
            try {
                bw.close();
                fw.close();
            } catch (Exception ex) {
            }
        }
    }
}
