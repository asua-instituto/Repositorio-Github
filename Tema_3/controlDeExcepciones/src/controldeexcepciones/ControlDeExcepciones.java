/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package controldeexcepciones;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author espmi
 */
public class ControlDeExcepciones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int edad;
        
        try {
        // pedir un dato ( || CONFLICTIVO||)
        Scanner input = new Scanner (System.in);
        System.out.println("Introduzca su edad: ");
        // int edad = input.nextInt(); //variable local en try
        edad = input.nextInt(); 
        System.out.println("Tu edad es "+edad);
    } catch (InputMismatchException e) {
            System.out.println("Dato no válido; debes introducir un número entero.");
    } finally {
            System.out.println("Dato perdido al usuario.");
        }
        
        
        // Mostrar un dato
        
    }
    
}
