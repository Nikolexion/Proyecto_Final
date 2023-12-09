package Logica.Habitat;

import Logica.*;

import javax.swing.*;
import java.awt.*;

public class Siniestro extends Habitat {
    private Image image;
    private Comedero comedero;
    public Siniestro(){
        super(new ImageIcon("resources/Ambientes/Siniestro.jpg").getImage());
        this.image = new ImageIcon("resources/Ambientes/Siniestro.jpg").getImage();
        comedero = new Comedero();
    }

    public Image getImage() {
        return image;
    }

    @Override
    public boolean permitePokemon(Pokemon pokemon) {
        return pokemon.getTipo() == Tipo.SINIESTRO;
    }
}
