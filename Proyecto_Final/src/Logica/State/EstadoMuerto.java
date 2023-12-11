package Logica.State;

import Logica.Pokemon;
/**
 * Clase que implementa EstadoPokemon siguiendo el patron de diseño "State" el cual representa el estado muerto, al cual se
 * llega depués de estar 20 segundo en el estado hambriento
 * */
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
