package Logica.Comidas;

import java.awt.*;

public abstract class Comida {
    private boolean Comido;
    private Image imagen;
    public Comida() {
        this.Comido = false;
    }
    abstract void comer();
    public Image getImagen(){
        return imagen;
    }
}
