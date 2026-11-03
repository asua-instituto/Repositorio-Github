/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio21;

import java.util.Scanner;

/**
 *
 * @author espmi
 */
public class Ejercicio21 {

    /*
        • Ejercicio 21.- Desarrolla un programa que, a partir de dos
        números que nos introduzca el usuario, muestre en pantalla
        la suma total de todos los números pares comprendidos
        entre ambos.
        • Utiliza 2 métodos distintos para pedir los datos al usuario, ya
        que en el segundo método deberás comprobar que el
        usuario te mete un número mayor que el primero (y sino se
        lo vuelves a pedir)
        • Utiliza también otro método que muestre el resultado a
        partir de los números recibidos.
    */
    
    public static void mostrarDatos (int n1, int n2) {
        int suma = 0;
        
        for (int i = n1;i < n2; i++) {
            if (i % 2 == 0) {
                suma += i;
            }
        }
        System.out.println("La suma de los números pares entre " + n1 + " y " + n2 + " es: " + suma);
    }
    
    /**
     * Almacenar lo que el usuario escribe.
     * @param n1 El primer valor que ha introducido el usuario.
     * @return devuelve el segundo valor comprobando que esta correcto.
     */
    public static int pedirDato2 (int n1){
        Scanner input = new Scanner(System.in);
        int valor;

        do {
            System.out.print("Introduce un segundo número mayor que " + n1 + ": ");
            valor = input.nextInt();

            if (valor <= n1) {
                System.out.println("Error: el número debe ser estrictamente mayor que " + n1 + ". Inténtalo de nuevo.");
            }
        } while (valor <= n1);

        return valor;
    }
            
            
    /**
     * Almacenar lo que el usuario escribe.
     * @return [lo que ha escrito el usuario].
     */
    public static int pedirDato1 (){
        Scanner input = new Scanner (System.in);
        System.out.print("Introduce el primer número: ");
        return input.nextInt();
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int n1, n2;
        
        n1 = pedirDato1();
        n2 = pedirDato2(n1);
        mostrarDatos(n1, n2);
        
    }
    
}
