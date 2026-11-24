/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejemplo15;

/**
 *
 * @author espmi
 */
public class Empleado {

    // Atributos
    private String nombre;
    private int salario;
    private Direccion direccion;

    // Constructor por defecto
    public Empleado() {
        this.nombre = "";
        this.salario = 0;
        this.direccion = new Direccion();
    }

    // Constructor parametrizado
    public Empleado(String nombre, int salario, Direccion direccion) {
        this.nombre = nombre;
        this.salario = salario;
        this.direccion = direccion;
    }

    // Getters y Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getSalario() {
        return salario;
    }

    public void setSalario(int salario) {
        this.salario = salario;
    }

    public Direccion getDireccion() {
        return direccion;
    }

    public void setDireccion(Direccion direccion) {
        this.direccion = direccion;
    }
    
    // toString
    @Override
    public String toString() {
        return "\nNombre: " + nombre + "\n"
             + "Salario: " + salario + "\n"
             + "Dirección:\n"
             + direccion.toString();
    }
}
