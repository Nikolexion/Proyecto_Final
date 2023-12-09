package Logica_Grafica;

import Logica.Comidas.Comida;

import javax.swing.*;
import java.awt.*;
import java.awt.image.ImageObserver;
import java.util.ArrayList;

public class VistaComida implements ImageObserver {
    public VistaComida() {
    }

    public void dibujarComidas(Graphics g, int x, int y, ArrayList<Comida> comidas) {
            switch (comidas.size()){
                case 1:
                    g.drawImage(comidas.get(0).getImagen(),x,y, 30, 40, this);
                    break;
                case 2:
                    g.drawImage(comidas.get(0).getImagen(), 30, 40, this);
                    g.drawImage(comidas.get(1).getImagen(),x + 37,y, 30, 40, this);
                    break;
                case 3:
                    g.drawImage(comidas.get(0).getImagen(),x,y, 30, 40, this);
                    g.drawImage(comidas.get(1).getImagen(),x + 37,y, 30, 40, this);
                    g.drawImage(comidas.get(2).getImagen(),x + 2 * 37,y, 30, 40, this);
                    break;
                case 4:
                    g.drawImage(comidas.get(0).getImagen(),x,y, 30, 40, this);
                    g.drawImage(comidas.get(1).getImagen(),x + 37,y, 30, 40, this);
                    g.drawImage(comidas.get(2).getImagen(),x + 2 * 37,y, 30, 40, this);
                    g.drawImage(comidas.get(3).getImagen(),x + 3 * 37,y, 30, 40, this);
                    break;
                case 5:
                    g.drawImage(comidas.get(0).getImagen(),x,y, 30, 40, this);
                    g.drawImage(comidas.get(1).getImagen(),x + 37,y, 30, 40, this);
                    g.drawImage(comidas.get(2).getImagen(),x + 2 * 37,y, 30, 40, this);
                    g.drawImage(comidas.get(3).getImagen(),x + 3 * 37,y, 30, 40, this);
                    g.drawImage(comidas.get(4).getImagen(),x + 4 * 37,y, 30, 40, this);
                    break;
                case 6:
                    g.drawImage(comidas.get(0).getImagen(),x,y, 30, 40, this);
                    g.drawImage(comidas.get(1).getImagen(),x + 37,y, 30, 40, this);
                    g.drawImage(comidas.get(2).getImagen(),x + 2 * 37,y, 30, 40, this);
                    g.drawImage(comidas.get(3).getImagen(),x + 3 * 37,y, 30, 40, this);
                    g.drawImage(comidas.get(4).getImagen(),x + 4 * 37,y, 30, 40, this);
                    g.drawImage(comidas.get(5).getImagen(),x + 5 * 37,y, 30, 40, this);
                    break;
                case 7:
                    g.drawImage(comidas.get(0).getImagen(),x,y, 30, 40, this);
                    g.drawImage(comidas.get(1).getImagen(),x + 37,y, 30, 40, this);
                    g.drawImage(comidas.get(2).getImagen(),x + 2 * 37,y, 30, 40, this);
                    g.drawImage(comidas.get(3).getImagen(),x + 3 * 37,y, 30, 40, this);
                    g.drawImage(comidas.get(4).getImagen(),x + 4 * 37,y, 30, 40, this);
                    g.drawImage(comidas.get(5).getImagen(),x + 5 * 37,y, 30, 40, this);
                    g.drawImage(comidas.get(6).getImagen(),x + 6 * 37,y, 30, 40, this);
                    break;
                case 8:
                    g.drawImage(comidas.get(0).getImagen(),x,y, 30, 40, this);
                    g.drawImage(comidas.get(1).getImagen(),x + 37,y, 30, 40, this);
                    g.drawImage(comidas.get(2).getImagen(),x + 2 * 37,y, 30, 40, this);
                    g.drawImage(comidas.get(3).getImagen(),x + 3 * 37,y, 30, 40, this);
                    g.drawImage(comidas.get(4).getImagen(),x + 4 * 37,y, 30, 40, this);
                    g.drawImage(comidas.get(5).getImagen(),x + 5 * 37,y, 30, 40, this);
                    g.drawImage(comidas.get(6).getImagen(),x + 6 * 37,y, 30, 40, this);
                    g.drawImage(comidas.get(7).getImagen(),x + 7 * 37,y, 30, 40, this);
                    break;
                default:
                    break;

        }
    }

    @Override
    public boolean imageUpdate(Image img, int infoflags, int x, int y, int width, int height) {
        return false;
    }
}
