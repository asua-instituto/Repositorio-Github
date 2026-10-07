/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio15;

import java.util.Scanner;

/**
 *
 * @author espmi
 */
public class Ejercicio15 {

    /**
     * @param args the command line arguments
     * 
     * Ejercicio 15.- Escribe un programa en JAVA que, utilizando bucles,
       imprima la tabla de multiplicar de un número que elija el usuario.
        
     * • Ejemplo:
        Introduzca un numero para calcular su tabla de multiplicar: 8
        8 x 0 = 0
        8 x 1 = 8
        8 x 2 = 16
        8 x 3 = 24 ...
     * 
     */
    public static void main(String[] args) {
        
        Scanner input = new Scanner (System.in);
        
        System.out.println("Introduzca un numero para calcular su tabla de multiplicar:");
        int n = input.nextInt();
        
        for (int i = 0; i <= 10; i++){
            System.out.println(n + " + " + i + " = " + (n * i));
        }
        
    }
    
}
