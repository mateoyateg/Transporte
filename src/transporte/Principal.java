/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package transporte;
import java.util.Scanner;
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
        
        
        System.out.println("Calcula tu ruta...");
        System.out.print("Ingrese la cantidad de paradas/trasbordos a realizar: ");
        int num = sc.nextInt();
        
        
        
        System.out.print("Ingrese el tiempo (en minutos): ");
        int tiempo = sc.nextInt();
        
        System.out.print("Ingrese el dinero: ");
        float dinero = sc.nextFloat();
        
            
        for (int i = num; i>0; i--){
            System.out.println("Trayecto" + i);
            if ()
        }
        
        
    }
    
}
