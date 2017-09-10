/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package transporte.logica;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Estudiantes
 */
public class Usuario {
    Ruta r = new Ruta();
    Distancia d = new Distancia();
    Scanner sc = new Scanner (System.in);
    Random rn = new Random ();
    
    private int dinero;
    private int tiempo;
    private int trayectos;

    public int getTrayectos() {
        return trayectos;
    }

    public void setTrayectos(int trayectos) {
        this.trayectos = trayectos;
    }
    
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
    
    public void pasarDatos(){
        r.setTrayectos(trayectos);
        r.setDinero(dinero);
        r.setTiempo(tiempo);
    }
    
    public void bienvenida(){
        System.out.println('\t' + "...CALCULA TU RUTA...");
        System.out.println("");
    }

    public void setDistancia() {
        System.out.print("N° de Calle de partida: ");
        d.setX1(sc.nextInt());
        System.out.print("N° de Carrera de partida (numero): ");
        d.setY1(sc.nextInt());
        System.out.print("N° de Calle de destino: ");
        d.setX2(sc.nextInt());
        System.out.print("N° de Carrera de destino: ");
        d.setY2(sc.nextInt());
        System.out.println("");
    }
    
    public void mostrarResultados (){
        d.mostrarDistancia();
        d.mostrarPuntos();
        r.mostrarRuta();        
    }

}
