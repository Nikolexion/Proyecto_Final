package Logica;

import java.util.ArrayList;

public class Inventario <T>{
    private ArrayList<T> inventario;
    private int dinero;
    public Inventario() {
        inventario = new ArrayList<>();
    }

    public T getInventario() {

        return inventario.get(0);
    }

    public void setObjeto(T item) {
        this.inventario.add(item);
    }
    public void sumarDinero(int ganancias){
        this.dinero += ganancias;
    }
    public void restarDinero(int gastos){
        this.dinero -= gastos;
    }
    public int getDinero(){
        return this.dinero;
    }
}
