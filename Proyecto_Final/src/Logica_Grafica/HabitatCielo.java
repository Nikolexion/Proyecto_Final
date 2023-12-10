package Logica_Grafica;

import Logica.Comidas.*;
import Logica.Habitat.Cielo;

import javax.swing.*;
import java.awt.*;

public class HabitatCielo extends JPanel{
    Cielo cielo;
    private Zona zona, zonaComedero;
    private Comedero comedero;
    public int x,y;
    private int ancho,alto;
    private VistaComida vistaComida;
    public HabitatCielo() {
        cielo = new Cielo();
        vistaComida = new VistaComida();
        comedero = new Comedero();
        comedero.addComida(new Latano());
        comedero.addComida(new Latano());
        JButton boton = new JButton();
        x = 260;
        y = 420;
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
        g.drawImage(cielo.getImage(),x,y,ancho,alto,this);
        g.drawImage(comedero.getImage(),x,y+155,ancho,40,this);
        vistaComida.dibujarComidas(g,x + 5,y + 155, comedero.getComedero());
        switch (cielo.getSize()){
            case 1:
                g.drawImage(cielo.getPokemon(0).getImage(),(int)cielo.getPokemon(0).xpkmn,(int)cielo.getPokemon(0).ypkmn,60,60,this);
                break;

            case 2:
                g.drawImage(cielo.getPokemon(0).getImage(),(int)cielo.getPokemon(0).xpkmn,(int)cielo.getPokemon(0).ypkmn,60,60,this);
                g.drawImage(cielo.getPokemon(1).getImage(),(int)cielo.getPokemon(1).xpkmn,(int)cielo.getPokemon(1).ypkmn,60,60,this);
                break;
            case 3:
                g.drawImage(cielo.getPokemon(0).getImage(),(int)cielo.getPokemon(0).xpkmn,(int)cielo.getPokemon(0).ypkmn,60,60,this);
                g.drawImage(cielo.getPokemon(1).getImage(),(int)cielo.getPokemon(1).xpkmn,(int)cielo.getPokemon(1).ypkmn,60,60,this);
                g.drawImage(cielo.getPokemon(2).getImage(),(int)cielo.getPokemon(2).xpkmn,(int)cielo.getPokemon(2).ypkmn,60,60,this);
                break;
            case 4:
                g.drawImage(cielo.getPokemon(0).getImage(),(int)cielo.getPokemon(0).xpkmn,(int)cielo.getPokemon(0).ypkmn,60,60,this);
                g.drawImage(cielo.getPokemon(1).getImage(),(int)cielo.getPokemon(1).xpkmn,(int)cielo.getPokemon(1).ypkmn,60,60,this);
                g.drawImage(cielo.getPokemon(2).getImage(),(int)cielo.getPokemon(2).xpkmn,(int)cielo.getPokemon(2).ypkmn,60,60,this);
                g.drawImage(cielo.getPokemon(3).getImage(),(int)cielo.getPokemon(3).xpkmn,(int)cielo.getPokemon(3).ypkmn,60,60,this);
                break;
            case 5:
                g.drawImage(cielo.getPokemon(0).getImage(),(int)cielo.getPokemon(0).xpkmn,(int)cielo.getPokemon(0).ypkmn,60,60,this);
                g.drawImage(cielo.getPokemon(1).getImage(),(int)cielo.getPokemon(1).xpkmn,(int)cielo.getPokemon(1).ypkmn,60,60,this);
                g.drawImage(cielo.getPokemon(2).getImage(),(int)cielo.getPokemon(2).xpkmn,(int)cielo.getPokemon(2).ypkmn,60,60,this);
                g.drawImage(cielo.getPokemon(3).getImage(),(int)cielo.getPokemon(3).xpkmn,(int)cielo.getPokemon(3).ypkmn,60,60,this);
                g.drawImage(cielo.getPokemon(4).getImage(),(int)cielo.getPokemon(4).xpkmn,(int)cielo.getPokemon(4).ypkmn,60,60,this);
                break;

            default:
                break;
        }

    }
    public Zona getZonaComedero() {
        return zonaComedero;
    }

    public Comedero getComedero() {
        return comedero;
    }

    public Image getImagen() {
        return cielo.getImage();
    }
    public void update(){
        for (int i = 0; i < cielo.getSize(); i++){
            cielo.getPokemon(i).refrescarEstado();
        }
    }
}
