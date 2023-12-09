package Logica.Habitat;

import Logica.*;
import Logica.Comidas.*;

import javax.swing.*;
import java.awt.*;

public class Lava extends Habitat {
    private Image image;
    private Comedero comedero;
    public Lava(){
        super(new ImageIcon("resources/Ambientes/Lava.jpg").getImage(), EnumComidas.POKOCHO);
        this.image = new ImageIcon("resources/Ambientes/Lava.jpg").getImage();
        comedero = new Comedero();
    }

    public Image getImage() {
        return image;
    }

    @Override
    public boolean permiteComida(Comida comida){
        return comida.getEnumComidas() == EnumComidas.POKOCHO;
    }
    @Override
    public boolean permitePokemon(Pokemon pokemon) {
        return pokemon.getTipo() == Tipo.LAVA;
    }
}