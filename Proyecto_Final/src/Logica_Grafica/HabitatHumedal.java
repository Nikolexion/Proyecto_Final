package Logica_Grafica;

import Logica.*;

public class HabitatHumedal {
    Habitat habitat;

    public HabitatHumedal() {
        habitat = new Habitat();
        String[] pkmns = {"Mudkip", "Marshtomp", "Swampert", "Lotad", "Lombre", "Ludicolo", "Wooper", "Quagsire", "Relicanth", "Psyduck",
                            "Golduck"};
        habitat.addPkmn(pkmns);
    }
}
