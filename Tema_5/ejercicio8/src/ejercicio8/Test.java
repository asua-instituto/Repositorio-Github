/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio8;

import java.util.Scanner;

/**
 *
 * @author espmi
 */
public class Test {

    public static void esPar(Numero n) {
        if (n.getNumero() % 2 == 0) {
            System.out.println("Es par");
        } else {
            System.out.println("Es impar");
        }
    }
    
    public static int pedirNumero() {
        Scanner input = new Scanner(System.in);
        int dato;
        System.out.println("Escribe un número: ");
        dato = input.nextInt();
        return dato;
    }

    public static void main(String[] args) {
        // El dato del usuario.
        int dato;
        dato = pedirNumero();
        
        // Creamos y pasamos el dato del usuario al constructor "Numero".
        Numero numero1 = new Numero(dato);
        
        // Comprobamos si el valor que tiene el objecto es par.
        esPar(numero1);
        
        
    }

}
