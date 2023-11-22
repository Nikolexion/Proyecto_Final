package Logica_Grafica;

import Logica.*;

public class HabitatSiniestro {
    Habitat habitat;

    public HabitatSiniestro() {
        habitat = new Habitat();
        String[] pkmns = {"Misdreavus", "Gastly", "Haunter", "Gengar", "Exeggute", "Exeggcutor", "Cubone", "Marowak", "Duskull", "Dusclops",
                            "Shuppet", "Banette"};
        habitat.addPkmn(pkmns);
    }
}
