package Logica.Habitat;

import Logica.*;
import Logica.Excepciones.HabitatNoPermitePokemon;

import java.awt.*;
import java.util.ArrayList;

public abstract class Habitat {
    private ArrayList<Pokemon> arrayList;
    private Image image;
    private Comedero comedero;
    public Habitat(Image image){
        this.image = image;
        arrayList = new ArrayList<>();
    }
    public abstract boolean permitePokemon(Pokemon pokemon);
    public void addPokemon(Pokemon pokemon) throws HabitatNoPermitePokemon {
        if (permitePokemon(pokemon)){
            this.arrayList.add(pokemon);
        } else {
            throw new HabitatNoPermitePokemon();
        }
    }
    public Pokemon getPokemon(Pokemon pokemon){
        int index = this.arrayList.indexOf(pokemon);
        if (index != -1) {
            return this.arrayList.remove(index);
        } else {
            return null;
        }
    }
    public Image getImage(){
        return image;
    }

}
