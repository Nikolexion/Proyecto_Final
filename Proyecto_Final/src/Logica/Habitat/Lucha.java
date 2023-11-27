package Logica.Habitat;

import java.util.ArrayList;
import javax.swing.*;
import java.awt.*;
import java.util.List;

public class Lucha extends Habitat {
    private List<String> pokemonesPermitidos;
    private Image image;

    public Lucha(){
        super(new ImageIcon("resources/Ambientes/Lucha.jpg").getImage());
        this.image = new ImageIcon("resources/Ambientes/Lucha.jpg").getImage();
        this.pokemonesPermitidos = new ArrayList<>();
        String[] permitidosLucha = {
                "Hitmonchan", "Hitmonlee", "Machop", "Machamp", "Machoke",
                "Makuhita", "Hariyama", "Mankey", "Primeape", "Annihilape"};
        for (String pokemon : permitidosLucha){
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
