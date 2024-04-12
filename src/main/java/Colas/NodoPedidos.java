package Colas;
public class NodoPedidos {
    private Pedido dato;
    private NodoPedidos sig;

    public NodoPedidos(Pedido dato) {
        this.dato = dato;
        this.sig = null;
    }

    public Pedido getDato() {
        return dato;
    }

    public void setDato(Pedido dato) {
        this.dato = dato;
    }

    public NodoPedidos getSig() {
        return sig;
    }

    public void setSig(NodoPedidos sig) {
        this.sig = sig;
    }
}