package metodos_distribuidos;

public class Main {

    public static void main(String[] args) {
        // Crear una instancia de TablaHash
        TablaHash tablaHash = new TablaHash(40); // Puedes cambiar la capacidad según sea necesario

        // Usuarios proporcionados
        String[][] usuarios = {
                {"Alberto Ipince", "612321"},
                {"Julio Campos", "123456"},
                {"Gresly Ruiz", "789456"},
                {"Piero Tong", "236548"},
                {"Messi", "635987"},
                {"asd", "136548"},
                {"Wiliamm", "125469"},
                {"Jose", "123845"},
                {"Miguel", "732569"},
                {"Gabriel", "745269"},
                {"Kiara", "623587"},
                {"Mauricio", "256987"},
                {"Walter", "569874"},
                {"Robert", "659874"},
                {"Xiomara", "365896"},
                {"Ashley", "258746"},
                {"Ricardo", "369452"},
                {"Antonhy", "587269"},
                {"Ana", "258799"},
                {"Angelo", "987233"},
                {"Edson", "987654"},
                {"Pablito", "231232"},
                {"Mathias", "654555"},
                {"Monica", "151544"},
                {"Fabiola", "258656"},
                {"Naiara", "689841"},
                {"Milena", "548235"}
        };

        // Insertar usuarios en la tabla hash
        for (int i = 0; i < usuarios.length; i++) {
            tablaHash.insertarUsuario(i + 1, usuarios[i][0], usuarios[i][1]);
        }

        // Calcular y mostrar los resultados de los métodos de dispersión
        for (int i = 0; i < usuarios.length; i++) {
            String login = usuarios[i][1]; // Obtener el login del usuario
            System.out.println("Usuario: " + usuarios[i][0] + ", Login: " + login);
            System.out.println("Función Hash: " + tablaHash.funcionHash(login));
            System.out.println("Aritmética Modular: " + tablaHash.aritmeticaModular(login));
            System.out.println("Plegamiento: " + tablaHash.plegamiento(login));
            System.out.println("Mitad del Cuadrado: " + tablaHash.mitadCuadrado(login));
            System.out.println("Multiplicación: " + tablaHash.multiplicacion(login));
            System.out.println();
        }
    }
}
