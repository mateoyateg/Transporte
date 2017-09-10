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
  
    
    public void mostrarRuta() {
        //Iniciar objetos de cada tipo de transporte
        int cont = 0;
        Transmilenio transmi = new Transmilenio();
        Metro met = new Metro();
        Caminar cam = new Caminar();
        Bicicleta bic = new Bicicleta ();
        Uber ube = new Uber ();
        Taxi tax = new Taxi();
        
        System.out.println("Ruta a seguir:");
        System.out.println("");
        System.out.println("Nota: Pueden aparecer varios medios de transporte");
        
        //Ciclo que imprima trayectos
        for (int i = 1; i<= trayectos; i++){
            //Encabezado del trayecto
            System.out.println("Trayecto: " + i);
            
            if (tiempo == 0){
                System.out.println("No existe desplazamiento para 0 minutos");
                break;
            }
            
            
            
            //[5000,inf)
            if (dinero >= 5000 && tiempo >= 4 ){
                ube.mostrar();          
                
                if (dinero >= 9000){
                    tax.mostrar();
                    
                    cont ++;
                }
                
                
                if (cont == 0){
                    dinero = dinero - 5000;
                }
                
                else {
                   dinero = dinero - 9000; 
                }
                
                tiempo = tiempo - 30;
                
                                
                break;
                
            }
            
            
            if (tiempo < 4 && tiempo > 0 && cont == 0){
                System.out.println("Usted no dispone de tiempo suficiente");
                break;
            }
                
            
            //Condiciones determinar el tipo de transporte
            
            //[800,5000)
            if (dinero < 5000 && dinero >= 800){
                
                
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
            
            if (dinero < 800 && tiempo < 0){
                cam.mostrar();
            }

            //Si el dinero es menor a cero, debe ser caminata
            if (dinero < 800 && tiempo > 0 ){
                cam.mostrar();
            }
                
            //Motivos esteticos
            System.out.println("");
        }
    }
}
    
    
    

