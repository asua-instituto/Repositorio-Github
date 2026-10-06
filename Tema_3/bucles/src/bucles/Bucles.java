/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bucles;

import java.util.Scanner;

/**
 *
 * @author espmi
 */
public class Bucles {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int indice = 0;
        
        // WHILE
        System.out.println("WHILE");
        while(indice < 10) {
            System.out.println(indice);
            indice++;
            
            // DO WHILE
            System.out.println("DO WHILE");
            //indice = 0;
            do {
                System.out.println(indice);
                indice++;
            } while (indice < 10);
            
            // FOR
            System.out.println("FOR");
            for (int i=0; i < 10; i++){
                System.out.println(i);
            }
            // MENUS
            int opc = 0;
            
            Scanner input = new Scanner (System.in);
            
            do {
                // MOSTRAR EL MENÚ AL USUARIO
                System.out.println("-- MENU --");
                System.out.println("1. Ver catálogo");
                System.out.println("2. Solicitar libro");
                System.out.println("3. Devolver libro");
                System.out.println("4. Salir");
                
                // PEDIR OPCIÓN
                System.out.println("Elija una opción: ");
                opc = input.nextInt();
                
                switch (opc) {
                    case 1:
                        System.out.println("Has elejido ver el catalogo");
                        break;
                    case 2:
                        System.out.println("Has elegido solicitar un libro");
                        break;
                    case 3:
                        System.out.println("Haz elegido devolver un libro");
                        break;
                    case 4:
                        System.out.println("Gracias por usar el programa");
                }
                
            }while(opc != 4);
        }
    }
    
}
