package Logica.Excepciones;

public class HabitatNoPermitePokemon extends Exception {
    public static final long serialVersionUID =700L;

    public HabitatNoPermitePokemon(String message) {
        super(message);
    }
}
