package Logica.Habitat;

import java.util.ArrayList;
import java.util.List;
import javax.swing.*;
import java.awt.*;

public class Agua extends Habitat {
    private List<String> pokemonesPermitidos;
    private Image image;

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
    }

    public Image getImage() {
        return image;
    }

    @Override
    public boolean permitePokemon(String nombrePokemon) {
        return pokemonesPermitidos.contains(nombrePokemon);
    }
}
