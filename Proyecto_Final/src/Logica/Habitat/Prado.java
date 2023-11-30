package Logica.Habitat;

import Logica.Comedero;

import java.util.ArrayList;
import javax.swing.*;
import java.awt.*;
import java.util.List;

public class Prado extends Habitat {
    private List<String> pokemonesPermitidos;
    private Image image;
    private Comedero comedero;
    public Prado(){
        super(new ImageIcon("resources/Ambientes/Prado.jpg").getImage());
        this.image = new ImageIcon("resources/Ambientes/Prado.jpg").getImage();
        this.pokemonesPermitidos = new ArrayList<>();
        String[] permitidosPrado = {
                "Celebi", "Mew", "Mewtwo", "Ralts", "Kirlia",
                "Gardevoir", "Gallade", "Snorlax", "Zigzagoon", "Linoone"};
        for (String pokemon : permitidosPrado){
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
