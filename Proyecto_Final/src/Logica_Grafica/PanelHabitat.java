package Logica_Grafica;

import Logica.Comidas.Comedero;
import Logica.Excepciones.HabitatNoPermitePokemon;
import Logica.ManejoDeColocacion.ColocarComida;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;

public class PanelHabitat extends JPanel {
    PanelMenuVert panelMenuVert;
    private HabitatAgua HabitatAgua;
    private HabitatBosque HabitatBosque;
    private HabitatCielo HabitatCielo;
    private HabitatCueva HabitatCueva;
    private HabitatElectrico HabitatElectrico;
    private HabitatHielo HabitatHielo;
    private HabitatHumedal HabitatHumedal;
    private HabitatLava HabitatLava;
    private HabitatLucha HabitatLucha;
    private HabitatPrado HabitatPrado;
    private HabitatSetas HabitatSetas;
    private HabitatSiniestro HabitatSiniestro;
    private Zona ZonaAgua, ZonaBosque, ZonaCielo, ZonaCueva, ZonaElectrico, ZonaHielo, ZonaHumedal, ZonaLava, ZonaLucha, ZonaPrado, ZonaSetas, ZonaSiniestro;
    private Image ImagenAgua, ImagenBosque, ImagenCielo, ImagenCueva, ImagenElectrico, ImagenHielo, ImagenHumedal, ImagenLava, ImagenLucha,
            ImagenPrado, ImagenSetas, ImagenSiniestro;
    private Comedero comederoAgua, comederoBosque, comederoCielo, comederoCueva, comederoElectrico, comederoHielo, comederoHumedal, comederoLava,
                comederoLucha, comederoPrado, comederoSetas, comederoSiniestro;
    public ColocarComida colocarComida;
    public PanelHabitat() {
        panelMenuVert = PanelMenuVert.getInstance();
        colocarComida = ColocarComida.getInstance();
        IniciarHabitats();
        IniciarZonas();
    }
    public void clicked(MouseEvent e) throws HabitatNoPermitePokemon {
        if (ZonaAgua.contienePunto(e.getX(),e.getY())){
            if (colocarComida.estado()){
                comederoAgua.addComida(colocarComida.queComida());
                System.out.println("Comida agregada");
                colocarComida.setDesativado();
                repaint();
                panelMenuVert.update();
            }else {
                HabitatAgua.agua.addPokemon(panelMenuVert.pkmn1);
                System.out.println("Agua");
                repaint();
            }

        } else if (ZonaBosque.contienePunto(e.getX(),e.getY())) {
            if (colocarComida.estado()){
                comederoBosque.addComida(colocarComida.queComida());
                System.out.println("Comida agregada");
                colocarComida.setDesativado();
                repaint();
                panelMenuVert.update();
            }else {
                HabitatBosque.bosque.addPokemon(panelMenuVert.pkmn1);
                panelMenuVert.pkmn1 = null;
                System.out.println("Bosque");
            }
        } else if (ZonaCielo.contienePunto(e.getX(),e.getY())){
            if (colocarComida.estado()){
                comederoCielo.addComida(colocarComida.queComida());
                System.out.println("Comida agregada");
                colocarComida.setDesativado();
                repaint();
                panelMenuVert.update();
            }else {
                HabitatCielo.cielo.addPokemon(panelMenuVert.pkmn1);
                panelMenuVert.pkmn1 = null;
                System.out.println("Cielo");
            }
        } else if (ZonaCueva.contienePunto(e.getX(),e.getY())) {
            if (colocarComida.estado()){
                comederoCueva.addComida(colocarComida.queComida());
                System.out.println("Comida agregada");
                colocarComida.setDesativado();
                repaint();
                panelMenuVert.update();
            }else {
                HabitatCueva.cueva.addPokemon(panelMenuVert.pkmn1);
                panelMenuVert.pkmn1 = null;
                System.out.println("Cueva");
            }
        } else if (ZonaElectrico.contienePunto(e.getX(),e.getY())) {
            if (colocarComida.estado()){
                comederoElectrico.addComida(colocarComida.queComida());
                System.out.println("Comida agregada");
                colocarComida.setDesativado();
                repaint();
                panelMenuVert.update();
            }else {
                HabitatElectrico.electrico.addPokemon(panelMenuVert.pkmn1);
                panelMenuVert.pkmn1 = null;
                System.out.println("Electrico");
            }
        } else if (ZonaHielo.contienePunto(e.getX(),e.getY())) {
            if (colocarComida.estado()){
                comederoHielo.addComida(colocarComida.queComida());
                System.out.println("Comida agregada");
                colocarComida.setDesativado();
                repaint();
                panelMenuVert.update();
            }else {
                HabitatHielo.hielo.addPokemon(panelMenuVert.pkmn1);
                panelMenuVert.pkmn1 = null;
                System.out.println("Hielo");
            }
        } else if (ZonaHumedal.contienePunto(e.getX(),e.getY())) {
            if (colocarComida.estado()){
                comederoHumedal.addComida(colocarComida.queComida());
                System.out.println("Comida agregada");
                colocarComida.setDesativado();
                repaint();
                panelMenuVert.update();
            }else {
                HabitatHumedal.humedal.addPokemon(panelMenuVert.pkmn1);
                panelMenuVert.pkmn1 = null;
                System.out.println("Humedal");
            }
        } else if (ZonaLava.contienePunto(e.getX(),e.getY())) {
            if (colocarComida.estado()){
                comederoLava.addComida(colocarComida.queComida());
                colocarComida.setDesativado();
                repaint();
                panelMenuVert.update();
            }else {
                HabitatLava.lava.addPokemon(panelMenuVert.pkmn1);
                panelMenuVert.pkmn1 = null;
                System.out.println("Lava");
            }
        } else if (ZonaLucha.contienePunto(e.getX(),e.getY())) {
            if (colocarComida.estado()){
                comederoLucha.addComida(colocarComida.queComida());
                System.out.println("Comida agregada");
                colocarComida.setDesativado();
                repaint();
                panelMenuVert.update();
            }else {
                HabitatLucha.lucha.addPokemon(panelMenuVert.pkmn1);
                panelMenuVert.pkmn1 = null;
                System.out.println("Lucha");
            }
        } else if (ZonaPrado.contienePunto(e.getX(),e.getY())) {
            if (colocarComida.estado()){
                comederoPrado.addComida(colocarComida.queComida());
                System.out.println("Comida agregada");
                colocarComida.setDesativado();
                repaint();
                panelMenuVert.update();
            }else {
                HabitatPrado.prado.addPokemon(panelMenuVert.pkmn1);
                panelMenuVert.pkmn1 = null;
                System.out.println("Prado");
            }
        } else if (ZonaSetas.contienePunto(e.getX(),e.getY())) {
            if (colocarComida.estado()){
                comederoSetas.addComida(colocarComida.queComida());
                System.out.println("Comida agregada");
                colocarComida.setDesativado();
                repaint();
                panelMenuVert.update();
            }else {
                HabitatSetas.setas.addPokemon(panelMenuVert.pkmn1);
                panelMenuVert.pkmn1 = null;
                System.out.println("Setas");
            }
        } else if (ZonaSiniestro.contienePunto(e.getX(),e.getY())) {
            if (colocarComida.estado()){
                comederoSiniestro.addComida(colocarComida.queComida());
                System.out.println("Comida agregada");
                colocarComida.setDesativado();
                repaint();
                panelMenuVert.update();
            }else {
                HabitatSiniestro.siniestro.addPokemon(panelMenuVert.pkmn1);
                panelMenuVert.pkmn1 = null;
                System.out.println("Siniestro");
            }
        }
        repaint();

    }
    public void IniciarHabitats(){
        HabitatAgua = new HabitatAgua();
        HabitatBosque = new HabitatBosque();
        HabitatCielo = new HabitatCielo();
        HabitatCueva = new HabitatCueva();
        HabitatElectrico = new HabitatElectrico();
        HabitatHielo = new HabitatHielo();
        HabitatHumedal = new HabitatHumedal();
        HabitatLava = new HabitatLava();
        HabitatLucha = new HabitatLucha();
        HabitatPrado = new HabitatPrado();
        HabitatSetas = new HabitatSetas();
        HabitatSiniestro = new HabitatSiniestro();

        comederoAgua = HabitatAgua.getComedero();
        comederoBosque = HabitatBosque.getComedero();
        comederoCielo = HabitatCielo.getComedero();
        comederoCueva = HabitatCueva.getComedero();
        comederoElectrico = HabitatElectrico.getComedero();
        comederoHielo = HabitatHielo.getComedero();
        comederoHumedal = HabitatHumedal.getComedero();
        comederoLava = HabitatLava.getComedero();
        comederoLucha = HabitatLucha.getComedero();
        comederoPrado = HabitatPrado.getComedero();
        comederoSetas = HabitatSetas.getComedero();
        comederoSiniestro = HabitatSiniestro.getComedero();
    }
    public void IniciarZonas(){
        ZonaAgua = HabitatAgua.getZona();
        ZonaBosque = HabitatBosque.getZona();
        ZonaCielo = HabitatCielo.getZona();
        ZonaCueva = HabitatCueva.getZona();
        ZonaElectrico = HabitatElectrico.getZona();
        ZonaHielo = HabitatHielo.getZona();
        ZonaHumedal = HabitatHumedal.getZona();
        ZonaLava = HabitatLava.getZona();
        ZonaLucha = HabitatLucha.getZona();
        ZonaPrado = HabitatPrado.getZona();
        ZonaSetas = HabitatSetas.getZona();
        ZonaSiniestro = HabitatSiniestro.getZona();



    }
    public void paint(Graphics g){
        super.paint(g);
        ImagenAgua = HabitatAgua.getImagen();
        ImagenBosque = HabitatBosque.getImagen();
        ImagenCielo = HabitatCielo.getImagen();
        ImagenCueva = HabitatCueva.getImagen();
        ImagenElectrico = HabitatElectrico.getImagen();
        ImagenHielo = HabitatHielo.getImagen();
        ImagenHumedal = HabitatHumedal.getImagen();
        ImagenLava = HabitatLava.getImagen();
        ImagenLucha = HabitatLucha.getImagen();
        ImagenPrado = HabitatPrado.getImagen();
        ImagenSetas = HabitatSetas.getImagen();
        ImagenSiniestro = HabitatSiniestro.getImagen();

        g.drawImage(ImagenAgua,260,10,300,195,this);
        g.drawImage(ImagenBosque,260,215,300,195,this);
        g.drawImage(ImagenCielo,260,420,300,195,this);

        g.drawImage(ImagenCueva,580,10,300,195,this);
        g.drawImage(ImagenElectrico,580,215,300,195,this);
        g.drawImage(ImagenHielo,580,420,300,195,this);

        g.drawImage(ImagenHumedal,900,10,300,195,this);
        g.drawImage(ImagenLava,900,215,300,195,this);
        g.drawImage(ImagenLucha,900,420,300,195,this);

        g.drawImage(ImagenPrado,1220,10,300,195,this);
        g.drawImage(ImagenSetas,1220,215,300,195,this);
        g.drawImage(ImagenSiniestro,1220,420,300,195,this);



        g.drawImage(comederoAgua.getImage(),260,165,300,40,this);
        g.drawImage(comederoBosque.getImage(),260,370,300,40,this);
        g.drawImage(comederoCielo.getImage(),260,575,300,40,this);

        g.drawImage(comederoCueva.getImage(),580,165,300,40,this);
        g.drawImage(comederoElectrico.getImage(),580,370,300,40,this);
        g.drawImage(comederoHielo.getImage(),580,575,300,40,this);

        g.drawImage(comederoHumedal.getImage(),900,165,300,40,this);
        g.drawImage(comederoLava.getImage(),900,370,300,40,this);
        g.drawImage(comederoLucha.getImage(),900,575,300,40,this);

        g.drawImage(comederoPrado.getImage(),1220,165,300,40,this);
        g.drawImage(comederoSetas.getImage(),1220,370,300,40,this);
        g.drawImage(comederoSiniestro.getImage(),1220,575,300,40,this);

        HabitatAgua.paint(g);
        HabitatBosque.paint(g);
        HabitatCielo.paint(g);
        HabitatCueva.paint(g);
        HabitatElectrico.paint(g);
        HabitatHielo.paint(g);
        HabitatHumedal.paint(g);
        HabitatLava.paint(g);
        HabitatLucha.paint(g);
        HabitatPrado.paint(g);
        HabitatSetas.paint(g);
        HabitatSiniestro.paint(g);
        repaint();
    }
}
