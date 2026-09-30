/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio5;

import java.util.Scanner;

/**
 *
 * @author espmi
 */
public class Ejercicio5 {

    /**
     * @param args the command line arguments
     * 
     * Ejercicio 05.- Implementa un algoritmo en JAVA que le pida
       al usuario un número por teclado. Posteriormente, el
       programa le dirá al usuario si el número introducido es par
       o impar.
     * 
     */
    public static void main(String[] args) {
        int num;
        
        Scanner input = new Scanner (System.in);
        
        System.out.println("Introduce un numero: ");
        num = input.nextInt();
        
        if (num % 2 == 0) {
            System.out.println("El numero "+num+" es par");
        } else {
            System.out.println("El numero "+num+" es impar");
        }
    }
    
}
