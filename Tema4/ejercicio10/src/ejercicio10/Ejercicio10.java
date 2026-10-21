/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio10;

import java.util.Scanner;

/**
 *
 * @author espmi
 */
public class Ejercicio10 {
    
    /*
        Ejercicio 10.- Escribe un programa en JAVA que, utilizando bucles,
        imprima la tabla de multiplicar de un número que elija el usuario. El
        número se pedirá en un método y la tabla de multiplicar se escribirá
        en otro.
    
        • Ejemplo:
    
        Introduzca un numero para calcular su tabla de multiplicar: 8
        8 x 0 = 0
        8 x 1 = 8
        8 x 2 = 16
        8 x 3 = 24 ...
    
    */
    
     /**
     * // Pedimos varibles al usuario.
     * @return [El valor que ha introducido el usuario]
     */
    
    public static int pedirNumero(){
        Scanner input = new Scanner (System.in);
        return input.nextInt();
    }
    
    /**
     * La multiplicación de la operacion y lo musestra por pantalla en el main.
     * @param pepe es n1
     * @param pepito es n2
     */
    public static void multiplicar(int pepe, int pepito){
        int i = 0;
        do {
            int resultado = pepe * i;
            System.out.println(i+". "+pepe+" x "+i+" = "+resultado);
            i++;
        } while (i <= pepito);
        
    }
    
    /**
     *
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        
        // Declaramos la variables.
        int n1, n2;
        
                System.out.println("Introduzca un numero para calcular su tabla de multiplicar: ");
                n1 = pedirNumero();
                System.out.println("Introduzca un numero para saber hazta donde multiplicar: ");
                n2 = pedirNumero();

                System.out.println("--- El un numero para calcular su tabla de multiplicar es: "+n2+" ---");

                multiplicar(n1,n2);
                
    }
    
}
