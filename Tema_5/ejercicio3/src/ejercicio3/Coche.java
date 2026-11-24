/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio3;

/**
 *
 * @author espmi
 */
public class Coche {
        // Atributos
        private String marca;
        private String modelo;
        private Rueda rueda;
    
        // Metodos Publicos:
        
        // setter
        public void establecerMarca (String mar) {
            marca = mar;
        }
        
        public void establecerModelo (String mo) {
            modelo = mo;
        }
        
        //getter
        public String obtenerMarca () {
            return marca;
        }
        
        public String obtenerModelo () {
            return modelo;
        }
        
        // setter de objecto (Rueda):
        
        public void establecerRueda (Rueda ru) {
            rueda = ru;
        }
        
        public Rueda obtenerRueda () {
            return rueda;
        }
        
        @Override
        public String toString () {
            return "\n----- Datos de los coches: -----" 
                    + "\nMarca: " + marca 
                    + "\nModelo: " + modelo 
                    + rueda;
        }
        
    /*
        • Muestra los datos de los coches creados (marca, modelo, material de su rueda y tamaño de su rueda.
    */
}
