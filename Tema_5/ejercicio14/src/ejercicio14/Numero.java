/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio14;

/**
 *
 * @author espmi
 */
public class Numero {
    // Atributo
    private int valor;
    // Constructor por defecto
    public Numero () {
        this.valor = 0;
    }
    // Contructor parametrizado
    public Numero (int nu) {
        this.valor = nu;
    }
    
    // Getter
    public int getNumero () {
        return valor;
    }
    
    // Setter
    public void setNumero (int nu) {
        this.valor = nu;
    }
    
    public void crearTabla() {
        int resultado;
        System.out.println("--- Tabla del " + this.valor + " ---");
        for (int i = 1; i <= 10; i++) {
            resultado = this.valor * i;
            System.out.println(this.valor + " x " + i + " = " + resultado);
        }
    }
    
    // toString
    @Override
    public String toString () {
        return "valor: " + valor;
    }
}
