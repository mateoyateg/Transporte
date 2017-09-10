/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package transporte;

import java.util.Random;
import java.util.Scanner;
import transporte.logica.Usuario;
/**
 *
 * @author Mateo Yate & Juan Ostos
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        //Declarar scanner & objetos de ruta y distancia
        Scanner sc = new Scanner (System.in);
        Usuario u = new Usuario();
        Random rn = new Random ();
        
        //Mensaje de bienvenida
        u.bienvenida();
        
        //"Setear" la distancia
        u.setDistancia();
        
        //"Setear" dinero
        System.out.print("Ingrese el dinero: ");
        u.setDinero(sc.nextInt());
        
        //"Setear" tiempo
        System.out.print("Ingrese el tiempo: ");
        u.setTiempo(sc.nextInt());
        
        //Establecer trayectos (aleatorios)
        u.setTrayectos(rn.nextInt(5) + 1);
        
        //Pasar datos de Usuario a Ruta
        u.pasarDatos();
        
        //Mostrar ruta a seguir
        u.mostrarResultados();
    }
    
}
