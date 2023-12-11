package Logica.Habitat;

import Logica.*;
import Logica.Comidas.*;

import javax.swing.*;
import java.awt.*;
/**
 * Clase que extiende a Habitat, la cual se encarga de la parte logica de habitat Setas, encapsulando su comedero, su imagen
 * correspondiente, si permite un tipo de comida y si permite un tipo de pokemons
 * */
public class Setas extends Habitat {

    private Image image;
    private Comedero comedero;
    public Setas(){
        super(new ImageIcon("resources/Ambientes/Setas.jpg").getImage(), EnumComidas.FRAMBU);
        this.image = new ImageIcon("resources/Ambientes/Setas.jpg").getImage();
        comedero = new Comedero();
    }

    public Image getImage() {
        return image;
    }

    @Override
    public boolean permiteComida(Comida comida){
        return comida.getEnumComidas() == EnumComidas.FRAMBU;
    }
    @Override
    public boolean permitePokemon(Pokemon pokemon) {
        return pokemon.getTipo() == Tipo.SETAS;
    }
}