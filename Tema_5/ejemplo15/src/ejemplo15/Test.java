/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejemplo15;

/**
 *
 * @author espmi
 */
public class Test {

    public static void main(String[] args) {
        // 1. Creamos las 3 direcciones
        Direccion dir1 = new Direccion("Calle Mayor", 12, "3º A", "Madrid");
        Direccion dir2 = new Direccion("Avenida de la Constitución", 45, "1º B", "Sevilla");
        Direccion dir3 = new Direccion("Calle Gran Vía", 8, "Bajo", "Valencia");

        // 2. Creamos los 3 empleados asignándoles una dirección a cada uno
        Empleado emp1 = new Empleado("Xamira Alejandra", 1800, dir1);
        Empleado emp2 = new Empleado("Luis Pérez", 2100, dir2);
        Empleado emp3 = new Empleado("Marta Castañeda", 1950, dir3);

        // 3. Imprimimos directamente usando toString()
        System.out.println(emp1.toString());
        System.out.println(emp2.toString());
        System.out.println(emp3.toString());
    }
}
