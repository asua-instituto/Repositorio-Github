/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejemplo15;

/**
 *
 * @author espmi
 */
public class Ejemplo15 {
    /*
        Ejercicio 15.- Diseña una clase Dirección con los atributos calle, número, piso y ciudad. A
        continuación, diseña una clase Empleado con los atributos nombre (de tipo String), salario (de tipo
        int) y dirección (de tipo Dirección).
    
        • Para probar la funcionalidad de las clases creadas crea una clase Test donde crees 3 direcciones y
        luego crea tres empleados, asignándoles una de las direcciones anteriormente creadas. Por último,
        crea un método que muestre los datos de cada empleado creado:
    
        EMPLEADO 1:
        Nombre: XXX
        Salario: XXX
        Dirección:
        Calle: XXX
        Número: XXX
        Puerta: XXX
        Ciudad: XXX
        EMPLEADO 2:
        Nombre: …………..
    */
    /**
     * @param args the command line arguments
     */
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
