/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio1;

import java.util.Scanner;

/**
 *
 * @author espmi
 */

public class Ejercicio1 {

    /*
        Ejercicio 01.- Diseña una clase Coche que contenga los
        siguientes atributos privados:
    
        • marca (de tipo cadena)
        • modelo (de tipo cadena)
        • color (de tipo cadena)
        • velocidad (de tipo entero)
        • motorEncendido (de tipo booleano inicializado a false)

        • Además contendrá los siguientes métodos públicos:
    
        • establecerMarca.
        • establecerModelo.
        • establecerColor.
        • arrancarCoche (pone motorEncendido a true y velocidad a 10)
        • apagarCoche (pone motorEncendido a false y velocidad a 0)
        • acelerarCoche (aumenta en 20 la velocidad)
        • frenarCoche (disminuye 6 la velocidad)
        • obtenerEstado (muestra el valor de los atributos)

        • Para probar el funcionamiento de la clase Coche, crea otra clase llamada
        Test (dentro del mismo paquete) que contenga el método main donde se
        creen dos objetos de la clase Coche: miCoche y cochePadre. Luego realiza
        las siguientes operaciones:
    
        • Establece el modelo, marca y color, primero en el objeto miCoche y luego en cochePadre.
        • Arranca miCoche y luego arranca cochePadre.
        • Acelera 5 veces miCoche.
        • Frena 2 veces miCoche.
        • Acelera 3 veces cochePadre.
        • Apaga cochePadre.
        • Muestra el estado de miCoche y luego el estado de cochePadre.
    
    */

    
    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        // Crear los dos objetos de la clase Coche
        Coche miCoche = new Coche();
        Coche cochePadre = new Coche();

        // Establecer modelo, marca y color en miCoche
        miCoche.setMarca("Toyota");
        miCoche.setModelo("Corolla");
        miCoche.setColor("Rojo");

        // Establecer modelo, marca y color en cochePadre
        cochePadre.setMarca("Ford");
        cochePadre.setModelo("Focus");
        cochePadre.setColor("Azul");

        // Arrancar ambos coches
        miCoche.arrancarCoche();
        cochePadre.arrancarCoche();

        // Acelerar 5 veces miCoche
        for (int i = 0; i < 5; i++) {
            miCoche.acelerarCoche();
        }

        // Frenar 2 veces miCoche
        for (int i = 0; i < 2; i++) {
            miCoche.frenarCoche();
        }

        // Acelerar 3 veces cochePadre
        for (int i = 0; i < 3; i++) {
            cochePadre.acelerarCoche();
        }

        // Apagar cochePadre
        cochePadre.apagarCoche();

        // Mostrar estado de ambos coches
        System.out.println("=== Estado de miCoche ===");
        miCoche.obtenerEstado();

        System.out.println("\n=== Estado de cochePadre ===");
        cochePadre.obtenerEstado();
    }
    
}
