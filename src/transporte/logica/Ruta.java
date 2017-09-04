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
          
    public void mostrarRuta() {
        
        Transmilenio transmi = new Transmilenio();
        Metro met = new Metro();
        Caminar cam = new Caminar();
        Bicicleta bic = new Bicicleta ();
        
        
        
               
            for (int i = 1; i<= trayectos; i++){
                System.out.println("Trayecto: " + i);
                
                if (dinero <= 5000 && dinero > 0){
                    
                    if (tiempo <= 30){
                                                
                        if (dinero >= 2200){
                            transmi.mostrar();
                            dinero = dinero - 2200;
                            tiempo = tiempo - 30;
                        }
                        
                                               
                        if (dinero < 2200){
                            met.mostrar();
                            dinero = dinero - 800;
                            tiempo = tiempo - 30;
                        }
                    }
                    
                    if (tiempo > 30){
                        if (tiempo >= 50){
                            cam.mostrar();    
                            tiempo = tiempo - 50;
                            
                        }
                        
                        if (tiempo < 50 && tiempo > 0){
                            bic.mostrar();
                            tiempo = tiempo - 30;
                            
                        }
                    }
                }
                
                if (dinero <=0 ){
                    cam.mostrar();
                }
                
                System.out.println("");
                
            }
            
            
    }
                                    
        
        
        
        
        
        
        
        
    }
    
    
    

