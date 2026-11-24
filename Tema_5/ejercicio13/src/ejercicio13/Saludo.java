/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio13;

/**
 *
 * @author espmi
 */
public class Saludo {
    // Atributo
    private String frase;
    // Constructor por defecto:
    public Saludo () {
        this.frase = "";
    }
    // Constructor:
    public Saludo (String fr) {
        this.frase = fr;
    }
    // Getter y Setter:
    
    // Getter
    public String getFrase () {
        return frase;
    }
    
    // Setter
    public void setFrase (String fr) {
        this.frase = fr;
    }
    
    public void repetirSaludo (int veces) {
        for (int i = 0; i < veces;i++) {
            System.out.println(toString());
        }
    }
    
    // toString
    @Override
    public String toString () {
        return "frase: " + frase;
    }
    
}
