package Interfaces;

import java.util.ArrayList;

public interface GuiaInterface<T> {

    public boolean insertar(T r);

    public boolean actualizar(T r);

    public boolean eliminar(String codigo);

    public T listarUno(String codigo);

    public ArrayList<T> listarTodo();

}
