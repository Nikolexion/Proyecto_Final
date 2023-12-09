package Logica.Habitat;

import Logica.*;
import Logica.Comidas.*;

import java.awt.*;

public abstract class Habitat {
    private Image image;
    private Comedero comedero;

    public Habitat(Image image) {
        this.image = image;
    }

    public abstract boolean permitePokemon(Pokemon pokemon);

    public Image getImage() {
        return image;
    }
}