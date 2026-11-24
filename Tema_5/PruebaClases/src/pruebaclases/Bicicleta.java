package pruebaclases;

/**
 * Clase Bicicleta
 * 
 * @author danib
 */
public class Bicicleta {
    
    //Atributos (NUNCA se inicializan en la declaración)
    private String marca;
    private String color;
    private float precio;
    private int anios;
    
    //Atributo static (SÍ se inicializa en la declaración)
    private static int contadorBicicletas = 0;
    
    // Atributo de otra clase (composición de clases)
    private Ciclista ciclista;
    
    
    // Constructores
    
    // 1. Por defecto
    public Bicicleta() {
        this.marca = "";
        this.color = "";
        this.precio = 0.0f;
        this.anios = 0;
    
        // (Inicializamos un ciclista)
        this.ciclista = new Ciclista();
                
    // (Incrementamos el valor del atributo estático)
        aumentarContadorBicicleta();
    }
    
    // 2. Parametrizado
    public Bicicleta(String marca, String color, float precio, int anios, Ciclista ciclista) {
        this.marca = marca;
        this.color = color;
        this.precio = precio;
        this.anios = anios;
        
        // (Inicializamos un ciclista)
        this.ciclista = ciclista;
        
    // (Incrementamos el valor del atributo estático)
        aumentarContadorBicicleta();
    }
    
    public Bicicleta(String color) {
        this.marca = "";
        this.color = color;
        this.precio = 0.0f;
        this.anios = 0;
    }
    
    
    //Métodos
    //Getters / Setters
    public String getMarca(){
        return marca;
    }
    
    public void setMarca(String m){
        marca = m;
    }
    
    public String getColor(){
        return color;
    }
    
    public void setColor(String c){
        color = c;
    }
    
    public float getPrecio(){
        return precio;
    }
    
    public void setPrecio(float p){
        precio = p;
    }
    
    public int getAnios(){
        return anios;
    }
    
    public void setAnios(int a){
        anios = a;
    }
    
    public static int getContadorBicicleta(){
        return contadorBicicletas;
    }
    
    public Ciclista getCiclista() {
        return ciclista;
    }
    
    public void setCiclista(Ciclista ciclista) {
        this.ciclista = ciclista;
    }    
    
    //Otros métodos
    public void mostrarAntiguedad(){
        if(anios > 10) {
            System.out.println("La bici es antigua");
        } else {
            System.out.println("La bicie es nueva");
        }
    }
    
    public static void aumentarContadorBicicleta(){
        contadorBicicletas++;
    }
    
    //Método mostrar / toString()
    public void mostrarBicicleta(){
        System.out.println("Marca: " + marca);
        System.out.println("Color: " + color);
        System.out.println("Precio: " + precio);
        System.out.println("Años: " + anios);
        System.out.println("Ciclista: " + ciclista.toString());
    }
     
    @Override
    public String toString(){
        return "Marca: " + marca 
                + ", Color: " + color 
                + ", Precio: " + precio 
                + ", Años: " + anios
                + ", Ciclista: " + ciclista;
    }
}
