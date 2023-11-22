package Logica_Grafica;

import Logica.*;

public class HabitatCueva {
    Habitat habitat;

    public HabitatCueva() {
        habitat = new Habitat();
        String[] pkmns = {"Diglet", "Dugtrio", "Geodude", "Graveler", "Golem", "Registeel", "Nosepass", "Aron", "Lairon", "Aggron",
                            "Groudon", "Regirock"};
        habitat.addPkmn(pkmns);
    }
}
