/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package transporte;
import java.util.Random;
import java.util.Scanner;
import transporte.logica.Distancia;
import transporte.logica.Ruta;
import transporte.logica.Usuario;
/**
 *
 * @author Mateo
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        //Declarar scanner & objetos de ruta y distancia
        Usuario u = new Usuario();
        
        //Mensaje de bienvenida
        System.out.println('\t' + "...CALCULA TU RUTA...");
        System.out.println("");
        
        
        
        
        System.out.println("");
        
        //Mostrar puntos y distancias
       
        u.setDistancia();
        u.setDinero();
        u.setTiempo();
        
        
        //Mostrar datos
        System.out.println("");
        System.out.println("Nota: Pueden aparecer varios medios de transporte");
        
        //Motivos esteticos
        System.out.println("");
        
        //Mostrar ruta a seguir
        System.out.println("Ruta a seguir:");
        u.mostrarRuta();
    }
    
}
