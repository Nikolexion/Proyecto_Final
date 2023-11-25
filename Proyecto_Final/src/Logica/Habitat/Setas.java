package Logica.Habitat;

import java.util.ArrayList;
import javax.swing.*;
import java.awt.*;
import java.util.List;

public class Setas extends Habitat {
    private List<String> pokemonesPermitidos;
    private Image image;

    public Setas(){
        super(new ImageIcon("resources/Ambientes/Setas.jpg").getImage());
        this.image = new ImageIcon("resources/Ambientes/Setas.jpg").getImage();
        this.pokemonesPermitidos = new ArrayList<>();
        String[] permitidosSetas = {
                "Ekans", "Arbok", "Igglybuff", "Jigglypuff", "Wigglytuff",
                "Koffing", "Weezing", "Paras", "Parasect", "Shroomish",
                "Breloom"};
        for (String pokemon : permitidosSetas){
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
