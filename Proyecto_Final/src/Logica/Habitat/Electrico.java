package Logica.Habitat;

import java.util.ArrayList;
import javax.swing.*;
import java.awt.*;
import java.util.List;

public class Electrico extends Habitat {
    private List<String> pokemonesPermitidos;
    private Image image;

    public Electrico(){
        super(new ImageIcon("resources/Ambientes/Electrico.jpg").getImage());
        this.image = new ImageIcon("resources/Ambientes/Electrico.jpg").getImage();
        this.pokemonesPermitidos = new ArrayList<>();
        String[] permitidosElectrico = {
                "Magnemite", "Magneton", "Magnezone", "Pichu", "Pikachu",
                "Raichu", "Raikou", "Voltrob", "Electrode", "Zapdos"};
        for (String pokemon : permitidosElectrico){
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
