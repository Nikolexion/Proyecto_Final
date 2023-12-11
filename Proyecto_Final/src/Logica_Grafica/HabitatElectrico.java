package Logica_Grafica;

import Logica.Comidas.*;
import Logica.Habitat.Electrico;

import javax.swing.*;
import java.awt.*;
/**
 * Panel encargado de la administracion del habitat electrico junto con su comida y pokemones
 * */
public class HabitatElectrico extends JPanel{
    Electrico electrico;
    private Zona zona, zonaComedero;
    private Comedero comedero;
    public int x,y;
    private int ancho,alto;
    private VistaComida vistaComida;
    public boolean flag;

    public HabitatElectrico() {
        electrico = new Electrico();
        vistaComida = new VistaComida();
        comedero = new Comedero();
        comedero.addComida(new Pinia());
        comedero.addComida(new Pinia());
        JButton boton = new JButton();
        x = 580;
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
        g.drawImage(electrico.getImage(),x,y,ancho,alto,this);
        g.drawImage(comedero.getImage(),x,y+155,ancho,40,this);
        vistaComida.dibujarComidas(g,x + 5,y + 155, comedero.getComedero());
        switch (electrico.getSize()){
            case 1:
                g.drawImage(electrico.getPokemon(0).getImage(),(int)electrico.getPokemon(0).xpkmn,(int)electrico.getPokemon(0).ypkmn,60,60,this);
                break;

            case 2:
                g.drawImage(electrico.getPokemon(0).getImage(),(int)electrico.getPokemon(0).xpkmn,(int)electrico.getPokemon(0).ypkmn,60,60,this);
                g.drawImage(electrico.getPokemon(1).getImage(),(int)electrico.getPokemon(1).xpkmn,(int)electrico.getPokemon(1).ypkmn,60,60,this);
                break;
            case 3:
                g.drawImage(electrico.getPokemon(0).getImage(),(int)electrico.getPokemon(0).xpkmn,(int)electrico.getPokemon(0).ypkmn,60,60,this);
                g.drawImage(electrico.getPokemon(1).getImage(),(int)electrico.getPokemon(1).xpkmn,(int)electrico.getPokemon(1).ypkmn,60,60,this);
                g.drawImage(electrico.getPokemon(2).getImage(),(int)electrico.getPokemon(2).xpkmn,(int)electrico.getPokemon(2).ypkmn,60,60,this);
                break;
            case 4:
                g.drawImage(electrico.getPokemon(0).getImage(),(int)electrico.getPokemon(0).xpkmn,(int)electrico.getPokemon(0).ypkmn,60,60,this);
                g.drawImage(electrico.getPokemon(1).getImage(),(int)electrico.getPokemon(1).xpkmn,(int)electrico.getPokemon(1).ypkmn,60,60,this);
                g.drawImage(electrico.getPokemon(2).getImage(),(int)electrico.getPokemon(2).xpkmn,(int)electrico.getPokemon(2).ypkmn,60,60,this);
                g.drawImage(electrico.getPokemon(3).getImage(),(int)electrico.getPokemon(3).xpkmn,(int)electrico.getPokemon(3).ypkmn,60,60,this);
                break;
            case 5:
                g.drawImage(electrico.getPokemon(0).getImage(),(int)electrico.getPokemon(0).xpkmn,(int)electrico.getPokemon(0).ypkmn,60,60,this);
                g.drawImage(electrico.getPokemon(1).getImage(),(int)electrico.getPokemon(1).xpkmn,(int)electrico.getPokemon(1).ypkmn,60,60,this);
                g.drawImage(electrico.getPokemon(2).getImage(),(int)electrico.getPokemon(2).xpkmn,(int)electrico.getPokemon(2).ypkmn,60,60,this);
                g.drawImage(electrico.getPokemon(3).getImage(),(int)electrico.getPokemon(3).xpkmn,(int)electrico.getPokemon(3).ypkmn,60,60,this);
                g.drawImage(electrico.getPokemon(4).getImage(),(int)electrico.getPokemon(4).xpkmn,(int)electrico.getPokemon(4).ypkmn,60,60,this);
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
        return electrico.getImage();
    }
    public void update(){
        for (int i = 0; i < electrico.getSize(); i++){
            electrico.getPokemon(i).refrescarEstado();
            if (electrico.getPokemon(i).isEstaComiendo()){
                electrico.getPokemon(i).comer(comedero.getComida());

            }
            if (comedero.getSize() == 0) {
                flag = true;
            }else {
                flag = false;
            }
        }
    }
}
