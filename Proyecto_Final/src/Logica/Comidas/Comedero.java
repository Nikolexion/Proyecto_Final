package Logica.Comidas;

import Logica.Comidas.Comida;
import Logica_Grafica.Zona;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
/**
 *  Clase que implementa EventManager, siguiendo el patron de diseño "Observer", el cual notifica a todos sus seguidores cuando se
 *  añade comida
 * */
public class Comedero implements EventManager{
    public ArrayList<Comida> comedero;
    private Image image;
    private Zona zona;
    Set<EventListener> listenerSet = new HashSet<>();

    public Comedero() {
        this.comedero = new ArrayList<>();
        this.image = new ImageIcon("resources/Comedero.png").getImage();
    }

    public Comida getComida() {
        if (comedero.size() > 0){
            return this.comedero.remove(0);
        } else {
            return null;
        }
    }
    public Comida cualComida(int index){

        return comedero.get(index);
    }

    public void addComida(Comida comida) {
        System.out.println("pokocho añadido");
        this.notify("");
        this.comedero.add(comida);
    }

    public Image getImage() {
        return image;
    }
    public void setZona(Zona zona){
        this.zona = zona;
    }

    public ArrayList<Comida> getComedero() {
        return comedero;
    }
    public int getSize(){
        return comedero.size();
    }

    @Override
    public void subscribe(EventListener listener) {
        listenerSet.add(listener);
    }

    @Override
    public void unsubscribe(EventListener listener) {
        listenerSet.remove(listener);
    }

    @Override
    public void notify(String eventType) {
        for (EventListener eventListener : listenerSet){
            eventListener.update();
        }
    }
}
