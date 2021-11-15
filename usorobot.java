/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package POO;

/**
 *
 * @author 57311
 */
public class usorobot {

    /**
    el segundo principio consiste en que si puedo instanciar las funciones o metodos de otra clase,
    * mas no modificar la clase, en este caso vemos que la clase licuadora hereda de la clase maquina sus metodos y funciones, la manera 
    * como JAVA permite modificar las propiedades es a traves de un canal especial.
    * 
    *
     */
    public static void main(String[] args) {
       
       robot robot1=new robot();
       maquina maquina1=new maquina();
      licuadora licuadora1=new licuadora();
      
      robot1.pesofinal(5000);

       System.out.println(robot1.damepesofinal());
       System.out.println(maquina1.marca);
       System.out.println(licuadora1.motor);
      



    }
    
}
