package Logica_Grafica;
import Logica.Comidas.*;
import Logica.Habitat.Agua;
import Logica.State.EstadoNormal;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class HabitatAgua extends JPanel {
    public Agua agua;
    private Zona zona, zonaComedero;
    private Comedero comedero;
    private float xpkmn1,ypkmn1,xpkmn2,ypkmn2,xpkmn3,ypkmn3,xpkmn4,ypkmn4,xpkmn5,ypkmn5;
    private float xVelocity1 = -20F;
    private float yVelocity1 = -20F;
    private float xVelocity2 = -20F;
    private float yVelocity2 = -20F;
    private float xVelocity3 = -20F;
    private float yVelocity3 = -20F;
    private float xVelocity4 = -20F;
    private float yVelocity4 = -20F;
    private float xVelocity5 = -20F;
    private float yVelocity5 = -20F;
    private int ancho,alto;
    public int x,y;
    private VistaComida vistaComida;
    private Timer timerpkmn;
    Random random;
    public HabitatAgua() {
        random = new Random();
        agua = new Agua();
        vistaComida = new VistaComida();
        comedero = new Comedero();
        comedero.addComida(new Pinia());
        comedero.addComida(new Pinia());
        ancho = 300;
        alto = 195;
        JButton boton = new JButton();
        x = 260;
        y = 10;
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
        g.drawImage(agua.getImage(),x,y,ancho,alto,this);
        g.drawImage(comedero.getImage(),x,y+155,ancho,40,this);
        vistaComida.dibujarComidas(g,x + 5,y + 155, comedero.getComedero());
        switch (agua.getSize()){
            case 1:
                g.drawImage(agua.getPokemon(0).getImage(),(int)agua.getPokemon(0).xpkmn,(int)agua.getPokemon(0).ypkmn,60,60,this);
                break;

            case 2:
                g.drawImage(agua.getPokemon(0).getImage(),(int)agua.getPokemon(0).xpkmn,(int)agua.getPokemon(0).ypkmn,60,60,this);
                g.drawImage(agua.getPokemon(1).getImage(),(int)agua.getPokemon(1).xpkmn,(int)agua.getPokemon(1).ypkmn,60,60,this);
                break;
            case 3:
                g.drawImage(agua.getPokemon(0).getImage(),(int)agua.getPokemon(0).xpkmn,(int)agua.getPokemon(0).ypkmn,60,60,this);
                g.drawImage(agua.getPokemon(1).getImage(),(int)agua.getPokemon(1).xpkmn,(int)agua.getPokemon(1).ypkmn,60,60,this);
                g.drawImage(agua.getPokemon(2).getImage(),(int)agua.getPokemon(2).xpkmn,(int)agua.getPokemon(2).ypkmn,60,60,this);
                break;
            case 4:
                g.drawImage(agua.getPokemon(0).getImage(),(int)agua.getPokemon(0).xpkmn,(int)agua.getPokemon(0).ypkmn,60,60,this);
                g.drawImage(agua.getPokemon(1).getImage(),(int)agua.getPokemon(1).xpkmn,(int)agua.getPokemon(1).ypkmn,60,60,this);
                g.drawImage(agua.getPokemon(2).getImage(),(int)agua.getPokemon(2).xpkmn,(int)agua.getPokemon(2).ypkmn,60,60,this);
                g.drawImage(agua.getPokemon(3).getImage(),(int)agua.getPokemon(3).xpkmn,(int)agua.getPokemon(3).ypkmn,60,60,this);
                break;
            case 5:
                g.drawImage(agua.getPokemon(0).getImage(),(int)agua.getPokemon(0).xpkmn,(int)agua.getPokemon(0).ypkmn,60,60,this);
                g.drawImage(agua.getPokemon(1).getImage(),(int)agua.getPokemon(1).xpkmn,(int)agua.getPokemon(1).ypkmn,60,60,this);
                g.drawImage(agua.getPokemon(2).getImage(),(int)agua.getPokemon(2).xpkmn,(int)agua.getPokemon(2).ypkmn,60,60,this);
                g.drawImage(agua.getPokemon(3).getImage(),(int)agua.getPokemon(3).xpkmn,(int)agua.getPokemon(3).ypkmn,60,60,this);
                g.drawImage(agua.getPokemon(4).getImage(),(int)agua.getPokemon(4).xpkmn,(int)agua.getPokemon(4).ypkmn,60,60,this);
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
        return agua.getImage();
    }
    public void update(){
        for (int i = 0; i < agua.getSize(); i++){
            agua.getPokemon(i).refrescarEstado();
            if (agua.getPokemon(i).isEstaComiendo()){
                agua.getPokemon(i).comer(comedero.getComida());

            }
        }
    }

}
