package Logica.Habitat;

import java.util.ArrayList;
import javax.swing.*;
import java.awt.*;

public abstract class Habitat {
    private Image image;
    private ArrayList<String> aceptaPokemon;
    public Habitat(Image image){
        this.image = image;
    }
    public abstract boolean permitePokemon(String nombrePokemon);
    public Image getImage(){
        return image;
    }

}
