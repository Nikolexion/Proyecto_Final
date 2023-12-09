package Logica_Grafica;

import Logica.Comidas.*;
import Logica.Habitat.Setas;

import javax.swing.*;
import java.awt.*;

public class HabitatSetas extends JPanel{
    Setas setas;
    private Zona zona, zonaComedero;
    private Comedero comedero;
    private int x,y,ancho,alto;
    private VistaComida vistaComida;

    public HabitatSetas() {
        setas = new Setas();
        vistaComida = new VistaComida();
        comedero = new Comedero();
        comedero.addComida(new Frambu());
        comedero.addComida(new Frambu());
        JButton boton = new JButton();
        x = 1220;
        y = 215;
        ancho = 300;
        alto = 195;
        zona = new Zona(x,y,ancho,alto,boton);
        JButton botonComida = new JButton();
        zonaComedero = new Zona(x,y + 155,ancho,40,botonComida);
        comedero.setZona(zonaComedero);
    }

    public Zona getZona() {
        return zona;
    }
    public void paint(Graphics g){
        super.paint(g);
        vistaComida.dibujarComidas(g,x + 5,y + 155, comedero.getComedero());

    }
    public Zona getZonaComedero() {
        return zonaComedero;
    }

    public Comedero getComedero() {
        return comedero;
    }
    public Image getImagen() {
        return setas.getImage();
    }
}
