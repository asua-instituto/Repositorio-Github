/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pruebaclases;

/**
 *  Clase Bicicleta
 * 
 * 
 * @author espmi
 */
public class Bicicleta {
    // Atributos (NUNCA se inicializa en la declaración)
    private String marca;
    private String color;
    private float precio;
    private int anios;
    
    // Atributo static (Sí se inicializa en la declaración
    private static int contadorBicicleta = 0;
    
    // Métodos
    // Getters / Setters
    public String getMarca () {
        return marca;
    }
    public void setMarca (String m) {
        marca = m;
    }
    public String getColor () {
        return color;
    }
    public void setColor (String c) {
        color = c;
    }
    public float getPrecio () {
        return precio;
    }
    public void setPrecio (float p) {
        precio = p;
    }
    public int getAnios () {
        return anios;
    }
    public void setAnios (int a) {
        anios = a;
    }
    
    public static int getContadorBicicleta () {
        return contadorBicicleta;
    }
    
    public static void aumentarContadorBicicletas () {
        contadorBicicleta++;
    }
    
    
    
    // Otros métodos
    
    public void mostrarAntiguedad () {
        if (anios > 10) {
            System.out.println("La bici es antigua");
        } else {
            System.out.println("La bici es nueva");
        }
    }
    
    // Método mostrar / toString()
    public void mostrarBicicletas (){
        System.out.println("Marca: " + marca);
        System.out.println("Color: " + color);
        System.out.println("Precio: " + precio);
        System.out.println("Años: " + anios);
    }
    
    @Override
    public String toString () {
        return "Marca: " + marca
                + "Color: " + color
                + "Precio: " + precio
                + "Años: " + anios;
    }
    
}
