package Logica_Grafica;

import Logica.Comidas.*;
import Logica.Habitat.Lava;

import javax.swing.*;
import java.awt.*;
/**
 * Panel encargado de la administracion del habitat lava junto con su comida y pokemones
 * */
public class HabitatLava extends JPanel{
    Lava lava;
    private Zona zona, zonaComedero;
    private Comedero comedero;
    public int x,y;
    private int ancho,alto;
    private VistaComida vistaComida;
    public boolean flag;

    public HabitatLava() {
        lava = new Lava();
        vistaComida = new VistaComida();
        comedero = new Comedero();
        comedero.addComida(new Pokocho());
        comedero.addComida(new Pokocho());
        JButton boton = new JButton();
        x = 900;
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
        g.drawImage(lava.getImage(),x,y,ancho,alto,this);
        g.drawImage(comedero.getImage(),x,y+155,ancho,40,this);
        vistaComida.dibujarComidas(g,x + 5,y + 155, comedero.getComedero());
        switch (lava.getSize()){
            case 1:
                g.drawImage(lava.getPokemon(0).getImage(),(int)lava.getPokemon(0).xpkmn,(int)lava.getPokemon(0).ypkmn,60,60,this);
                break;

            case 2:
                g.drawImage(lava.getPokemon(0).getImage(),(int)lava.getPokemon(0).xpkmn,(int)lava.getPokemon(0).ypkmn,60,60,this);
                g.drawImage(lava.getPokemon(1).getImage(),(int)lava.getPokemon(1).xpkmn,(int)lava.getPokemon(1).ypkmn,60,60,this);
                break;
            case 3:
                g.drawImage(lava.getPokemon(0).getImage(),(int)lava.getPokemon(0).xpkmn,(int)lava.getPokemon(0).ypkmn,60,60,this);
                g.drawImage(lava.getPokemon(1).getImage(),(int)lava.getPokemon(1).xpkmn,(int)lava.getPokemon(1).ypkmn,60,60,this);
                g.drawImage(lava.getPokemon(2).getImage(),(int)lava.getPokemon(2).xpkmn,(int)lava.getPokemon(2).ypkmn,60,60,this);
                break;
            case 4:
                g.drawImage(lava.getPokemon(0).getImage(),(int)lava.getPokemon(0).xpkmn,(int)lava.getPokemon(0).ypkmn,60,60,this);
                g.drawImage(lava.getPokemon(1).getImage(),(int)lava.getPokemon(1).xpkmn,(int)lava.getPokemon(1).ypkmn,60,60,this);
                g.drawImage(lava.getPokemon(2).getImage(),(int)lava.getPokemon(2).xpkmn,(int)lava.getPokemon(2).ypkmn,60,60,this);
                g.drawImage(lava.getPokemon(3).getImage(),(int)lava.getPokemon(3).xpkmn,(int)lava.getPokemon(3).ypkmn,60,60,this);
                break;
            case 5:
                g.drawImage(lava.getPokemon(0).getImage(),(int)lava.getPokemon(0).xpkmn,(int)lava.getPokemon(0).ypkmn,60,60,this);
                g.drawImage(lava.getPokemon(1).getImage(),(int)lava.getPokemon(1).xpkmn,(int)lava.getPokemon(1).ypkmn,60,60,this);
                g.drawImage(lava.getPokemon(2).getImage(),(int)lava.getPokemon(2).xpkmn,(int)lava.getPokemon(2).ypkmn,60,60,this);
                g.drawImage(lava.getPokemon(3).getImage(),(int)lava.getPokemon(3).xpkmn,(int)lava.getPokemon(3).ypkmn,60,60,this);
                g.drawImage(lava.getPokemon(4).getImage(),(int)lava.getPokemon(4).xpkmn,(int)lava.getPokemon(4).ypkmn,60,60,this);
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
        return lava.getImage();
    }
    public void update(){
        for (int i = 0; i < lava.getSize(); i++){
            lava.getPokemon(i).refrescarEstado();
            if (lava.getPokemon(i).isEstaComiendo()){
                lava.getPokemon(i).comer(comedero.getComida());

            }
            if (comedero.getSize() == 0) {
                flag = true;
            }else {
                flag = false;
            }
        }
    }
}
