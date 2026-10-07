/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tarea_13;

/**
 *
 * @author espmi
 */
public class Tarea_13 {

    /**
     * @param args the command line arguments
     * 
     * “¿Recuerdas la prueba de agilidad mental de los dos vasos? El vaso A tiene líquido azul y B líquido rojo. ¿Como pasarías
     * el liquido de un vaso a otro de forma que el vaso A se quede con líquido rojo y el B con líquido azul.?”
     * 
     * • Realiza un programa en el que tengas dos variables de tipo entero, num1 que
     * contiene un 1 y num2 que contiene un 2. ¿Cómo pasarías el contenido de una
     * variable a otra de forma que num1 contenga el 2 y num2 contenga el 1?
     * 
     * • Muestra por pantalla el resultado de la siguiente forma:
     * 
     * La variable num1 contiene el valor 1 y la variable num2 contiene el valor 2.
     * 
     * Ahora, la variable num1 contiene el valor 2 y la variable num2 contiene el valor 1. 
     * 
     */
    public static void main(String[] args) {
        
        int num1 = 1;
        int num2 = 2;
        int vaso;
        
        System.out.println("La variable num1 contiene el valor: " + num1 + " y la variable num2 contiene el valor: " + num2 + ".\n");
        
        // num1= 1; num2= 2; vaso = ;
        vaso = num2;
        // num1= 1; num2= ; vaso = 2;
        num2 = num1;
        // num1= ; num2= 1; vaso = 2;
        num1 = vaso;
        // num1= 2; num2= 1; vaso = ;
        
        System.out.println("Ahora, La variable num1 contiene el valor: " + num1 + " y la variable num2 contiene el valor: " + num2 + ".");

    }
}
