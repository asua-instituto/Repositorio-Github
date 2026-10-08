/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio21;

// importamos su correspondiente herramienta InputMismatchException
import java.util.InputMismatchException;

import java.util.Scanner;

/**
 *
 * @author espmi
 */
public class Ejercicio21 {

    /**
     * @param args the command line arguments
     * 
     * Ejercicio 21.- Crea un programa que calcule el resultado de
       dividir los números que introduzca el usuario.
     * 
       • En caso de que el usuario introduzca un número divisor
       igual a 0, debemos capturar la excepción y mostrarle un
       mensaje de error al usuario.
     * 
     */
    public static void main(String[] args) {
        
        // Declaramos las Variables
        
        int num1, num2, operacion;
         
        // Usamos el try y catch para capturar el posible problema que pueda surgir    
        
        try {
            
            // Pedimos los datos al usuario
            Scanner input = new Scanner (System.in);
        
            System.out.println("Escribe el [Dividendo]: ");
            num1 = input.nextInt();

            System.out.println("Escribe el [Divisor]");
            num2 = input.nextInt();
            
            // Imagina que pone num1 = 10 y num2 = g daria: Error InputMismatchException
            operacion = num1 / num2;
        
            // Declaramos el error y le ponemos 0 para que 
            
            } catch (InputMismatchException e) {
                System.out.println("Error de numerico; Haz puesto un dato no numerico ej. (g,@ etc...)");
                operacion = 0;
            } finally {
                System.out.println("La captura ha finalizado");
            }
        
        System.out.println("El resultado es: "+ operacion);
        
        
        
    }
    
}
