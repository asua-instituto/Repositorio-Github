/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio4;

import java.util.Scanner;

/**
 *
 * @author espmi
 */
public class Ejercicio4 {

    /**
     * @param args the command line arguments
     * 
     * Ejercicio 04.- Escribir un algoritmo en JAVA que pida tres
       números e imprima por pantalla el menor de ellos.
     * 
     */
    public static void main(String[] args) {
        
        int num1, num2, num3, menor;
        
        Scanner input = new Scanner (System.in);
        
        System.out.println("Introduce el primer valor: ");
        num1 = input.nextInt();
        System.out.println("Introduce el Segundo valor: ");
        num2 = input.nextInt();
        System.out.println("Introduce el Tercer valor: ");
        num3 = input.nextInt();
        
        if (num1 <= num2 && num1 <= num3) {
            menor = num1;
        } else if (num2 <= num1 && num2 <= num3) {
            menor = num2;
        } else {
            menor = num3;
        }
        
        System.out.println("El valor menor introducido es: "+menor);
        
    }
    
}
