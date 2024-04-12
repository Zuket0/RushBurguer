/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metodos_distribuidos;

import DAO.UsuarioDAO;
import java.util.ArrayList;
import java.util.HashMap;
import modelo.Usuario;
import java.util.List;
import java.util.Map;
import javax.swing.JOptionPane;

public class TablaHashBD { 

    private UsuarioDAO usuarioDAO; //interaccion con BD
    private int capacidad; // Tamaño de la tabla hash
    private List<Usuario>[] tablaHash; //array de listas, para implementar la tabla Hash
    
    

    public TablaHashBD(int capacidad) { //parametro: capacidad
        this.capacidad = capacidad; //se asigna el valor de la capacidad recibida
        this.usuarioDAO = new UsuarioDAO();
        this.tablaHash = new ArrayList[capacidad]; //se inicializa el array con una longitud igual a la capacidad recibida como parametro
        for (int i = 0; i < capacidad; i++) { //bucle para recorrer los indices del array
            this.tablaHash[i] = new ArrayList<>(); //se crea una lista vacia en cada posicion
               

        }
        
    }
    

    TablaHashBD() {
    this.capacidad = 100; // Establecer una capacidad predeterminada
    this.usuarioDAO = new UsuarioDAO(); // Inicializar el objeto UsuarioDAO
}
    



    // Método para obtener usuarios de la tabla hash y ordenarlos según el método de dispersión especificado
    public List<Usuario> obtenerUsuariosOrdenados(String metodo) {
        List<Usuario> usuarios = usuarioDAO.listarTodo(); //para obtener todos los usuarios BD

        // Ordenar los usuarios según el método especificado
        switch (metodo) { //switch para determinar el metodo de dispersion
            case "funcionHash":
                // Aquí puedes implementar lógica para ordenar los usuarios según el método de dispersión
                break;
            case "aritmeticaModular":
                // Aquí puedes implementar lógica para ordenar los usuarios según el método de dispersión
                break;
            case "plegamiento":
                // Aquí puedes implementar lógica para ordenar los usuarios según el método de dispersión
                break;
            case "mitadCuadrado":
                // Aquí puedes implementar lógica para ordenar los usuarios según el método de dispersión
                break;
            case "multiplicacion":
                // Aquí puedes implementar lógica para ordenar los usuarios según el método de dispersión
                break;
            default:
                throw new IllegalArgumentException("Método de dispersión no válido: " + metodo);
        }

        return usuarios; //devuelve la lista de usuarios ordenados segun el metodo
    }

    // Método de dispersión: Función hash
    // Método de dispersión: Función hash
    public int funcionHash(String login) { //suma de los valores ASCII de los caracteres del login
    int hash = 0; //se inicializa hash como 0. Variable utilizada para calcular el hash
    for (int i = 0; i < login.length(); i++) { //bucle for para recorrer cada caracter en el login
        hash += login.charAt(i); //en cada iteracion, se suma el valor ASCII al "hash"
    }
    return hash % capacidad; //suma con la capacidad de la tabla hash para devolver un valor
}

    // Método de dispersión: Aritmética modular
    public int aritmeticaModular(String login) {
    final int primo = 31; // Puede ser cualquier número primo //numero primo constante
    int hash = 0;//se inicializa hash como 0. Variable utilizada para calcular el hash
    for (int i = 0; i < login.length(); i++) {//bucle for para recorrer cada caracter en el login
        hash += login.charAt(i);//en cada iteracion, se suma el valor ASCII al "hash"
    }
    return (primo * hash) % capacidad; //se calcula el hash multiplicando hash por el "primo".
    //tomando el modulo del resultado con la capacidad de la tabla hash se calcula finalmente.
    //esto asegura que el resultado este dentro del rango de los indices validos
}

    // Método de dispersión: Plegamiento
     public int plegamiento(String login) { //divide el login en segmentos de 2 caracteres
    int suma = 0; //se inicializa suma como 0. Se utuliza para acumular la suma de los segmentos plegados del login
    for (int i = 0; i < login.length(); i += 2) { //se inicia un bucle for que recorre el login de dos en dos caracteres
        if (i + 1 < login.length()) { //se verifica si aun quedan caracteres en el login para formar un segmento de dos caracteres
            suma += Integer.parseInt(login.substring(i, i + 2)); //si hay 2 caracteres disponibles se convierten a un entero y se suman a la 'suma'
        } else {
            suma += Integer.parseInt(login.substring(i));//si solo queda un caracter, se converte a un entero y se suma a la 'suma'
            
        }
    }
    return suma % capacidad; //se calcula el hash final tomando el modulo de la 'suma' con la capacidad de la tabla hash.
}

    // Método de dispersión: Mitad del cuadrado
    public int mitadCuadrado(String login) { //calcula el cuadrado del login convertido a entero
    int cuadrado = Integer.parseInt(login) * Integer.parseInt(login); //convierte el login a entero y lo multiplica por su mismo valor
    String cuadradoStr = String.valueOf(cuadrado); //convierte el cuadrado a una cadena de texto para poder manipularlo como una secuencia de caracteres
    int mitad = cuadradoStr.length() / 2; //luego toma la mitad de los digitos del cuadrado
    int startIndex = Math.max(0, mitad - 1); // Asegurar que el índice de inicio sea válido, no sea negativo
    return Integer.parseInt(cuadradoStr.substring(startIndex, mitad + 1)) % capacidad;//toma la mitad de la cadena del cuadrado, se convierte en entero y toma el modulo del valor con la capacidad de la tabla hash
}

    // Método de dispersión: Multiplicación
    public int multiplicacion(String login) { //se utiliza una constante multiplicativa
    final double A = 0.6180339887; // Constante multiplicativa (0 < A < 1) //crucial para la tecnica de multiplicacion
    double valor = Integer.parseInt(login) * A; //se toma la parte fraccionaria y se multiplica por A
    double fraccionParte = valor - (int) valor;//Calcula la parte fraccionaria del resultado de la multiplicacion
    return (int) (capacidad * fraccionParte); //multiplica la capacidad de la tabla ash por la parte fraccionaria y convierte el resultado a un entero. 
    //este valor se utiliza como indice en la tabla hash.
}
    
   
   
   
}
