package Logica_Grafica;

import Logica.Comedero;
import Logica.Habitat.Habitat;
import Logica.Habitat.Prado;

import javax.swing.*;
import java.awt.*;

public class HabitatPrado {
    Prado prado;
    private Zona zona, zonaComedero;
    private Comedero comederoPrado;
    private int x,y,ancho,alto;

    public HabitatPrado() {
        prado = new Prado();
        comederoPrado = new Comedero();
        JButton boton = new JButton();
        x = 1220;
        y = 10;
        ancho = 300;
        alto = 195;
        zona = new Zona(x,y,ancho,alto,boton);
        JButton botonComida = new JButton();
        zonaComedero = new Zona(x,y + 155,ancho,40,botonComida);
        comederoPrado.setZona(zonaComedero);
    }

    public Zona getZona() {
        return zona;
    }

    public Zona getZonaComedero() {
        return zonaComedero;
    }

    public Comedero getComederoPrado() {
        return comederoPrado;
    }
    public Image getImagen() {
        return prado.getImage();
    }
}
