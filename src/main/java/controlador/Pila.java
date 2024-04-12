package controlador;

import modelo.Nodo;

/**
 * Estructura de datos que crea una Pila en la que se van a almacenar datos del
 * tipo especificado. Esta clase se asemeja en estructura a la clase
 * {@code Stack} derivada de la interfaz {@code Collection}.
 *
 
 * @param <T> Tipo de los elementos que se almacenarán en la Pila.
 */
public class Pila<T> {

    private Nodo<T> top;
    private int tamanio;

    /**
     * Constructor que inicializa los campos.
     */
    public Pila() {
        this.top = null;
        this.tamanio = 0;
    }

    /**
     * Indica si la pila está vacía.
     *
     * @return
     */
    public boolean isEmpty() {
        return top == null;
    }

    /**
     * Indica el tamaño de la pila.
     *
     * @return
     */
    public int size() {
        return this.tamanio;
    }

    /**
     * Devuelve el elemento que esta más arriba en la pila.
     *
     * @return
     */
    public T peek() {
        return !isEmpty() ? top.getDato() : null;
    }

    /**
     * Saca y devuelve el elemento que mas arriba esta en la pila.
     *
     * @return
     */
    public T pop() {
        if (isEmpty()) {
            return null;
        } else {
            T elemento = top.getDato();
            Nodo<T> aux = top.getSiguiente();
            top = null; //marco para borrar
            top = aux; //actualizo el top
            this.tamanio--;
            return elemento;
        }
    }

    /**
     * Elimina el nodo de la pila en la posicion especificada.
     *
     * @param index índice que se va a elminiar
     * @return el elemento eliminado. Nulo si la lista está vacía.
     */
    public T remove(int index) {
        if (isEmpty() || (index < 0 || index >= size())) {
            return null;
        } else if (index == 0) {
            return pop();
        } else {

            //Cojo el nodo anterior al que quiero borrar
            Nodo<T> nodo_anterior = getNode(index - 1);

            //Cojo el nodo que quiero borrar
            Nodo<T> nodo_actual = getNode(index);

            //Cojo el elemento antes de borrar
            T elemento = nodo_actual.getDato();

            //Cojo el nodo siguiente al que quiero borrar
            Nodo<T> nodo_siguiente = nodo_actual.getSiguiente();

            //El nodo anterior apunta al nodo siguiente
            nodo_anterior.setSiguiente(nodo_siguiente);

            tamanio--;
            return elemento;

        }
    }

    /**
     * Mete un elemento a la pila.
     *
     * @param elemento
     * @return
     */
    public T push(T elemento) {
        Nodo<T> aux = new Nodo<>(elemento, top);
        top = aux; //actualizo el top
        this.tamanio++;
        return aux.getDato();
    }

    /**
     * Método para imprimir la pila.
     *
     * @return Contador con el contenido de la pila.
     */
    public String print() {
        String resultado = "";
        if (!isEmpty()) {
            Nodo<T> aux = top;
            //Recorro la pila
            while (aux != null) {
                resultado += aux.getDato().toString();
                aux = aux.getSiguiente();
            }
        } else {
            resultado = "La pila esta vacia";
        }
        return resultado;
    }

    /**
     * Obtiene el objeto en el índice especificado.
     *
     * @param index Índice ingresado
     * @return Objeto requerido
     */
    public T get(int index) {
        if (index < 0 || index >= size()) {
            return null;
        }
        Nodo<T> actual = top;
        for (int i = 0; i < index; i++) {
            actual = actual.getSiguiente();
        }
        return actual.getDato();
    }

    /**
     * Método para obtener un nodo de la lista. Si está vacío o el índice no es
     * correcto, devuelve un valor nulo.
     *
     * @param index recibe el índice especificado
     * @return el nodo completo de una posicion especificada
     */
    private Nodo<T> getNode(int index) {
        if (isEmpty() || (index < 0 || index >= size())) {
            return null;
        } else if (index == 0) {
            return top;
        } else {
            Nodo<T> buscado = top;
            int contador = 0;
            while (contador < index) {
                contador++;
                buscado = buscado.getSiguiente();
            }
            return buscado;
        }
    }

    /**
     * Indica la posición del elemento especificado.
     *
     * @param elemento
     * @return
     */
    public int indexOf(T elemento) {
        if (!isEmpty()) {
            Nodo<T> aux = top;
            int posicion = 0;
            while (aux != null) {
                if (elemento.equals(aux.getDato())) {
                    return posicion;
                }
                posicion++;
                aux = aux.getSiguiente();
            }
        }
        return -1;
    }

}
