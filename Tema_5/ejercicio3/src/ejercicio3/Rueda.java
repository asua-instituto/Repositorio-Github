/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio3;

/**
 *
 * @author espmi
 */
public class Rueda {
    
    // Declaramos los atributos:
    private String material;
    private int pulgadas;
    
    // Metodos publicos (getter y setter):
    
    // setter
    public void establecerMaterial (String ma) {
        material = ma; 
    }
    
    public void establecerPulgadas (int pul) {
        pulgadas = pul;
    }
    
    //getter
    public String obtenerMaterial () {
        return material;
    }
    
    public int obtenerPulgadas () {
        return pulgadas;
    }
    
    
    // Mostramos los datos:
    public String toString () {
        return "\n----- Datos de Ruedas: -----" 
                + "\nMaterial: " + material 
                + "\nPulgadas: " + pulgadas; 
    }
}
