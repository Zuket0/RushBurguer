package Pilas;

import Colas.NodoPedidos;
import Colas.Pedido;

public class PilaPedidos {
    private NodoPedidos tope;

    public PilaPedidos() {
        this.tope = null;
    }

    public NodoPedidos getTope() {
        return tope;
    }

    public void setTope(NodoPedidos tope) {
        this.tope = tope;
    }
    
    public void push(Pedido dato) {
    NodoPedidos nuevo = new NodoPedidos(dato);
    if (tope == null) {
        tope = nuevo;
    } else {
        nuevo.setSig(tope);
        tope = nuevo;
    }
}


   public Pedido pop() {
    Pedido dato = null;
    if (tope != null) {
        dato = tope.getDato();
        tope = tope.getSig();
    }
    return dato;
}


    public boolean estaVacia() {
        return tope == null;
    }
}
