/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package intersotware;

import paquete1.Empleado;

/**
 *
 * @author ADMIN
 */
public class Intersotware {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // TODO code application logic here
        int edad = 50;
        //yo necesito usar mi clase para usar mi clase necesito :
        // crear un objeto
        Empleado empleado = new Empleado();
        
        System.out.println("Nombre : "+empleado.nombre);
        empleado.nombre="Pedro Coral";
        System.out.println("Nombre : "+empleado.nombre);        
        empleado.cedula=618840;
        System.out.println("Cedula : "+empleado.cedula);
        
        Empleado pachito = new Empleado("Pacho");        
        System.out.println("Nombre : "+pachito.nombre);
        
        Empleado objeto3=new Empleado("juan",438171155,4000000,"Calle");
      
        
    }
    
}
