package Logica.Comidas;
import java.util.*;
/**
 *  Clase que usa el patron de diseño "Observer", la cual se encarga de publicar, suscribir y desuscribir a las clases observadoras
 * */
public interface EventManager {
    Map<String, List<EventListener>> listeners = new HashMap<>();

    public void subscribe(EventListener listener);
    public void unsubscribe(EventListener listener);

    public void notify(String eventType);
}
