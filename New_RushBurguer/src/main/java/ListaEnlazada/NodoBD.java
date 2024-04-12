package ListaEnlazada;

public class NodoBD {
    private String nombre; //atributo que representa el nombre del nodo
    private NodoBD sig; //variable sig referencia al siguiente nodo
    
    public NodoBD(String nombre, NodoBD sig){
        this.nombre = nombre; //se asigna el valor del parametro nombre al atributo nombre
        this.sig = sig;
    }
    
    public NodoBD(String nombre){ //acepta el parametro nombre pero no el sig
        this.nombre = nombre;
        this.sig = null; //se asigna null ya que no se proporciona un siguiente nodo
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public NodoBD getSig() {
        return sig;
    }

    public void setSig(NodoBD sig) {
        this.sig = sig;
    } 
}
