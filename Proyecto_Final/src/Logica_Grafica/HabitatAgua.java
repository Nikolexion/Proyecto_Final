package Logica_Grafica;
import Logica.Habitat.Habitat;

import javax.swing.*;

public class HabitatAgua {
    private Habitat habitat;
    public Zona zona;

    public HabitatAgua() {
        habitat = new Habitat();
        String[] pkmns = {"Squirtle","Wartortle", "Blastoise", "Magikarp", "Gyarados", "Lapras", "Omanyte", "Omastar",
                            "Totodile", "Croconaw", "Feraligatr", "Suicune", "Kyogre"};
        habitat.addPkmn(pkmns);
        JButton boton = new JButton();
        zona = new Zona(300,30,300,300,boton);

    }
}
