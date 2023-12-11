package Logica_Grafica;

import Logica.Comidas.*;
import Logica.Habitat.Setas;

import javax.swing.*;
import java.awt.*;

public class HabitatSetas extends JPanel{
    Setas setas;
    private Zona zona, zonaComedero;
    private Comedero comedero;
    public int x,y;
    private int ancho,alto;
    private VistaComida vistaComida;
    public boolean flag;

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
        g.drawImage(setas.getImage(),x,y,ancho,alto,this);
        g.drawImage(comedero.getImage(),x,y+155,ancho,40,this);
        vistaComida.dibujarComidas(g,x + 5,y + 155, comedero.getComedero());
        switch (setas.getSize()){
            case 1:
                g.drawImage(setas.getPokemon(0).getImage(),(int)setas.getPokemon(0).xpkmn,(int)setas.getPokemon(0).ypkmn,60,60,this);
                break;

            case 2:
                g.drawImage(setas.getPokemon(0).getImage(),(int)setas.getPokemon(0).xpkmn,(int)setas.getPokemon(0).ypkmn,60,60,this);
                g.drawImage(setas.getPokemon(1).getImage(),(int)setas.getPokemon(1).xpkmn,(int)setas.getPokemon(1).ypkmn,60,60,this);
                break;
            case 3:
                g.drawImage(setas.getPokemon(0).getImage(),(int)setas.getPokemon(0).xpkmn,(int)setas.getPokemon(0).ypkmn,60,60,this);
                g.drawImage(setas.getPokemon(1).getImage(),(int)setas.getPokemon(1).xpkmn,(int)setas.getPokemon(1).ypkmn,60,60,this);
                g.drawImage(setas.getPokemon(2).getImage(),(int)setas.getPokemon(2).xpkmn,(int)setas.getPokemon(2).ypkmn,60,60,this);
                break;
            case 4:
                g.drawImage(setas.getPokemon(0).getImage(),(int)setas.getPokemon(0).xpkmn,(int)setas.getPokemon(0).ypkmn,60,60,this);
                g.drawImage(setas.getPokemon(1).getImage(),(int)setas.getPokemon(1).xpkmn,(int)setas.getPokemon(1).ypkmn,60,60,this);
                g.drawImage(setas.getPokemon(2).getImage(),(int)setas.getPokemon(2).xpkmn,(int)setas.getPokemon(2).ypkmn,60,60,this);
                g.drawImage(setas.getPokemon(3).getImage(),(int)setas.getPokemon(3).xpkmn,(int)setas.getPokemon(3).ypkmn,60,60,this);
                break;
            case 5:
                g.drawImage(setas.getPokemon(0).getImage(),(int)setas.getPokemon(0).xpkmn,(int)setas.getPokemon(0).ypkmn,60,60,this);
                g.drawImage(setas.getPokemon(1).getImage(),(int)setas.getPokemon(1).xpkmn,(int)setas.getPokemon(1).ypkmn,60,60,this);
                g.drawImage(setas.getPokemon(2).getImage(),(int)setas.getPokemon(2).xpkmn,(int)setas.getPokemon(2).ypkmn,60,60,this);
                g.drawImage(setas.getPokemon(3).getImage(),(int)setas.getPokemon(3).xpkmn,(int)setas.getPokemon(3).ypkmn,60,60,this);
                g.drawImage(setas.getPokemon(4).getImage(),(int)setas.getPokemon(4).xpkmn,(int)setas.getPokemon(4).ypkmn,60,60,this);
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
        return setas.getImage();
    }
    public void update(){
        for (int i = 0; i < setas.getSize(); i++){
            setas.getPokemon(i).refrescarEstado();
            if (setas.getPokemon(i).isEstaComiendo()){
                setas.getPokemon(i).comer(comedero.getComida());

            }
            if (comedero.getSize() == 0) {
                flag = true;
            }else {
                flag = false;
            }
        }
    }
}
