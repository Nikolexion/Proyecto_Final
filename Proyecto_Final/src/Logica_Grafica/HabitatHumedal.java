package Logica_Grafica;

import Logica.Comidas.*;
import Logica.Habitat.Humedal;

import javax.swing.*;
import java.awt.*;
/**
 * Panel encargado de la administracion del habitat humedal junto con su comida y pokemones
 * */
public class HabitatHumedal extends JPanel{
    Humedal humedal;
    private Zona zona, zonaComedero;
    private Comedero comedero;
    public int x,y;
    private int ancho,alto;
    private VistaComida vistaComida;
    public boolean flag;

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
        g.drawImage(humedal.getImage(),x,y,ancho,alto,this);
        g.drawImage(comedero.getImage(),x,y+155,ancho,40,this);
        vistaComida.dibujarComidas(g,x + 5,y + 155, comedero.getComedero());
        switch (humedal.getSize()){
            case 1:
                g.drawImage(humedal.getPokemon(0).getImage(),(int)humedal.getPokemon(0).xpkmn,(int)humedal.getPokemon(0).ypkmn,60,60,this);
                break;

            case 2:
                g.drawImage(humedal.getPokemon(0).getImage(),(int)humedal.getPokemon(0).xpkmn,(int)humedal.getPokemon(0).ypkmn,60,60,this);
                g.drawImage(humedal.getPokemon(1).getImage(),(int)humedal.getPokemon(1).xpkmn,(int)humedal.getPokemon(1).ypkmn,60,60,this);
                break;
            case 3:
                g.drawImage(humedal.getPokemon(0).getImage(),(int)humedal.getPokemon(0).xpkmn,(int)humedal.getPokemon(0).ypkmn,60,60,this);
                g.drawImage(humedal.getPokemon(1).getImage(),(int)humedal.getPokemon(1).xpkmn,(int)humedal.getPokemon(1).ypkmn,60,60,this);
                g.drawImage(humedal.getPokemon(2).getImage(),(int)humedal.getPokemon(2).xpkmn,(int)humedal.getPokemon(2).ypkmn,60,60,this);
                break;
            case 4:
                g.drawImage(humedal.getPokemon(0).getImage(),(int)humedal.getPokemon(0).xpkmn,(int)humedal.getPokemon(0).ypkmn,60,60,this);
                g.drawImage(humedal.getPokemon(1).getImage(),(int)humedal.getPokemon(1).xpkmn,(int)humedal.getPokemon(1).ypkmn,60,60,this);
                g.drawImage(humedal.getPokemon(2).getImage(),(int)humedal.getPokemon(2).xpkmn,(int)humedal.getPokemon(2).ypkmn,60,60,this);
                g.drawImage(humedal.getPokemon(3).getImage(),(int)humedal.getPokemon(3).xpkmn,(int)humedal.getPokemon(3).ypkmn,60,60,this);
                break;
            case 5:
                g.drawImage(humedal.getPokemon(0).getImage(),(int)humedal.getPokemon(0).xpkmn,(int)humedal.getPokemon(0).ypkmn,60,60,this);
                g.drawImage(humedal.getPokemon(1).getImage(),(int)humedal.getPokemon(1).xpkmn,(int)humedal.getPokemon(1).ypkmn,60,60,this);
                g.drawImage(humedal.getPokemon(2).getImage(),(int)humedal.getPokemon(2).xpkmn,(int)humedal.getPokemon(2).ypkmn,60,60,this);
                g.drawImage(humedal.getPokemon(3).getImage(),(int)humedal.getPokemon(3).xpkmn,(int)humedal.getPokemon(3).ypkmn,60,60,this);
                g.drawImage(humedal.getPokemon(4).getImage(),(int)humedal.getPokemon(4).xpkmn,(int)humedal.getPokemon(4).ypkmn,60,60,this);
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
        return humedal.getImage();
    }
    public void update(){
        for (int i = 0; i < humedal.getSize(); i++){
            humedal.getPokemon(i).refrescarEstado();
            if (humedal.getPokemon(i).isEstaComiendo()){
                humedal.getPokemon(i).comer(comedero.getComida());

            }
            if (comedero.getSize() == 0) {
                flag = true;
            }else {
                flag = false;
            }
        }
    }
}
