/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio16;

/**
 *
 * @author espmi
 * 
 */
public class Ejercicio16 {

    /**
     * @param args the command line arguments
     * 
     *  * Ejercicio 16.- Crea un programa que imprima los números
        impares que existen entre los números 20 y el 160.
        Además, al final, nos dirá cuantos impares ha imprimido en
        total por pantalla.

     * • Ejemplo:
        Los números impares existentes entre el número 20 y el 160 son: 21
        – 23 – 25 – 27 – 29 – 31 - …
        La cantidad de números impares impresos han sido: XXX
     * 
     */
    public static void main(String[] args) {
        
        int i = 20, contador = 0;
        do {
            i++;
            if (i % 2 == 1){
                System.out.println(i);
                contador += 1;
            }
        } while (i < 160);
        
        System.out.println("la cantidad es: "+contador);
        
        

    }
    
}
