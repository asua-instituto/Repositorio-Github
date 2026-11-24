/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio3;

/**
 *
 * @author espmi
 */
public class Test {
        
    public static void main(String[] args) {
        // Creamos los objectos  Rueda].
        Rueda ruedas1 = new Rueda();
        Rueda ruedas2 = new Rueda();
        
        // Establacemos datos de rueda 1 y 2.
        //Rueda 1
        ruedas1.establecerMaterial("Caucho");
        ruedas1.establecerPulgadas(14);
        // Rueda 2
        ruedas2.establecerMaterial("Grafeno");
        ruedas2.establecerPulgadas(16);
        
        // Mostarmos los datos.
            //Rueda 1
            System.out.println("El material del caucho 1 es: "+ ruedas1.obtenerMaterial());
            System.out.println("Las pulgadas del caucho 1 es: "+ ruedas1.obtenerPulgadas());
            //Rueda 2
            System.out.println("El material del caucho 2 es: "+ ruedas2.obtenerMaterial());
            System.out.println("Las pulgadas del caucho 2 es: "+ ruedas2.obtenerPulgadas());
            
        // Creamos lo objectos [Coche].
        Coche coche1 = new Coche();
        Coche coche2 = new Coche();
        Coche coche3 = new Coche();
        
        // Establacemos datos de coche 1, 2 y 3.
        // Coche 1
        coche1.establecerMarca("Seat");
        coche1.establecerModelo("León");
        // Coche 2
        coche2.establecerMarca("Renault");
        coche2.establecerModelo("Clio");
        // Coche 3
        coche3.establecerMarca("Toyota");
        coche3.establecerModelo("Yaris");
        
        // Establecemos las "Ruedas" del coche1 y coche2 con los datos del objecto ruedas1:
        coche1.establecerRueda(ruedas1);
        coche2.establecerRueda(ruedas1);
        // Establecemos las "Ruedas" del coche3 con los datos del objecto ruedas2:
        coche3.establecerRueda(ruedas2);
        
        // Mostramos los datos de los coches:
        System.out.println(coche1.toString());
        System.out.println(coche2.toString());
        System.out.println(coche3.toString());

    }
}
