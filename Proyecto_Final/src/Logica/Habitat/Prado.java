package Logica.Habitat;

import Logica.*;
import Logica.Comidas.*;

import javax.swing.*;
import java.awt.*;


public class Prado extends Habitat {
    private Image image;
    private Comedero comedero;
    public Prado(){
        super(new ImageIcon("resources/Ambientes/Prado.jpg").getImage());
        this.image = new ImageIcon("resources/Ambientes/Prado.jpg").getImage();
        comedero = new Comedero();
    }

    public Image getImage() {
        return image;
    }

    @Override
    public boolean permitePokemon(Pokemon pokemon) {
        return pokemon.getTipo() == Tipo.PRADO;
    }
}