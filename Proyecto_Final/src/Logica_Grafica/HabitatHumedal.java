package Logica_Grafica;

import Logica.Comidas.*;
import Logica.Habitat.Humedal;

import javax.swing.*;
import java.awt.*;

public class HabitatHumedal extends JPanel{
    Humedal humedal;
    private Zona zona, zonaComedero;
    private Comedero comedero;
    private int x,y,ancho,alto;
    private VistaComida vistaComida;

    public HabitatHumedal() {
        humedal = new Humedal();
        vistaComida = new VistaComida();
        comedero = new Comedero();
        comedero.addComida(new Pinia());
        comedero.addComida(new Pinia());
        JButton boton = new JButton();
        x = 900;
        y = 10;
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
        return humedal.getImage();
    }
}
