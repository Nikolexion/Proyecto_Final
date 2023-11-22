package Logica_Grafica;

import Logica.*;

public class HabitatBosque {
    Habitat habitat;

    public HabitatBosque() {
        habitat = new Habitat();
        String[] pkmns = {"Chikorita", "Bayleef", "Meganium","Odish", "Gloom", "Vileplume","Treecko", "Grovyle", "Sceptile",
                            "Bulbasaur", "Ivysaur", "Venusaur", "Snivy", "Servine", "Serperior", "Sudowoodo"};
        habitat.addPkmn(pkmns);
    }
}
