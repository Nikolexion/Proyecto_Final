package Logica.Comidas;

import java.awt.*;

public abstract class Comida {
    private boolean Comido;
    private Image imagen;
    private EnumComidas enumComidas;
    public Comida(Image image, EnumComidas enumComidas) {
        this.imagen = image;
        this.Comido = false;
        this.enumComidas = enumComidas;
    }
    abstract void comer();
    public Image getImagen(){
        return imagen;
    }

    public EnumComidas getEnumComidas() {
        return enumComidas;
    }
}
