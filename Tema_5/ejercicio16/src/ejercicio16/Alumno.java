/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio16;

/**
 *
 * @author espmi
 */
public class Alumno {

    // Atributos
    private String nombre;
    private int nota;

    // Constructor por defecto
    public Alumno() {
        this.nombre = "";
        this.nota = 0;
    }

    // Constructor parametrizado
    public Alumno(String nombre, int nota) {
        this.nombre = nombre;
        this.nota = nota;
    }

    // Getters y Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNota() {
        return nota;
    }

    public void setNota(int nota) {
        this.nota = nota;
    }

    // Método para calcular la calificación en texto según la nota (con switch-case)
    public String obtenerCalificacion() {
        switch (nota) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
                return "Suspenso";
            case 5:
            case 6:
                return "Bien";
            case 7:
            case 8:
                return "Notable";
            case 9:
            case 10:
                return "Sobresaliente";
            default:
                return "Error: nota fuera de rango";
        }
    }

    @Override
    public String toString() {
        return "Alumno: " + nombre + " | Nota: " + nota + " | Calificación: " + obtenerCalificacion();
    }
}
