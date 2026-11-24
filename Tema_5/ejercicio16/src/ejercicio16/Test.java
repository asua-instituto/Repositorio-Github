/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio16;

import java.util.Scanner;

/**
 *
 * @author espmi
 */
public class Test {

    static Scanner input = new Scanner(System.in);

    // Pide el nombre del alumno
    public static String pedirNombre() {
        System.out.print("Introduce el nombre del alumno: ");
        return input.nextLine();
    }

    // Pide la nota y avisa con un error si no está entre 0 y 10
    public static int pedirNota() {
        int nota;
        do {
            System.out.print("Introduce la nota (0 a 10): ");
            nota = input.nextInt();
            input.nextLine(); // Limpia el salto de línea para el siguiente nextLine()

            if (nota < 0 || nota > 10) {
                System.out.println("ERROR: La nota debe estar entre 0 y 10. Inténtalo de nuevo.");
            }
        } while (nota < 0 || nota > 10);

        return nota;
    }

    // Crea y devuelve un objeto Alumno pidiendo sus datos
    public static Alumno crearAlumno(int numero) {
        System.out.println("\n--- ALUMNO " + numero + " ---");
        String nombre = pedirNombre();
        int nota = pedirNota();
        return new Alumno(nombre, nota);
    }

    // Muestra la calificación de los 3 alumnos usando toString()
    public static void mostrarResultados(Alumno a1, Alumno a2, Alumno a3) {
        System.out.println("\n=== CALIFICACIONES ===");
        System.out.println(a1.toString());
        System.out.println(a2.toString());
        System.out.println(a3.toString());
    }

    // Método principal del programa
    public static void ejecutar() {
        Alumno alumno1 = crearAlumno(1);
        Alumno alumno2 = crearAlumno(2);
        Alumno alumno3 = crearAlumno(3);

        mostrarResultados(alumno1, alumno2, alumno3);
    }

    public static void main(String[] args) {
        ejecutar();
    }
}
