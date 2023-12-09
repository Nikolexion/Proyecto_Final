package Logica.Comidas;

import Logica.Comidas.Comida;
import Logica_Grafica.Zona;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class Comedero {
    public ArrayList<Comida> comedero;
    private Image image;
    private Zona zona;

    public Comedero() {
        this.comedero = new ArrayList<>();
        this.image = new ImageIcon("resources/Comedero.png").getImage();
        this.addComida(new Pokocho());
    }

    public Comida getComida() {
        return this.comedero.remove(0);
    }
    public Comida cualComida(int index){

        return comedero.get(index);
    }

    public void addComida(Comida comida) {
        System.out.println("pokocho añadido");
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
}
