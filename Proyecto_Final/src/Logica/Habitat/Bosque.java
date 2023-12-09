package Logica.Habitat;

import Logica.*;

import javax.swing.*;
import java.awt.*;


public class Bosque extends Habitat {
    private Image image;
    private Comedero comedero;

    public Bosque(){
        super(new ImageIcon("resources/Ambientes/Bosque.jpg").getImage());
        this.image = new ImageIcon("resources/Ambientes/Bosque.jpg").getImage();
        comedero = new Comedero();
    }

    public Image getImage() {
        return image;
    }

    @Override
    public boolean permitePokemon(Pokemon pokemon) {
        return pokemon.getTipo() == Tipo.BOSQUE;
    }
}
