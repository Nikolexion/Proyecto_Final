package Logica;

import Logica.Comidas.Comida;

import java.util.ArrayList;
/**
 *Clase encargada de guardar temporalmente la comida que se pondrá en los habitats
 * */
public class Inventario {
    private ArrayList<Comida> inventario;
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
}
