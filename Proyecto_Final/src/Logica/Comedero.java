package Logica_Grafica;

import Logica.Comida;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class Comedero {
    public ArrayList<Comida> comedero;
    public Image image;

    public Comedero() {
        comedero = new ArrayList<>();
        image = new ImageIcon("resources/Comedero.png").getImage();
    }

    public Comida getComedero() {
        return this.comedero.get(0);
    }

    public void addComida(Comida comida) {
        this.comedero.add(comida);
    }
}
