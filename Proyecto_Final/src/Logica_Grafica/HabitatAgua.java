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
    private VistaComida vistaComida;
    public HabitatAgua() {
        agua = new Agua();
        vistaComida = new VistaComida();
        comederoAgua = new Comedero();
        ancho = 300;
        alto = 195;
        JButton boton = new JButton();
        x = 260;
        y = 10;
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
        vistaComida.dibujarComidas(g,x + 5,y + 155,comederoAgua.getComedero());

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
