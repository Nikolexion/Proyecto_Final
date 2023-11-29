package Logica_Grafica;

import Logica.Comedero;
import Logica.Habitat.Habitat;

import javax.swing.*;

public class HabitatCueva {
    Habitat habitat;
    private Zona zona, zonaComedero;
    private Comedero comederoCueva;

    public HabitatCueva() {
        comederoCueva = new Comedero();
        JButton boton = new JButton();
        zona = new Zona(580,10,300,195,boton);
        JButton botonComida = new JButton();
        zonaComedero = new Zona(580,165,300,40,botonComida);
    }

    public Zona getZona() {
        return zona;
    }

    public Zona getZonaComedero() {
        return zonaComedero;
    }

    public Comedero getComederoCueva() {
        return comederoCueva;
    }
}
