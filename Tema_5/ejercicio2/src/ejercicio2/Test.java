/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio2;

/**
 *
 * @author espmi
 */
public class Test {
    public static void main(String[] args) {
        
        // Creamos los objectos.
        Curso curso1 = new Curso();
        Curso curso2 = new Curso();
        
        //Ponemos la información.
        curso1.establecerNombreyHoras("Programación", 30);
        curso2.establecerNombreyHoras("Sistemas Informáticos", 15);
        
        // Curso1
        System.out.println("El nombre del Curso1 es: "+curso1.obtenerNombre());
        System.out.println("La hora del Curso1 es: "+curso1.obtenerHoras());
        
        // Curso2
        System.out.println("\nEl nombre del Curso2 es: "+curso2.obtenerNombre());
        System.out.println("La hora del Curso2 es: "+curso2.obtenerHoras());
        
        // Número total de clientes registrados.
        System.out.println("\nEl numero de clientes registrado es: "+ Curso.verNumeroCursos());
    }
}
