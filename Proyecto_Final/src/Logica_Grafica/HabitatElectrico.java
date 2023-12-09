package Logica_Grafica;

import Logica.Comidas.*;
import Logica.Habitat.Electrico;

import javax.swing.*;
import java.awt.*;

public class HabitatElectrico {
    Electrico electrico;
    private Zona zona, zonaComedero;
    private Comedero comederoElectrico;
    private int x,y,ancho,alto;

    public HabitatElectrico() {
        electrico = new Electrico();
        comederoElectrico = new Comedero();
        JButton boton = new JButton();
        x = 580;
        y = 215;
        ancho = 300;
        alto = 195;
        zona = new Zona(x,y,ancho,alto,boton);
        JButton botonComida = new JButton();
        zonaComedero = new Zona(x,y + 155,ancho,40,botonComida);
        comederoElectrico.setZona(zonaComedero);
    }

    public Zona getZona() {
        return zona;
    }

    public Zona getZonaComedero() {
        return zonaComedero;
    }

    public Comedero getComederoElectrico() {
        return comederoElectrico;
    }

    public Image getImagen() {
        return electrico.getImage();
    }
}
