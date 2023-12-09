package Logica.Habitat;

import Logica.*;

import javax.swing.*;
import java.awt.*;

public class Setas extends Habitat {

    private Image image;
    private Comedero comedero;
    public Setas(){
        super(new ImageIcon("resources/Ambientes/Setas.jpg").getImage());
        this.image = new ImageIcon("resources/Ambientes/Setas.jpg").getImage();
        comedero = new Comedero();
    }

    public Image getImage() {
        return image;
    }

    @Override
    public boolean permitePokemon(Pokemon pokemon) {
        return pokemon.getTipo() == Tipo.SETAS;
    }
}
