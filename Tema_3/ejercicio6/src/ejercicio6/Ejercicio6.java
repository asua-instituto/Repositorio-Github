/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio6;

import java.util.Scanner;

/**
 *
 * @author espmi
 */
public class Ejercicio6 {

    /**
     * @param args the command line arguments
     * 
     * Ejercicio 06.- Crea un programa en JAVA en donde el usuario
       introduzca la nota de un alumno (número entero entre 0 y 10) y se
       escribirá su calificación según el valor de la nota ingresada:
     * 
       • 0 a 4 = Suspenso.
       • 5 a 6 = Bien.
       • 7 a 8 = Notable.
       • 9 a 10 = Sobresaliente.
     * 
       • Nota: Se le avisará al usuario de un error en caso de que la nota que
       nos introduzca no esté entre 0 y 10.
     * 
     * 
     */
    public static void main(String[] args) {
        int num;
        
        Scanner input = new Scanner (System.in);
        
        System.out.println("Introduce tu nota del (1-10): ");
        num = input.nextInt();
        
        switch (num) {
            case 0:
                System.out.println("Tienes un: SUSPENSO");
                break;
            case 4:
                System.out.println("Tienes un: SUSPENSO");
                break;
            case 5:
                System.out.println("Tienes un: BIEN");
                break;
            case 6:
                System.out.println("Tienes un: BIEN");
                break;
            case 7:
                System.out.println("Tienes un: Notable");
                break;
            case 8:
                System.out.println("Tienes un: Notable");
                break;
            case 9:
                System.out.println("Tienes un SOBRESALIENTE");
                break;
            case 10:
                System.out.println("Tienes un SOBRESALIENTE");
                break;
            default:
                System.out.println("Tio no haz puesto la nota del (1-10) ");
                
        }
    }
    
}
