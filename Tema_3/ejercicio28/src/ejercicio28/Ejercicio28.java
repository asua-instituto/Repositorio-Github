/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio28;

/**
 *
 * @author espmi
 */
public class Ejercicio28 {

    /**
     * @param args the command line arguments
     * 
     * Ejercicio 28.- Realiza un programa que genere un número
        aleatorio (utiliza Math.random() ) entre 1 y 100, que lo muestre
        por pantalla e indique si es par o impar.
     * 
        • Pistas: El método Math.random() devuelve un double aleatorio entre 0 y el 1,
        sin incluir el 1 (o sea, desde el 0 y el 0,99999). Ejemplo: double aleatorio =
        Math.random();
     * 
        • Si quisiéramos un aleatorio entre 0 y 4 (exclusivo) bastará con multiplicar por 4.
        Ejemplo: double aleatorio = (Math.random())*4;
     * 
        • Si quisiéramos un aleatorio entre 1 y 4 (exclusivo) bastará con multiplicar por 4
        y sumar 1. Ejemplo: double aleatorio = (Math.random())*4+1;

        • Si queremos obtener un número aleatorio entero, en vez de
        double, lo podemos hacer en dos pasos:
     * 
        I. Mediante el método Math.floor, que redondea al entero inferior. Ejemplo de
        aleatorio entre 0 y 3:
        double aleatorio = Math.floor((Math.random()*4);
     * 
        //Otra forma:
        double aleatorio=(Math.random()*4);
        aleatorio=Math.floor(aleatorio);
     * 
        II. Luego, hacemos cast:
        int aleatorioEntero = (int) aleatorio;
     */
    public static void main(String[] args) {
        
            // declaramos y incializamos entre que datos va a tomar para hacer la probabilidad (1 - 100)
        double aleatorio = (Math.random()*100+1);
            // Agarramos el valor
        aleatorio = Math.floor(aleatorio);
            // Lo convertimos en entero ya que esta por default en double
        int aleatorioEntero = (int) aleatorio;
        
        // Informacion para el usuario
            System.out.println("El numero aleatorio que ha salido es: [" + aleatorioEntero+"]");
        
                    //Comprobacion de si es par o impar
                if (aleatorioEntero % 2 == 0) {
                    System.out.println("Ese numero ["+aleatorioEntero+"] es: [PAR]");
                } else {
                    System.out.println("Ese numero ["+aleatorioEntero+"] es: [INPAR]");
                }
    }
    
}
