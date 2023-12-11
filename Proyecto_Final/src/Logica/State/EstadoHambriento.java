package Logica.State;

import Logica.Comidas.Comida;
import Logica.Pokemon;
/**
 * Clase que implementa EstadoPokemon siguiendo el patron de diseño "State" el cual representa el estado hambriento, al cual se
 * llega despues de estar 10 segundos en el estado normal
 * */
public class EstadoHambriento implements EstadoPokemon{
    private Pokemon pokemon;
    private float yVelocity = -2F;
    public EstadoHambriento(Pokemon pokemon){
        this.pokemon = pokemon;
    }
    @Override
    public void actuar() {
        if (pokemon.ypkmn <= pokemon.y + 165){
            System.out.println("bajando");
            if (yVelocity > 0) yVelocity *= -1;
        }
        pokemon.y += yVelocity;
        if (pokemon.ypkmn > pokemon.y + 200){
            System.out.println("A comer");
            comer();
        }
        System.out.println(pokemon.getNombre() + " está Hambriento.");
    }
    public void comer(){
        pokemon.cambiarEstado(new EstadoComiendo(pokemon));
    }
}
