/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio3;

import java.util.Scanner;
import mayorDe.MayorDe;

/**
 *
 * @author espmi
 */
public class Ejercicio3 {

    /**
     * @param args the command line arguments
     */
    
    /*
        Ejercicio 03.- Diseña un programa en JAVA que lea tres números en
        el main y se los pase a un método que imprimirá por pantalla el
        mayor de ellos. ESTE MÉTODO ESTARÁ EN UNA CLASE
        DISTINTA DE OTRO PAQUETE.
    
        • Muestra por pantalla el resultado de la siguiente forma:
    
        Por favor, introduzca el primer numero: xxx
        Ahora, introduzca un segundo numero: xxx
        Por último, introduzca un tercer numero: xxx
        El número mayor de los introducidos es el xxx       
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
        
        System.out.println("Por favor, introduzca el primer número: ");
        n1 = pedirNumero();
        System.out.println("Ahora, introduzca un segundo número: ");
        n2 = pedirNumero();
        System.out.println("Por ultimo, introduzca un tercer número: ");
        n3 = pedirNumero();
        
        // Llamamos para que en otra clase que esta en otro packete en este ejercicio 3.
        System.out.println("El número mayor de los introducidos es el: "+MayorDe.mayorde(n1, n2, n3));
        
    }
    
}
