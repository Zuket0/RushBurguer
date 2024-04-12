package metodos_distribuidos;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import static java.util.Objects.hash;

public class TablaHash {
    private LinkedList<Usuarios>[] tabla;
    private int capacidad;

    public TablaHash(int capacidad) {
        this.capacidad = capacidad;
        tabla = new LinkedList[capacidad];
        for (int i = 0; i < capacidad; i++) {
            tabla[i] = new LinkedList<>();
        }
        
         insertarUsuario(1, "Alberto Ipince", "612321");
        insertarUsuario(2, "Julio Campos", "123456");
        insertarUsuario(3, "Gresly Ruiz", "789456");
        insertarUsuario(4, "Piero Tong", "236548");
        insertarUsuario(5, "Messi", "635987");
        insertarUsuario(7, "asd", "136548");
        insertarUsuario(10, "Wiliamm", "125469");
        insertarUsuario(11, "Jose", "123845");
        insertarUsuario(12, "Miguel", "732569");
        insertarUsuario(13, "Gabriel", "745269");
        insertarUsuario(14, "Kiara", "623587");
        insertarUsuario(15, "Mauricio", "256987");
        insertarUsuario(16, "Walter", "569874");
        insertarUsuario(17, "Robert", "659874");
        insertarUsuario(18, "Xiomara", "365896");
        insertarUsuario(19, "Ashley", "258746");
        insertarUsuario(20, "Ricardo", "369452");
        insertarUsuario(21, "Antonhy", "587269");
        insertarUsuario(22, "Ana", "258799");
        insertarUsuario(23, "Angelo", "987233");
        insertarUsuario(24, "Edson", "987654");
        insertarUsuario(25, "Pablito", "231232");
        insertarUsuario(26, "Mathias", "654555");
        insertarUsuario(27, "Monica", "151544");
        insertarUsuario(28, "Fabiola", "258656");
        insertarUsuario(29, "Naiara", "689841");
        insertarUsuario(30, "Milena", "548235");
    }

   

     public void insertarUsuario(int id, String nombre, String login) {
        int indice = hash(id) % capacidad;
        tabla[indice].add(new Usuarios(id, nombre, login));
    }
    // Método de dispersión: Función hash
    public int funcionHash(String login) { 
    int hash = 0; //valor del hash
    for (int i = 0; i < login.length(); i++) { //recorrido login c
        hash += login.charAt(i); //+ ascii + hash
    }
    return hash % capacidad; //modulo del r con la capacidad.
}

    // Método de dispersión: Aritmética modular
    public int aritmeticaModular(String login) {
    final int primo = 31; // Puede ser cualquier número primo
    int hash = 0;
    for (int i = 0; i < login.length(); i++) {
        hash += login.charAt(i);
    }
    return (primo * hash) % capacidad;
}

    // Método de dispersión: Plegamiento
     public int plegamiento(String login) { //division en 2
    int suma = 0;
    for (int i = 0; i < login.length(); i += 2) { //2_2 carac.
        if (i + 1 < login.length()) { //ver
            suma += Integer.parseInt(login.substring(i, i + 2));// 2 disp = 1 y +
        } else {
            suma += Integer.parseInt(login.substring(i));// 1 = 1 y +
        }
    }
    return suma % capacidad;
}

    // Método de dispersión: Mitad del cuadrado
    public int mitadCuadrado(String login) {
    int cuadrado = Integer.parseInt(login) * Integer.parseInt(login);//x.x
    String cuadradoStr = String.valueOf(cuadrado);
    int mitad = cuadradoStr.length() / 2;//digitos/2
    int startIndex = Math.max(0, mitad - 1); // Asegurar que el índice de inicio sea válido
    return Integer.parseInt(cuadradoStr.substring(startIndex, mitad + 1)) % capacidad;
}
    // Método de dispersión: Multiplicación
    public int multiplicacion(String login) {
    final double A = 0.6180339887; // Constante multiplicativa (0 < A < 1)
    double valor = Integer.parseInt(login) * A;
    double fraccionParte = valor - (int) valor;
    return (int) (capacidad * fraccionParte);
}

    

    // Método para buscar un usuario por su ID en la tabla hash
    /*public Usuarios buscar(int id) {
        int indice = funcionHash(id); // Puedes cambiar el método de dispersión aquí
        LinkedList<Usuarios> lista = tabla[indice];
        for (Usuarios usuario : lista) {
            if (usuario.getId() == id) {
                return usuario;
            }
        }
        return null;
    } /**/
    

    // Método para eliminar un usuario por su ID en la tabla hash
   /* public void eliminar(int id) {
        int indice = funcionHash(id); // Puedes cambiar el método de dispersión aquí
        LinkedList<Usuarios> lista = tabla[indice];
        lista.removeIf(usuario -> usuario.getId() == id);
    }/**/

    // Clase interna para representar un usuario
    public static class Usuarios {
        private int id;
        private String nombre;
        private String login;

        public Usuarios(int id, String nombre, String login) {
            this.id = id;
            this.nombre = nombre;
            this.login = login;
        }

        public int getId() {
            return id;
        }

        public String getNombre() {
            return nombre;
        }

        public String getLogin() {
            return login;
        }

        @Override
        public String toString() {
            return "ID: " + id + ", Nombre: " + nombre + ", Login: " + login;
        }
    }

   
public List<Usuarios> obtenerUsuariosOrdenados(String metodo) {
        List<Usuarios> usuarios = new ArrayList<>();
        for (LinkedList<Usuarios> lista : tabla) {
            usuarios.addAll(lista);
        }

        // Ordenar los usuarios según el método especificado
        switch (metodo) {
            case "funcionHash":
                Collections.sort(usuarios, Comparator.comparingInt(u -> funcionHash(u.getLogin())));
                break;
            case "aritmeticaModular":
                Collections.sort(usuarios, Comparator.comparingInt(u -> aritmeticaModular(u.getLogin())));
                break;
            case "plegamiento":
                Collections.sort(usuarios, Comparator.comparingInt(u -> plegamiento(u.getLogin())));
                break;
            case "mitadCuadrado":
                Collections.sort(usuarios, Comparator.comparingInt(u -> mitadCuadrado(u.getLogin())));
                break;
            case "multiplicacion":
                Collections.sort(usuarios, Comparator.comparingInt(u -> multiplicacion(u.getLogin())));
                break;
            default:
                throw new IllegalArgumentException("Método de dispersión no válido: " + metodo);
        }

        return usuarios;
    }



}
