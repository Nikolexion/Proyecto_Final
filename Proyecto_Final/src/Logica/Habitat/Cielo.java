package Logica.Habitat;

import Logica.*;
import Logica.Comidas.*;

import javax.swing.*;
import java.awt.*;
public class Cielo extends Habitat {
    private Image image;
    private Comedero comedero;

    public Cielo(){
        super(new ImageIcon("resources/Ambientes/Cielo.jpg").getImage(), EnumComidas.LATANO);
        this.image = new ImageIcon("resources/Ambientes/Cielo.jpg").getImage();
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
        return pokemon.getTipo() == Tipo.CIELO;
    }
}