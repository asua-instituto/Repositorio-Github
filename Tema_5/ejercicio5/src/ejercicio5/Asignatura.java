/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio5;

/**
 *
 * @author espmi
 */
public class Asignatura {
    private String nombre;
    private double nota;

    // Constructor que asigna directamente el nombre al crear el objeto
    public Asignatura(String nombre) {
        this.nombre = nombre;
    }

    // Método para asignar la nota pasándola como argumento
    public void setNota(double no) {
        this.nota = no;
    }

    public String getNombre() {
        return nombre;
    }

    public double getNota() {
        return nota;
    }


}


