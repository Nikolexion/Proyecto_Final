package Logica.Habitat;

import Logica.*;
import Logica.Comidas.*;

import java.awt.*;

public abstract class Habitat {
    private Image image;
    private Comedero comedero;
    private EnumComidas comidaPreferida;

    public Habitat(Image image, EnumComidas comidaPreferida) {
        this.image = image;
        this.comidaPreferida = comidaPreferida;
    }

    public abstract boolean permitePokemon(Pokemon pokemon);
    public abstract boolean permiteComida(Comida comida);

    public Image getImage() {
        return image;
    }
}