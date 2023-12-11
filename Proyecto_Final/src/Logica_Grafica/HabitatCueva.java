package Logica_Grafica;

import Logica.Comidas.*;
import Logica.Habitat.Cueva;

import javax.swing.*;
import java.awt.*;

public class HabitatCueva extends JPanel{
    Cueva cueva;
    private Zona zona, zonaComedero;
    private Comedero comedero;
    public int x,y;
    private int ancho,alto;
    private VistaComida vistaComida;
    public boolean flag;

    public HabitatCueva() {
        cueva = new Cueva();
        vistaComida = new VistaComida();
        comedero = new Comedero();
        comedero.addComida(new Pokocho());
        comedero.addComida(new Pokocho());
        JButton boton = new JButton();
        x = 580;
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
        g.drawImage(cueva.getImage(),x,y,ancho,alto,this);
        g.drawImage(comedero.getImage(),x,y+155,ancho,40,this);
        vistaComida.dibujarComidas(g,x + 5,y + 155, comedero.getComedero());
        switch (cueva.getSize()){
            case 1:
                g.drawImage(cueva.getPokemon(0).getImage(),(int)cueva.getPokemon(0).xpkmn,(int)cueva.getPokemon(0).ypkmn,60,60,this);
                break;

            case 2:
                g.drawImage(cueva.getPokemon(0).getImage(),(int)cueva.getPokemon(0).xpkmn,(int)cueva.getPokemon(0).ypkmn,60,60,this);
                g.drawImage(cueva.getPokemon(1).getImage(),(int)cueva.getPokemon(1).xpkmn,(int)cueva.getPokemon(1).ypkmn,60,60,this);
                break;
            case 3:
                g.drawImage(cueva.getPokemon(0).getImage(),(int)cueva.getPokemon(0).xpkmn,(int)cueva.getPokemon(0).ypkmn,60,60,this);
                g.drawImage(cueva.getPokemon(1).getImage(),(int)cueva.getPokemon(1).xpkmn,(int)cueva.getPokemon(1).ypkmn,60,60,this);
                g.drawImage(cueva.getPokemon(2).getImage(),(int)cueva.getPokemon(2).xpkmn,(int)cueva.getPokemon(2).ypkmn,60,60,this);
                break;
            case 4:
                g.drawImage(cueva.getPokemon(0).getImage(),(int)cueva.getPokemon(0).xpkmn,(int)cueva.getPokemon(0).ypkmn,60,60,this);
                g.drawImage(cueva.getPokemon(1).getImage(),(int)cueva.getPokemon(1).xpkmn,(int)cueva.getPokemon(1).ypkmn,60,60,this);
                g.drawImage(cueva.getPokemon(2).getImage(),(int)cueva.getPokemon(2).xpkmn,(int)cueva.getPokemon(2).ypkmn,60,60,this);
                g.drawImage(cueva.getPokemon(3).getImage(),(int)cueva.getPokemon(3).xpkmn,(int)cueva.getPokemon(3).ypkmn,60,60,this);
                break;
            case 5:
                g.drawImage(cueva.getPokemon(0).getImage(),(int)cueva.getPokemon(0).xpkmn,(int)cueva.getPokemon(0).ypkmn,60,60,this);
                g.drawImage(cueva.getPokemon(1).getImage(),(int)cueva.getPokemon(1).xpkmn,(int)cueva.getPokemon(1).ypkmn,60,60,this);
                g.drawImage(cueva.getPokemon(2).getImage(),(int)cueva.getPokemon(2).xpkmn,(int)cueva.getPokemon(2).ypkmn,60,60,this);
                g.drawImage(cueva.getPokemon(3).getImage(),(int)cueva.getPokemon(3).xpkmn,(int)cueva.getPokemon(3).ypkmn,60,60,this);
                g.drawImage(cueva.getPokemon(4).getImage(),(int)cueva.getPokemon(4).xpkmn,(int)cueva.getPokemon(4).ypkmn,60,60,this);
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
        return cueva.getImage();
    }
    public void update(){
        for (int i = 0; i < cueva.getSize(); i++){
            cueva.getPokemon(i).refrescarEstado();
            if (cueva.getPokemon(i).isEstaComiendo()){
                cueva.getPokemon(i).comer(comedero.getComida());

            }
            if (cueva.getSize() == 0) {
                flag = true;
            }else {
                flag = false;
            }
        }
    }
}
