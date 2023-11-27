package Logica.Habitat;

import java.util.ArrayList;
import javax.swing.*;
import java.awt.*;
import java.util.List;

public class Hielo extends Habitat {
    private List<String> pokemonesPermitidos;
    private Image image;

    public Hielo(){
        super(new ImageIcon("resources/Ambientes/Hielo.jpg").getImage());
        this.image = new ImageIcon("resources/Ambientes/Hielo.jpg").getImage();
        this.pokemonesPermitidos = new ArrayList<>();
        String[] permitidosHielo = {
                "Articuno", "Regice", "Snorunt", "Glalie", "Froslass",
                "Spheal", "Sealeo", "Walrein", "Vanillish", "Vanillite",
                "Vanilluxe"};
        for (String pokemon : permitidosHielo){
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
