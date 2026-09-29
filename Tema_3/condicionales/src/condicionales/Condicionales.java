/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package condicionales;

/**
 *
 * @author alumno
 */
public class Condicionales {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int num1 = 5;
        
        // IF
        System.out.println("IF");
        if (num1 % 2 == 0) {
            System.out.println("El numero es par.");
        }
        
        // IF ELSE
        
        System.out.println("\nIF ELSE");
        if (num1 % 2 == 0) {
            System.out.println("El numero es par.");
        } else {
            System.out.println("El numero es impar.");
        }
        
        // IF ELSE IF ELSE
        
        System.out.println("\nIF - ELSE IF ELSE");
        if (num1 > 0) {
            System.out.println("El numero es positivo.");
        } else if(num1 < 0) {
            System.out.println("El numero es negativo.");
        } else {
            System.out.println("El numero es 0.");
            
        // Switch
        
            System.out.println("\nSWITCH");
            switch(num1) {
                case 1:
                    System.out.println("Lunes");
                    break;
                case 2:
                    System.out.println("Martes");
                    break;
                case 3:
                    System.out.println("Miercoles");
                    break;
                case 4:
                    System.out.println("Jueves");
                    break;
                case 5:
                    System.out.println("Viernes");
                    break;
                case 6:
                    System.out.println("Sabado");
                    break;
                case 7:
                    System.out.println("Domingo");
                    break;
                default :
                    System.out.println("No exixte ese dia de la semana");
                    
                    // Otra forma de escribirlo:
                    
                    /*
                    System.out.println("\nSWITCH");
            switch(num1) {
                case 1 -> System.out.println("Lunes");
                case 2 -> System.out.println("Martes");
                case 3 -> System.out.println("Miercoles");
                case 4 -> System.out.println("Jueves");
                case 5 -> System.out.println("Viernes");
                case 6 -> System.out.println("Sabado");
                case 7 -> System.out.println("Domingo");
                default -> System.out.println("No exixte ese dia de la semana");
                    */
                    
              
            }
        }
    }
    
}
