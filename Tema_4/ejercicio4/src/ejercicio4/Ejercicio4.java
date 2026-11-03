/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio4;

import java.util.Scanner;
import menorDe.Menorde;


/**
 *
 * @author espmi
 */
public class Ejercicio4 {

    /**
     * @param args the command line arguments
     */
    
    /*
        Ejercicio 04.- Escribir un algoritmo en JAVA que pida tres
        números (en el main) y se los pase a un método que los
        imprima por pantalla el menor de ellos. ESTE MÉTODO
        ESTARÁ EN UNA CLASE DISTINTA DEL MISMO
        PAQUETE.
    */
    
     /**
     * Le pedimos el dato a usuario y los retornamos al main.
     * @return *El dato del usuario* 
     */
    
    public static int pedirNumero(){
        Scanner input = new Scanner (System.in);
        return input.nextInt();
    }
    
    public static void main(String[] args) {
        // Declaramos las variables que vamos a usar.
        int n1,n2,n3;
        
        // Pedimos al usuario las distintas variables.
        System.out.println("Por favor, introduzca el primer número: ");
        n1 = pedirNumero();
        System.out.println("Ahora, introduzca un segundo número: ");
        n2 = pedirNumero();
        System.out.println("Por ultimo, introdzca un tercer número: ");
        n3 = pedirNumero();
        
        // Llamamos para que en otra clase que esta en otro packete en este ejercicio 3.
        System.out.println("El número mayor de los introducidos es el: "+Menorde.mayorde(n1, n2, n3));
    }
    
}
