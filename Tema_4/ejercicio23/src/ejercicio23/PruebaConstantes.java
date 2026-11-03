/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio23;

import static ejercicio23.Constantes.CONSTANTEPLANCK;
import static ejercicio23.Constantes.CONSTANTEUNIVERSALGRAVITACION;
import static ejercicio23.Constantes.VELOCIDADLUZ;

/**
 *
 * @author espmi
 */
public class PruebaConstantes {

    /*
        Ejercicio 23.- Crea una clase llamada Constantes que
        contenga, únicamente, la declaración de 3 constantes
        estáticas (public final static double):
    
        • VELOCIDADLUZ
        • CONSTANTEUNIVERSALGRAVITACION
        • CONSTANTEPLANCK
        • Dentro del mismo paquete, crea otra clase llamada
    
        PruebaConstantes que en su método main imprima por
        pantalla el valor de las 3 constantes declaradas.
    */
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println(CONSTANTEPLANCK);
        System.out.println(CONSTANTEUNIVERSALGRAVITACION);
        System.out.println(VELOCIDADLUZ);
    }
    
}
