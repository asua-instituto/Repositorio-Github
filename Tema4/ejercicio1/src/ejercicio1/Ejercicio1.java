/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio1;

import java.util.Scanner;

/**
 *
 * @author espmi
 */
public class Ejercicio1 {

    /**
     * @param args the command line arguments
     * 
     * Ejercicio 01.- Realiza un programa en JAVA en el cual se le
        pide al usuario (en el main) un número por teclado. Luego se
        llamará a un método que pasándole número introducido por
        el usuario, nos dirá si el número introducido es positivo o
        negativo.
     * 
        • Muestra por pantalla el resultado de la siguiente forma:
        Por favor, introduzca un numero: xxx
        El número introducido es positivo o negativo
     */
    
    /**
     * Pedimos al usuario un valor
     * @return Nos lo devuelve
     */
        public static int pedirNumero (){
            Scanner input = new Scanner (System.in);
            System.out.println("Por favor, introduzca un numero: ");
            return input.nextInt();
    }
        
    public static void main(String[] args) {
        
        int dato;
        
        dato = pedirNumero();
       
        if(dato > 0){
            System.out.println("Es un numero es: [Positivo]");
        } else {
            System.out.println("Es un numero es :[Negativo]");
        }
        

    }
    
}
