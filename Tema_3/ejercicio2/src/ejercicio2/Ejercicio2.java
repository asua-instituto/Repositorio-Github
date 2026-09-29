/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio2;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Ejercicio2 {

    /**
     * @param args the command line arguments
     * 
     * Ejercicio 02.- Realiza un programa en el que le solicites al usuario 2
       números y, si el primer número introducido es mayor que 10, se
       multipliquen, y en caso contrario que se sumen. Muestra al usuario la
       operación realizada y el resultado.
        
     * • Muestra por pantalla el resultado de la siguiente forma:
        Por favor, introduzca un numero: xxx
        Ahora, introduzca un segundo numero: xxx
        La operación que se realizó es suma o producto y el resultado es xxx
     * 
     */
    public static void main(String[] args) {
        
        int num1;
        int num2;
        
        Scanner input = new Scanner (System.in);
        
        System.out.println("Por favor, introduce un numero: ");
        num1 = input.nextInt();
        System.out.println("Ahora introduce el segundo numero: ");
        num2 = input.nextInt();
                
        

        if (num1 > 10){
            num1 *= num2;
            System.out.println("El resultado de esta operacion es una multiplicacion: "+num1);
        } else if (num2 < 10) {
            num2 += num1;
            System.out.println("El resultado de esta operacion es una suma: "+num2);
        }
        
        
    }
    
}
