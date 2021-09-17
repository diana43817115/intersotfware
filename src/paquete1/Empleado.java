/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete1;

/**
 *
 * @author ADMIN
 */
public class Empleado {
    
    //Atributos=Datos=Variables
    public String nombre;
    public  int cedula;
    public int salario;
    public String direccion;
    
    //Metodos = acciones = funciones

    public Empleado() {
    }

    public Empleado(String nombre) {
        this.nombre = nombre;
    }

    public Empleado(String nombre, int cedula, int salario, String direccion) {
        this.nombre = nombre;
        this.cedula = cedula;
        this.salario = salario;
        this.direccion = direccion;
    }
    
    
    
    
}
