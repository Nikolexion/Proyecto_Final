package Logica.Comidas;

import javax.swing.*;
import java.awt.*;

public class Pinia extends Comida{
    private boolean Comido;
    private Image image;
    public Pinia() {
        super(EnumComidas.PINIA.getImagen(), EnumComidas.PINIA);
        this.Comido = false;
        image = EnumComidas.PINIA.getImagen();
    }

    @Override
    public void comer() {
        this.Comido = true;
    }

    public Image getImage() {
        return image;
    }
}
