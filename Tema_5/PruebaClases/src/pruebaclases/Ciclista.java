package pruebaclases;

/**
 *
 * @author d3stroya
 */
public class Ciclista {
    // ATRIBUTOS
    private String nombre;
    private int dorsal;

    // CONSTRUCTORES
    // Por defecto
    public Ciclista() {
        this.nombre = "";
        this.dorsal = 0;
    }
    
    // Parametrizado
    public Ciclista(String nombre, int dorsal) {
        this.nombre = nombre;
        this.dorsal = dorsal;
    }    

    // GETTERS Y SETTERS
    public String getNombre() {
        return nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public int getDorsal() {
        return dorsal;
    }
    
    public void setDorsal(int dorsal) {
        this.dorsal = dorsal;
    }

    // MÉTODOS


    // TO STRING
    @Override
    public String toString() {
        return "Nombre: " + this.nombre + " (" + this.dorsal + ")";
    }
}
