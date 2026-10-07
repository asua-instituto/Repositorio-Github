/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tarea15;

/**
 *
 * @author espmi
 */
public class Tarea15 {

    /**
     * @param args the command line arguments
     * 
     * Ejercicio 15.- Realiza un programa en el que tengas una
     * variable entera llamada tiempo que contiene un tiempo
     * en segundos igual a 10000 (diez mil). Queremos conocer
     * ese tiempo, pero expresado en horas, minutos y
     * segundos.
     * 
     * • Muestra por pantalla el resultado de la siguiente forma:
     * 10.000 segundos hacen un total de: xxx horas, xxx
     * minutos y xxx segundos.
     * 
     */
    
    public static void main(String[] args) {
        
        // 1 hora = 60 min.
        // 1 minuto = 60 segundos.
        
        int tiempo = 10000;
        
        //Hora
        
        int hora = tiempo / 3600; // 2 (Horas)
        
       /*   Para convertir los segundos a horas dividimos el (Tiempo) 10.000 / 3600 (1 hora equivalente a segundos) 
            en una calculadora el resultado me daria: 2,77 (horas) pero para mostrarlo en pantalla uso "int"
            para ver solamente el entero es decir veria: 2 (horas)
       */ 
       
       // Minutos

       int segSobrantes = hora * 3600; // 7200 (segundos)
       segSobrantes = tiempo - segSobrantes; // 2800 (segundos sobrantes)
       int minutos = segSobrantes / 60; //46 (minutos)
               
               
        /*   Para ver los cuantos segundos "sobran" de la hora vamos a hacer la siguiente operacion:
               2 (horas) * 3600 (segundos que equivalen a una hora) = 7200 (segundos sobrantes)
               entonces descontamos los segundos que sabemos: 10.000 (segundos) - 7200 (segundos) = 2800 (segundos sobrantes).
               
               Ahora, tomamos esos 2800 (segundos sobrantes) y los dividimos por 60 para tener los (minutos restantes)
               Entonces el resultado es: 46,66 (minutos) pero para mostrarlo en pantalla uso "int"
               para ver solamente el entero es decir veria: 46 (minutos).
       */ 
        
        int segundos =  segSobrantes - (minutos * 60);
        
        /*   Para ver los cuantos segundos quedan necesito mutiplicar los 46 (minutos) * 60 para convertirlo a "los segundos que han pasado" 
                daria: 2760 (segundos) de los cuales tenemos que restar de los "segundos sobrantes"
       */ 
        System.out.println("10.000 segundos hacen un total de: " + hora + " horas, " + minutos + " minutos y " + segundos + " segundos");
    }
    
}
