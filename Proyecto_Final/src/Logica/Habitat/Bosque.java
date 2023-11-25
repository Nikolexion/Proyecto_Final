package Logica.Habitat;

import java.util.ArrayList;
import javax.swing.*;
import java.awt.*;
import java.util.List;

public class Bosque extends Habitat {
    private List<String> pokemonesPermitidos;
    private Image image;

    public Bosque(){
        super(new ImageIcon("resources/Ambientes/Bosque.jpg").getImage());
        this.image = new ImageIcon("resources/Ambientes/Bosque.jpg").getImage();
        this.pokemonesPermitidos = new ArrayList<>();
        String[] permitidosBosque = {
                "Chikorita", "Bayleef", "Meganium", "Bonsly", "Sudowoodo",
                "Bulbasaur", "Ivysaur", "Venusaur", "Oddish", "Gloom",
                "Bellossom", "Vileplume", "Snivy", "Servine", "Serperior",
                "Treecko", "Grovyle", "Sceptile"};
        for (String pokemon : permitidosBosque){
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
