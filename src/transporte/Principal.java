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
        Scanner sc = new Scanner (System.in);
        Random rn = new Random ();
        Ruta r = new Ruta();
        Distancia d = new Distancia();
        
        //Mensaje de bienvenida
        System.out.println('\t' + "...CALCULA TU RUTA...");
        System.out.println("");
        
        //Pedir calles y carreras
        System.out.print("N° de Calle de partida: ");
        d.setX1(sc.nextInt());
        System.out.print("N° de Carrera de partida (numero): ");
        d.setY1(sc.nextInt());
        System.out.print("N° de Calle de destino: ");
        d.setX2(sc.nextInt());
        System.out.print("N° de Carrera de destino: ");
        d.setY2(sc.nextInt());
        System.out.println("");
        
        //Generar numero de transbordos
        //r.setTrayectos(rn.nextInt(5));
        
        r.setTrayectos(3);
                        
        //Pedir tiempo disponible
        int tiempo;
        System.out.print("Ingrese el tiempo (en minutos): ");
        tiempo = sc.nextInt();
        
        while (tiempo < 0){
            System.out.print("Ingrese un tiempo valido: ");
            tiempo = sc.nextInt();
        }
        
        r.setTiempo(tiempo);
        
        //Pedir dinero disponible
        int dinero;
        System.out.print("Ingrese el dinero: ");
        dinero = sc.nextInt();
        
        while (dinero < 0){
            System.out.print("Ingrese una cantidad de dinero valida: ");
            dinero = sc.nextInt();
        }
        
        r.setDinero(dinero);
        
        System.out.println("");
        
        //Mostrar puntos y distancias
        d.mostrarPuntos();
        d.mostrarDistancia();
        
        //Mostrar datos
        System.out.println("");
        System.out.println("Nota: Pueden aparecer varios medios de transporte");
        
        //Motivos esteticos
        System.out.println("");
        
        //Mostrar ruta a seguir
        System.out.println("Ruta a seguir:");
        r.mostrarRuta();
    }
    
}
