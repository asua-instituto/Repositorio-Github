/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio24;

import java.util.Scanner;

/**
 *
 * @author Michael Asua Trinitario
 */
public class Ejercicio24 {

    /**
     * @param args the command line arguments
     * 
     * Ejercicio 24.- Crea un programa en JAVA que que imprima todos
        los números múltiplos de 3 que existen entre el número 1 y otro
        número introducido por el usuario.
     * 
        • Controla que el usuario te meta un número mayor que 0 y, sino,
        avísale del error y vuélveselo al pedir las veces que hagan falta.
     * 
        • Por último infórmale al usuario del total de números mostrados.
     */
    public static void main(String[] args) {
        
        int num;
        Scanner input = new Scanner(System.in);
        
        
        // Validar si el usuario ha metido un dato mayor que 1
        do {
            System.out.print("Introduce un numero mayor que 0: ");
            num = input.nextInt();
            
            if (num <= 0) {
                System.out.println("Error: El numero debe ser mayor que 0. Vuelve a intentarlo.\n");
            }
        } while (num <= 0);
        
        int total = num / 3;
        
        System.out.println("\nLos mltiplos de 3 entre 1 y " + num + " son:");
        
        // 3. El bucle solo da las vueltas necesarias
        for (int i = 1; i <= num; i++) {
            int calculo = 3 * i; // La tabla del 3: 3x1, 3x2, 3x3...
            System.out.println(i + ". -> 3 x " + i + " = " + calculo);
        }
        }
        
    }
