package Logica.Comidas;

import javax.swing.*;
import java.awt.*;
/**
 * Clase que extiende a Comida, la cual difiere de las demas clases Comida solo por su imagen y por la preferencia de los pokemones
 * */
public class Frambu extends Comida{
    private Image image;
    public Frambu() {
        super(EnumComidas.FRAMBU.getImagen(), EnumComidas.FRAMBU);
        image = EnumComidas.FRAMBU.getImagen();
    }

    public Image getImage() {
        return image;
    }
}
