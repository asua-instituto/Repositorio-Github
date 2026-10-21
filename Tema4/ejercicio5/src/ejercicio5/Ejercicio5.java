/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio5;

import java.util.Scanner;

/**
 *
 * @author espmi
 */
public class Ejercicio5 {

    /**
     * @param args the command line arguments
     */
    /*
        Ejercicio 05.- Implementa un algoritmo en JAVA que le
        pida al usuario un número por teclado (en el main). Ese
        número se lo pasaremos a un método que nos dirá si el
        número introducido es par o impar. ESTE MÉTODO
        ESTARÁ EN UNA CLASE DISTINTA DE OTRO
        PAQUETE.
    */
    
    /*
    Forma larga de [validacion]:
    
    public static boolean validacion (int n1) {
        if (n1 % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }
    
    Fíjate en lo redundante que es:

        "Si la condición es verdadera, devuelve verdadero (true)."
        "Si la condición es falsa, devuelve falso (false)."

    Estoy usando un if para devolver exactamente lo mismo que la condición ya vale.
    
    (n1 % 2 == 0) Esto funciona ya que Java cualquier comparación que hagas en Java da como resultado un valor booleano (true o false).
    
    Haria lo siguiente si el usuario introduce el número 4:

    1. Entra al método: validacion(4)
    2. Java lee: return (4 % 2 == 0);
    3. Calcula el resto: 4 % 2 es 0. Ahora queda: return (0 == 0);
    4. Comprueba: ¿0 es igual a 0? Sí, es true.
    5. Ejecuta: return true;
    */
    
    /**
     * Validad y nos da valores booleanos.
     * @param n1 El valor que ha introducido el usuario.
     * @return Nos retorna valores booleanos dependiendo si la comparacion es verdadera en caso contrario será falsa.
     */
    
    public static boolean validacion (int n1) {
        return (n1 % 2 == 0);
        }
    
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
        int n1;
        
        // Pedimos al usuario las distintas variables.
        System.out.println("Por favor, introduzca el primer número: ");
        n1 = pedirNumero();
        
        boolean resultado = validacion(n1);
        
        if (resultado == true) {
            System.out.println("Es número es: [Par]");
        } else {
            System.out.println("Es número es: [Inpar]");
        }
    }
    
}
