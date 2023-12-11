package Logica.Comidas;

import javax.swing.*;
import java.awt.*;
/**
 * Clase que extiende a Comida, la cual difiere de las demas clases Comida solo por su imagen y por la preferencia de los pokemones
 * */
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
