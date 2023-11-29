package Logica_Grafica;

import Logica.Comedero;
import Logica.Habitat.Habitat;

import javax.swing.*;

public class HabitatBosque {
    Habitat habitat;
    private Zona zona, zonaComedero;
    private Comedero comederoBosque;

    public HabitatBosque() {
        comederoBosque = new Comedero();
        JButton boton = new JButton();
        zona = new Zona(260,215,300,195,boton);
        JButton botonComida = new JButton();
        zonaComedero = new Zona(260,370,300,40,botonComida);
    }

    public Zona getZona() {
        return zona;
    }

    public Zona getZonaComedero() {
        return zonaComedero;
    }

    public Comedero getComederoBosque() {
        return comederoBosque;
    }
}
