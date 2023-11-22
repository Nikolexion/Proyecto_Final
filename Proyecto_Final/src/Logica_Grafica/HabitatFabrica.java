package Logica_Grafica;

import Logica.*;

public class HabitatFabrica {
    Habitat habitat;

    public HabitatFabrica() {
        habitat = new Habitat();
        String[] pkmns = {"Pikachu", "Raichu", "Magnemite", "Magneton", "Magnezone", "Voltrob", "Electrode", "Raikou", "Zapdos"};
        habitat.addPkmn(pkmns);
    }
}
