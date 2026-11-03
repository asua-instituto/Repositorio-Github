/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio11;

import java.util.Scanner;

/**
 *
 * @author espmi
 */
public class Ejercicio11 {

    /*
        Ejercicio 11.- Crea un programa que calcule la raíz cuadrada
        del número que introduzca el usuario. (Utiliza el método
        Math.sqrt() )
    
        • Si el usuario introduce un número negativo, debemos
        mostrarle un mensaje de error y volver a pedírselo (tantas
        veces como sea necesario).
    
        • La petición del número lo haremos en un método, el cálculo
        de la raíz cuadrada en otro, y mostraremos el resultado en
        otro método.
    */
    
    public static void resultado (){
        raizCuadrada();
    }
    
    
    
    /**
     * 
     * @param n1 El valor que ha introducido el usuario y se usa en la raiz cuadrada directamente
     * @return nos devuelve directamente la raiz cudadrada con el int para convertirlo de double a int
     */
    
    public static int raizCuadrada(int n1){
        return (int) Math.sqrt(n1);
    }
    
     /**
     * // Pedimos varibles al usuario.
     * @return [El valor que ha introducido el usuario]
     */
    
    public static int pedirNumero(){
        Scanner input = new Scanner (System.in);
        return input.nextInt();
        }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int n1, resultadoRaiz, resultado;
        
        do {
            System.out.println("--- Introduce un valor para hacer su raiz cuadrada ---");
            n1 = pedirNumero();
            resultadoRaiz = raizCuadrada(n1);
            resultado = resultado();
        }while();
    }
}

        /*
        int i = 0;
        int n1;
        int resultado;
        do {
            System.out.println("--- Introduce un valor para hacer su raiz cuadrada ---");
            n1 = pedirNumero();
            resultado = raizCuadrada(n1);
            System.out.println("--- El resultado es: "+ resultado+" ---");
            i++;
        }while (n1 < 0);
        */