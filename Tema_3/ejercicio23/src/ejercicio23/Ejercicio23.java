/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio23;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author espmi
 */
public class Ejercicio23 {

    /**
     * @param args the command line arguments
     * 
     * Ejercicio 23.- Realiza un algoritmo que imprima todos los
       números existentes entre el número 1 y otro introducido
       por el usuario.
     * 
       • Controla que el usuario te meta un número mayor que 1 y,
       sino, avísale del error y vuélveselo a pedir las veces que
       hagan falta. (hasta que introduzca un número mayor que 1)
     * 
     */
    
    static int num2;
    
    public static void main(String[] args) {
        
        // Hago un bucle pidiendole al usuario el valor y encapsulandolo en un try para en caso de que ponga valores decimales ej 0,5 o 1,5 [Solo funciona con enteros].
        do{
            try {
             
                System.out.println("Introduce hasta que tope de valores de numeros quieres ver entre el 1: ");
                Scanner input = new Scanner (System.in);
                
                num2 = input.nextInt();
                
                // Haria el trabajo del try solo que funciona con numeros enteros
                if (num2 <= 1) {
                    System.out.println("Error: Tio haz puesto un numero debajo del 1");
                }        
            }catch (InputMismatchException e){
                System.out.println("Error de instruccion");
            }
        }while (num2 <= 1);
            
        // Mostramos al usuario hasta que numero ha escrito.
        System.out.println("\nNumeros del 1 al " + num2 + ":");
        
        // inicializo la variable i con 1 porque quiero ver desde el numero 1 y le pongo desde tope el num2 hasta que los recorra
        // en cada vuelta sumara un numero hasta el tope.
            for (int i = 1; i <= num2; i++){
                System.out.println(i);
            }
        
    }
    
}
