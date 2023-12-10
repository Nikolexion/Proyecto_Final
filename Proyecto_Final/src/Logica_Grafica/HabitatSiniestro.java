package Logica_Grafica;

import Logica.Comidas.*;
import Logica.Habitat.Siniestro;

import javax.swing.*;
import java.awt.*;

public class HabitatSiniestro extends JPanel{
    Siniestro siniestro;
    private Zona zona, zonaComedero;
    private Comedero comedero;
    public int x,y;
    private int ancho,alto;
    private VistaComida vistaComida;

    public HabitatSiniestro() {
        siniestro = new Siniestro();
        vistaComida = new VistaComida();
        comedero = new Comedero();
        comedero.addComida(new Pokocho());
        comedero.addComida(new Pokocho());
        JButton boton = new JButton();
        x = 1220;
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
        vistaComida.dibujarComidas(g,x + 5,y + 155, comedero.getComedero());
        switch (siniestro.getSize()){
            case 1:
                g.drawImage(siniestro.getPokemon(0).getImage(),(int)siniestro.getPokemon(0).xpkmn,(int)siniestro.getPokemon(0).ypkmn,60,60,this);
                break;

            case 2:
                g.drawImage(siniestro.getPokemon(0).getImage(),(int)siniestro.getPokemon(0).xpkmn,(int)siniestro.getPokemon(0).ypkmn,60,60,this);
                g.drawImage(siniestro.getPokemon(1).getImage(),(int)siniestro.getPokemon(1).xpkmn,(int)siniestro.getPokemon(1).ypkmn,60,60,this);
                break;
            case 3:
                g.drawImage(siniestro.getPokemon(0).getImage(),(int)siniestro.getPokemon(0).xpkmn,(int)siniestro.getPokemon(0).ypkmn,60,60,this);
                g.drawImage(siniestro.getPokemon(1).getImage(),(int)siniestro.getPokemon(1).xpkmn,(int)siniestro.getPokemon(1).ypkmn,60,60,this);
                g.drawImage(siniestro.getPokemon(2).getImage(),(int)siniestro.getPokemon(2).xpkmn,(int)siniestro.getPokemon(2).ypkmn,60,60,this);
                break;
            case 4:
                g.drawImage(siniestro.getPokemon(0).getImage(),(int)siniestro.getPokemon(0).xpkmn,(int)siniestro.getPokemon(0).ypkmn,60,60,this);
                g.drawImage(siniestro.getPokemon(1).getImage(),(int)siniestro.getPokemon(1).xpkmn,(int)siniestro.getPokemon(1).ypkmn,60,60,this);
                g.drawImage(siniestro.getPokemon(2).getImage(),(int)siniestro.getPokemon(2).xpkmn,(int)siniestro.getPokemon(2).ypkmn,60,60,this);
                g.drawImage(siniestro.getPokemon(3).getImage(),(int)siniestro.getPokemon(3).xpkmn,(int)siniestro.getPokemon(3).ypkmn,60,60,this);
                break;
            case 5:
                g.drawImage(siniestro.getPokemon(0).getImage(),(int)siniestro.getPokemon(0).xpkmn,(int)siniestro.getPokemon(0).ypkmn,60,60,this);
                g.drawImage(siniestro.getPokemon(1).getImage(),(int)siniestro.getPokemon(1).xpkmn,(int)siniestro.getPokemon(1).ypkmn,60,60,this);
                g.drawImage(siniestro.getPokemon(2).getImage(),(int)siniestro.getPokemon(2).xpkmn,(int)siniestro.getPokemon(2).ypkmn,60,60,this);
                g.drawImage(siniestro.getPokemon(3).getImage(),(int)siniestro.getPokemon(3).xpkmn,(int)siniestro.getPokemon(3).ypkmn,60,60,this);
                g.drawImage(siniestro.getPokemon(4).getImage(),(int)siniestro.getPokemon(4).xpkmn,(int)siniestro.getPokemon(4).ypkmn,60,60,this);
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
        return siniestro.getImage();
    }
    public void update(){
        for (int i = 0; i < siniestro.getSize(); i++){
            siniestro.getPokemon(i).refrescarEstado();
        }
    }
}
