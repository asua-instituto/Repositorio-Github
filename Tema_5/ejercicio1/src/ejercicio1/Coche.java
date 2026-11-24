/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio1;

/**
 *
 * @author espmi
 */

public class Coche {
    private String marca;
    private String modelo;
    private String color;
    private int velocidad;
    
    // Atributo estatico publico
    private boolean motor = false;
    
    // Atributos:
    
    //getters:
    // marca
    public String getMarca () {
        return marca;
    }

    // modelo
    public String getModelo () {
        return modelo;
    }

    // color
    public String getColor () {
        return color;
    }
    
    // velocidad
    public int getVelocidad () {
        return velocidad;
    }
    
    // motorEncendido
    public boolean getMotor () {
        return motor;
    }
    
    
    // setters:

    public void setMarca (String establecerMarca) {
        this.marca = establecerMarca;
    }
        
    public void setModelo (String establecerModelo) {
        this.modelo = establecerModelo;
    }
     
    public void setColor (String establecerColor) {
        this.color = establecerColor;
    }
        

    // Metodos: 
    
    public void arrancarCoche () {
            motor = true;
            velocidad = 10;
    }
    
    
    public void apagarCoche () {
            motor = false;
            velocidad = 0;
    }
    
    public void acelerarCoche () {
        velocidad = velocidad + 20; // velocidad = velocidad + 20;
    }
    
    public void frenarCoche () {
        velocidad = velocidad - 6; // velocidad = velocidad - 6;
    }
    
    public void obtenerEstado () {
        System.out.println("El modelo es: "+ modelo);
        System.out.println("El marca es: "+ marca);
        System.out.println("El color es: "+ color);
        System.out.println("La velocidad es: "+ velocidad);
        System.out.println("EL motor esta: "+ motor);
    }
    
}
