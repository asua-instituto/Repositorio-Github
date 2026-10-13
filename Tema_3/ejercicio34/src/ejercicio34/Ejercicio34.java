/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio34;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author espmi
 */
public class Ejercicio34 {

    /**
     * @param args the command line arguments
     * 
     *  Ejercicio 34.- Realizar un programa que calcule el tiempo
        en horas y minutos que tarda un tren en llegar a su destino.
     * 
        • Para ello se le pedirán al usuario el día, hora y minuto de
        salida y el día, hora y minuto de llegada.
     * 
        • Controla que la hora de llegada sea posible (no se puede
        retroceder en el tiempo), pero ten en cuenta que, por
        ejemplo, un tren puede salir a las 6 de la tarde y llegar a las
        5 de la tarde del día siguiente.
     * 
     */
    public static void main(String[] args) {
        
        
        // Variables de entrada
        int boleto_s_dia, boleto_s_hora, boleto_s_minuto, boleto_l_dia, boleto_l_hora, boleto_l_minuto;
        
        
        // Variables de manejo de informacion
        int minutosTotal_s, minutosTotal_l, diferenciaMinutos, traslado_hora, traslado_minutos, i = 0;
        
        // Pedimos los datos al (usuario)
        
        Scanner input = new Scanner (System.in);
        
        do {
            
            try {
                                // Dia:5 Hora:6 Minuto:20
            System.out.println("Introduce el boleto de [SALIDA] del tren en el siguiente formato:");
                System.out.println("---DATOS SALIDA ---");
                    System.out.println("[Dia]: ");
                        boleto_s_dia = input.nextInt();
                    System.out.println("[Hora (0-23)]: ");
                        boleto_s_hora = input.nextInt();
                    System.out.println("[Minuto] (0-59): ");
                        boleto_s_minuto = input.nextInt();

            // Día:6 Hora:5 Minuto:20
            System.out.println("\nIntroduce el boleto de [Llegada] del tren en el siguiente formato:");
                System.out.println("---DATOS LLEGADA ---");
                    System.out.println("[Dia]: ");
                        boleto_l_dia = input.nextInt();
                    System.out.println("[Hora (0-23)]: ");
                        boleto_l_hora = input.nextInt();
                    System.out.println("[Minuto] (0-59): ");
                        boleto_l_minuto = input.nextInt();
                    i++;
                        if (boleto_s_hora < 0 || boleto_s_hora > 23 || boleto_s_minuto < 0 || boleto_s_minuto > 59 || boleto_l_hora < 0 || boleto_l_minuto > 23){
                            
                            // Normalizamos los valores a unidad más pequeña (Minutos) para trabajar más comodo con los valores.
                            minutosTotal_s = ((boleto_s_dia * 24) * 60) + (boleto_s_hora * 60) + boleto_s_minuto;
                            minutosTotal_l = ((boleto_l_dia * 24) * 60) + (boleto_l_hora * 60) + boleto_l_minuto;
                            
                            //Restamos la diferencia entre ambos valores:
                            diferenciaMinutos = minutosTotal_l - minutosTotal_s;
                            
                            traslado_hora = diferenciaMinutos / 60;
                            traslado_minutos = diferenciaMinutos % 60;
                            
                            // Imprimimos por pantalla (usuario)
                            
                            System.out.println("\nTiempo de traslado: Horas: " + traslado_hora + " y Minutos: " + traslado_minutos);
                            break;
            
                                } else if(boleto_l_dia < boleto_s_dia){
                                    System.out.println("ERROR; No eres un viajero del tiempo");
                                    break;
                                }
                        } catch (InputMismatchException e){
                            System.out.println("Error! Tio no haz escrito un numero.");
                        }
            }while (i < 3);
                            }

                        }
