/* Copyright (C) 2017 Mateo Yate & Juan Ostos
 * Universidad Distrital Francisco José de Caldas - 2017
 * Programación Orientada a Objetos - Gr. 020-85
 * Prohibida la reproducción total o parcial de este código
 */

package transporte.logica;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Mateo Yate & Juan Ostos
 * @version 1.0 / 09.09.17
 */

public class Usuario {
    
    //Declarar objetos
    Ruta r = new Ruta();
    Distancia d = new Distancia();
    Scanner sc = new Scanner (System.in);
    Random rn = new Random ();
    
    //Declarar variables privadas
    private int dinero;
    private int tiempo;
    private int trayectos;
    
    public int getDinero() {
        return dinero;
    }

    public void setDinero(int dinero) {
        this.dinero = dinero;
    }
    
    public int getTiempo() {
        return tiempo;
    }
    
    public void setTiempo(int tiempo) {
        this.tiempo = tiempo;
    }
    
    public int getTrayectos() {
        return trayectos;
    }
    
    public void setTrayectos(int trayectos) {
        this.trayectos = trayectos;
    }
    
    //Pasar datos, de Usuario a Ruta
    public void pasarDatos(){
        r.setTrayectos(trayectos);
        r.setDinero(dinero);
        r.setTiempo(tiempo);
    }
    
    //Metodo del mensaje de bienvenida
    public void bienvenida(){
        System.out.println('\t' + "...CALCULA TU RUTA...");
        System.out.println("");
    }
    
    //Establecer datos de distancia
    public void setDistancia() {
        System.out.print("N° de Calle de partida:   ");
        d.setX1(sc.nextInt());
        
        System.out.print("N° de Carrera de partida: ");
        d.setY1(sc.nextInt());
        
        System.out.print("N° de Calle de destino:   ");
        d.setX2(sc.nextInt());
        
        System.out.print("N° de Carrera de destino: ");
        d.setY2(sc.nextInt());
        
        System.out.println("");
    }
    
    //Metodo de mostrar los resultados (Rutas & Distancias)
    public void mostrarResultados (){
        d.mostrarDistancia();
        d.mostrarPuntos();
        r.mostrarRuta();        
    }
    
}
