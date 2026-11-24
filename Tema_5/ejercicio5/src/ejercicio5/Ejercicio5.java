/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio5;

import java.util.Scanner;

/**
 *
 * @author espmi
 */
public class Ejercicio5 {
    /*
        Ejercicio 05.- Realiza un programa en JAVA en el que le pidas al usuario las notas de las 6 asignaturas del
        Ciclo de DAM y te calcule la nota media del curso.
    
        • o Nota 1: Cada una de las asignaturas serán un objeto cuyos atributos serán el nombre y la nota.
        • o Nota 2: Crea un constructor con el que puedas asignar directamente el nombre de la asignatura al crear el
        objeto. En cambio, el atributo nota, será el usuario quien lo introduzca mediante un método al que se le
        pase la nota como argumento.
        • o Nota 3: Crea otro método que reciba las 6 notas como argumentos y devuelva la nota media (return)
    
        • o Ejemplo de ejecución:
        Por favor, introduzca la nota de Programación: 6,5
        Introduzca la nota de Lenguajes de Marcas: 7,5
        Introduzca la nota de Bases de Datos: 7,5
        Introduzca la nota de Entornos de Desarrollo: 8
        Introduzca la nota de Sistemas Informáticos: 6,5
        Por último, introduzca la nota de Formación y Orientación Laboral: 6
        Su nota media del curso es de: 7
    */
    
    /**
     * @param args the command line arguments
     */
    
    // Método que recibe las 6 notas como argumentos y devuelve la nota media
    public static double calcularMedia(double n1, double n2, double n3, double n4, double n5, double n6) {
        return (n1 + n2 + n3 + n4 + n5 + n6) / 6;
    }
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Creamos los 6 objetos Asignatura pasando su nombre al constructor
        Asignatura prog = new Asignatura("Programación");
        Asignatura lm = new Asignatura("Lenguajes de Marcas");
        Asignatura bd = new Asignatura("Bases de Datos");
        Asignatura ed = new Asignatura("Entornos de Desarrollo");
        Asignatura si = new Asignatura("Sistemas Informáticos");
        Asignatura fol = new Asignatura("Formación y Orientación Laboral");

        // Pedimos las notas al usuario y las guardamos usando setNota()
        System.out.print("Por favor, introduzca la nota de " + prog.getNombre() + ": ");
        prog.setNota(input.nextDouble());

        System.out.print("Introduzca la nota de " + lm.getNombre() + ": ");
        lm.setNota(input.nextDouble());

        System.out.print("Introduzca la nota de " + bd.getNombre() + ": ");
        bd.setNota(input.nextDouble());

        System.out.print("Introduzca la nota de " + ed.getNombre() + ": ");
        ed.setNota(input.nextDouble());

        System.out.print("Introduzca la nota de " + si.getNombre() + ": ");
        si.setNota(input.nextDouble());

        System.out.print("Por último, introduzca la nota de " + fol.getNombre() + ": ");
        fol.setNota(input.nextDouble());

        // Calculamos la media pasando las 6 notas como argumentos
        double media = calcularMedia(
                prog.getNota(),
                lm.getNota(),
                bd.getNota(),
                ed.getNota(),
                si.getNota(),
                fol.getNota()
        );

        System.out.println("Su nota media del curso es de: " + media);
        
        
    }
}
