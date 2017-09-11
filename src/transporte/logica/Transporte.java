/* Copyright (C) 2017 Mateo Yate, Juan Ostos
 * Universidad Distrital Francisco José de Caldas - 2017
 * Programación Orientada a Objetos - Gr. 020-85
 * Prohibida la reproducción total o parcial de este código
 */

package transporte.logica;

/**
 * Hace de padre heredando los metodos a los diferentes medios de transporte
 * @author Mateo Yate, Juan Ostos
 * @version 1.0 / 09.09.17
 * @see Bicicleta
 * @see Caminar
 * @see Metro
 * @see Taxi
 * @see Uber
 * @see Transmilenio
 */

public abstract class Transporte {
    
    //Atributo que hereda a todos los medios de transporte
    public abstract void mostrar();
    
}