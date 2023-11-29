package Logica_Grafica;

import Logica.Comedero;
import Logica.Habitat.Habitat;

import javax.swing.*;

public class HabitatSetas {
    Habitat habitat;
    private Zona zona, zonaComedero;
    private Comedero comederoSetas;

    public HabitatSetas() {
        comederoSetas = new Comedero();
        JButton boton = new JButton();
        zona = new Zona(1220,215,300,195,boton);
        JButton botonComida = new JButton();
        zonaComedero = new Zona(1220,370,300,40,botonComida);
    }

    public Zona getZona() {
        return zona;
    }

    public Zona getZonaComedero() {
        return zonaComedero;
    }

    public Comedero getComederoSetas() {
        return comederoSetas;
    }
}
