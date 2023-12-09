package Logica_Grafica;

import Logica.Comidas.*;
import Logica.Habitat.Setas;

import javax.swing.*;
import java.awt.*;

public class HabitatSetas {
    Setas setas;
    private Zona zona, zonaComedero;
    private Comedero comederoSetas;
    private int x,y,ancho,alto;

    public HabitatSetas() {
        setas = new Setas();
        comederoSetas = new Comedero();
        JButton boton = new JButton();
        x = 1220;
        y = 215;
        ancho = 300;
        alto = 195;
        zona = new Zona(x,y,ancho,alto,boton);
        JButton botonComida = new JButton();
        zonaComedero = new Zona(x,y + 155,ancho,40,botonComida);
        comederoSetas.setZona(zonaComedero);
    }

    public Zona getZona() {
        return zona;
    }

    public Zona getZonaComedero() {
        return zonaComedero;
    }

    public Comedero getComederoSetas() {
        return comederoSetas;
    }
    public Image getImagen() {
        return setas.getImage();
    }
}
