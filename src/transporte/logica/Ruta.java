/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package transporte.logica;

import java.util.ArrayList;


/**
 *
 * @author Mateo
 */
public class Ruta {
    public ArrayList<Transporte> transportes;
    
    private int dinero;
    private int tiempo;
    private int trayectos;
              
    public void setDinero(int dinero){
        this.dinero = dinero;
    }
    
    public int getDinero(){
        return dinero;
    }

    public void setTiempo(int tiempo) {
        this.tiempo = tiempo;
    }

    public int getTiempo() {
        return tiempo;
    }

    public void setTrayectos(int trayectos) {
        this.trayectos = trayectos;
    }

    public int getTrayectos() {
        return trayectos;
    }
    
    
    
       
    
       
    public Ruta (){
        this.transportes = new ArrayList<>();
    }
    
    /**
     *
     * @return
     */
    
}
