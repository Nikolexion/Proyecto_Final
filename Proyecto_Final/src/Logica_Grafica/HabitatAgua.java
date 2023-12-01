package Logica_Grafica;
import Logica.Comidas.Comedero;
import Logica.Comidas.Comida;
import Logica.Comidas.Pokocho;
import Logica.Habitat.Agua;

import javax.swing.*;
import java.awt.*;

public class HabitatAgua extends JPanel{
    private Agua agua;
    private Zona zona, zonaComedero;
    private Comedero comederoAgua;
    private int x,y,ancho,alto;

    public HabitatAgua() {
        agua = new Agua();
        comederoAgua = new Comedero();
        JButton boton = new JButton();
        x = 260;
        y = 10;
        ancho = 300;
        alto = 195;
        zona = new Zona(x,y,ancho,alto,boton);
        JButton botonComida = new JButton();
        zonaComedero = new Zona(x,y + 155,ancho,40,botonComida);
        comederoAgua.setZona(zonaComedero);

    }

    public Zona getZona() {
        return zona;
    }
    public void paint(Graphics g){
        super.paint(g);
        paintComida(g);

    }
    public void paintComida(Graphics g){
        int count = comederoAgua.getComedero().size();
        switch (count){
            case 1:
                Comida comida = comederoAgua.cualComida(0);
                g.drawImage(comida.getImagen(), x+5,y+155,30,40,this);
                break;
            case 2:
                g.drawImage(comederoAgua.cualComida(0).getImagen(), x+5,y+155,30,40,this);
                g.drawImage(comederoAgua.cualComida(1).getImagen(), x+35,y+155,30,40,this);
                break;
            case 3:
                g.drawImage(comederoAgua.cualComida(0).getImagen(), x+5,y+155,30,40,this);
                g.drawImage(comederoAgua.cualComida(1).getImagen(), x+35,y+155,30,40,this);
                g.drawImage(comederoAgua.cualComida(2).getImagen(), x+65,y+155,30,40,this);
                break;
            case 4:
                break;
            case 5:
                break;
            case 6:
                break;
            case 7:
                break;
            case 8:
                break;
            default:
                break;
        }
    }

    public Zona getZonaComedero() {
        return zonaComedero;
    }

    public Comedero getComederoAgua() {
        return comederoAgua;
    }

    public Image getImagen() {
        return agua.getImage();
    }
}
