/* Copyright (C) 2017 Mateo Yate, Juan Ostos
 * Universidad Distrital Francisco José de Caldas - 2017
 * Programación Orientada a Objetos - Gr. 020-85
 * Prohibida la reproducción total o parcial de este código
 */

package transporte.logica;

import java.util.Random;
import java.util.Scanner;

/**
 * Simula los datos de un usuario y muestra la ruta generada en otra clase
 * @author Mateo Yate, Juan Ostos
 * @version 1.0 / 09.09.17
 * @see Ruta
 * @see Distancia
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
    
    //Settear y Gettear el Dinero
    public int getDinero() {
        return dinero;
    }
    
    //Settear y Gettear el Dinero
    public void setDinero(int dinero) {
        this.dinero = dinero;
    }
    
    //Settear y Gettear el Tiempo
    public int getTiempo() {
        return tiempo;
    }
    
    //Settear y Gettear el Tiempo
    public void setTiempo(int tiempo) {
        this.tiempo = tiempo;
    }
    
    //Settear y Gettear lso Trayectos
    public int getTrayectos() {
        return trayectos;
    }
    
    //Settear y Gettear lso Trayectos
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
