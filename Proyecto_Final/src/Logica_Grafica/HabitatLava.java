package Logica_Grafica;

import Logica.Habitat.Habitat;

public class HabitatLava {
    Habitat habitat;

    public HabitatLava() {
        habitat = new Habitat();
        String[] pkmns = {"Charmander", "Charmeleon", "Charizard", "Vulpix", "Ninetales", "Torchic", "Combusken", "Blaziken",
                            "Moltres", "Cyndaquil", "Quilava", "Typhlosion","Entei"};
        habitat.addPkmn(pkmns);
    }
}
