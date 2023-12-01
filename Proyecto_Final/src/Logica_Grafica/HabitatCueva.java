package Logica_Grafica;

import Logica.Comidas.Comedero;
import Logica.Habitat.Cueva;

import javax.swing.*;
import java.awt.*;

public class HabitatCueva {
    Cueva cueva;
    private Zona zona, zonaComedero;
    private Comedero comederoCueva;
    private int x,y,ancho,alto;

    public HabitatCueva() {
        cueva = new Cueva();
        comederoCueva = new Comedero();
        JButton boton = new JButton();
        x = 580;
        y = 10;
        ancho = 300;
        alto = 195;
        zona = new Zona(x,y,ancho,alto,boton);
        JButton botonComida = new JButton();
        zonaComedero = new Zona(x,y + 155,ancho,40,botonComida);
        comederoCueva.setZona(zonaComedero);
    }

    public Zona getZona() {
        return zona;
    }

    public Zona getZonaComedero() {
        return zonaComedero;
    }

    public Comedero getComederoCueva() {
        return comederoCueva;
    }

    public Image getImagen() {
        return cueva.getImage();
    }
}
