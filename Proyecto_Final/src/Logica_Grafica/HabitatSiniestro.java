package Logica_Grafica;

import Logica.Comedero;
import Logica.Habitat.Habitat;

import javax.swing.*;

public class HabitatSiniestro {
    Habitat habitat;
    private Zona zona, zonaComedero;
    private Comedero comederoSiniestro;

    public HabitatSiniestro() {
        comederoSiniestro = new Comedero();
        JButton boton = new JButton();
        zona = new Zona(1220,420,300,195,boton);
        JButton botonComida = new JButton();
        zonaComedero = new Zona(1220,575,300,40,botonComida);
    }

    public Zona getZona() {
        return zona;
    }

    public Zona getZonaComedero() {
        return zonaComedero;
    }

    public Comedero getComederoSiniestro() {
        return comederoSiniestro;
    }
}
