/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio13;

/**
 *
 * @author espmi
 */
public class Ejercicio13 {

    /**
     * @param args the command line arguments
     * 
     * Ejercicio 13.- Crea un algoritmo en JAVA que, utilizando un
       bucle while, imprima los números pares que existen entre el
       número 11 y el número 133.
     */
    public static void main(String[] args) {
        
        int n = 11;
        
        while(n < 133) {
            if (n % 2 == 0) {
                System.out.println(n);
            }
            n++;
    }
    }
}
