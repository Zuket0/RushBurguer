package Colas;

public class Pedido {
    // Atributos
    private String nombre;
    private double precio;

    // Constructor
    public Pedido(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    // Métodos Getter y Setter para el nombre
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    // Métodos Getter y Setter para el precio
    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    // Método toString para representar el Pedido como una cadena
    @Override
    public String toString() {
        return "Nombre: " + nombre + ", Precio: " + precio + "\n";
    }
}
