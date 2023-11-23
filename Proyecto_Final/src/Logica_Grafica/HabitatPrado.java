package Logica_Grafica;

import Logica.Habitat.Habitat;

public class HabitatPrado {
    Habitat habitat;

    public HabitatPrado() {
        habitat = new Habitat();
        String[] pkmns = {"Snorlax", "Mew", "Mewtwo", "Celebi", "Zigzagoon", "Linoone", "Ralts", "Kirlia", "Gardevoir"};
        habitat.addPkmn(pkmns);
    }
}
