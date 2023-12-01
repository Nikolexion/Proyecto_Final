package Logica.Comidas;

import javax.swing.*;
import java.awt.*;

public class Pinia extends Comida{
    private boolean Comido;
    private Image image;
    public Pinia() {
        this.Comido = false;
        image = new ImageIcon("resources/Baya_Pinia.png").getImage();
    }

    @Override
    public void comer() {
        this.Comido = true;
    }

    public Image getImage() {
        return image;
    }
}
