/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pruebaclases;

/**
 *
 * @author espmi
 */
public class PruebaClases {

    /**
     * Metodo main
     * 
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // crear dos bicicletas
        
        // Bici 1
        Bicicleta bici1 = new Bicicleta();
        bici1.setMarca("Orbea");
        bici1.setColor("Rojo");
        bici1.setPrecio(100f);
        bici1.setAnios(5);
        
        // Incrementar contador de bicis en 1
        Bicicleta.aumentarContadorBicicletas();
        
        // Bici 2
        Bicicleta bici2 = new Bicicleta();
        bici2.setMarca("Mérida");
        bici2.setColor("Azul");
        bici2.setPrecio(500f);
        bici2.setAnios(15);
        
        // Incrementar contador de bicis en 1
        Bicicleta.aumentarContadorBicicletas();
        
        // Mostrar bici1 (Mostrar)
        
        bici1.mostrarBicicletas();
        System.out.println(""); // Dar salto de linea
        
        // Mostrar bici2 (toString)
        
        System.out.println(bici2.toString());
        System.out.println(""); // Dar salto de linea
        
        // Mostrar color de bici1
        
        System.out.println("Color de bici1: " + bici1.getColor());
        
        // Mostar contador de Bicicletas
        System.out.println("Contador de Bicicletas: "+ Bicicleta.getContadorBicicleta());
        
    }
    
}
