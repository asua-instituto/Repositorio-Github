/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio2;

import java.util.Scanner;

/**
 *
 * @author espmi
 */
public class Ejercicio2 {

    /**
     * @param args the command line arguments
     */
    
    /*
    Ejercicio 02.- Realiza un programa en el que le solicites en el main al
    usuario 2 números y, si el primer número introducido es mayor que 10, se
    llamará a un método que los multiplicará y mostrará el resultado, y en
    caso contrario se llamará a un método que los sume. ESTOS DOS
    MÉTODOS ESTARÁN EN UNA CLASE DISTINTA EN EL MISMO
    PAQUETE. Muestra al usuario la operación realizada y el resultado.
    
    • Muestra por pantalla el resultado de la siguiente forma:
    Por favor, introduzca un numero: xxx
    Ahora, introduzca un segundo numero: xxx
    La operación que se realizó es suma o producto y el resultado es xxx
    
    */
    
    /**
     * Sumamos los dos valores y lo retornamos al main.
     * @param n1
     * @param n2
     * @return la suma de las dos variables.
     */
    
    public static int sumar(int n1, int n2) {
        return n1 + n2;
    }
    /**
     * Multiplicamos los dos valores y lo retornamos al main.
     * @param n1
     * @param n2
     * @return la multiplicacion de dos variables.
     */
    
    public static int multiplicar(int n1, int n2){
        return n1 * n2;
    }
    
    /**
     * Pedimos los datos al usuario y lo retornamos al main.
     * @return *El dato del usuario*
     */
    
    public static int pedirNumero (){
        Scanner input = new Scanner (System.in);
        return input.nextInt();
    }
    
    public static void main(String[] args) {
        
        // Declaramos al usuario las variables que trabajaremos.
        int n1, n2;
        
        // Pedimos al usuario los datos correspondientes con la clase pedirNumero
        System.out.println("Por favor, introduzca un numero: ");
        n1 = pedirNumero();
        
        System.out.println("Ahora, introduzca un segundo numero: ");
        n2 = pedirNumero();
        
        // Hacemos la toma de decición con los metodos multiplicar y sumar dependiendo del valor que introdujo el usuario.
        if (n1 > 10) {
            System.out.println("La operacion que se realizo es [MULTIPLICAR] y el resultado es: "+multiplicar(n1,n2));
        }else{
            System.out.println("La operacion que se realizo es [SUMA] y el resultado es: "+sumar(n1,n2));
        }
        
        
    }
    
}
