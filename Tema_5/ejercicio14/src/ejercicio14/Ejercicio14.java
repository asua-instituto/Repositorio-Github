/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio14;

import java.util.Scanner;

/**
 *
 * @author espmi
 */
public class Ejercicio14 {

    /*
        Ejercicio 14.- Realiza un programa que, utilizando bucles,
        imprima la tabla de multiplicar de un número que elija el
        usuario.
    
        • Utiliza el constructor por defecto. Luego llama a un método
        que asignará al atributo “valor” de la clase “Numero” el
        número que elija el usuario.
    
        • Realiza el ejercicio a tu gusto, con los métodos que
        consideres necesarios (cuantos más mejor). Intenta que el
        método main sea pequeño.
    */
    
    public static int pedirNumero () {
        Scanner input = new Scanner (System.in);
        System.out.println("Cuál número de tabla quieres:");
        return input.nextInt();
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Pedimos el dato del usuario.
        int valor;
        valor = pedirNumero();

        // Contruimos el objecto.
        Numero numero1 = new Numero(valor);
        numero1.crearTabla();
        
    }
    
}
