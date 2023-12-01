package Logica_Grafica;

import Logica.Comidas.Comedero;
import Logica.Habitat.Hielo;

import javax.swing.*;
import java.awt.*;

public class HabitatHielo {
    Hielo hielo;
    private Zona zona, zonaComedero;
    private Comedero comederoHielo;
    private int x,y,ancho,alto;

    public HabitatHielo() {
        hielo = new Hielo();
        comederoHielo = new Comedero();
        JButton boton = new JButton();
        x = 580;
        y = 420;
        ancho = 300;
        alto = 195;
        zona = new Zona(x,y,ancho,alto,boton);
        JButton botonComida = new JButton();
        zonaComedero = new Zona(x,y + 155,ancho,40,botonComida);
        comederoHielo.setZona(zonaComedero);
    }

    public Zona getZona() {
        return zona;
    }

    public Zona getZonaComedero() {
        return zonaComedero;
    }

    public Comedero getComederoHielo() {
        return comederoHielo;
    }
    public Image getImagen() {
        return hielo.getImage();
    }
}
