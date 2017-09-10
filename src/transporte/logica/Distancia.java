/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package transporte.logica;

/**
 *
 * @author Mateo
 */
public class Distancia {
    //Declarar variables
    private int x1;
    private int y1;
    private int x2;
    private int y2;
    
    //Setear & "gettear" datos
    public int getX1() {
        return x1;
    }
    
    //Setear & "gettear" datos
    public void setX1(int x1) {
        this.x1 = x1;
    }
    
    //Setear & "gettear" datos
    public int getY1() {
        return y1;
    }
    
    //Setear & "gettear" datos
    public void setY1(int y1) {
        this.y1 = y1;
    }
    
    //Setear & "gettear" datos
    public int getX2() {
        return x2;
    }

    //Setear & "gettear" datos
    public void setX2(int x2) {
        this.x2 = x2;
    }
    
    //Setear & "gettear" datos
    public int getY2() {
        return y2;
    }
    
    //Setear & "gettear" datos
    public void setY2(int y2) {
        this.y2 = y2;
    }
    
    //Mostrar distancia entre puntos
    public void mostrarDistancia(){
        float distancia;
        distancia = (float) (Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2)));
        System.out.println("La distancia entre los puntos es: " + distancia + " Unidades");
    }
    
    //Mostrar puntos como calles y carreras
    public void mostrarPuntos(){
        System.out.println("");
        System.out.println("La direccion de partida es: Calle " + x1 + " con Carrera " + y1);
        System.out.println("La direccion de llegada es: Calle " + x2 + " con Carrera " + y2);
        System.out.println("");
    }
    
    
}
