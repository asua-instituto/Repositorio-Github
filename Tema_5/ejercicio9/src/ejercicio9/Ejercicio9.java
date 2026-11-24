/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio9;

import java.util.Scanner;

/**
 *
 * @author espmi
 */
public class Ejercicio9 {

    /*
        Ejercicio 09.- Realiza un programa en JAVA,
        ORIENTADO A OBJETOS, que lea tres números e
        imprima por pantalla el mayor de ellos.
    
        • Realiza el ejercicio a tu gusto, con los métodos que
        consideres necesarios (cuantos más mejor).
    
        • Pista: Necesitarás crear 3 objetos de una clase “Numero”
        con un atributo llamado “valor”.
    */
    
    // Pasamos los objectos como parametros para determinar cual es el mayor de ellos.
    public static void esMayor (Numero n1,Numero n2,Numero n3) {
        if (n1.getValor() > n2.getValor() && n1.getValor() > n3.getValor()) {
            System.out.println("\nEl mayor es: "+ n1.getValor());
        } else if (n2.getValor() > n1.getValor() && n2.getValor() > n3.getValor()) {
            System.out.println("\nEl mayor es: "+ n2.getValor());
        } else {
            System.out.println("\nEl mayor es: "+ n3.getValor());
        }
    }
    
    // Es solo para que el usuario vea mejor a que casillas esta introduciendo los datos.
    public static int i = 1;
    
    public static int pedirNumero () {
        Scanner input = new Scanner (System.in);
        int dato;
        System.out.println("Introduce el valor para el [Numero]["+i+"] :");
        dato = input.nextInt();
        i++;
        return dato;
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Declaramos y pedimos los datos al usuario
        int d1,d2,d3;
        d1 = pedirNumero();
        d2 = pedirNumero();
        d3 = pedirNumero();
        
        // Creamos lo objectos del la clase "Numero"
        Numero n1 = new Numero(d1);
        Numero n2 = new Numero(d2);
        Numero n3 = new Numero(d3);
        
        // Comprobamos cual de esos valores es el mayor de ellos.
        esMayor(n1,n2,n3);
        
        
        
        
    }
    
}
