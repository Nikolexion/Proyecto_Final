package Logica_Grafica;

import Logica.Comidas.*;
import Logica.Habitat.Lucha;

import javax.swing.*;
import java.awt.*;
/**
 * Panel encargado de la administracion del habitat lucha junto con su comida y pokemones
 * */
public class HabitatLucha extends JPanel{
    Lucha lucha;
    private Zona zona, zonaComedero;
    private Comedero comedero;
    public int x,y;
    private int ancho,alto;
    private VistaComida vistaComida;
    public boolean flag;

    public HabitatLucha() {
        lucha = new Lucha();
        vistaComida = new VistaComida();
        comedero = new Comedero();
        comedero.addComida(new Latano());
        comedero.addComida(new Latano());
        JButton boton = new JButton();
        x = 900;
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
        g.drawImage(lucha.getImage(),x,y,ancho,alto,this);
        g.drawImage(comedero.getImage(),x,y+155,ancho,40,this);
        vistaComida.dibujarComidas(g,x + 5,y + 155, comedero.getComedero());
        switch (lucha.getSize()){
            case 1:
                g.drawImage(lucha.getPokemon(0).getImage(),(int)lucha.getPokemon(0).xpkmn,(int)lucha.getPokemon(0).ypkmn,60,60,this);
                break;

            case 2:
                g.drawImage(lucha.getPokemon(0).getImage(),(int)lucha.getPokemon(0).xpkmn,(int)lucha.getPokemon(0).ypkmn,60,60,this);
                g.drawImage(lucha.getPokemon(1).getImage(),(int)lucha.getPokemon(1).xpkmn,(int)lucha.getPokemon(1).ypkmn,60,60,this);
                break;
            case 3:
                g.drawImage(lucha.getPokemon(0).getImage(),(int)lucha.getPokemon(0).xpkmn,(int)lucha.getPokemon(0).ypkmn,60,60,this);
                g.drawImage(lucha.getPokemon(1).getImage(),(int)lucha.getPokemon(1).xpkmn,(int)lucha.getPokemon(1).ypkmn,60,60,this);
                g.drawImage(lucha.getPokemon(2).getImage(),(int)lucha.getPokemon(2).xpkmn,(int)lucha.getPokemon(2).ypkmn,60,60,this);
                break;
            case 4:
                g.drawImage(lucha.getPokemon(0).getImage(),(int)lucha.getPokemon(0).xpkmn,(int)lucha.getPokemon(0).ypkmn,60,60,this);
                g.drawImage(lucha.getPokemon(1).getImage(),(int)lucha.getPokemon(1).xpkmn,(int)lucha.getPokemon(1).ypkmn,60,60,this);
                g.drawImage(lucha.getPokemon(2).getImage(),(int)lucha.getPokemon(2).xpkmn,(int)lucha.getPokemon(2).ypkmn,60,60,this);
                g.drawImage(lucha.getPokemon(3).getImage(),(int)lucha.getPokemon(3).xpkmn,(int)lucha.getPokemon(3).ypkmn,60,60,this);
                break;
            case 5:
                g.drawImage(lucha.getPokemon(0).getImage(),(int)lucha.getPokemon(0).xpkmn,(int)lucha.getPokemon(0).ypkmn,60,60,this);
                g.drawImage(lucha.getPokemon(1).getImage(),(int)lucha.getPokemon(1).xpkmn,(int)lucha.getPokemon(1).ypkmn,60,60,this);
                g.drawImage(lucha.getPokemon(2).getImage(),(int)lucha.getPokemon(2).xpkmn,(int)lucha.getPokemon(2).ypkmn,60,60,this);
                g.drawImage(lucha.getPokemon(3).getImage(),(int)lucha.getPokemon(3).xpkmn,(int)lucha.getPokemon(3).ypkmn,60,60,this);
                g.drawImage(lucha.getPokemon(4).getImage(),(int)lucha.getPokemon(4).xpkmn,(int)lucha.getPokemon(4).ypkmn,60,60,this);
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
        return lucha.getImage();
    }
    public void update(){
        for (int i = 0; i < lucha.getSize(); i++){
            lucha.getPokemon(i).refrescarEstado();
            if (lucha.getPokemon(i).isEstaComiendo()){
                lucha.getPokemon(i).comer(comedero.getComida());

            }
            if (comedero.getSize() == 0) {
                flag = true;
            }else {
                flag = false;
            }
        }
    }
}
