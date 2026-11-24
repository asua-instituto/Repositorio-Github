/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio2;

/**
 *
 * @author espmi
 */
public class Curso {
    
    // Atributos:
    private String nombre;
    private int numeroHoras;
    // Atributo [estatico]
    private static int numeroDeCursos = 0;
    
    // Metodos Publicos:
    public void establecerNombreyHoras (String nom, int hora) {
        nombre = nom;
        numeroHoras = hora;
        sumarCursos();
    }
    public String obtenerNombre () {
        return nombre;
    }
    public int obtenerHoras () {
        return numeroHoras;
    }
    
    // Metodos estaticos para trabajar con el atributo estatico.
    public static void sumarCursos () {
        numeroDeCursos = numeroDeCursos + 1; // tambien puede ser: numeroDeCursos++;
    }
    
    public static int verNumeroCursos () {
        return numeroDeCursos;
    }
    
    
}
