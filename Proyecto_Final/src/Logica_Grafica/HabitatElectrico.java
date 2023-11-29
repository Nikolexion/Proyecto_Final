package Logica_Grafica;

import Logica.Comedero;
import Logica.Habitat.Habitat;

import javax.swing.*;

public class HabitatElectrico {
    Habitat habitat;
    private Zona zona, zonaComedero;
    private Comedero comederoElectrico;

    public HabitatElectrico() {
        comederoElectrico = new Comedero();
        JButton boton = new JButton();
        zona = new Zona(580,215,300,195,boton);
        JButton botonComida = new JButton();
        zonaComedero = new Zona(580,370,300,40,botonComida);
    }

    public Zona getZona() {
        return zona;
    }

    public Zona getZonaComedero() {
        return zonaComedero;
    }

    public Comedero getComederoElectrico() {
        return comederoElectrico;
    }
}
