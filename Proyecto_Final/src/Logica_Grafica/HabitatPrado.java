package Logica_Grafica;

import Logica.Comedero;
import Logica.Habitat.Habitat;

import javax.swing.*;

public class HabitatPrado {
    Habitat habitat;
    private Zona zona, zonaComedero;
    private Comedero comederoPrado;

    public HabitatPrado() {
        comederoPrado = new Comedero();
        JButton boton = new JButton();
        zona = new Zona(1220,10,300,195,boton);
        JButton botonComida = new JButton();
        zonaComedero = new Zona(1220,165,300,40,botonComida);
    }

    public Zona getZona() {
        return zona;
    }

    public Zona getZonaComedero() {
        return zonaComedero;
    }

    public Comedero getComederoPrado() {
        return comederoPrado;
    }
}
