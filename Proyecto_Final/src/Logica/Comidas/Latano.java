package Logica.Comidas;

import javax.swing.*;
import java.awt.*;

public class Latano extends Comida {
    private boolean Comido;
    private Image image;
    public Latano() {
        super(EnumComidas.LATANO.getImagen(), EnumComidas.LATANO);
        this.Comido = false;
        image = EnumComidas.LATANO.getImagen();
    }

    @Override
    public void comer() {
        this.Comido = true;
    }

    public Image getImage() {
        return image;
    }


}
