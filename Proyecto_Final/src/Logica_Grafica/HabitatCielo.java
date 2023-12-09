package Logica_Grafica;

import Logica.Comidas.*;
import Logica.Habitat.Cielo;

import javax.swing.*;
import java.awt.*;

public class HabitatCielo {
    Cielo cielo;
    private Zona zona, zonaComedero;
    private Comedero comederoCielo;
    private int x,y,ancho,alto;
    public HabitatCielo() {
        cielo = new Cielo();
        comederoCielo = new Comedero();
        JButton boton = new JButton();
        x = 260;
        y = 420;
        ancho = 300;
        alto = 195;
        zona = new Zona(x,y,ancho,alto,boton);
        JButton botonComida = new JButton();
        zonaComedero = new Zona(x,y + 155,ancho,40,botonComida);
        comederoCielo.setZona(zonaComedero);
    }

    public Zona getZona() {
        return zona;
    }

    public Zona getZonaComedero() {
        return zonaComedero;
    }

    public Comedero getComederoCielo() {
        return comederoCielo;
    }

    public Image getImagen() {
        return cielo.getImage();
    }
}
