package Logica.Habitat;

import Logica.Comidas.Comedero;

import java.util.ArrayList;
import javax.swing.*;
import java.awt.*;
import java.util.List;

public class Cueva extends Habitat {
    private List<String> pokemonesPermitidos;
    private Image image;
    private Comedero comedero;
    public Cueva(){
        super(new ImageIcon("resources/Ambientes/Cueva.jpg").getImage());
        this.image = new ImageIcon("resources/Ambientes/Cueva.jpg").getImage();
        this.pokemonesPermitidos = new ArrayList<>();
        String[] permitidosCueva = {
                "Aron", "Lairon", "Aggron", "Diglett", "Dugtrio",
                "Geodude", "Graveler", "Golem", "Groudon", "Nosepass",
                "Probopass", "Regirock", "Registeel"};
        for (String pokemon : permitidosCueva){
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
