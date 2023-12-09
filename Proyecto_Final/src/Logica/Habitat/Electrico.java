package Logica.Habitat;

import Logica.*;
import Logica.Comidas.*;

import javax.swing.*;
import java.awt.*;

public class Electrico extends Habitat {
    private Image image;
    private Comedero comedero;
    public Electrico(){
        super(new ImageIcon("resources/Ambientes/Electrico.jpg").getImage());
        this.image = new ImageIcon("resources/Ambientes/Electrico.jpg").getImage();
        comedero = new Comedero();
    }

    public Image getImage() {
        return image;
    }

    @Override
    public boolean permitePokemon(Pokemon pokemon) {
        return pokemon.getTipo() == Tipo.ELECTRICO;
    }
}