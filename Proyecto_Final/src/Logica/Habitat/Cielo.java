package Logica.Habitat;

import java.util.ArrayList;
import javax.swing.*;
import java.awt.*;
import java.util.List;

public class Cielo extends Habitat {
    private List<String> pokemonesPermitidos;
    private Image image;

    public Cielo(){
        super(new ImageIcon("resources/Ambientes/Cielo.jpg").getImage());
        this.image = new ImageIcon("resources/Ambientes/Cielo.jpg").getImage();
        this.pokemonesPermitidos = new ArrayList<>();
        String[] permitidosCielo = {
                "Bagon", "Shelgon", "Salamence", "Dratini", "Dragonair",
                "Dragonite", "Ho-Oh", "Lugia", "Pidgey", "Pidgeotto",
                "Pidgeot", "Rayquaza", "Swablu", "Altaria"};
        for (String pokemon : permitidosCielo){
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
