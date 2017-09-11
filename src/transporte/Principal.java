/* Copyright (C) 2017 Mateo Yate, Juan Ostos
 * Universidad Distrital Francisco José de Caldas - 2017
 * Programación Orientada a Objetos - Gr. 020-85
 * Prohibida la reproducción total o parcial de este código
 */

package transporte;

import java.util.Random;
import java.util.Scanner;
import transporte.logica.Usuario;

/**
 * Desde esta clase se ejecuta el programa
 * @author Mateo Yate, Juan Ostos
 * @version 1.0 / 09.09.17
 * @see Usuario
 */

public class Principal {

    /**
     * Metodo donde se piden los datos, se setean y se muestran resultados
     * @param args the command line arguments
     * 
     */
    
    public static void main(String[] args) {
        //Declarar scanner & objetos de ruta y distancia
        Scanner sc = new Scanner (System.in);
        Usuario u = new Usuario();
        Random rn = new Random ();
        
        //Declarar variables privadas
        int dinero;
        int tiempo;
        
        //Mensaje de bienvenida
        u.bienvenida();
        
        //"Setear" la distancia
        u.setDistancia();
        
        //Pedir cantidad de Dinero al usuario
        System.out.print("Ingrese el dinero: ");
        dinero = sc.nextInt();
        
        //Si el dinero es negativo, pedir de nuevo
        while (dinero < 0){
            System.out.print("Ingrese una cantidad de dinero valida: ");
            dinero = sc.nextInt();
        }
        
        //"Setear" dinero
        u.setDinero(dinero);
        
        //Pedir cantidad de Tiempo al usuario
        System.out.print("Ingrese el tiempo: ");
        tiempo = sc.nextInt();
        
        //Si el tiempo es negativo, pedir de nuevo
        while (tiempo < 0){
            System.out.print("Ingrese una cantidad de tiempo valida: ");
            tiempo = sc.nextInt();
        }
        
        //"Setear" tiempo
        u.setTiempo(tiempo);
        
        //Establecer trayectos (aleatorios)
        u.setTrayectos(rn.nextInt(5) + 1);
        
        //Pasar datos de Usuario a Ruta
        u.pasarDatos();
        
        //Mostrar ruta a seguir
        u.mostrarResultados();
    }
    
}