package Logica_Grafica;

import Logica.Comidas.Comedero;
import Logica.Habitat.Humedal;

import javax.swing.*;
import java.awt.*;

public class HabitatHumedal {
    Humedal humedal;
    private Zona zona, zonaComedero;
    private Comedero comederoHumedal;
    private int x,y,ancho,alto;

    public HabitatHumedal() {
        humedal = new Humedal();
        comederoHumedal = new Comedero();
        JButton boton = new JButton();
        x = 900;
        y = 10;
        ancho = 300;
        alto = 195;
        zona = new Zona(x,y,ancho,alto,boton);
        JButton botonComida = new JButton();
        zonaComedero = new Zona(x,y + 155,ancho,40,botonComida);
        comederoHumedal.setZona(zonaComedero);
    }

    public Zona getZona() {
        return zona;
    }

    public Zona getZonaComedero() {
        return zonaComedero;
    }

    public Comedero getComederoHumedal() {
        return comederoHumedal;
    }
    public Image getImagen() {
        return humedal.getImage();
    }
}
