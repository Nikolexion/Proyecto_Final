package Logica_Grafica;

import Logica.*;

public class HabitatLucha {
    Habitat habitat;

    public HabitatLucha() {
        habitat = new Habitat();
        String[] pkmns = {"Mankey", "Primeape", "Hitmonlee", "Hitmonchan", "Machop", "Machoke", "Machamp", "Makuhita", "Hariyama"};
        habitat.addPkmn(pkmns);
    }
}
