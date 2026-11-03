/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio16;

/**
 *
 * @author espmi
 */
public class Ejercicio16 {

    
    /*  Ejercicio 16.- Crea un programa en JAVA que calcule las siguientes operaciones y
        muestre su resultado:
    
        • Raíz cuadrada de 64.
    
        • 8 elevado al cubo.
    
        • Exponencial de 2.
    
        • Logaritmo de 2,71828.
    
        • Menor valor entre 2 y 3.
    
        • Valor absoluto de -4,5.
    
        • Redondeando -4,5 con ROUND.
    
        • Seno de 45 grados.
    
        • IMPORTANTE: Cada operación se realizará en un subprograma [Es decir, un método]. */
    
    /**
     * Este metodo sirve para devolver el seno.
     * @param n1 [45 grados]
     * @return [Devuelve el seno]
     */
    
    public static double seno (double n1) {
        return Math.sin(n1 * Math.PI / 180);
    }
        
    /**
     *  Un metodo para devolver el redondeo de un valor.
     * @param n1 [valor de 4,5]
     * @return [El valor redondeado]
     */    
    
    public static double redondear (double n1) {
        return Math.round(n1);
    }
    
    /**
     *  un metodo para devolver el valor absoluto de un valor.
     * @param n1 [valor de 4,5]
     * @return [El valor absoluto]
     */
    
    public static double vlAbsoluto (double n1) {
        return Math.abs(n1);
    }
    
    /**
     * Un metodo para devolvernos el menor entre dos valores.
     * @param n1 valor [2]
     * @param n2 valor [3]
     * @return [El menor de entre esos dos números]
     */
    
    public static int menorDE (int n1, int n2) {
        return Math.min(n1, n2);
    }
    
    /**
     * La operación en base
     * @param expo El Exponencial 2,71828
     * @return [El logaritmo en base del exponencial]
     */
    
    public static double logaritmo(double expo) {
        return Math.log(expo);
    }
    
    /**
     * La operación de convertir el número extraido en exponencial
     * @param expo [El valor de 2]
     * @return [Devuelve el valor exponencial del número]
     */
    
    public static double exponencial(int expo){
        return Math.exp(expo);
    }
    
    /**
     * 
     * @param elevado número 8
     * @param cubo numero 3
     * @return [La operación de elevarlo al cubo]
     */
    
    public static double alCubo (int elevado, int cubo){
        return Math.pow(elevado, cubo);
    }
    
    /**
     * La operación de convertir el número extraido en una raiz
     * y sacar su resultado
     * @param raiz [El valor de 64]
     * @return [La raiz de dicho número]
     */
    
    public static double raiz (int raiz){
        return Math.sqrt(raiz);
    }
    
    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        int raiz = 64, elevado = 8, expo = 2, menor1 = 2, menor2 = 3;
        double absoluto = -4.5, redondeo = -4.5, seno = 45, logVal = 2.71828;
        
        System.out.println("Raíz cuadrada de 64 es: "+raiz(raiz));
        
        System.out.println("8 elevado al cubo "+alCubo(elevado,3));
        
        System.out.println("Exponencial de 2 es: "+exponencial(expo));
        
        System.out.println("Logaritmo de 2,71828 es: "+logaritmo(logVal));
        
        System.out.println("Menor valor entre 2 y 3 es "+menorDE(menor1,menor2));
        
        System.out.println("Valor absoluto de -4,5 es: "+vlAbsoluto(absoluto));
        
        System.out.println("El redondeo de -4,5 es: "+redondear(redondeo));
        
        System.out.println("Seno de 45 grados es: "+seno(seno));
        
    }
    
}
