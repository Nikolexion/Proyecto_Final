package Logica.Habitat;

import Logica.Comidas.Comedero;

import java.util.ArrayList;
import java.util.List;
import javax.swing.*;
import java.awt.*;

public class Agua extends Habitat {
    private List<String> pokemonesPermitidos;
    private Image image;
    private Comedero comedero;

    public Agua(){
        super(new ImageIcon("resources/Ambientes/Agua.jpg").getImage());
        this.image = new ImageIcon("resources/Ambientes/Agua.jpg").getImage();
        this.pokemonesPermitidos = new ArrayList<>();
        String[] permitidosAgua = {
                "Squirtle","Wartortle", "Blastoise", "Magikarp", "Gyarados",
                "Lapras", "Omanyte", "Omastar", "Totodile", "Croconaw",
                "Feraligatr", "Suicune", "Kyogre"};
        for (String pokemon : permitidosAgua){
            pokemonesPermitidos.add(pokemon);
        }
        comedero = new Comedero();
    }

    public Image getImage() {
        return image;
    }

    @Override
    public boolean permitePokemon(String nombrePokemon) {
        return pokemonesPermitidos.contains(nombrePokemon);
    }
}
