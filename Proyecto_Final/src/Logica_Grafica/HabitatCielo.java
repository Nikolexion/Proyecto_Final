package Logica_Grafica;

import Logica.Comedero;
import Logica.Habitat.Habitat;

import javax.swing.*;

public class HabitatCielo {
    Habitat habitat;
    private Zona zona, zonaComedero;
    private Comedero comederoCielo;
    public HabitatCielo() {
        comederoCielo = new Comedero();
        JButton boton = new JButton();
        zona = new Zona(260,420,300,195,boton);
        JButton botonComida = new JButton();
        zonaComedero = new Zona(260,575,300,40,botonComida);
    }

    public Zona getZona() {
        return zona;
    }

    public Zona getZonaComedero() {
        return zonaComedero;
    }

    public Comedero getComederoCielo() {
        return comederoCielo;
    }
}
