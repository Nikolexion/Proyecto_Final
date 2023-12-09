package Logica.Habitat;

import Logica.*;
import Logica.Comidas.*;

import javax.swing.*;
import java.awt.*;


public class Humedal extends Habitat {
    private Image image;
    private Comedero comedero;
    public Humedal(){
        super(new ImageIcon("resources/Ambientes/Humedal.jpg").getImage());
        this.image = new ImageIcon("resources/Ambientes/Humedal.jpg").getImage();
        comedero = new Comedero();
    }

    public Image getImage() {
        return image;
    }

    @Override
    public boolean permitePokemon(Pokemon pokemon) {
        return pokemon.getTipo() == Tipo.HUMEDAL;
    }
}