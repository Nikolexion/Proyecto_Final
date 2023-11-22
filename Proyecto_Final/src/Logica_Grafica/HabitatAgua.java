package Logica_Grafica;
import Logica.*;

public class HabitatAgua {
    private Habitat habitat;

    public HabitatAgua() {
        habitat = new Habitat();
        String[] pkmns = {"Squirtle","Wartortle", "Blastoise", "Magikarp", "Gyarados", "Lapras", "Omanyte", "Omastar",
                            "Totodile", "Croconaw", "Feraligatr", "Suicune", "Kyogre"};
        habitat.addPkmn(pkmns);
    }
}
