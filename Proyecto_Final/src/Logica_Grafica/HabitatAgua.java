package Logica_Grafica;
import Logica.Comidas.*;
import Logica.Habitat.Agua;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class HabitatAgua extends JPanel implements ActionListener {
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
    private int ancho,alto,x,y;
    private VistaComida vistaComida;
    private Timer timerpkmn;
    Random random;
    public HabitatAgua() {
        random = new Random();
        agua = new Agua();
        vistaComida = new VistaComida();
        timerpkmn = new Timer(1000,this);
        timerpkmn.start();
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

        xpkmn1 = x +random.nextInt(210);
        ypkmn1 = y + random.nextInt(110);
        xpkmn2 = x +random.nextInt(210);
        ypkmn2 = y + random.nextInt(110);
        xpkmn3 = x +random.nextInt(210);
        ypkmn3 = y + random.nextInt(110);
        xpkmn4 = x +random.nextInt(210);
        ypkmn4 = y + random.nextInt(110);
        xpkmn5 = x +random.nextInt(210);
        ypkmn5 = y + random.nextInt(110);
    }

    public Zona getZona() {
        return zona;
    }
    public void paint(Graphics g){
        super.paint(g);
        vistaComida.dibujarComidas(g,x + 5,y + 155, comedero.getComedero());
        switch (agua.getSize()){
            case 1:
                g.drawImage(agua.getPokemon(0).getImage(),(int) xpkmn1,(int) ypkmn1,60,60,this);
                break;
            case 2:
                g.drawImage(agua.getPokemon(0).getImage(),(int) xpkmn1,(int) ypkmn1,60,60,this);
                g.drawImage(agua.getPokemon(1).getImage(),(int) xpkmn2,(int) ypkmn2,60,60,this);
                break;
            case 3:
                g.drawImage(agua.getPokemon(0).getImage(),(int) xpkmn1,(int) ypkmn1,60,60,this);
                g.drawImage(agua.getPokemon(1).getImage(),(int) xpkmn2,(int) ypkmn2,60,60,this);
                g.drawImage(agua.getPokemon(2).getImage(),(int) xpkmn3,(int) ypkmn3,60,60,this);
                break;
            case 4:
                g.drawImage(agua.getPokemon(0).getImage(),(int) xpkmn1,(int) ypkmn1,60,60,this);
                g.drawImage(agua.getPokemon(1).getImage(),(int) xpkmn2,(int) ypkmn2,60,60,this);
                g.drawImage(agua.getPokemon(2).getImage(),(int) xpkmn3,(int) ypkmn3,60,60,this);
                g.drawImage(agua.getPokemon(3).getImage(),(int) xpkmn4,(int) ypkmn4,60,60,this);
                break;
            case 5:
                g.drawImage(agua.getPokemon(0).getImage(),(int) xpkmn1,(int) ypkmn1,60,60,this);
                g.drawImage(agua.getPokemon(1).getImage(),(int) xpkmn2,(int) ypkmn2,60,60,this);
                g.drawImage(agua.getPokemon(2).getImage(),(int) xpkmn3,(int) ypkmn3,60,60,this);
                g.drawImage(agua.getPokemon(3).getImage(),(int) xpkmn4,(int) ypkmn4,60,60,this);
                g.drawImage(agua.getPokemon(4).getImage(),(int) xpkmn5,(int) ypkmn5,60,60,this);
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

    @Override
    public void actionPerformed(ActionEvent e) {
        switch (agua.getSize()){
            case 1:
                if(xpkmn1 <= x +15|| xpkmn1+80 >= x + ancho){
                    xVelocity1 = xVelocity1 * -1;
                }
                xpkmn1 = xpkmn1 + xVelocity1;
                if(ypkmn1 <= y || ypkmn1+60 >= y + 125){
                    yVelocity1 = yVelocity1 * -1;
                }
                ypkmn1 = ypkmn1 + yVelocity1;
                repaint();
                break;
            case 2:
                if(xpkmn1 <= x +15|| xpkmn1+80 >= x + ancho){
                    xVelocity1 = xVelocity1 * -1;
                }
                xpkmn1 = xpkmn1 + xVelocity1;
                if(ypkmn1 <= y || ypkmn1+60 >= y + 125){
                    yVelocity1 = yVelocity1 * -1;
                }
                ypkmn1 = ypkmn1 + yVelocity1;

                if(xpkmn2 <= x +15|| xpkmn2+80 >= x + ancho){
                    xVelocity2 = xVelocity2 * -1;
                }
                xpkmn2 = xpkmn2 + xVelocity2;
                if(ypkmn2 <= y || ypkmn2+60 >= y + 125){
                    yVelocity2 = yVelocity2 * -1;
                }
                ypkmn2 = ypkmn2 + yVelocity2;
                break;
            case 3:
                if(xpkmn1 <= x +15|| xpkmn1+80 >= x + ancho){
                    xVelocity1 = xVelocity1 * -1;
                }
                xpkmn1 = xpkmn1 + xVelocity1;
                if(ypkmn1 <= y || ypkmn1+60 >= y + 125){
                    yVelocity1 = yVelocity1 * -1;
                }
                ypkmn1 = ypkmn1 + yVelocity1;

                if(xpkmn2 <= x +15|| xpkmn2+80 >= x + ancho){
                    xVelocity2 = xVelocity2 * -1;
                }
                xpkmn2 = xpkmn2 + xVelocity2;
                if(ypkmn2 <= y || ypkmn2+60 >= y + 125){
                    yVelocity2 = yVelocity2 * -1;
                }
                ypkmn2 = ypkmn2 + yVelocity2;

                if(xpkmn3 <= x +15|| xpkmn3+80 >= x + ancho){
                    xVelocity3 = xVelocity3 * -1;
                }
                xpkmn3 = xpkmn3 + xVelocity3;
                if(ypkmn3 <= y || ypkmn3+60 >= y + 125){
                    yVelocity3 = yVelocity3 * -1;
                }
                ypkmn3 = ypkmn3 + yVelocity3;
                break;
            case 4:
                if(xpkmn1 <= x +15|| xpkmn1+80 >= x + ancho){
                    xVelocity1 = xVelocity1 * -1;
                }
                xpkmn1 = xpkmn1 + xVelocity1;
                if(ypkmn1 <= y || ypkmn1+60 >= y + 125){
                    yVelocity1 = yVelocity1 * -1;
                }
                ypkmn1 = ypkmn1 + yVelocity1;

                if(xpkmn2 <= x +15|| xpkmn2+80 >= x + ancho){
                    xVelocity2 = xVelocity2 * -1;
                }
                xpkmn2 = xpkmn2 + xVelocity2;
                if(ypkmn2 <= y || ypkmn2+60 >= y + 125){
                    yVelocity2 = yVelocity2 * -1;
                }
                ypkmn2 = ypkmn2 + yVelocity2;

                if(xpkmn3 <= x +15|| xpkmn3+80 >= x + ancho){
                    xVelocity3 = xVelocity3 * -1;
                }
                xpkmn3 = xpkmn3 + xVelocity3;
                if(ypkmn3 <= y || ypkmn3+60 >= y + 125){
                    yVelocity3 = yVelocity3 * -1;
                }
                ypkmn3 = ypkmn3 + yVelocity3;

                if(xpkmn4 <= x +15|| xpkmn4+80 >= x + ancho){
                    xVelocity4 = xVelocity4 * -1;
                }
                xpkmn4 = xpkmn4 + xVelocity4;
                if(ypkmn4 <= y || ypkmn4+60 >= y + 125){
                    yVelocity4 = yVelocity4 * -1;
                }
                ypkmn4 = ypkmn4 + yVelocity4;
                break;
            case 5:
                if(xpkmn1 <= x +15|| xpkmn1+80 >= x + ancho){
                    xVelocity1 = xVelocity1 * -1;
                }
                xpkmn1 = xpkmn1 + xVelocity1;
                if(ypkmn1 <= y || ypkmn1+60 >= y + 125){
                    yVelocity1 = yVelocity1 * -1;
                }
                ypkmn1 = ypkmn1 + yVelocity1;

                if(xpkmn2 <= x +15|| xpkmn2+80 >= x + ancho){
                    xVelocity2 = xVelocity2 * -1;
                }
                xpkmn2 = xpkmn2 + xVelocity2;
                if(ypkmn2 <= y || ypkmn2+60 >= y + 125){
                    yVelocity2 = yVelocity2 * -1;
                }
                ypkmn2 = ypkmn2 + yVelocity2;

                if(xpkmn3 <= x +15|| xpkmn3+80 >= x + ancho){
                    xVelocity3 = xVelocity3 * -1;
                }
                xpkmn3 = xpkmn3 + xVelocity3;
                if(ypkmn3 <= y || ypkmn3+60 >= y + 125){
                    yVelocity3 = yVelocity3 * -1;
                }
                ypkmn3 = ypkmn3 + yVelocity3;

                if(xpkmn4 <= x +15|| xpkmn4+80 >= x + ancho){
                    xVelocity4 = xVelocity4 * -1;
                }
                xpkmn4 = xpkmn4 + xVelocity4;
                if(ypkmn4 <= y || ypkmn4+60 >= y + 125){
                    yVelocity4 = yVelocity4 * -1;
                }
                ypkmn4 = ypkmn4 + yVelocity4;

                if(xpkmn5 <= x +15|| xpkmn5+80 >= x + ancho){
                    xVelocity5 = xVelocity5 * -1;
                }
                xpkmn5 = xpkmn5 + xVelocity5;
                if(ypkmn5 <= y || ypkmn5+60 >= y + 125){
                    yVelocity5 = yVelocity5 * -1;
                }
                ypkmn5 = ypkmn5 + yVelocity5;
                break;
        }

    repaint();
    }
}
