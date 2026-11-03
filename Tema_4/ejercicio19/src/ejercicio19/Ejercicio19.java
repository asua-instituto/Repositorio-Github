/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio19;

import java.util.Scanner;

/**
 *
 * @author espmi
 */
public class Ejercicio19 {

    /*
        Ejercicio 19.- Escribe un programa que lea un día de la
        semana que introduzca el usuario (Lunes, Martes,
        Miércoles, Jueves, Viernes, Sábado o Domingo) y, según
        sea su valor, escriba en pantalla su posición en la
        semana.
    
        • Ejemplo de ejecución:
        Por favor, introduzca un día de la semana: Miércoles
        El Miércoles es el tercer día de la semana
     */
    public static boolean compararDias(String dia) {
        switch (dia.toLowerCase()) {
            case "lunes":
                System.out.println("El Lunes es el primer día de la semana");
                return true;
            case "martes":
                System.out.println("El Martes es el segundo día de la semana");
                return true;
            case "miércoles": // Aceptamos con y sin tilde
            case "miercoles": // Aceptamos con y sin tilde
                System.out.println("El Miércoles es el tercer día de la semana");
                return true;
            case "jueves":
                System.out.println("El Jueves es el cuarto día de la semana");
                return true;
            case "viernes":
                System.out.println("El Viernes es el quinto día de la semana");
                return true;
            case "sábado": // Aceptamos con y sin tilde
            case "sabado": // Aceptamos con y sin tilde
                System.out.println("El Sábado es el sexto día de la semana");
                return true;
            case "domingo":
                System.out.println("El Domingo es el séptimo día de la semana");
                return true;
            default:
                System.out.println("El día introducido no es un dia de la semana. Inténtelo de nuevo.");
                return false;
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        boolean esValido = false;

        do {
            System.out.println("Por favor, introduzca un día de la semana: (ej.Miércoles)");
            Scanner input = new Scanner(System.in);
            String dia = input.nextLine();

            esValido = compararDias(dia);

        } while (esValido == false);

    }

}
