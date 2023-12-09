package Logica.Habitat;

import Logica.*;
import Logica.Comidas.*;

import javax.swing.*;
import java.awt.*;

public class Cueva extends Habitat {
    private Image image;
    private Comedero comedero;
    public Cueva(){
        super(new ImageIcon("resources/Ambientes/Cueva.jpg").getImage());
        this.image = new ImageIcon("resources/Ambientes/Cueva.jpg").getImage();
        comedero = new Comedero();
    }

    public Image getImage() {
        return image;
    }

    @Override
    public boolean permitePokemon(Pokemon pokemon) {
        return pokemon.getTipo() == Tipo.CUEVA;
    }
}