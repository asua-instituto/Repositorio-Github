/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio32;
import java.util.Scanner;

/**
 *
 * @author espmi
 */
public class Ejercicio32 {

    /**
     * @param args the command line arguments
     * 
     * Ejercicio 32.- Realiza un programa que dado un importe en
       euros nos indique número óptimo de billetes de 50, 20, 10 y
       5, así como la cantidad sobrante en monedas de 2 y de 1
       euro.
       
      * • Por ejemplo:
       Por favor, indique una cantidad de dinero: 232
       232 Euros se descomponen en 4 billetes de 50, 1 billetes de 20, 1 billetes de
       10, 0 billetes de 5, 1 monedas de 2 euros y 0 monedas de 1 euro.
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Por favor, indique una cantidad de dinero: ");
        int cantidad = input.nextInt();

        int original = cantidad;

        int billetes50 = cantidad / 50;
        cantidad %= 50;

        int billetes20 = cantidad / 20;
        cantidad %= 20;

        int billetes10 = cantidad / 10;
        cantidad %= 10;

        int billetes5 = cantidad / 5;
        cantidad %= 5;

        int monedas2 = cantidad / 2;
        cantidad %= 2;

        int monedas1 = cantidad;

        System.out.println(original + " Euros se descomponen en:");
        System.out.println(billetes50 + " billetes de 50");
        System.out.println(billetes20 + " billetes de 20");
        System.out.println(billetes10 + " billetes de 10");
        System.out.println(billetes5 + " billetes de 5");
        System.out.println(monedas2 + " monedas de 2 euros");
        System.out.println(monedas1 + " monedas de 1 euro");
    }
    
}
