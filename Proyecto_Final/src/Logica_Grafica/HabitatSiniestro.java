package Logica_Grafica;

import Logica.Comedero;
import Logica.Habitat.Habitat;
import Logica.Habitat.Siniestro;

import javax.swing.*;
import java.awt.*;

public class HabitatSiniestro {
    Siniestro siniestro;
    private Zona zona, zonaComedero;
    private Comedero comederoSiniestro;
    private int x,y,ancho,alto;

    public HabitatSiniestro() {
        siniestro = new Siniestro();
        comederoSiniestro = new Comedero();
        JButton boton = new JButton();
        x = 1220;
        y = 420;
        ancho = 300;
        alto = 195;
        zona = new Zona(x,y,ancho,alto,boton);
        JButton botonComida = new JButton();
        zonaComedero = new Zona(x,y + 155,ancho,40,botonComida);
        comederoSiniestro.setZona(zonaComedero);
    }

    public Zona getZona() {
        return zona;
    }

    public Zona getZonaComedero() {
        return zonaComedero;
    }

    public Comedero getComederoSiniestro() {
        return comederoSiniestro;
    }
    public Image getImagen() {
        return siniestro.getImage();
    }
}
