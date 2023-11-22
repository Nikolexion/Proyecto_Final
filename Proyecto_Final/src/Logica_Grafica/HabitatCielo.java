package Logica_Grafica;

import Logica.*;

public class HabitatCielo {
    Habitat habitat;

    public HabitatCielo() {
        habitat = new Habitat();
        String[] pkmns = {"Pidgey", "Pidgeotto", "Pidgeot", "Dratini", "Dragonair", "Dragonite", "Lugia", "Ho-Oh","Swablu", "Altaria",
                            "Bagon", "Shelgon", "Salamence", "Rayquaza"};
        habitat.addPkmn(pkmns);
    }
}
