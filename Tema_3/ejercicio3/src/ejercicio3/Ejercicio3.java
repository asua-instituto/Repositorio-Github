/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio3;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Ejercicio3 {

    /**
     * @param args the command line arguments
     * 
     * Ejercicio 03.- Diseña un programa en JAVA que lea tres números e
       imprima por pantalla el mayor de ellos.
       
     * • Muestra por pantalla el resultado de la siguiente forma:
       Por favor, introduzca el primer numero: xxx
       Ahora, introduzca un segundo numero: xxx
       Por último, introduzca un tercer numero: xxx
       El número mayor de los introducidos es el xxx
     * 
     */
    public static void main(String[] args) {
        
        int num1, num2, num3;
        
        Scanner input = new Scanner (System.in);
        
        System.out.println("Por favor, introduzca el primer numero: ");
        num1 = input.nextInt();
        
        System.out.println("Por favor, introduzca el segundo numero: ");
        num2 = input.nextInt();
        
        System.out.println("Por favor, introduzca el tercer numero: ");
        num3 = input.nextInt();
        
        if (num1 > num2 && num2 < num3){
            
        }
            
    }
    
}
