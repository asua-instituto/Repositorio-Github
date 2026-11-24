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

    /*
        Ejercicio 08.- Realiza un programa en JAVA, orientado a
        objetos, en el que crees una clase llamada Numero que
        contendrá un único atributo privado, llamado valor, de tipo
        entero.
        • Para probar el funcionamiento de la clase Numero, crea una
        nueva clase llamada Test donde le pidas al usuario un
        número por teclado. Luego, crea un objeto, siendo el
        número introducido por el usuario el valor del atributo valor.
        Posteriormente, le pasarás el objeto a un método que le dirá
        al usuario si el número introducido es par o impar.
     */
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

    /**
     * @param args the command line arguments
     */
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
