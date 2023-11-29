package Logica_Grafica;

import Logica.Comedero;
import Logica.Habitat.Habitat;

import javax.swing.*;

public class HabitatLava {
    Habitat habitat;
    private Zona zona, zonaComedero;
    private Comedero comederoLava;

    public HabitatLava() {
        comederoLava = new Comedero();
        JButton boton = new JButton();
        zona = new Zona(900,215,300,195,boton);
        JButton botonComida = new JButton();
        zonaComedero = new Zona(900,370,300,40,botonComida);
    }

    public Zona getZona() {
        return zona;
    }

    public Zona getZonaComedero() {
        return zonaComedero;
    }

    public Comedero getComederoLava() {
        return comederoLava;
    }
}
