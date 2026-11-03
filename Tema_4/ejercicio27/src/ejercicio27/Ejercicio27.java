/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio27;

import java.util.Scanner;

/**
 *
 * @author espmi
 */
public class Ejercicio27 {

    /*
        Ejercicio 27.- Escribe un programa que simule el
        lanzamiento de una moneda. Le pediremos al usuario
        que pida “cara” o “cruz” y generaremos aleatoriamente
        un resultado. Luego le mostraremos al usuario el
        resultado y le daremos la Enhorabuena si ha acertado o
        le diremos que ha perdido y otra vez le pediremos que
        elija “cara” o “cruz” y tiraremos la moneda de nuevo, así
        hasta que acierte.
     */
    
    /**
     * Verifica si el dato del usuario corresponde a lo que ha salido en la moneda.
     * @param datoUsuario [Dato del usuario.]
     * @param moneda [Dato de la cara de la moneda.]
     * @return Devuelve resultados del contraste de los datos devolviendo valores booleanos.
     */
    public static boolean verificar(String datoUsuario, String moneda) {
        if (moneda.equalsIgnoreCase(datoUsuario)) {
            System.out.println("¡Exelente haz acertado!");
            return true;
        } else {
            System.out.println("No haz acertado. Intentalo nuevamente...");
            return false;
        }
    }

    /**
     * Pedimos al usuario por pantalla lo que cree que va a salir en la moneda.
     * @return [Devuelve el dato del usuario.]
     */
    
    public static String pedirDato() {
        Scanner input = new Scanner(System.in);
        System.out.println("¿Qué lado de la moneda crees que va a salir (CARA / CRUZ)?");
        return input.nextLine();
    }

    /**
     * Simula el lanzamiento de la moneda de froma aleatoria.
     * @return CARA en caso de dar 1 y CRUZ en caso de ser 0.
     */
    public static String lanzarMoneda() {
        int resultado;
        resultado = (int) (Math.random() * 2);
        if (resultado == 1) {
            System.out.println("Ha salido en la moneda: CARA");
            return "CARA";
        } else {
            System.out.println("Ha salido en la moneda: CRUZ");
            return "CRUZ";
        }
    }

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        // Declaramos variables.
        boolean resultado;
        // Declaramos he inicializamos.
        int i = 0;
        do {
            // Almacenamos el valor booleano en resultado del metodo verificar() a travaz de los otros dos metodos.
            resultado = verificar(pedirDato(), lanzarMoneda());
            i++;
        } while (resultado == false);
        // Mostramos el número de intentos al usuario.
        System.out.println("Numero de intentos es: " + i);
    }

}
