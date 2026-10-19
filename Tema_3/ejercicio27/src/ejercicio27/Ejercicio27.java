/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio27;

import java.util.Scanner;

/**
 *
 * @author espmi
 */
public class Ejercicio27 {

    /**
     * @param args the command line arguments
     * 
     * Ejercicio 27.- Diseña un programa en JAVA que pida al usuario dos números por
       teclado. Posteriormente el programa mostrará un menú que le permitirá al usuario:
     * 
       • 1.- Sumar los números.
       • 2.- Restar los números.
       • 3.- Multiplicar los números.
       • 4.- Dividir los números.
       • 5.- Salir del programa.
     * 
       • Nota1: Mientras el usuario no pulse 5, el programa no termina y el menú volverá a
        aparecer pidiendo nuevamente que le introduzcas una opción.
     * 
       • Nota 2: Controla el caso de división entre 0 mediante la captura de excepciones.
     * 
     */
    public static void main(String[] args) {
        
        
        // Declaramos la s variables
        int num1, num2, decicion, suma, resta, multiplicacion, divicion;
        
        Scanner input = new Scanner (System.in);
        
        // Iniciamos el bucle con lo siguiente:
        do{
            // Preguntamos a usuario los numeros
            System.out.println("Introduce el primer numero:");
            num1 = input.nextInt();
            System.out.println("Introduce el segundo numero:");
            num2 = input.nextInt();
            
            // Le mostramos el menu y gruardamos el valor de su decición
            System.out.println(
               "1.- Sumar los numeros.\n" +
               "2.- Restar los numeros.\n" +
               "3.- Multiplicar los numeros.\n" +
               "4.- Dividir los numeros.\n" +
               "5.- Salir del programa.\n");
            
            decicion = input.nextInt();
            
            //Dependiendo de lo que decididera el usuario se van a dar los diferentes casos es decir, las operaciones que él usuario espera.
            switch (decicion) {
                case 1:{
                    suma = num1 + num2;
                    System.out.println("La suma es: "+suma);
                    break;
                }
                case 2:{
                    resta = num1 - num2;
                    System.out.println("La resta es: "+resta);
                    break;
                }
                case 3:{
                    multiplicacion = num1 * num2;
                    System.out.println("La multiplicacion es: "+multiplicacion);
                    break;
                }
                /* El usuario puede dividir entre 0 lo que causa un error entonces ahi ponemos el try/catch para capturar el problema
                   y mostrarle al usuario de que debe "no dividir entre 0" */
                case 4: {
                    try{
                        divicion = num1 / num2;
                        System.out.println("La divicion es: "+divicion);
                    }catch (ArithmeticException e) {
                            System.out.println("Error! No se puede dividir entre 0");
                            }
                    break;
                }
                default:{
                    System.out.println("Salimos del Programa...");
                    break;
                }
            }
            // El usuario hasta que no de la decicion de 5 es decir, la salida no sale del bucle
        }while (decicion < 5);
    }
    
}
