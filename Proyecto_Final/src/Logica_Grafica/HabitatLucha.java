package Logica_Grafica;

import Logica.Comedero;
import Logica.Habitat.Habitat;

import javax.swing.*;

public class HabitatLucha {
    Habitat habitat;
    private Zona zona, zonaComedero;
    private Comedero comederoLucha;

    public HabitatLucha() {
        comederoLucha = new Comedero();
        JButton boton = new JButton();
        zona = new Zona(900,420,300,195,boton);
        JButton botonComida = new JButton();
        zonaComedero = new Zona(900,575,300,40,botonComida);
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
}
