package Logica;

import Logica.Habitat.Habitat;

import javax.swing.*;
import java.awt.*;

public class Pokemon {
    private String nombre;
    private Image image;
    private Tipo tipo;
    public Pokemon (DetallePokemon pokemon, Tipo tipo){
        this.nombre = pokemon.getNombre();
        this.tipo = tipo;
        this.image = pokemon.getImagen();
    }

    public String getNombre() {
        return nombre;
    }
    public Tipo getTipo(){
        return tipo;
    }
    public Image getImage() {
        return image;
    }
}
