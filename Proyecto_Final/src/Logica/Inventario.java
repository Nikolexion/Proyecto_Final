package Logica;

import java.util.ArrayList;

public class Inventario <T>{
    ArrayList<T> inventario;
    public Inventario() {
        inventario = new ArrayList<>();
    }

    public T getInventario() {

        return inventario.get(0);
    }

    public void setObjeto(T item) {
        this.inventario.add(item);
    }
}
