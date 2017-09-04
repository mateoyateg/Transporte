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
public class Ruta {
    //Declarar variables
    private int dinero;
    private int tiempo;
    private int trayectos;
    
    //Setear & "gettear" datos
    public void setDinero(int dinero){
        this.dinero = dinero;
    }
    
    //Setear & "gettear" datos
    public int getDinero(){
        return dinero;
    }

    //Setear & "gettear" datos
    public void setTiempo(int tiempo) {
        this.tiempo = tiempo;
    }
    
    //Setear & "gettear" datos
    public int getTiempo() {
        return tiempo;
    }
    
    //Setear & "gettear" datos
    public void setTrayectos(int trayectos) {
        this.trayectos = trayectos;
    }

    //Setear & "gettear" datos
    public int getTrayectos() {
        return trayectos;
    }
  
    //Setear & "gettear" datos
    public void mostrarRuta() {
        //Iniciar objetos de cada tipo de transporte
        Transmilenio transmi = new Transmilenio();
        Metro met = new Metro();
        Caminar cam = new Caminar();
        Bicicleta bic = new Bicicleta ();
        
        //Ciclo que imprima trayectos
        for (int i = 1; i<= trayectos; i++){
            //Encabezado del trayecto
            System.out.println("Trayecto: " + i);
            
            //Condiciones determinar el tipo de transporte
            if (dinero <= 5000 && dinero > 0){
                
                //Si el tiempo es menor a 30, puede ser metro o transmilenio
                if (tiempo <= 30){
                    
                    //Si el dinero es mayor o igual a 2.200, el transporte es Transmilenio
                    if (dinero >= 2200){
                        transmi.mostrar();
                        dinero = dinero - 2200;
                        tiempo = tiempo - 30;
                    }
                        
                    //Si el dinero es menor a 2.200, el transporte es Metro                           
                    if (dinero < 2200){
                        met.mostrar();
                        dinero = dinero - 800;
                        tiempo = tiempo - 30;
                    }
                }
                
                //Si el tiempo es mayor a 30, puede ser caminata o bicicleta (sin contar dinero)
                if (tiempo > 30){
                    
                    //Si el tiempo es mayor a 50, el transporte sera caminata
                    if (tiempo >= 50){
                        cam.mostrar();    
                        tiempo = tiempo - 50;
                    }
                    
                    //Si el tiempo es menor a 50, el transporte sera bicicleta
                    if (tiempo < 50 && tiempo > 0){
                        bic.mostrar();
                        tiempo = tiempo - 30;
                    }
                }
            }

            //Si el dinero es menor a cero, debe ser caminata
            if (dinero <=0 ){
                cam.mostrar();
            }
                
            //Motivos esteticos
            System.out.println("");
        }
    }
}
    
    
    

