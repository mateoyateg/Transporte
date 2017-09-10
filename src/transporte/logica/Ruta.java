/* Copyright (C) 2017 Mateo Yate & Juan Ostos
 * Universidad Distrital Francisco José de Caldas - 2017
 * Programación Orientada a Objetos - Gr. 020-85
 * Prohibida la reproducción total o parcial de este código
 */

package transporte.logica;

/**
 *
 * @author Mateo Yate & Juan Ostos
 * @version 1.0 / 09.09.17
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
  
    
    public void mostrarRuta() {
        
        //Iniciar objetos de cada tipo de transporte
        Transmilenio transmi = new Transmilenio ();
        Metro met = new Metro ();
        Caminar cam = new Caminar ();
        Bicicleta bic = new Bicicleta ();
        Uber uber = new Uber ();
        Taxi tax = new Taxi ();
        
        //Iniciar variables
        int cont = 0;
        
        //Cabezilla del mensaje
        System.out.println("Nota: Pueden aparecer varios medios de transporte");
        System.out.println("");
        System.out.println("Ruta a seguir:");
        
        //Ciclo que imprima trayectos
        for (int i = 1; i <= trayectos; i++){
            
            //Encabezado del trayecto
            System.out.println("Trayecto: " + i);
            
            //Condicion para cuando el dinero es igual a 0
            if (tiempo == 0){
                System.out.println("No existe desplazamiento para 0 minutos");
                break;
            }
            
            //Dinero en el rango de [5000,inf) & tiempo en [4,inf)
            if ((dinero >= 5000) && (tiempo >= 4)){
                uber.mostrar();          
                
                //Si el dinero es mayor a 9000, mostrar mensaje del taxi
                if (dinero >= 9000){
                    tax.mostrar();
                    cont ++;
                }
                
                //Si el contador esta en 0, ya que se mostro solo Uber, restar 5000
                if (cont == 0){
                    dinero = dinero - 5000;
                } else {
                    dinero = dinero - 9000; 
                }
                
                //Restar tiempo en cualquier caso
                tiempo = tiempo - 30;
                
                break;
                
            }
            
            //Si el tiempo esta entre (0,4) & el contador no ha aumentado
            if ((tiempo < 4) && (tiempo > 0) && (cont == 0)){
                System.out.println("Usted no dispone de tiempo suficiente");
                break;
            }
            
            //Si el dinero esta entre [800,5000)
            if ((dinero < 5000) && (dinero >= 800)){
                
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
                        tiempo = tiempo - 49;
                        cont ++;
                    }
                    
                    //Si el tiempo es menor a 50, el transporte sera bicicleta
                    if ((tiempo < 50) && (tiempo > 0)){
                        bic.mostrar();
                        tiempo = tiempo - 29;
                        cont ++;
                    }
                }
            }
            
            //Si el dinero es menor a 800 & el tiempo es menor a 0, debe ser caminata
            if ((dinero < 800) && (tiempo < 0)){
                cam.mostrar();
            }

            //Si el dinero es menor a cero, debe ser caminata
            if ((dinero < 800) && (tiempo > 0)){
                cam.mostrar();
            }
                
            //Motivos esteticos
            System.out.println("");
        }
        
    }
    
}