package controlador;

import modelo.Nodo;

/**
 * Estructura de datos que crea una Cola en la que se van a almacenar datos del
 * tipo especificado. Esta clase se asemeja en estructura a la clase
 * {@code Queue} derivada de la interfaz {@code Collection}.
 *
 
 * @param <T> Tipo de los elementos que se almacenarán en la Cola.
 */
public class Cola<T> {

    private Nodo<T> primero;
    private Nodo<T> ultimo;
    private int tamanio;

    /**
     * Constructor que inicializa los campos.
     */
    public Cola() {
        this.primero = null;
        this.ultimo = null;
        this.tamanio = 0;

    }

    /**
     * Indica si la cola esta vacia.
     *
     * @return verdadero o falso si la cola está vacía.
     */
    public boolean isEmpty() {
        return tamanio == 0;
    }

    /**
     * Indica el tamaño de la cola.
     *
     * @return El contenido de la variable tamanio.
     */
    public int size() {
        return tamanio;
    }

    /**
     * Selecciona y retorna el primer elemento en la cola.
     *
     * @return El primer elemento de la cola.
     */
    public T peek() {
        return (!isEmpty()) ? primero.getDato() : null;
    }

    /**
     * Elimina y devuelve el primer elemento de la cola.
     *
     * @return El primer elemento eliminado de la cola.
     */
    public T pop() {
        if (isEmpty()) {
            return null;
        }
        T elemento = primero.getDato();
        Nodo<T> aux = primero.getSiguiente();
        primero = null;
        primero = aux;
        tamanio--;
        if (isEmpty()) {
            ultimo = null;
        }
        return elemento;
    }

    /**
     * Encola un nuevo elemento.
     *
     * @param elemento El objeto que se va a encolar.
     * @return El objeto encolado.
     */
    public T queue(T elemento) {
        Nodo<T> aux = new Nodo(elemento, null);
        if (isEmpty()) {
            primero = aux;
            ultimo = aux;
        } else {
            if (size() == 1) {
                primero.setSiguiente(aux);
            } else {
                ultimo.setSiguiente(aux);
            }
            ultimo = aux;
        }
        tamanio++;
        return aux.getDato();
    }

    /**
     * Método para obtener un nodo de la lista. Si está vacío o el índice no es
     * correcto, devuelve un valor nulo.
     *
     * @param index El índice especificado.
     * @return El nodo de una posicion especificada.
     */
    private Nodo<T> getNodo(int index) {
        if (isEmpty() || (index < 0 || index >= size())) {
            return null;
        } else if (index == 0) {
            return primero;
        } else if (index == size() - 1) {
            return ultimo;
        } else {
            Nodo<T> buscado = primero;
            int contador = 0;
            while (contador < index) {
                contador++;
                buscado = buscado.getSiguiente();
            }
            return buscado;
        }
    }

    /**
     * Método para obtener un nodo de la cola. Si está vacío o el índice no es
     * correcto, devuelve un valor nulo.
     *
     * @param index El índice del elemento deseado.
     * @return El elemento en el nodo de una posicion especificada.
     */
    public T get(int index) {
        Nodo<T> buscado = getNodo(index);
        return buscado.getDato();
    }

    /**
     * Indica la posición del elemento especificado.
     *
     * @param elemento
     * @return
     */
    public int indexOf(T elemento) {
        if (!isEmpty()) {
            Nodo<T> aux = primero;
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

    /**
     * Elmina el elemento de la Cola especificado.
     *
     * @param index El índice del elemento a eliminar
     * @return El elemento eliminado.
     */
    public T remove(int index) {
        if (isEmpty() || (index < 0 || index >= size())) {
            return null;
        } else if (index == 0) {
            return pop();
        } else {

            //Cojo el nodo anterior al que quiero borrar
            Nodo<T> nodo_anterior = getNodo(index - 1);

            //Cojo el nodo que quiero borrar
            Nodo<T> nodo_actual = getNodo(index);

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
     * Muestra el contenido de la cola.
     *
     * @return Contador con el contenido de la cola.
     */
    public String print() {
        if (isEmpty()) {
            return "La lista esta vacia";
        } else {
            String cadena = "";
            Nodo<T> aux = primero;
            while (aux != null) {
                cadena += aux.getDato().toString();
                aux = aux.getSiguiente();
            }
            return cadena;
        }
    }

}
