package app.model;

public class Frutas {
    private static  int contador = 0;
    private int id;
    private String nombre;
    private String color;
    private double peso;
    private double precio;
    private boolean esOrganica;

    // recordar que se usan las funciones get para que sean manejables los errores
    // Constructor de Frutas
    public Frutas(String nombre, String color, double peso, double precio, boolean esOrganica){
        this.id = ++contador;
        setNombre(nombre);
        setColor(color);
        setPeso(peso);
        setPrecio(precio);
        this.esOrganica = esOrganica;
    }

    public int getId() {
        return id;
    }

    // get y set de Nombre
    public String getNombre(){
        return nombre;
    }
    public void setNombre(String nombre){
        if(nombre == null || nombre.trim().isEmpty()) throw new IllegalArgumentException("El nombre no puede estar vacio");
        this.nombre = nombre;
    }

    // get y set de color
    public String getColor() {
        return color;
    }
    public void setColor(String color){
        if (color == null || color.trim().isEmpty()) throw new IllegalArgumentException("El color no puede estar vacio");
        this.color = color;
    }

    // get y set de Peso
    public double getPeso() {
        return peso;
    }
    public void setPeso(double peso) {


        if(peso <= 0) throw new IllegalArgumentException("El peso debe ser positivo");
        this.peso = peso;
    }

    // get y set de precio
    public double getPrecio(){
        return precio;
    }
    public void setPrecio(double precio){
        if(precio <= 0) throw new IllegalArgumentException("El precio debe ser mayor a 0");
        this.precio = precio;
    }

   // para convertir un objeto a una representación en texto

    public String toString() {
        return "fruta" +
                " id:" + id +
                " nombre: " + nombre +
                " color: " + color +
                " peso: " + peso +
                " precio: " + precio +
                " organica: " + esOrganica;
    }

}
