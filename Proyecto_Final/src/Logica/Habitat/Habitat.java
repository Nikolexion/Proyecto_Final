package Logica.Habitat;

import Logica.*;
import Logica.Comidas.*;
import Logica.Excepciones.HabitatNoPermitePokemon;

import java.awt.*;
import java.util.ArrayList;

public abstract class Habitat {
    private Image image;
    private Comedero comedero;
    private EnumComidas comidaPreferida;
    private ArrayList<Pokemon> arrayList;

    public Habitat(Image image, EnumComidas comidaPreferida) {
        this.image = image;
        this.comidaPreferida = comidaPreferida;
        arrayList = new ArrayList<>();
    }

    public abstract boolean permitePokemon(Pokemon pokemon);
    public abstract boolean permiteComida(Comida comida);
    public void addPokemon(Pokemon pokemon) throws HabitatNoPermitePokemon {
        if (permitePokemon(pokemon)){
            this.arrayList.add(pokemon);
        } else {
            throw new HabitatNoPermitePokemon("El pokemon " + pokemon.getNombre()
                                              + " no puede ir en este habitat. ");
        }
    }
    public Pokemon getPokemonEspecifico(Pokemon pokemon){
        int index = this.arrayList.indexOf(pokemon);
        if (index != -1) {
            return this.arrayList.remove(index);
        } else {
            return null;
        }
    }
    public Pokemon getPokemon(int index){
        if (arrayList.size() > 0){
            return arrayList.get(index);
        } else {
            return null;
        }
    }
    public int getSize(){
        return arrayList.size();
    }
    public int getSizeComedero(){
        return comedero.getSize();
    }

    public Image getImage() {
        return image;
    }
}