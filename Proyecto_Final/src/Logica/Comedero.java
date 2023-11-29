package Logica;

import Logica.Comida;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class Comedero {
    private ArrayList<Comida> comedero;
    private Image image;

    public Comedero() {
        this.comedero = new ArrayList<>();
        this.image = new ImageIcon("resources/Comedero.png").getImage();
    }

    public Comida getComida() {
        return this.comedero.remove(0);
    }

    public void addComida(Comida comida) {
        this.comedero.add(comida);
    }

    public Image getImage() {
        return image;
    }
}
