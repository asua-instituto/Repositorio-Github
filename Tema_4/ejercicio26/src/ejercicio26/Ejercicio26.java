/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio26;

import java.util.Scanner;

/**
 *
 * @author espmi
 */
public class Ejercicio26 {

    /*
        Ejercicio 26.- Escribe un programa que contenga un método
        llamado esPrimo que reciba un número entero como
        parámetro y devuelva un booleano que indique si se trata de
        un número primo o no.
        • Pista: Para comprobar que se trata de un número primo, hay
        que comprobar que no tiene divisores distintos de la unidad
        y del propio número. Se irá comprobando si tiene algún
        divisor a partir del 2 en adelante y si se encuentra algún
        divisor cuyo resto sea 0 ya sabremos que ese número no es
        primo.
    */
    
        /**
         * Verificar si el valor es primo o no lo es.
         * @param numero el dato del usuario
         * @return [valores booleanos dependiendo de lo que ha introducido el usuario] 
         */
        public static boolean esPrimo(int numero) {
        // Los números menores o iguales a 1 (0, 1 y negativos) NO son primos
        if (numero <= 1) {
            return false;
        }

        // Buscamos divisores desde 2 hasta numero - 1
        for (int i = 2; i < numero; i++) {
            // Si el resto de dividir 'numero' entre 'i' es 0, hemos encontrado un divisor
            if (numero % i == 0) {
                return false; // No es primo, terminamos inmediatamente la función
            }
        }
        // Si terminó el bucle y no encontró ningún divisor, el número es primo
        return true;
        }
    
        public static int pedirDato (){
        Scanner input = new Scanner (System.in);
        System.out.print("Introduce el primer número: ");
        return input.nextInt();
        }
        
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int n;
        
        n = pedirDato();
        if (esPrimo(n)) {
            System.out.println("El número " + n + " ES primo.");
        } else {
            System.out.println("El número " + n + " NO es primo.");
        }
    }
    
}
