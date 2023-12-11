package Logica.State;

import Logica.*;
/**
 *Clase que implementa EstadoPokemon siguiendo el patron de diseño "State", el cual representa el estado normal de los
 * pokemon, sin hambre
 * */
public class EstadoNormal implements EstadoPokemon{
    private Pokemon pokemon;
    private float xVelocity = 0.5F;
    private float yVelocity = 0.5F;
    public EstadoNormal(Pokemon pokemon){
        this.pokemon = pokemon;
    }
    @Override
    public void actuar() {
        if(pokemon.xpkmn <= pokemon.x +15|| pokemon.xpkmn+80 >= pokemon.x + 300){
            xVelocity = xVelocity * -1;
        }
        pokemon.xpkmn = pokemon.xpkmn + xVelocity;
        if(pokemon.ypkmn <= pokemon.y || pokemon.ypkmn+60 >= pokemon.y + 125){
            yVelocity = yVelocity * -1;
        }
        pokemon.ypkmn = pokemon.ypkmn + yVelocity;
        System.out.println(pokemon.getNombre() + " está en estado Normal.");
    }

}
