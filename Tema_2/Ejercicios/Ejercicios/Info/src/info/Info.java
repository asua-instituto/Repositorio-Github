/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package info;

import java.util.Scanner;



/**
 *
 * @author espmi
 */
public class Info {

    //Constantes:
    
    final static float GRAVEDAD = 9.8f;
    
    // "Static" por que es global
    // "Final" porque es una constante es decir, no cambia el valor a lo
    // largo del codigo
    // Recuerda que cada ves que uses el tipo de variable "float" al numero
    // que quieres guardar el dato tienes que ponerle al final una f
    
    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
       /* 
        //Variables (Locales)
        //Enteros:
        byte edad;
        short distancia = 100;
        int numMatricula = 2453;
        long numAlumno = 30;
        
        //Decimales:
        float altura = 1.83f;
        double precio = 30.5F;
        
        //Boleanos:
        boolean enResposo = true;
        
        // Caracteres
        char letra = 'A';
        
        
        System.out.println("");
        
        int resto = distancia % 2; */
        
        // Entrada de Datos por teclado
        Scanner entrada = new Scanner(System.in);
        System.out.println("Cual es tu edad?: ");
        int edad2 = entrada.nextInt();
        
        System.out.println("Tu edad es: " + edad2);
        
    }
    
}
