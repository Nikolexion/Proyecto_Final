package Logica_Grafica;

import Logica.Comidas.*;
import Logica.Habitat.Bosque;

import javax.swing.*;
import java.awt.*;

public class HabitatBosque extends JPanel{
    Bosque bosque;
    private Zona zona, zonaComedero;
    private Comedero comedero;
    public int x,y;
    private int ancho,alto;
    private VistaComida vistaComida;

    public HabitatBosque() {
        bosque = new Bosque();
        vistaComida = new VistaComida();
        comedero = new Comedero();
        comedero.addComida(new Latano());
        comedero.addComida(new Latano());
        JButton boton = new JButton();
        x = 260;
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
        g.drawImage(bosque.getImage(), x,y,ancho,alto,this);
        g.drawImage(comedero.getImage(),x,y+155,ancho,40,this);
        vistaComida.dibujarComidas(g,x + 5,y + 155, comedero.getComedero());
        switch (bosque.getSize()){
            case 1:
                g.drawImage(bosque.getPokemon(0).getImage(),(int)bosque.getPokemon(0).xpkmn,(int)bosque.getPokemon(0).ypkmn,60,60,this);
                break;

            case 2:
                g.drawImage(bosque.getPokemon(0).getImage(),(int)bosque.getPokemon(0).xpkmn,(int)bosque.getPokemon(0).ypkmn,60,60,this);
                g.drawImage(bosque.getPokemon(1).getImage(),(int)bosque.getPokemon(1).xpkmn,(int)bosque.getPokemon(1).ypkmn,60,60,this);
                break;
            case 3:
                g.drawImage(bosque.getPokemon(0).getImage(),(int)bosque.getPokemon(0).xpkmn,(int)bosque.getPokemon(0).ypkmn,60,60,this);
                g.drawImage(bosque.getPokemon(1).getImage(),(int)bosque.getPokemon(1).xpkmn,(int)bosque.getPokemon(1).ypkmn,60,60,this);
                g.drawImage(bosque.getPokemon(2).getImage(),(int)bosque.getPokemon(2).xpkmn,(int)bosque.getPokemon(2).ypkmn,60,60,this);
                break;
            case 4:
                g.drawImage(bosque.getPokemon(0).getImage(),(int)bosque.getPokemon(0).xpkmn,(int)bosque.getPokemon(0).ypkmn,60,60,this);
                g.drawImage(bosque.getPokemon(1).getImage(),(int)bosque.getPokemon(1).xpkmn,(int)bosque.getPokemon(1).ypkmn,60,60,this);
                g.drawImage(bosque.getPokemon(2).getImage(),(int)bosque.getPokemon(2).xpkmn,(int)bosque.getPokemon(2).ypkmn,60,60,this);
                g.drawImage(bosque.getPokemon(3).getImage(),(int)bosque.getPokemon(3).xpkmn,(int)bosque.getPokemon(3).ypkmn,60,60,this);
                break;
            case 5:
                g.drawImage(bosque.getPokemon(0).getImage(),(int)bosque.getPokemon(0).xpkmn,(int)bosque.getPokemon(0).ypkmn,60,60,this);
                g.drawImage(bosque.getPokemon(1).getImage(),(int)bosque.getPokemon(1).xpkmn,(int)bosque.getPokemon(1).ypkmn,60,60,this);
                g.drawImage(bosque.getPokemon(2).getImage(),(int)bosque.getPokemon(2).xpkmn,(int)bosque.getPokemon(2).ypkmn,60,60,this);
                g.drawImage(bosque.getPokemon(3).getImage(),(int)bosque.getPokemon(3).xpkmn,(int)bosque.getPokemon(3).ypkmn,60,60,this);
                g.drawImage(bosque.getPokemon(4).getImage(),(int)bosque.getPokemon(4).xpkmn,(int)bosque.getPokemon(4).ypkmn,60,60,this);
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
        return bosque.getImage();
    }
    public void update(){
        for (int i = 0; i < bosque.getSize(); i++){
            bosque.getPokemon(i).refrescarEstado();
            if (bosque.getPokemon(i).isEstaComiendo()){
                bosque.getPokemon(i).comer(comedero.getComida());

            }
        }
    }
}
