/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tema4;

import java.util.Scanner;
import operaciones.Operaciones;

/**
 *
 * @author espmi
 */
public class Tema4 {

    /**
     * @param args the command line arguments
     */
    
        /**
         * Metodo que pide al usuario un número entero
         * @return  el numero que escribe al usuario
         */
        public static int pedirNumero () {
            Scanner input = new Scanner (System.in);
            System.out.println("Numero: ");
            return input.nextInt();
            /*
            O puedes hacer los siguiente:
            int num = input.nextInt();
            return num;
            */
        }
                
         /**
         * Metodo que imprime por pantalla saludar
         */
        
        public static void saludar(){
            System.out.println("Hola, Mundo");
        }
        /**
         * Método que multiplica dos numeros recibidos por parametro
         * @param num1
         * @param num2
         * @return el resultado
         */
        public static int multiplicar(int num1,int num2){
            return num1 * num2;
        }
        
    public static void main(String[] args) {
        saludar();

        int num1 = pedirNumero();
        int num2 = pedirNumero();

        // Llamo al método multiplicar
        int resultado = multiplicar(num1, num2);
        
        // imprimo el resultado
        System.out.println("El resultado es: "+resultado);
        System.out.println(multiplicar(num1,num2));
        System.out.println("Multiplicando pasando el metodo por parametro:");
        System.out.println(multiplicar(pedirNumero(), pedirNumero()));
        
            // Llamo al metodo suma() de la clase operaciones que esta en el paqutte operaciones
        Operaciones.sumar(num1, num2);
    } 
   }


