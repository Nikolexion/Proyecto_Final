package Logica.State;

import Logica.Comidas.Comida;
import Logica.Pokemon;
/**
 * Clase que implementa EstadoPokemon siguiendo el patron de diseño "State", el cual es una clase de paso, que se ocupa mientras
 * el pokemon está comiendo en el comedero para después volver al estado normal
 * */
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
