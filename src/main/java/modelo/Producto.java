package modelo;

public class Producto {
    private int id_producto;
    private Categoria id_Categoria;
    private String descripcion;
    private String imagen;
    private double precio;

    public int getId_producto() {
        return id_producto;
    }

    public void setId_producto(int id_producto) {
        this.id_producto = id_producto;
    }

    public Categoria getId_Categoria() {
        return id_Categoria;
    }

    public void setId_Categoria(Categoria id_Categoria) {
        this.id_Categoria = id_Categoria;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
}
