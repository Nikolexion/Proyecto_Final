package Logica;

import Logica.Comidas.Comida;

import java.util.ArrayList;

public class Inventario {
    private ArrayList<Comida> inventario;
    private int dinero;
    public Inventario() {
        inventario = new ArrayList<>();
    }

    public ArrayList<Comida> getInventario() {
        return inventario;
    }

    public void addComida(Comida comida) {
        this.inventario.add(comida);
    }
    public Comida getComida(){
        return inventario.remove(0);
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
