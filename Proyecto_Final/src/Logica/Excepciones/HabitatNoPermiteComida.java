package Logica.Excepciones;

public class HabitatNoPermiteComida extends Exception{
    public static final long serialVersionUID =700L;

    public HabitatNoPermiteComida(String message) {
        super(message);
    }

}
