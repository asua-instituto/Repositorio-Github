/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package parqueatraciones;

import java.util.Scanner;

/**
 *
 * @author espmi
 */
public class ParqueAtraciones {

    
    public static int pedirDato () {
        boolean visitanteEnGrupo = false;
        int contador = 0;
        int esPrimo;
        int dividir = 0;
        Scanner input = new Scanner (System.in);
       
        do {
            System.out.println("¿Cúantos amigos van contigo?");
            esPrimo = input.nextInt();
            for (int i = 2; i <= esPrimo; i++) {
                if (esPrimo % i == 0) {
                    System.out.println("El grupo debe dividirse en: ");
                    dividir = (esPrimo / 2);
                    visitanteEnGrupo = true;
                    return esPrimo;
                    
                } else if (esPrimo % i == 0){
                    System.out.println("No se pude ir en grupos impares. Intenta nuevamente");
                }
            }
            contador++;
        } while (!visitanteEnGrupo);
        return -1;
    }
    
    public static void minutosOrdenados () {
        Scanner input = new Scanner (System.in);
        System.out.println("Dame el primer tiempo en [Minutos] ");
        int t1 = input.nextInt();
        System.out.println("Dame el Segundo tiempo en [Minutos] ");
        int t2 = input.nextInt();
        System.out.println("Dame el Tercer tiempo en [Minutos] ");
        int t3 = input.nextInt();
        
        int aux = 0, aux2 =0, aux3 = 0;
        
        if (t1 < t2) {
            t1 = aux;
            t1 = t2;
            aux = t2;
        } else if (t2 < t1) {
            t2 = aux2;
            t1 = t2;
            aux = t2;
        } else if (t1 < t3) {
            t1 = aux3;
            t1 = t3;
            t3 = aux;
        }
            
        System.out.println(" El orden de menor a mayor es: "+ t1 +" "+ t2 + " " + t3);
}
    
    public static double calcularArea () {
        System.out.println("Dame el radio del tiovivo: ");
        Scanner input = new Scanner (System.in);
        double radio = input.nextDouble();
        double calculo = (Math.sqrt(radio) * PI);
        return calculo;
    }
    
    final static double PI = 14.266666;

    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        int opcion;
        
        do {
   
            System.out.println("---- Parque de atrciones ----");
            System.out.println("1. Dividir Grupos");
            System.out.println("2. Ordenar los tiempos de las tres estaciónes");
            System.out.println("3. Calcular el area de la superficie sobre la que se colocará el nuevo tiovivo");
            System.out.println("4. Salir del programa");
            
            opcion = input.nextInt();
            
            switch (opcion) {
                case 1:
                    pedirDato ();
                    break;
                case 2:
                    minutosOrdenados();
                    break;
                case 3:
                    double dato = calcularArea();
                    System.out.println("El calculo es: "+dato);
                    break;
                case 4: 
                    System.out.println("Ha salido de la seccion...");
                    break;
                default :
                    System.out.println("Elige de la opcion 1 hasta la 4.");
            }
        }while (opcion != 4);
                
            
        
      
    }
    
}
