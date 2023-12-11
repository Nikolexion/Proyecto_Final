package Logica.Comidas;

import javax.swing.*;
import java.awt.*;
/**
 * Clase que extiende a Comida, la cual difiere de las demas clases Comida solo por su imagen y por la preferencia de los pokemones
 * */
public class Latano extends Comida {
    private Image image;
    public Latano() {
        super(EnumComidas.LATANO.getImagen(), EnumComidas.LATANO);
        image = EnumComidas.LATANO.getImagen();
    }


    public Image getImage() {
        return image;
    }


}
