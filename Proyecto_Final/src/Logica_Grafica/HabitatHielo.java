package Logica_Grafica;

import Logica.Comidas.*;
import Logica.Habitat.Hielo;

import javax.swing.*;
import java.awt.*;
/**
 * Panel encargado de la administracion del habitat hielo junto con su comida y pokemones
 * */
public class HabitatHielo extends JPanel{
    Hielo hielo;
    private Zona zona, zonaComedero;
    private Comedero comedero;
    public int x,y;
    private int ancho,alto;
    private VistaComida vistaComida;
    public boolean flag;

    public HabitatHielo() {
        hielo = new Hielo();
        vistaComida = new VistaComida();
        comedero = new Comedero();
        comedero.addComida(new Frambu());
        comedero.addComida(new Frambu());
        JButton boton = new JButton();
        x = 580;
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
        g.drawImage(hielo.getImage(),x,y,ancho,alto,this);
        g.drawImage(comedero.getImage(),x,y+155,ancho,40,this);
        vistaComida.dibujarComidas(g,x + 5,y + 155, comedero.getComedero());
        switch (hielo.getSize()){
            case 1:
                g.drawImage(hielo.getPokemon(0).getImage(),(int)hielo.getPokemon(0).xpkmn,(int)hielo.getPokemon(0).ypkmn,60,60,this);
                break;

            case 2:
                g.drawImage(hielo.getPokemon(0).getImage(),(int)hielo.getPokemon(0).xpkmn,(int)hielo.getPokemon(0).ypkmn,60,60,this);
                g.drawImage(hielo.getPokemon(1).getImage(),(int)hielo.getPokemon(1).xpkmn,(int)hielo.getPokemon(1).ypkmn,60,60,this);
                break;
            case 3:
                g.drawImage(hielo.getPokemon(0).getImage(),(int)hielo.getPokemon(0).xpkmn,(int)hielo.getPokemon(0).ypkmn,60,60,this);
                g.drawImage(hielo.getPokemon(1).getImage(),(int)hielo.getPokemon(1).xpkmn,(int)hielo.getPokemon(1).ypkmn,60,60,this);
                g.drawImage(hielo.getPokemon(2).getImage(),(int)hielo.getPokemon(2).xpkmn,(int)hielo.getPokemon(2).ypkmn,60,60,this);
                break;
            case 4:
                g.drawImage(hielo.getPokemon(0).getImage(),(int)hielo.getPokemon(0).xpkmn,(int)hielo.getPokemon(0).ypkmn,60,60,this);
                g.drawImage(hielo.getPokemon(1).getImage(),(int)hielo.getPokemon(1).xpkmn,(int)hielo.getPokemon(1).ypkmn,60,60,this);
                g.drawImage(hielo.getPokemon(2).getImage(),(int)hielo.getPokemon(2).xpkmn,(int)hielo.getPokemon(2).ypkmn,60,60,this);
                g.drawImage(hielo.getPokemon(3).getImage(),(int)hielo.getPokemon(3).xpkmn,(int)hielo.getPokemon(3).ypkmn,60,60,this);
                break;
            case 5:
                g.drawImage(hielo.getPokemon(0).getImage(),(int)hielo.getPokemon(0).xpkmn,(int)hielo.getPokemon(0).ypkmn,60,60,this);
                g.drawImage(hielo.getPokemon(1).getImage(),(int)hielo.getPokemon(1).xpkmn,(int)hielo.getPokemon(1).ypkmn,60,60,this);
                g.drawImage(hielo.getPokemon(2).getImage(),(int)hielo.getPokemon(2).xpkmn,(int)hielo.getPokemon(2).ypkmn,60,60,this);
                g.drawImage(hielo.getPokemon(3).getImage(),(int)hielo.getPokemon(3).xpkmn,(int)hielo.getPokemon(3).ypkmn,60,60,this);
                g.drawImage(hielo.getPokemon(4).getImage(),(int)hielo.getPokemon(4).xpkmn,(int)hielo.getPokemon(4).ypkmn,60,60,this);
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
        return hielo.getImage();
    }
    public void update(){
        for (int i = 0; i < hielo.getSize(); i++){
            hielo.getPokemon(i).refrescarEstado();
            if (hielo.getPokemon(i).isEstaComiendo()){
                hielo.getPokemon(i).comer(comedero.getComida());

            }
            if (comedero.getSize() == 0) {
                flag = true;
            }else {
                flag = false;
            }
        }
    }
}
