package Logica.State;

import Logica.*;

public class EstadoNormal implements EstadoPokemon{
    private Pokemon pokemon;
    public EstadoNormal(Pokemon pokemon){
        this.pokemon = pokemon;
    }
    @Override
    public void actuar() {
        System.out.println(pokemon.getNombre() + " está en estado Normal.");
    }
}
