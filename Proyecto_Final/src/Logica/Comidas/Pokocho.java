package Logica.Comidas;

import javax.swing.*;
import java.awt.*;
/**
 * Clase que extiende a Comida, la cual difiere de las demas clases Comida solo por su imagen y por la preferencia de los pokemones
 * */
public class Pokocho extends Comida{
    private Image image;
    public Pokocho() {
        super(EnumComidas.POKOCHO.getImagen(), EnumComidas.POKOCHO);
        image = EnumComidas.POKOCHO.getImagen();
    }

    public Image getImage() {
        return image;
    }
}
