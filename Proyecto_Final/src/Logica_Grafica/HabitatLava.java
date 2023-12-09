package Logica_Grafica;

import Logica.Comidas.*;
import Logica.Habitat.Lava;

import javax.swing.*;
import java.awt.*;

public class HabitatLava {
    Lava lava;
    private Zona zona, zonaComedero;
    private Comedero comederoLava;
    private int x,y,ancho,alto;

    public HabitatLava() {
        lava = new Lava();
        comederoLava = new Comedero();
        JButton boton = new JButton();
        x = 900;
        y = 215;
        ancho = 300;
        alto = 195;
        zona = new Zona(x,y,ancho,alto,boton);
        JButton botonComida = new JButton();
        zonaComedero = new Zona(x,y + 155,ancho,40,botonComida);
        comederoLava.setZona(zonaComedero);
    }

    public Zona getZona() {
        return zona;
    }

    public Zona getZonaComedero() {
        return zonaComedero;
    }

    public Comedero getComederoLava() {
        return comederoLava;
    }
    public Image getImagen() {
        return lava.getImage();
    }
}
