package Logica.Comidas;

import Logica.*;

import javax.swing.*;
import java.awt.*;

public enum EnumComidas {
    POKOCHO("pokocho", 200, "resources/pokocho.png"),
    FRAMBU("frambu", 200, "resources/Baya_Frambu.png"),
    LATANO("latano", 200, "resources/Baya_Latano.png"),
    PINIA("pinia", 200, "resources/Baya_Pinia.png");

    private String nombre;
    private int precio;
    private Image imagen;
    EnumComidas(String nombre, int precio, String path){
        this.nombre = nombre;
        this.precio = precio;
        this.imagen = new ImageIcon(path).getImage();
    }

    public String getNombre() {
        return nombre;
    }

    public int getPrecio() {
        return precio;
    }

    public Image getImagen() {
        return imagen;
    }
}
