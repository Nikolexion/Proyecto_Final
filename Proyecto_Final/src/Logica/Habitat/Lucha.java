package Logica.Habitat;

import Logica.*;
import Logica.Comidas.*;

import javax.swing.*;
import java.awt.*;
/**
 * Clase que extiende a Habitat, la cual se encarga de la parte logica de habitat Lucha, encapsulando su comedero, su imagen
 * correspondiente, si permite un tipo de comida y si permite un tipo de pokemons
 * */
public class Lucha extends Habitat {
    private Image image;
    private Comedero comedero;
    public Lucha(){
        super(new ImageIcon("resources/Ambientes/Lucha.jpg").getImage(), EnumComidas.LATANO);
        this.image = new ImageIcon("resources/Ambientes/Lucha.jpg").getImage();
        comedero = new Comedero();
    }

    public Image getImage() {
        return image;
    }

    @Override
    public boolean permiteComida(Comida comida){
        return comida.getEnumComidas() == EnumComidas.LATANO;
    }
    @Override
    public boolean permitePokemon(Pokemon pokemon) {
        return pokemon.getTipo() == Tipo.LUCHA;
    }
}