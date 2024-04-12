package Colas;
public class ListaCola {
    
    private NodoPedidos inicio, fin;

    public ListaCola() {
        this.inicio = null;
        this.fin = null;
    }

    public NodoPedidos getInicio() {
        return inicio;
    }

    public void setInicio(NodoPedidos inicio) {
        this.inicio = inicio;
    }

    public NodoPedidos getFin() {
        return fin;
    }

    public void setFin(NodoPedidos fin) {
        this.fin = fin;
    }
    
    //METODOS TOTALES
    
    // Metodo para insertar en la cola
    
    public void encolar(Pedido dato){
        NodoPedidos nuevo = new NodoPedidos(dato);
        
        if(inicio==null)
            inicio = fin= nuevo;
        else{
            fin.setSig(nuevo);
            fin=fin.getSig();
        }
    }
    
     

    // Método para verificar si la cola está vacía
   public boolean estaVacia() {
        return inicio == null;
    }
    
   // Metodo para desencolar
   
    public void desencolar(){
        Pedido xdato=null;
        if(inicio != null){
            xdato = inicio.getDato();
            inicio = inicio.getSig();
        }
        System.out.println("Elemento eliminado -- "+xdato);
    }
   
}
