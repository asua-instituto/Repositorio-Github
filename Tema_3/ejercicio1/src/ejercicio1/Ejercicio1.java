/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio1;

import java.util.Scanner;


 /**
 *
 * @author alumno
 */
public class Ejercicio1 {

    /**
     * @param args the command line arguments
     * 
     * Ejercicio 01.- Implementa un algoritmo en JAVA que le pida al usuario
        un número por teclado. Posteriormente el programa le dirá al usuario
        si el número introducido es positivo o negativo.
    * 
        • Muestra por pantalla el resultado de la siguiente forma:
        Por favor, introduzca un numero: xxx
        El número introducido es positivo o negativo
     * 
     * 
     */
    public static void main(String[] args) {
        
        System.out.println("Por favor introduce el numero: ");
        
        double num1;
        
        Scanner entrada = new  Scanner (System.in);
        num1 = entrada.nextDouble ();
        
        System.out.println ("\nEl numero que haz puesto es: "+(int)num1);
        
        if (num1 < 0) {
            System.out.println("\nEs numero introducido es negativo");
        } else {
            System.out.println("\nEl numero introducido es positivo");
        }
    }
    
}
