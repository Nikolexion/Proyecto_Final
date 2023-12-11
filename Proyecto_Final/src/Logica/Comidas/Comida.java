package Logica.Comidas;

import java.awt.*;
/**
 * Clase generica de Comida, de la cual se heredan distintos metodos usados por los distintos tipos de Comida
 * */
public abstract class Comida {
    private Image imagen;
    private EnumComidas enumComidas;
    public Comida(Image image, EnumComidas enumComidas) {
        this.imagen = image;
        this.enumComidas = enumComidas;
    }
    public Image getImagen(){
        return imagen;
    }

    public EnumComidas getEnumComidas() {
        return enumComidas;
    }
}
