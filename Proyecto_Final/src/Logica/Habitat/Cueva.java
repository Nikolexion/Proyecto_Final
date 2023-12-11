package Logica.Habitat;

import Logica.*;
import Logica.Comidas.*;

import javax.swing.*;
import java.awt.*;
/**
 * Clase que extiende a Habitat, la cual se encarga de la parte logica de habitat Cueva, encapsulando su comedero, su imagen
 * correspondiente, si permite un tipo de comida y si permite un tipo de pokemons
 * */
public class Cueva extends Habitat {
    private Image image;
    private Comedero comedero;
    public Cueva(){
        super(new ImageIcon("resources/Ambientes/Cueva.jpg").getImage(), EnumComidas.POKOCHO);
        this.image = new ImageIcon("resources/Ambientes/Cueva.jpg").getImage();
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
        return pokemon.getTipo() == Tipo.CUEVA;
    }
}