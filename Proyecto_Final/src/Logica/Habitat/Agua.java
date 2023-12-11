package Logica.Habitat;

import Logica.*;
import Logica.Comidas.*;

import javax.swing.*;
import java.awt.*;
/**
 * Clase que extiende a Habitat, la cual se encarga de la parte logica de habitat Agua, encapsulando su comedero, su imagen
 * correspondiente, si permite un tipo de comida y si permite un tipo de pokemons
 * */
public class Agua extends Habitat {
    private Image image;
    private Comedero comedero;

    public Agua(){
        super(new ImageIcon("resources/Ambientes/Agua.jpg").getImage(), EnumComidas.PINIA);
        this.image = new ImageIcon("resources/Ambientes/Agua.jpg").getImage();
        comedero = new Comedero();
    }

    public Image getImage() {
        return image;
    }
    @Override
    public boolean permiteComida(Comida comida){
        return comida.getEnumComidas() == EnumComidas.PINIA;
    }
    @Override
    public boolean permitePokemon(Pokemon pokemon) {
        return pokemon.getTipo() == Tipo.AGUA;
    }
}