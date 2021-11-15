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
public class usomaquinas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        abstract class  usomaquina {
            String descripcion;
            public usomaquina (){
           descripcion="";
                  
   
            }
            public String damedescripcion(String descripcion){
                      return "la descripcion es"+descripcion;
                  }
            public void definedescripcion(String descripcion){
                this.descripcion=descripcion;
            }
    
   class robot extends usomaquina{
    public robot(){
        super();
        robot robot2=new robot();
        robot2.definedescripcion("hola");
        System.out.println(robot2.damedescripcion(descripcion));

        
                
        
    }
    
}
            
     
       
   
    
}
}

    
}


    
    

