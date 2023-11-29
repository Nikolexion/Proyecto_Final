package Logica_Grafica;
import Logica.Comedero;
import Logica.Habitat.Habitat;

import javax.swing.*;

public class HabitatAgua {
    private Habitat habitat;
    private Zona zona, zonaComedero;
    private Comedero comederoAgua;

    public HabitatAgua() {
        comederoAgua = new Comedero();
        JButton boton = new JButton();
        zona = new Zona(260,10,300,195,boton);
        JButton botonComida = new JButton();
        zonaComedero = new Zona(260,165,300,40,botonComida);

    }

    public Zona getZona() {
        return zona;
    }

    public Zona getZonaComedero() {
        return zonaComedero;
    }

    public Comedero getComederoAgua() {
        return comederoAgua;
    }
}
