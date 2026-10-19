/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio29;

import java.util.Scanner;

/**
 *
 * @author espmi
 */
public class Ejercicio29 {

    /**
     * @param args the command line arguments
     * 
     * Ejercicio 29.- Escribe un programa que juegue con el usuario a
        adivinar un número. El ordenador debe generar un número
        entero aleatorio entre 1 y 100, y el usuario tiene que intentar
        adivinarlo.
     * 
        • Para ello, cada vez que el usuario introduce un valor el ordenador
        debe decirle al usuario si el número que tiene que adivinar es
        mayor o menor que el que ha introducido.
     * 
        • Cuando consiga adivinarlo debe indicárselo e imprimir en pantalla
        el número de veces que el usuario ha intentado adivinar el
        número.
     * 
     */
    public static void main(String[] args) {
        
        int num, aleatorio = (int) Math.random() * 100 + 1;
      
        do {
            System.out.println("Introduce el numero que crees que pueda salir [¡A ver si aciertas SUERTE!]");
            Scanner input = new Scanner (System.in);
            num = input.nextInt()
            
        }while();
    }
    
}
