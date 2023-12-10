package Logica.State;

import Logica.Pokemon;

public class EstadoMuerto implements EstadoPokemon{
    private Pokemon pokemon;
    public EstadoMuerto(Pokemon pokemon){
        this.pokemon = pokemon;
    }
    @Override
    public void actuar() {
        System.out.println(pokemon.getNombre() + " ha muerto.");
    }
}
