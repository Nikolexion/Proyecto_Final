package Logica.Habitat;

import Logica.Comidas.Comedero;

import java.util.ArrayList;
import javax.swing.*;
import java.awt.*;
import java.util.List;

public class Siniestro extends Habitat {
    private List<String> pokemonesPermitidos;
    private Image image;
    private Comedero comedero;
    public Siniestro(){
        super(new ImageIcon("resources/Ambientes/Siniestro.jpg").getImage());
        this.image = new ImageIcon("resources/Ambientes/Siniestro.jpg").getImage();
        this.pokemonesPermitidos = new ArrayList<>();
        String[] permitidosSiniestro = {
                "Cubone", "Marowak", "Duskull", "Dusclops", "Dusknoir",
                "Exeggcute", "Exeggutor", "Gastly", "Haunter", "Gengar",
                "Misdreavus", "Mismagius", "Shuppet", "Banette"};
        for (String pokemon : permitidosSiniestro){
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
