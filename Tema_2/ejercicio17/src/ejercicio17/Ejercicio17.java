/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio17;

/**
 *
 * @author espmi
 */
public class Ejercicio17 {

    /**
     * @param args the command line arguments
     * 
     * Ejercicio 17.- Dadas las siguientes expresiones
       aritméticas, calcule cuál es el resultado de evaluarlas.
     * 
        a) 25 + 20 – 15
        b) 20 * 10 + 15 * 10
        c) 20 * 10/2 – 20 / 5 * 3
        d) 15 / 10 * 2 + 3 / 4 * 8
     * 
     */
    public static void main(String[] args) {
        
        int opa, opb, opc;
        double opd;
        
        opa = (25 + 20) - 15; 
        // su suma primeo la suma (25 + 20)
        // Quedaria en: "45" - 15
        // Se resta y el resultado seria 30
        
        opb = ((20 * 10) + (15 * 10)); 
        // El resultado es: 350, Se multiplica (20 * 10) y (15 * 10) quedaria en:
        // "200" + "150" = 350
        
        opc = ((20 * 10) / 2) - ((20 / 5) * 3);
        /*
        Se Multiplica (20 * 10) y (20 / 5) porque se leen las operaciones de izquierda a derecha
        quedaria "200" / 2 - "4" * 3 despues dividimos y mutiplicamos esta operaciones en parentesis ("200" / 2) - ("4" * 3)
        quedaria en ""100"" - ""12"" entonces hacemos la resta que daria (100 - 12) = 88
        */
        opd = (((double)15 / 10) * 2) + (((double)3 / 4) * 8);
        /*
        Se Divide (15 /10) y (3 / 4) quedaria la operacion: "1,5" * 2 + "0,75" * 8
        Se Mutiplica ("1,5" * 2) y ("0,75" * 8) quedaria la operacion: ""3"" + ""6""
        quedaria en 3 + 6 = 9
        */
        
        System.out.println("El resultado de la operacion 1 es: "+opa);
        System.out.println("\nEl resultado de la operacion 2 es: "+opb);
        System.out.println("\nEl resultado de la operacion 3 es: "+opc);
        System.out.println("\nEl resultado de la operacion 4 es: "+(int) opd);
        
        // se agrega el (int) en la salida para que convierta el resultado en entero aunque tambien lo puedes
        // hacer dentro de la operacion en el incio para indicar que de ese resultado lo convierta en en entero
    }
    
}
