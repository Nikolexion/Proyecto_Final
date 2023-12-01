package Logica.Comidas;

import javax.swing.*;
import java.awt.*;

public class Latano extends Comida {
    private boolean Comido;
    private Image image;
    public Latano() {
        this.Comido = false;
        image = new ImageIcon("resources/Baya_Latano.png").getImage();
    }

    @Override
    public void comer() {
        this.Comido = true;
    }

    public Image getImage() {
        return image;
    }


}
