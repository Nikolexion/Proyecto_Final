package Logica.State;

import Logica.Comidas.Comida;
import Logica.Pokemon;

public class EstadoComiendo implements EstadoPokemon{
    private Pokemon pokemon;

    public EstadoComiendo(Pokemon pokemon){
        this.pokemon = pokemon;
    }
    @Override
    public void actuar() {
        pokemon.setEstaComiendo();
    }
}
