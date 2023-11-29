package Logica_Grafica;

import Logica.Comedero;
import Logica.Habitat.Habitat;

import javax.swing.*;

public class HabitatHumedal {
    Habitat habitat;
    private Zona zona, zonaComedero;
    private Comedero comederoHumedal;

    public HabitatHumedal() {
        comederoHumedal = new Comedero();
        JButton boton = new JButton();
        zona = new Zona(900,10,300,195,boton);
        JButton botonComida = new JButton();
        zonaComedero = new Zona(900,165,300,40,botonComida);
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
}
