package Logica_Grafica;

import Logica.*;

public class HabitatElectrico {
    Habitat habitat;

    public HabitatElectrico() {
        habitat = new Habitat();
        String[] pkmns = {"Pikachu", "Raichu", "Magnemite", "Magneton", "Magnezone", "Voltrob", "Electrode", "Raikou", "Zapdos"};
        habitat.addPkmn(pkmns);
    }
}
