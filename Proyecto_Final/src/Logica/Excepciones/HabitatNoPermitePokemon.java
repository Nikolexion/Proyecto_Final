package Logica.Excepciones;
/**
 * Clase que extiende Exception, la cual ocurre al momento de intentar introducir un pokemon en un habitat equivocado
 * */
public class HabitatNoPermitePokemon extends Exception {
    public static final long serialVersionUID =700L;

    public HabitatNoPermitePokemon(String message) {
        super(message);
    }
}
