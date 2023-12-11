package Logica.Excepciones;
/**
 * Clase que extiende Exception, la cual ocurre al momento de intentar introducir una comida en un habitat equivocado
 * */
public class HabitatNoPermiteComida extends Exception{
    public static final long serialVersionUID =700L;

    public HabitatNoPermiteComida(String message) {
        super(message);
    }

}
