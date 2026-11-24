/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio2;

/**
 *
 * @author espmi
 */
public class Ejercicio2 {

    /*
        Ejercicio 02.- Diseña una clase Curso que contenga los siguientes atributos
        privados:
    
        • nombre (de tipo cadena)
        • numeroHoras (de tipo entero)
    
        • Además dispondrá de un atributo estático llamado numeroDeCursos de tipo
        entero que lo utilizaremos para contar los objetos que vamos creando.
    
        • La clase Curso contendrá los siguientes métodos públicos:
    
        • establecerNombreyHoras.
        • obtenerNombre.
        • obtenerHoras.

        • Además, la clase Curso, dispondrá de dos métodos estáticos (para trabajar con el
        atributo estático):
    
        • sumarCursos
        • verNumeroCursos
    
        • Para probar el funcionamiento de la clase Curso, crea otra clase llamada Test
        (dentro del mismo paquete) que contenga el método main, donde se creen dos
        objetos de la clase Curso: curso1 y curso2. Luego realiza las siguientes operaciones:
    
        • Establece el nombre y el número de horas, primero en el objeto curso1 y luego en curso2.
        • Muestra los datos de los 2 cursos creados.
        • Por último, muestra el número de cursos creados almacenados en el atributo estático de clase
        numeroDeClientes.
    */
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Creamos lo objectos.
        Curso curso1 = new Curso();
        Curso curso2 = new Curso();
        
        //Ponemos la información.
        curso1.establecerNombreyHoras("Programación", 30);
        curso2.establecerNombreyHoras("Sistemas Informaticos", 15);
        
        // Curso1 info.
        System.out.println("El nombre del Curso1 es: "+curso1.obtenerNombre());
        System.out.println("La hora del Curso1 es: "+curso1.obtenerHoras());
        
        // Curso2 info.
        System.out.println("\nEl nombre del Curso2 es: "+curso2.obtenerNombre());
        System.out.println("La hora del Curso2 es: "+curso2.obtenerHoras());
        
        // Número total de clientes registrados.
        
        System.out.println("\nEl numero de clientes registrado es: "+ Curso.verNumeroCursos());
    }
    
}
