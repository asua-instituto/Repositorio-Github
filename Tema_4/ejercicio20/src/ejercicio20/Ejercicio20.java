/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio20;

import java.util.Scanner;

/**
 *
 * @author espmi
 */

public class Ejercicio20 {

    /*
        Ejercicio 20.- Realiza un programa que le haga un examen al usuario, preguntándole cuál
        es la capital de España y quién descubrió América.
    
        • Le dirá si ha respondido correctamente o no, cual sería la respuesta correcta, y por último
        le dirá su nota (Un 0, un 5 o un 10)
    
        • Ejemplo de ejecución:
    
        EXAMEN DE CULTURA GENERAL
        1ª PREGUNTA: ¿Cuál es la capital de España?: Madrid
        Muy bien, respuesta correcta.
    
        2ª PREGUNTA: ¿Quién descubrió América?: Napoleón Bonaparte
        No es correcto. La respuesta correcta sería Colón
        NOTA DEL EXAMEN: 5
    
        • Nota: Las 2 soluciones (Madrid y Colón) guárdalas como constantes. Además,
        procura hacer cada pregunta en un método distinto.
    */
    
    /**
     * Para comprobar si el usuario ha introducido la respuesta correcta asignando una puntuación [America].
     * @param v1 [Entrada de texto que ha introducido el usuario].
     * @return 5 en caso de ser verdadero 5 y 0 en caso de lo contrario.
     */
    
    public static int verificarAmerica (String v1) {
        if (v1.equalsIgnoreCase(AMERICA) || v1.equalsIgnoreCase("Colon")) {
            System.out.println("Muy bien, respuesta correcta.");
            return 5;
        } else {
            System.out.println("No es correcto. La respuesta correcta es: Cólon");
            return 0;
        }
    }

    /**
     * Para comprobar si el usuario ha introducido la respuesta correcta asignando una puntuación con [Capital].
     * @param v1 [Entrada de texto que ha introducido el usuario].
     * @return 5 en caso de ser verdadero 5 y 0 en caso de lo contrario.
     */    
    
    public static int verificarCapital(String v1) {
        if (v1.equalsIgnoreCase(CAPITAL)) {
            System.out.println("Muy bien, respuesta correcta.");
            return 5;
        } else {
            System.out.println("No es correcto. La respuesta correcta es: Madrid");
            return 0;
        }
    }
    
    /**
     * Almacenar lo que el usuario escribe.
     * @return [lo que ha escrito el usuario].
     */
    
    public static String pedirDato (){
        Scanner input = new Scanner (System.in);
        return input.nextLine();
    }
    
    // Declaramos y almacenamos los valores constantes verdaderas.
    
    final static String CAPITAL = "Madrid";
    final static String AMERICA = "Colón";
    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        
        // Declaramos las variables.
        String v1, v2;
        int nTotal = 0;
        
        // Salida por pantalla.
        System.out.println("--- EXAMEN DE CULTURA GENERAL ---");
        System.out.println("1ª PREGUNTA: ¿Cuál es la capital de España?:");
        //Pedimos el dato
        v1 = pedirDato();
        // Almacenamos el valore.
        nTotal += verificarCapital(v1);
        
        System.out.println("2ª PREGUNTA: ¿Cuál es la capital de America?:");
        v2 = pedirDato();
        nTotal += verificarAmerica(v2);
        
        // Mostramos el valor de la nota total.
        System.out.println("NOTA DEL EXAMEN:"+nTotal);
    }
    
}
