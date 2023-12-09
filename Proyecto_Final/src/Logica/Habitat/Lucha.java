package Logica.Habitat;

import Logica.*;

import javax.swing.*;
import java.awt.*;

public class Lucha extends Habitat {
    private Image image;
    private Comedero comedero;
    public Lucha(){
        super(new ImageIcon("resources/Ambientes/Lucha.jpg").getImage());
        this.image = new ImageIcon("resources/Ambientes/Lucha.jpg").getImage();
        comedero = new Comedero();
    }

    public Image getImage() {
        return image;
    }

    @Override
    public boolean permitePokemon(Pokemon pokemon) {
        return pokemon.getTipo() == Tipo.LUCHA;
    }
}
