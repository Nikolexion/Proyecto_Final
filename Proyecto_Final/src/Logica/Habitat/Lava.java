package Logica.Habitat;

import java.util.ArrayList;
import javax.swing.*;
import java.awt.*;
import java.util.List;

public class Lava extends Habitat {
    private List<String> pokemonesPermitidos;
    private Image image;

    public Lava(){
        super(new ImageIcon("resources/Ambientes/Lava.jpg").getImage());
        this.image = new ImageIcon("resources/Ambientes/Lava.jpg").getImage();
        this.pokemonesPermitidos = new ArrayList<>();
        String[] permitidosLava = {
                "Charmander", "Charmeleon", "Charizard", "Cyndaquil", "Quilava",
                "Typhlosion", "Entei", "Moltres", "Torchic", "Combusken",
                "Blaziken", "Vulpix", "Ninetales"};
        for (String pokemon : permitidosLava){
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
