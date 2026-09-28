/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tarea_14;

/**
 *
 * @author espmi
 */
public class Tarea_14 {

    /**
     * @param args the command line arguments
     * 
     * • Ejercicio 14.- Realiza un programa que calcule el área de
     * una circunferencia de radio 5,2 centímetros. Para ello
     * utiliza la constante PI.
     * 
     * • Muestra por pantalla el resultado de igual forma que el
     * ejercicio anterior
     * 
     */
    
    final static float PI = 3.14159f;
    final static float R = 5.2f;
    
    public static void main(String[] args) {
       
       float areaCircunferencia = PI * (R * R);
        
        System.out.println("El area de una circunferencia cuyo radio vale 5,2 seria igual a: " + areaCircunferencia + " metros.");

    }
    
}
