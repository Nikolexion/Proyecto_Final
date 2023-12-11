package Logica.Comidas;

import javax.swing.*;
import java.awt.*;
/**
 * Clase que extiende a Comida, la cual difiere de las demas clases Comida solo por su imagen y por la preferencia de los pokemones
 * */
public class Pinia extends Comida{
    private Image image;
    public Pinia() {
        super(EnumComidas.PINIA.getImagen(), EnumComidas.PINIA);
        image = EnumComidas.PINIA.getImagen();
    }

    public Image getImage() {
        return image;
    }
}
