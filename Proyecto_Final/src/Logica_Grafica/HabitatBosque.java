package Logica_Grafica;

import Logica.Comidas.Comedero;
import Logica.Habitat.Bosque;

import javax.swing.*;
import java.awt.*;

public class HabitatBosque {
    Bosque bosque;
    private Zona zona, zonaComedero;
    private Comedero comederoBosque;
    private int x,y,ancho,alto;

    public HabitatBosque() {
        bosque = new Bosque();
        comederoBosque = new Comedero();
        JButton boton = new JButton();
        x = 260;
        y = 215;
        ancho = 300;
        alto = 195;
        zona = new Zona(x,y,ancho,alto,boton);
        JButton botonComida = new JButton();
        zonaComedero = new Zona(x,y + 155,ancho,40,botonComida);
        comederoBosque.setZona(zonaComedero);
    }

    public Zona getZona() {
        return zona;
    }

    public Zona getZonaComedero() {
        return zonaComedero;
    }

    public Comedero getComederoBosque() {
        return comederoBosque;
    }

    public Image getImagen() {
        return bosque.getImage();
    }
}
