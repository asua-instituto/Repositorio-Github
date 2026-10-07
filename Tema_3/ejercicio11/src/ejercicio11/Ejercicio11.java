/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio11;

/**
 *
 * @author espmi
 */
public class Ejercicio11 {

    /**
     * @param args the command line arguments
     * 
     * Ejercicio 11.- Crea un programa en JAVA que, utilizando
        bucles, muestre por pantalla el mensaje "Hola" seis veces
        acompañado por un numero que se incrementa cada vez.
     * 
        • Muestra por pantalla el resultado de la siguiente forma:
        - Hola1 – Hola2 – Hola3 – Hola4 – Hola5 – Hola6 - Hola ...
     * 
     */
    public static void main(String[] args) {
        
        for(int i = 1; i < 7; i++) {
            System.out.println("\nHola"+i);
        }
    }
    
}
