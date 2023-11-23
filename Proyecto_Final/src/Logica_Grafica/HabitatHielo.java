package Logica_Grafica;

import Logica.Habitat.Habitat;

public class HabitatHielo {
    Habitat habitat;

    public HabitatHielo() {
        habitat = new Habitat();
        String[] pkmns = {"Articuno", "Snorunt", "Glalie", "Spheal", "Sealeo", "Walrein", "Regice", "Vanillite", "Vanillish", "Vanilluxe"};
        habitat.addPkmn(pkmns);
    }
}
