
package arbolbinariod;

import java.util.LinkedList;


public class ArbolBinarioRushBurguer {
    private Nodo raiz;//Almacena la raiz del arbol, el nodo principal
    //desde el cual se ramifican los demas nodos
    private int num_nodos;//Cuenta el numero de nodos por arbol
    private int alt;//VAriable que almacena la altura del arbol

    public ArbolBinarioRushBurguer() {
        raiz = null;//Inicia la raiz como nula. El principio del arbol es vacio
        num_nodos = 0; //Inicializa contador de nodos
        alt = 0;//La altura del arbol en 0
    }
    
    //Metodo para insertar un dato en el arbol y que no se repitan los elementos
    //Recorre el arbol desde la raiz hasta encontrar la posicion adecuada del nuevo nodo
    //Inserta contador de nodo despues de la insercion
    
    public void insertar(int dato){
       if(existe(dato))return; //Se verifica si el dato existe en el arbol llamando al metodo existe dato
                               //Si el dato existe, se sale del emtodo sin hacer ninguna insercion
       Nodo nuevo = new Nodo(dato);//Creamos un nuevo nodo del dato y se almacena en la variable nuevo
          if (raiz == null) //Si la raiz del arbol es nula 
              raiz = nuevo;//Entonces el nuevo nodo se convierte en la raiz del arbol
          else //Si la raiz no es nula
          {
              Nodo anterior = null; //El nodo anterior se establece como vacio
              Nodo tmp = raiz; //El nodo temporal se establece como la raiz del arbol
              while (tmp != null) //Se inicia un bucle while hasta que tmp sea nulo
                                   //Recorre el arbol hasat llegar a un nodo nulo o encontrar la nueva posicion del nuevo nodo
              {
                  anterior = tmp; // Se actualiza el nodo anterior con la referencia del nodo actual
                  if (dato < tmp.getDato())//Se comprueba si el dato a insertar es menor o mayor que el dato del odo actual
                      tmp = tmp.getIzq();//Si el dato es menor , se mueve al hijo izquierdo del nodo actual
                  else//sino
                      tmp = tmp.getDer();//el dato se mueve al hijo derecho
              }
              if (dato < anterior.getDato())//cuando se encunetre la psoicion adecuada
                  
                  anterior.setIzq(nuevo);// se verifica si el nuevo nodo debe  ser de izquierda
              else
                  anterior.setDer(nuevo);//sino al hijo derecho
          }
          num_nodos++; //Se incrementa el contador de nodos despues de realizar la insercion
    }

    public Nodo getRaiz() {
        return raiz;
    }

    public void setRaiz(Nodo raiz) {
        this.raiz = raiz;
    }

    public int getNumNodos() {
        return num_nodos;
    }
    
    //Recorrido preorden, recibe el nodo a empezar (raiz) y una lista para ir guardando el recorrido
    public void preorden(Nodo aux,LinkedList recorrido){
          if (aux != null)
          {
              recorrido.add(aux.getDato());
              preorden (aux.getIzq(),recorrido);
              preorden (aux.getDer(),recorrido);
              //En el recorrido preorden, primero visitamos el nodo actual,
              //luego el nodo hijo izquierdo y finalmente el nodo hijo derecho.
              //Esto significa que exploramos primero hacia abajo (hacia los hijos)
              //antes de explorar hacia los lados
          }
    }
    //Recorrido inorden, recibe el nodo a empezar (raiz) y una linkedlist para ir guardando el recorrido
    public void inorden(Nodo aux,LinkedList recorrido){
          if (aux != null)
          {
              inorden (aux.getIzq(),recorrido);
              recorrido.add(aux.getDato());
              inorden (aux.getDer(),recorrido);
              
              //En el recorrido inorden, primero visitamos el nodo hijo izquierdo,
              //luego el nodo actual y finalmente el nodo hijo derecho.
              //Esto significa que exploramos primero hacia abajo (hacia el hijo izquierdo)
              //luego visitamos el nodo actual y finalmente exploramos hacia el hijo derecho.


          }
    }
    //Recorrido postorden, recibe el nodo a empezar (raiz) y una linkedlist para ir guardando el recorrido
    public void postorden(Nodo aux,LinkedList recorrido){
          if (aux != null)
          {
              postorden (aux.getIzq(),recorrido);
              postorden (aux.getDer(),recorrido);
              recorrido.add(aux.getDato());
              //primero visitamos el nodo hijo izquierdo
              //luego el nodo hijo derecho y finalmente el nodo actual.
              //que exploramos primero hacia abajo (hacia los hijos) 
              //antes de visitar el nodo actual.
          }
    }
    //Recorrido por nivel, recibe el nodo a empezar (raiz) y una linkedlist para ir guardando el recorrido
    public void porNivel(Nodo aux,LinkedList recorrido){
        LinkedList<Nodo> cola = new LinkedList<Nodo>();// creacion de lista que almacena los nodos 
        cola.addLast(aux);//agregamos el nodo inicial al final de la lista
        while(cola.size()> 0){ //con el bucle while que continuara hasta que la cola este vacia
            Nodo tmp = cola.pollFirst(); //Se extrae y alamcena el primer nodo de la cola en la variable tmp. luego se elimina y devuelve el primer elemento de la cola
            recorrido.add(tmp.getDato()); //Se añade el dato del nodo actual a la lista recorrido
            if(tmp.getIzq()!=null){// si el nodo actual tiene un hijo izquierdo,
                cola.addLast(tmp.getIzq());// se añade al final de la cola para ser visitado mas tarde
            }
            if(tmp.getDer()!=null){//Si el nodo actual tiene un hijo derecho
                cola.addLast(tmp.getDer()); //Se añade al final de la cola para ser visitado mas tarde
                
                //En el recorrido por nivel, visitamos los nodos nivel por nivel
                //comenzando desde la raíz y avanzando hacia abajo.
                //Este tipo de recorrido es más estructurado 
                //sigue un patrón de nivel por nivel en el árbol.
            } 
        }
    }
    
    //Metodo para verificar si hay un nodo en el arbol
    public boolean existe(int dato) {
        Nodo aux = raiz; ////Iniciamos el nodo auxiliar con la raiz del arbol
        while (aux!=null) {//Bucle mientras el nodo auxiliar no sea nulo
            if (dato==aux.getDato())//Si el dato coincide
                return true;//Retorna verdadero
            else
                if (dato>aux.getDato())//si el dato es mayor
                    aux=aux.getDer();//avanza al hijo derecho
                else
                    aux=aux.getIzq();//Si el dato es menor, avanza al hijo izquierdo
        }
        return false;//sino se encuentra el dato retorna falso
        
        //Recorre el arbol desde la raiz hasta encontrar el dato buscado o a un nodo nulo
        //Devuele verdadero si el dato existe
        //Devuelve falso si el dato no existe
    }
    
    //Metodo para la altura del arbol
    private void altura (Nodo aux,int nivel)  {
        if (aux != null) { //Si el nodo auxiliar no es nulo
            altura(aux.getIzq(),nivel+1);//Calculamos la altura dela subarbol izquierdo
            alt = nivel; //Actualizamos la variable altura con el nivel actual
            altura(aux.getDer(),nivel+1); //Luego calculamos la altura del subarbol derecho
           
        }
    }
    //Devuleve la altura del arbol
    public int getAltura(){
        altura(raiz,1); //Calculamos lla altura del arbol comenasndo desde la raiz
        return alt; //devolvemos la altura calculada del arbol
    }
     
}

