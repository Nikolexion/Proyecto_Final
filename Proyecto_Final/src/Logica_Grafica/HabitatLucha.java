package Logica_Grafica;

import Logica.Comidas.*;
import Logica.Habitat.Lucha;

import javax.swing.*;
import java.awt.*;

public class HabitatLucha {
    Lucha lucha;
    private Zona zona, zonaComedero;
    private Comedero comederoLucha;
    private int x,y,ancho,alto;

    public HabitatLucha() {
        lucha = new Lucha();
        comederoLucha = new Comedero();
        JButton boton = new JButton();
        x = 900;
        y = 420;
        ancho = 300;
        alto = 195;
        zona = new Zona(x,y,ancho,alto,boton);
        JButton botonComida = new JButton();
        zonaComedero = new Zona(x,y + 155,ancho,40,botonComida);
        comederoLucha.setZona(zonaComedero);
    }

    public Zona getZona() {
        return zona;
    }

    public Zona getZonaComedero() {
        return zonaComedero;
    }

    public Comedero getComederoLucha() {
        return comederoLucha;
    }
    public Image getImagen() {
        return lucha.getImage();
    }
}
