package Logica.Habitat;

import Logica.*;
import Logica.Comidas.*;

import javax.swing.*;
import java.awt.*;

public class Setas extends Habitat {

    private Image image;
    private Comedero comedero;
    public Setas(){
        super(new ImageIcon("resources/Ambientes/Setas.jpg").getImage(), EnumComidas.FRAMBU);
        this.image = new ImageIcon("resources/Ambientes/Setas.jpg").getImage();
        comedero = new Comedero();
    }

    public Image getImage() {
        return image;
    }

    @Override
    public boolean permiteComida(Comida comida){
        return comida.getEnumComidas() == EnumComidas.FRAMBU;
    }
    @Override
    public boolean permitePokemon(Pokemon pokemon) {
        return pokemon.getTipo() == Tipo.SETAS;
    }
}