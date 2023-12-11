package Logica.Comidas;

import Logica.*;

import javax.swing.*;
import java.awt.*;
/**
 * Enum encargado de encapsular el nombre de las distintas comidas, precio(El cual no pudo ser implementado) y la imagen de
 * cada tipo de comida
 * */
public enum EnumComidas {
    POKOCHO("Pokocho", 200, "resources/pokocho.png"),
    FRAMBU("Frambu", 200, "resources/Baya_Frambu.png"),
    LATANO("Latano", 200, "resources/Baya_Latano.png"),
    PINIA("Pinia", 200, "resources/Baya_Pinia.png");

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

    public Image getImagen() {
        return imagen;
    }
}
