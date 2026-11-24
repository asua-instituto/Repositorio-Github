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
        Ejercicio 10.- Escribe un programa en JAVA, orientado a
        objetos, en el que el usuario introduzca cuatro números
        enteros y luego el programa los muestre por pantalla
        ordenados de forma creciente. (de menor a mayor)
    
        • Pista: Necesitarás cuatro objetos de la clase “Numero”
        con un solo atributo llamado “valor”.
    */
    
    public static int ordenandoNumeros (Numeros n1,Numeros n2,Numeros n3,Numeros n4) {
        int aux;
        if (n1.getValor() > n2.getValor() && n1.getValor() > n3.getValor() && n1.getValor() > n4.getValor()) {
            n1.getValor() = aux;
        }
    }
    
    public static int contador = 1;
    
    public static int pedirNumero () {
        Scanner input = new Scanner (System.in);
        int dato;
        System.out.println("Introduce el valor para el Numero ["+contador+"]:");
        dato = input.nextInt();
        return dato;
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // Declaramos y pedimos el numeros y lo almacenamos en la variable "n1","n2","n3","n4".
        int n1,n2,n3,n4;
        n1 = pedirNumero();
        n2 = pedirNumero();
        n3 = pedirNumero();
        n4 = pedirNumero();
        
        // Contruimos los cuatro objectos.
        Numeros numero1 = new Numeros(n1);
        Numeros numero2 = new Numeros(n2);
        Numeros numero3 = new Numeros(n3);
        Numeros numero4 = new Numeros(n4);
        
        
        
        
    }
    
}
