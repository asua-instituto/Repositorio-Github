/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio13;

import java.util.Scanner;

/**
 *
 * @author espmi
 */
public class Ejercicio13 {
   
    /*
        Ejercicio 13.- Crea un programa JAVA orientado a
        objetos que, utilizando bucles, escriba "Hola, que tal"
        cinco veces. Para ello tendrás una clase “Saludo” con un
        atributo “frase” de tipo String.
    
        • Realiza el ejercicio a tu gusto, con los métodos que
        consideres necesarios (cuantos más mejor). Intenta que
        el método main sea pequeño.
    */
    
    public static String pedirDato () {
        Scanner input = new Scanner (System.in);
        System.out.println("Introduce la frase");
        return input.nextLine();
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String frase;
        frase = pedirDato();
        
        // Construimos los objectos.
        Saludo saludo1 = new Saludo(frase);
        saludo1.repetirSaludo(5);
        
        
    }
    
}
