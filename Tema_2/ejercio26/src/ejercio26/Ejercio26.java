/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercio26;

import java.util.Scanner;

/**
 *
 * @author espmi
 */
public class Ejercio26 {

    /**
     * @param args the command line arguments
     * 
     * Ejercicio 26.- Desarrolla un programa en el que le pidas al usuario
       un número de 4 cifras y muestre por pantalla cada una de las cifras
       que lo forman.
       
     * • Muestra por pantalla el resultado de la siguiente forma:
       Por favor, introduzca un número de 4 cifras: XYZW
       La primera cifra es: X
       La segunda cifra es: Y
       La tercera cifra es: Z
       La cuarta cifra es: W
     */
    public static void main(String[] args) {
        
        int cifra, primera, segunda, tercera, cuarta;
        
        Scanner input = new Scanner (System.in);
        
        System.out.println("Por favor, introduzca un numero de 4 cifras: ");
        cifra = input.nextInt();
        
        primera = cifra / 1000;
        segunda = (cifra / 100) % 10;
        tercera = (cifra / 10) % 10;
        cuarta = cifra % 10;
        
        System.out.println("La primera cifra es: "+primera);
        System.out.println("La segunda cifra es: "+segunda);
        System.out.println("La tercera cifra es: "+tercera);
        System.out.println("La cuarta cifra es: "+cuarta);
        
    }
    
}
