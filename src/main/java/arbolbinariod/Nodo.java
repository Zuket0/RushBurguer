
package arbolbinariod;


public class Nodo {
     private int dato;
    private Nodo izq,der;
    public Nodo(int dato){
        this.dato = dato; 
        izq = null;
        der = null;
    }
    //Cada nodo contiene un valor y puede tener hasta dos nodos hijos, uno a la izquierda y otro a la derecha. 
    //Los métodos proporcionados permiten acceder y modificar el valor y los nodos hijos de un nodo.
    //Esta clase es fundamental para construir y manipular árboles binarios en Java.
    public int getDato() {
        return dato;
    }

    public Nodo getIzq() {
        return izq;
    }

    public Nodo getDer() {
        return der;
    }

    public void setDato(int dato) {
        this.dato = dato;
    }

    public void setIzq(Nodo izq) {
        this.izq = izq;
    }

    public void setDer(Nodo der) {
        this.der = der;
    } 
}

