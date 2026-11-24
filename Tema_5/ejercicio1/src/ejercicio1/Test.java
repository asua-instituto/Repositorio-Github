/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio1;

/**
 *
 * @author espmi
 */
public class Test {
    
    
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
