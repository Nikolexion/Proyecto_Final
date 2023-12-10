package Logica.State;

import Logica.Pokemon;

public class EstadoHambriento implements EstadoPokemon{
    private Pokemon pokemon;
    public EstadoHambriento(Pokemon pokemon){
        this.pokemon = pokemon;
    }
    @Override
    public void actuar() {
        System.out.println(pokemon.getNombre() + " está Hambriento.");
    }
}
