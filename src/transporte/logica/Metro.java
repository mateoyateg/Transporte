/* Copyright (C) 2017 Mateo Yate, Juan Ostos
 * Universidad Distrital Francisco José de Caldas - 2017
 * Programación Orientada a Objetos - Gr. 020-85
 * Prohibida la reproducción total o parcial de este código
 */

package transporte.logica;

/**
 * Simula el metodo de transporte "metro"
 * @author Mateo Yate, Juan Ostos
 * @version 1.0 / 09.09.17
 * @see Ruta
 */

public class Metro extends Transporte {
    
    //Mensaje de uso
    @Override
    public void mostrar() {
        System.out.println("- Use el metro");
    }
    
}
