package Logica.Comidas;

import javax.swing.*;
import java.awt.*;

public class Frambu extends Comida{
    private boolean Comido;
    private Image image;
    public Frambu() {
        this.Comido = false;
        image = new ImageIcon("resources/Baya_Frambu.png").getImage();
    }

    @Override
    public void comer() {
        this.Comido = true;
    }

    public Image getImage() {
        return image;
    }
}
