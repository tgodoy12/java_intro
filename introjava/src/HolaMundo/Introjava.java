/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HolaMundo;

import java.util.Scanner;

/**
 *
 * @author aobakun
 */
public class Introjava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         //Se instancia "leer" de la clase scanner, y se llama a la función que ésta posee de leer por teclado "System.in"
        Scanner leer = new Scanner(System.in);
        
        //Se define la variable "nombre" de tipo String 
        String nombre;
       
        //Se imprime por pantalla
        System.out.println("Ingrese su nombre");
       
        /** Se llama la variable "leer" instanciada anteriormente para definir el valor de la variable "nombre"
         * next es un método que su resultado se asignará a la variable 
         */
        nombre = leer.next();
        
        //Se imprime por pantalla el siguiente mensaje + el valor de la variable asignada a "nombre"
        System.out.println("¡Hola mundo! Mi nombre es " + nombre + " y estoy creando mi primer programa en Java");
    }
    
}
