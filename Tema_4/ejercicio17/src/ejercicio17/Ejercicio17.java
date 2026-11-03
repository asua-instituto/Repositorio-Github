/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio17;

import java.util.Scanner;

/**
 *
 * @author espmi
 */

public class Ejercicio17 {

    /*
        • Ejercicio 17.- Escribe un programa que juegue con el usuario a adivinar una letra
        minúscula. El ordenador debe generar una letra aleatoria entre a y z, y el usuario
        tiene que intentar adivinarla.
    
        • Para ello, cada vez que el usuario introduce un valor el ordenador debe decirle al
        usuario si la letra que tiene que adivinar está antes o después en el alfabeto.
    
        • Cuando consiga adivinarlo debe indicárselo e imprimir en pantalla el número de
        intentos que el usuario ha necesitado para adivinar el número. Recuerda utilizar
        subprogramas.
    
        • Pistas:
        • El código ASCII de la a es el 97, y el de la z es el 122.
        • Para capturar el char que introduzca el usuario, utiliza:
        char letra=entrada.nextLine().charAt(0);
    */
    
    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        double aleatorio = Math.floor((Math.random()*122)+97);
        int aleatorioEntero = (int)aleatorio;
        char aleatorioChar = (char) aleatorio;
        int num = 0, intentos = 0;
        boolean enc = false;
        
        System.out.println("Número secreto: "+aleatorioEntero);
        System.out.println("Número secreto: "+aleatorioChar);

        do{
            System.out.print("\nAdivina el número: ");
            try{
                num = teclado.nextInt();    
            }
            catch(Exception e){
                System.out.print("Error. Debes introducir un número válido: "+e.getMessage());
                teclado.nextLine();
            }
            finally{
                if  (num > aleatorioEntero){
                    System.out.print("\nEl número a adivinar es más pequeño");
                }
                else{
                    if  (num < aleatorioEntero){
                        System.out.print("\nEl número a adivinar es más grande");
                    }
                    else{
                        enc = true;
                    }
                }
                intentos++;
            }
        }while(!enc);
        System.out.print("\n¡Enhorabuena! Has necesitado "+intentos+" intentos");
            
        
        
        //Scanner input = new Scanner (System.in);
        
            //letra = input.nextLine().charAt(0);
            
            //System.out.println("lo que haz escrito es: "+letra);

    }
    
}
