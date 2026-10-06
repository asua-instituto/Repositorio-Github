/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio18;

import java.util.Scanner;

/**
 *
 * @author espmi
 */
public class Ejercicio18 {

    /**
     * @param args the command line arguments
     * 
     * Importante: No los hagas con palabras hazlo con NUMEROS
     * 
     * Ejercicio 18.- Realiza un programa que le pida una contraseña al usuario.
     * Si la escribe bien le dará la enhorabuena, pero si la escribe mal 3 veces
     * le dará un mensaje de error de acceso.
     * 
     * • Pista: Como sabes que al menos se ejecutará el bucle una vez, deberás utilizar un bucle do…while. 
     * 
     * • Comprime el proyecto con el nombre de ejercicio18.zip (o ejercicio18.rar)
     *  y súbelo a tu carpeta de Google Drive, dentro de una carpeta llamada Tema03.
     * 
     */
    
    final static int CLAVE = 1991;
    
    public static void main(String[] args) {
        
        int password, contador = 0 ;
        
        Scanner input = new Scanner (System.in);
        
        do {
            System.out.println("Ingresa tu contrasena [SOLO] numeros : ");
            password = input.nextInt();
            contador++;
            
            if (password == CLAVE) {
                System.out.println("Enhorabuena haz introducido la contasena bien que guay :D");
                } else if(contador < 3){
                   System.out.println("Haz puesto la contrasena mal intentalo nuevamente... tienes ("+contador+"/3)");
                }
       }while (password != CLAVE && contador < 3);
        
        if (contador == 3) {
            System.out.println("Error de acceso");
        }
        
    }
    
}
