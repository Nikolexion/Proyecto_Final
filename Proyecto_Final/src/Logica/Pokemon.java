package Logica;

import Logica.Habitat.Habitat;

import javax.swing.*;
import java.awt.*;

public class Pokemon {
    private String nombre;
    private Habitat habitat;
    private Image image;
    public Pokemon (String nombre, Habitat habitat, String path){
        this.nombre = nombre;
        this.habitat = habitat;
        this.image = new ImageIcon(path).getImage();
    }

    public String getNombre() {
        return nombre;
    }

    public Habitat getHabitat() {
        return habitat;
    }
    public Image getImage() {
        return image;
    }
}
