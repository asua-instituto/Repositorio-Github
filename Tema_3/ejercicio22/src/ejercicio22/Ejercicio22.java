/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio22;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author espmi
 */
public class Ejercicio22 {

    /**
     * @param args the command line arguments
     * 
     * Ejercicio 22.- Crea un programa que calcule sume dos
       números que introduzca el usuario.
     * 
       • En caso de que el usuario introduzca una letra en vez de un
       número, debemos capturar la excepción y mostrarle un
       mensaje de error.
     * 
     */
    public static void main(String[] args) {
        
        //Declaramos las variables
        int num1, num2, operacion;
           
        try {
            // Pedimos los datos al usuario
            Scanner input = new Scanner (System.in);
            
            System.out.println("Ingresa el primer numero para sumar: ");
            num1 = input.nextInt();
            System.out.println("Ingresa el segundo numero para sumar: ");
            num2 = input.nextInt();
            
            // Sumamos la operacion digamos que el usuario pone 10 + f seria: "Error"
            
            operacion = num1 + num2;
            
        }catch (InputMismatchException e){
            System.out.println("Error de numeracion; Haz puesto un dato no nomerico");
            operacion = 0;
        } finally {
            System.out.println("La captura ha finalizado");
        }
        
        System.out.println("El resultado de la suma es: "+operacion);
        
    }
    
}
