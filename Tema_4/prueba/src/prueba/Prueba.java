/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package prueba;

import java.util.Scanner;

/**
 *
 * @author espmi
 */
public class Prueba {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
                Scanner input = new Scanner (System.in);
        System.out.println("Dame el primer tiempo en [Minutos] ");
        int t1 = input.nextInt();
        System.out.println("Dame el Segundo tiempo en [Minutos] ");
        int t2 = input.nextInt();
        System.out.println("Dame el Tercer tiempo en [Minutos] ");
        int t3 = input.nextInt();
        
        int aux = 0;
        
        if (t1 < t2) {
            t1 = aux;
            t1 = t2;
            aux = t2;
        } else if (t2 < t3) {
            t2 = aux;
            t2 = t3;
            aux = t3;
        } 
            
        System.out.println(" El orden de menor a mayor es: "+ t1 +" "+ t2 + " " + t3);
    }
    
}
