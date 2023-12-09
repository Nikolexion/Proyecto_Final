package Logica;

import Logica.Habitat.Habitat;

import javax.swing.*;
import java.awt.*;

public class Pokemon {
    private String nombre;
    private Image image;
    private Tipo tipo;
    public Pokemon (DetallePokemon pokemon){
        this.nombre = pokemon.getNombre();
        this.tipo = pokemon.getTipo();
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
