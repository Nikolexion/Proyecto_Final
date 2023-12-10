package Logica.Comidas;
import java.util.*;

public interface EventManager {
    Map<String, List<EventListener>> listeners = new HashMap<>();

    public void subscribe(EventListener listener);
    public void unsubscribe(EventListener listener);

    public void notify(String eventType);
}
