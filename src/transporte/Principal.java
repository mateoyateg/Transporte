/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package transporte;
import java.util.Scanner;
import transporte.logica.Ruta;
/**
 *
 * @author Mateo
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        Ruta r = new Ruta();
        
        
        System.out.println('\t' + "...CALCULA TU RUTA...");
        System.out.println("");
        
        System.out.print("Ingrese la cantidad de paradas/trasbordos a realizar: ");
        r.setTrayectos(sc.nextInt());
                        
        System.out.print("Ingrese el tiempo (en minutos): ");
        r.setTiempo(sc.nextInt());
                
        System.out.print("Ingrese el dinero: ");
        r.setDinero(sc.nextInt());
        System.out.println("");
        
        System.out.println("Nota: Pueden aparecer varios medios de transporte");
        
        System.out.println("");
        
        System.out.println("Ruta a seguir:");
        
        r.mostrarRuta();
    }
    
}
