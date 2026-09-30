/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio9;

import java.util.Scanner;

/**
 *
 * @author espmi
 */
public class Ejercicio9 {

    /**
     * @param args the command line arguments
     * 
     * Ejercicio 09.- Escribe un programa en JAVA en el que el usuario
       introduzca cuatro números enteros y luego el programa los muestre
       por pantalla ordenados de forma creciente.(de menor a mayor)
     
     * • Muestra por pantalla el resultado de la siguiente forma:
       Por favor, introduzca el primer numero: 8
       Ahora, introduzca un segundo numero: 5
       Introduzca el tercer numero: 9
       Por último, introduzca un cuarto numero: 1
       El orden de los números introducidos es el 1 - 5 - 8 - 9
     * 
     */
    public static void main(String[] args) {
        
        int num1,num2,num3,num4,caja;
        
        Scanner input = new Scanner (System.in);
        
        System.out.println("Por favor, introduzca el primer numero: ");
        num1 = input.nextInt();
        
        System.out.println("Por favor, introduzca el segundo numero: ");
        num2 = input.nextInt();
        
        System.out.println("Por favor, introduzca el tercer numero: ");
        num2 = input.nextInt();
        
        System.out.println("Por ultimo, introduzca el cuarto numero: ");
        num2 = input.nextInt();
        
        // 1 - 5 - 8 - 9
        
        if (num2 > num1) {
            num2 = caja;
            num2 
            
        }
        
        
        
    }
    
}
