/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio8;

import java.util.Scanner;

/**
 *
 * @author espmi
 */
public class Ejercicio8 {

    /**
     * @param args the command line arguments
     * 
     * Ejercicio 08.- Realiza un programa que dado un importe en euros nos indique número
        óptimo de billetes de 50, 20, 10 y 5, así como la cantidad sobrante en monedas de 2 y
        de 1 euro. En caso de que NO haya billetes/monedas de algún tipo NO se mostrarán.
        
     * • Por ejemplo:
        Por favor, indique una cantidad de dinero: 232
        232 Euros se descomponen en:
        Billetes de 50: 4
        Billetes de 20: 1
        Billetes de 10: 1
        Monedas de 2 euros: 1
     * 
        En el tema anterior: 232 Euros se descomponen en 4 billetes de 50, 1 billetes de 20, 1 billetes de 10, 0 billetes de 5, 1 monedas de 2 euros y 0 monedas de 1 euro.
     */
    public static void main(String[] args) {
        
        int dinero;
        
        Scanner input = new Scanner (System.in);
        
        System.out.println("Por favor, indique la cantidad de dinero: ");
        dinero = input.nextInt();
        
        int b50, b20, b10, b5, moneda2, moneda1;
     
        System.out.println(dinero +" Euros se descomponen en:");
        
         b50 = dinero / 50;
         dinero = dinero % 50;       
         
         if (b50 > 0) {
            System.out.println("Billetes de 50: "+b50);
         }
         
         b20 = dinero / 20;
         dinero = dinero % 20;
        
        if (b20 > 0) {
            System.out.println("Billetes de 20: "+b20);
        }
         
         b10 = dinero / 10;
         dinero = dinero % 10;
        
        if (b10 > 0) {
            System.out.println("Billetes de 10: "+b10);
        }
         
         b5 = dinero / 5;
         dinero = dinero % 5;
        
        if (b5 > 0) {
            System.out.println("Billetes de 5: "+b5);
        }
         
         moneda2 = dinero / 2;
         dinero = dinero % 2;
         
        if (moneda2 > 0) {
            System.out.println("Monedas de 2: "+moneda2);
        }
         
         moneda1 = dinero / 1;
         dinero = dinero % 1;         
         
        if (moneda1 > 0){
            System.out.println("Monedas de 1: "+moneda1);
        }
    }
    
}
