package Logica.Habitat;

import Logica.Comidas.Comedero;

import java.util.ArrayList;
import java.awt.*;

public abstract class Habitat {
    private Image image;
    private ArrayList<String> aceptaPokemon;
    private Comedero comedero;
    public Habitat(Image image){
        this.image = image;
    }
    public abstract boolean permitePokemon(String nombrePokemon);
    public Image getImage(){
        return image;
    }

}
