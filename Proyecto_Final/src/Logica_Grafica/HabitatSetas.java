package Logica_Grafica;

import Logica.Habitat.Habitat;

public class HabitatSetas {
    Habitat habitat;

    public HabitatSetas() {
        habitat = new Habitat();
        String[] pkmns = {"Shroomish", "Breelom", "Koffing", "Weezing", "Jigglypuff", "Igglytuff", "Paras", "Parasect", "Ekans", "Arbok"};
        habitat.addPkmn(pkmns);
    }
}
