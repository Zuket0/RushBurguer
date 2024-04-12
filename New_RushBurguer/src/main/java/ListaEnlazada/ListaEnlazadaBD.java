 package ListaEnlazada;

public class ListaEnlazadaBD {
    
    
    private NodoBD inicio, fin; //se declaran 2 variables, primer y ultimo nodo de la lista
    
    public ListaEnlazadaBD(){ //constructor
        this.inicio= null; //lista vacia al inicio
        this.fin= null;
    }

    public NodoBD getInicio() { //constructor
        return inicio;
    }

    public NodoBD getFin() {
        return fin;
    }
    
    
    
    // Método para insertar un nodo al inicio
    public void insertarInicio(String nombre){
        inicio = new NodoBD(nombre, inicio);
        
        if(fin == null)
            fin = inicio;
    }
    
    // Método para insertar un nodo al final
    public void insertarFin(String nombre){
        if(inicio == null)
            inicio = fin = new NodoBD(nombre);
        else{
            fin.setSig(new NodoBD(nombre));
            fin = fin.getSig();
        }
    }
    
    // Método para recorrer los nodos y mostrar los nombres
    public String recorrerNodos(){
        StringBuilder resultado = new StringBuilder();
        if(inicio == null)
            resultado.append("La lista está vacía..");
        else{
            NodoBD elemento = inicio;
            
            while(elemento != null){
                resultado.append(elemento.getNombre()).append(" --> ");
                elemento = elemento.getSig();
            }
        }
        return resultado.toString();
    }
    
    // Otros métodos (eliminar, buscar, etc.) pueden mantenerse igual o modificarse según tus necesidades

    public void insertarEnPosicion(String nombre, int posicion) { //metodo insertar entre
         // Verificar si la posición es válida
    if (posicion < 0) {
        System.out.println("La posición ingresada no es válida.");
        return;
    }
    
    // Si la lista está vacía o la posición es 0, insertar al inicio
    if (inicio == null || posicion == 0) {
        insertarInicio(nombre);
        return;
    }
    
    // Contador para rastrear la posición actual
    int contador = 1;
    
    // Nodo actual y nodo anterior
    NodoBD actual = inicio;
    NodoBD anterior = null;
    
    // Moverse a la posición deseada o al final de la lista
    while (actual != null && contador < posicion) {
        anterior = actual;
        actual = actual.getSig();
        contador++;
    }
    
    // Crear un nuevo nodo con el nombre dado
    NodoBD nuevoNodo = new NodoBD(nombre);
    
    // Insertar el nuevo nodo en la posición adecuada
    if (actual != null) {
        // Insertar en medio de la lista
        nuevoNodo.setSig(actual);
        if (anterior != null) {
            anterior.setSig(nuevoNodo);
        } else {
            inicio = nuevoNodo; // Si anterior es null, el nuevo nodo es el nuevo inicio de la lista
        }
    } else {
        // Insertar al final de la lista
        if (anterior != null) {
            anterior.setSig(nuevoNodo);
        } else {
            inicio = nuevoNodo; // Si anterior es null, el nuevo nodo es el nuevo inicio de la lista (también es el fin)
        }
        fin = nuevoNodo; // Actualizar el fin de la lista
    }
    } 

    //metodo eliminar inicio
    public void eliminarInicio() {
         // Verificar si la lista está vacía
    if (inicio == null) {
        return; // No hay nada que eliminar
    }
    
    // Mover el inicio al siguiente nodo
    inicio = inicio.getSig();
    
    // Si después de eliminar el nodo el inicio es nulo, también actualizar el fin
    if (inicio == null) {
        fin = null;
    }
    }

    
    //metodo eliminar final
    public void eliminarFinal() {
        // Verificar si la lista está vacía
    if (inicio == null) {
        return; // No hay nada que eliminar
    }
    
    // Verificar si hay solo un nodo en la lista
    if (inicio == fin) {
        inicio = fin = null; // La lista queda vacía
        return;
    }
    
    // Encontrar el nodo anterior al último nodo
    NodoBD nodoAnterior = inicio;
    while (nodoAnterior.getSig() != fin) {
        nodoAnterior = nodoAnterior.getSig();
    }
    
    // Eliminar la referencia al último nodo
    nodoAnterior.setSig(null);
    fin = nodoAnterior; // Actualizar el puntero al último nodo
    }

    
public int obtenerPosicion(String nombre) {  //metodo para insertar entre
    int posicion = 0;
    NodoBD actual = inicio;

    // Recorrer la lista enlazada
    while (actual != null) {
        // Si se encuentra el nombre, devolver la posición actual
        if (actual.getNombre().equals(nombre)) {
            return posicion;
        }
        // Avanzar al siguiente nodo y aumentar la posición
        actual = actual.getSig();
        posicion++;
    }

    // Si el nombre no se encuentra en la lista, devolver -1
    return -1;
}    

public NodoBD buscar(String nombre) { //metodo para buscar
    NodoBD actual = inicio;
    while (actual != null) {
        if (actual.getNombre().equals(nombre)) {
            return actual; // Devuelve el nodo si se encuentra el nombre
        }
        actual = actual.getSig(); // Avanza al siguiente nodo
    }
    return null; // Devuelve null si el nombre no se encuentra en la lista
}

}
