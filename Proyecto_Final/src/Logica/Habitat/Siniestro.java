package Logica.Habitat;

import Logica.*;
import Logica.Comidas.*;

import javax.swing.*;
import java.awt.*;
/**
 * Clase que extiende a Habitat, la cual se encarga de la parte logica de habitat Siniestro, encapsulando su comedero, su imagen
 * correspondiente, si permite un tipo de comida y si permite un tipo de pokemons
 * */
public class Siniestro extends Habitat {
    private Image image;
    private Comedero comedero;
    public Siniestro(){
        super(new ImageIcon("resources/Ambientes/Siniestro.jpg").getImage(), EnumComidas.POKOCHO);
        this.image = new ImageIcon("resources/Ambientes/Siniestro.jpg").getImage();
        comedero = new Comedero();
    }

    public Image getImage() {
        return image;
    }

    @Override
    public boolean permiteComida(Comida comida){
        return comida.getEnumComidas() == EnumComidas.POKOCHO;
    }
    @Override
    public boolean permitePokemon(Pokemon pokemon) {
        return pokemon.getTipo() == Tipo.SINIESTRO;
    }
}