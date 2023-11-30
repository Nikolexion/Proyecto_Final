package Logica_Grafica;
import Logica.Comedero;
import Logica.Habitat.Agua;
import Logica.Habitat.Habitat;

import javax.swing.*;
import java.awt.*;

public class HabitatAgua {
    private Agua agua;
    private Zona zona, zonaComedero;
    private Comedero comederoAgua;
    private int x,y,ancho,alto;

    public HabitatAgua() {
        agua = new Agua();
        comederoAgua = new Comedero();
        JButton boton = new JButton();
        x = 260;
        y = 10;
        ancho = 300;
        alto = 195;
        zona = new Zona(x,y,ancho,alto,boton);
        JButton botonComida = new JButton();
        zonaComedero = new Zona(x,y + 155,ancho,40,botonComida);
        comederoAgua.setZona(zonaComedero);

    }

    public Zona getZona() {
        return zona;
    }

    public Zona getZonaComedero() {
        return zonaComedero;
    }

    public Comedero getComederoAgua() {
        return comederoAgua;
    }

    public Image getImagen() {
        return agua.getImage();
    }
}
