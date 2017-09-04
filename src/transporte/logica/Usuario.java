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
    private int distancia;
    

    

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

    public void setDinero() {
        System.out.print("Ingrese el dinero: ");
        this.dinero = sc.nextInt();
        
        while (dinero < 0){
            System.out.print("Ingrese una cantidad de dinero valida: ");
            this.dinero = sc.nextInt();
        }
        
        r.setDinero(dinero);
        
    }

    public void setTiempo() {
        System.out.print("Ingrese el tiempo (en minutos): ");
        this.tiempo = sc.nextInt();
        
        while (tiempo < 0){
            System.out.print("Ingrese un tiempo valido: ");
            this.tiempo = sc.nextInt();
        }
        
        r.setTiempo(tiempo);
       
    }
    
    public void mostrarRuta (){
        d.mostrarPuntos();
        d.mostrarDistancia();
        r.mostrarRuta();
    }
    
    int aleatorio = rn.nextInt(4) + 1;
    
    
}
