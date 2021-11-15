/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package POO;

/**
 
la clase robot es la clase principal, la clase maquina es un modulo independiente y posee sus propias funciones 
 */
public class robot {
    //metodo constructor principal
   private int kwenergia, motor, peso, pesofinal;
    public robot(){
    kwenergia=1000;
    motor=23;
    peso=20;
    
    } 
    // aqui tenemos un metodo que es el encargado de modificar el valor del peso final,
    //si se tuviera mas metodos seria ideal crear otra interfaz para no forzar tanto la clase
 
    //el quinto principio indica que se deben crear clases con independencias estrictas, en este caso
    //vemos que cada clase tiene su propio metodo y no dependen una de otra
public void pesofinal (int peso_final) {
    pesofinal=peso_final;
} 
public String damepesofinal (){
    return "el peso final es "+ pesofinal;
}
 }

class maquina{
 private  int kwenergia, motor, peso, costo;
    String marca;
public maquina(){
    kwenergia=1000;
    motor=100;
    peso=20;
    marca="siemens";
    
    
}
public void modificacosto(int costo){
    this.costo=costo;
}
public String damecosto(){
    return "el costo de la maquina es "+ costo;
}
}


