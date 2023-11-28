package Logica;

import javax.swing.*;
import java.awt.*;

public enum DetallePokemon {
    SQUIRTLE("Squirtle", 100,"resources/Pokemones/Agua/Squirtle/Squirtle007.png");

    private String nombre;
    private Image imagen;
    private int precio;
    DetallePokemon(String nombre, int precio, String path){
        this.nombre = nombre;
        this.precio = precio;
        this.imagen = new ImageIcon(path).getImage();
    }

    public Image getImagen() {
        return imagen;
    }
}
