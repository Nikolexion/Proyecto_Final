package Logica_Grafica;

import Logica.Comedero;
import Logica.Habitat.Habitat;

import javax.swing.*;

public class HabitatHielo {
    Habitat habitat;
    private Zona zona, zonaComedero;
    private Comedero comederoHielo;

    public HabitatHielo() {
        comederoHielo = new Comedero();
        JButton boton = new JButton();
        zona = new Zona(580,420,300,195,boton);
        JButton botonComida = new JButton();
        zonaComedero = new Zona(580,575,300,40,botonComida);
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
}
