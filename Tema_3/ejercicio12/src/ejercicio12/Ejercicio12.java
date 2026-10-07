/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio12;

/**
 *
 * @author espmi
 */
public class Ejercicio12 {

    /**
     * @param args the command line arguments
     * Ejercicio 12.- Crea un algoritmo en JAVA que, utilizando un
       bucle do…while, imprima los números pares que existen
       entre el número 11 y el número 133.
     * 
     */
    public static void main(String[] args) {
        int num1 = 11, num2 = 133;
        
        do{
            if(num1 % 2 == 0){
                System.out.println(num1);
                } else{
                    num1++;
                    }
        }while (num1 < num2);
    }
    
}
