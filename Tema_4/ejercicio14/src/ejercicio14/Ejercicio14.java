/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio14;

import java.util.Scanner;

/**
 *
 * @author espmi
 */
public class Ejercicio14 {

        /*
        Ejercicio 14.- Crea un programa en JAVA que que imprima todos
        los números múltiplos de 3 que existen entre el número 1 y otro
        número introducido por el usuario.
    
        • Controla que el usuario te meta un número mayor que 0 y, sino,
        avísale del error y vuélveselo al pedir las veces que hagan falta.
    
        • Por último infórmale al usuario del total de números mostrados.
    
        • Crea un método para pedir el dato al usuario, otro para comprobar
        que es mayor que 0 y otro para hacer los cálculos y mostrar el
        resultado.
    */
    
    /**
     * Calculamos los multiplos de 3 con el dato del usuario como limite.
     * @param limite [el dato que ha puesto el usuario].
     */
    
    public static void calcularMultiplos (int limite) {
        int contador = 0;
        System.out.println("Múltiplos de 3 encontrados:");
        for (int i = 1; i <= limite; i++) {
            if(i % 3 == 0) {
                System.out.println(contador+". "+i);
                contador++;
            }
        }
        System.out.println("Total de números múltiplos de 3 mostrados: " + contador);
    }
    
    
    /**
     * Comprobamos si el valor es mayor a 0.
     * @param numero [El valor del usuario]
     * @return valores booleanos.
     */
    public static boolean esMayor(int numero) {
        return numero > 0;
        }

    /**
     * Pedimos el limite al usuario
     * @return [El dato introducido por el usuario]
     */
    public static int pedirNumero () {
        Scanner input = new Scanner (System.in);
        System.out.println("Introduce un valor");
        return input.nextInt();
    }
    
    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        // declaramos variables
        boolean resultado;
        int dato;
        
        do {
            // Almacenamos datos
            dato = pedirNumero();
            resultado = esMayor(dato);
            // Si el resultado es verdadero lo niega devolviendolo en el bucle.
            // En caso de ser falso es decir, que el resultado es mayor que 0 lo niega saliendo del bucle.
            if (!resultado) {
                System.out.println("El número tiene que ser mayor que 0, vuelve a intentarlo...");
            }
        } while (!resultado);
        // El calculo de los multiplos de 3.
        calcularMultiplos(dato);
    }
    
}
