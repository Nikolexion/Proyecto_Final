package Logica.Habitat;

import java.util.ArrayList;
import javax.swing.*;
import java.awt.*;
import java.util.List;

public class Humedal extends Habitat {
    private List<String> pokemonesPermitidos;
    private Image image;

    public Humedal(){
        super(new ImageIcon("resources/Ambientes/Humedal.jpg").getImage());
        this.image = new ImageIcon("resources/Ambientes/Humedal.jpg").getImage();
        this.pokemonesPermitidos = new ArrayList<>();
        String[] permitidosHumedal = {
                "Lotad", "Lombre", "Ludicolo", "Mudkip", "Marshtomp",
                "Swampert", "Psyduck", "Golduck", "Relicanth", "Wooper",
                "Quagsire"};
        for (String pokemon : permitidosHumedal){
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
