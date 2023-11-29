package Logica_Grafica;

import Logica.Comedero;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;

public class PanelHabitat extends JPanel {
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
    private Zona ZonaComederoAgua, ZonaComederoBosque, ZonaComederoCielo, ZonaComederoCueva, ZonaComederoElectrico, ZonaComederoHielo,
            ZonaComederoHumedal, ZonaComederoLava, ZonaComederoLucha, ZonaComederoPrado, ZonaComederoSetas, ZonaComederoSiniestro;
    private Image ImagenAgua, ImagenBosque, ImagenCielo, ImagenCueva, ImagenElectrico, ImagenHielo, ImagenHumedal, ImagenLava, ImagenLucha,
            ImagenPrado, ImagenSetas, ImagenSiniestro;
    private Comedero comederoAgua, comederoBosque, comederoCielo, comederoCueva, comederoElectrico, comederoHielo, comederoHumedal, comederoLava,
                comederoLucha, comederoPrado, comederoSetas, comederoSiniestro;
    private Boolean alimentar;
    public PanelHabitat() {
        IniciarHabitats();
        IniciarZonas();
    }
    public void clicked(MouseEvent e){
        if (ZonaAgua.contienePunto(e.getX(),e.getY())){
            if (alimentar){

            }else {

            }
            System.out.println("Agua");
        } else if (ZonaBosque.contienePunto(e.getX(),e.getY())) {
            if (alimentar){

            }else {

            }
            System.out.println("Bosque");
        } else if (ZonaCielo.contienePunto(e.getX(),e.getY())){
            if (alimentar){

            }else {

            }
            System.out.println("Cielo");
        } else if (ZonaCueva.contienePunto(e.getX(),e.getY())) {
            if (alimentar){

            }else {

            }
            System.out.println("Cueva");
        } else if (ZonaElectrico.contienePunto(e.getX(),e.getY())) {
            if (alimentar){

            }else {

            }
            System.out.println("Electrico");
        } else if (ZonaHielo.contienePunto(e.getX(),e.getY())) {
            if (alimentar){

            }else {

            }
            System.out.println("Hielo");
        } else if (ZonaHumedal.contienePunto(e.getX(),e.getY())) {
            if (alimentar){

            }else {

            }
            System.out.println("Humedal");
        } else if (ZonaLava.contienePunto(e.getX(),e.getY())) {
            if (alimentar){

            }else {

            }
            System.out.println("Lava");
        } else if (ZonaLucha.contienePunto(e.getX(),e.getY())) {
            if (alimentar){

            }else {

            }
            System.out.println("Lucha");
        } else if (ZonaPrado.contienePunto(e.getX(),e.getY())) {
            if (alimentar){

            }else {

            }
            System.out.println("Prado");
        } else if (ZonaSetas.contienePunto(e.getX(),e.getY())) {
            if (alimentar){

            }else {

            }
            System.out.println("Setas");
        } else if (ZonaSiniestro.contienePunto(e.getX(),e.getY())) {
            if (alimentar){

            }else {

            }
            System.out.println("Siniestro");
        }

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

        comederoAgua = HabitatAgua.getComederoAgua();
        comederoBosque = HabitatBosque.getComederoBosque();
        comederoCielo = HabitatCielo.getComederoCielo();
        comederoCueva = HabitatCueva.getComederoCueva();
        comederoElectrico = HabitatElectrico.getComederoElectrico();
        comederoHielo = HabitatHielo.getComederoHielo();
        comederoHumedal = HabitatHumedal.getComederoHumedal();
        comederoLava = HabitatLava.getComederoLava();
        comederoLucha = HabitatLucha.getComederoLucha();
        comederoPrado = HabitatPrado.getComederoPrado();
        comederoSetas = HabitatSetas.getComederoSetas();
        comederoSiniestro = HabitatSiniestro.getComederoSiniestro();
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
        ImagenAgua = new ImageIcon("resources/Ambientes/Agua.jpg").getImage();
        ImagenBosque = new ImageIcon("resources/Ambientes/Bosque.jpg").getImage();
        ImagenCielo = new ImageIcon("resources/Ambientes/Cielo.jpg").getImage();
        ImagenCueva = new ImageIcon("resources/Ambientes/Cueva.jpg").getImage();
        ImagenElectrico = new ImageIcon("resources/Ambientes/Electrico.jpg").getImage();
        ImagenHielo = new ImageIcon("resources/Ambientes/Hielo.jpg").getImage();
        ImagenHumedal = new ImageIcon("resources/Ambientes/Humedal.jpg").getImage();
        ImagenLava = new ImageIcon("resources/Ambientes/Lava.jpg").getImage();
        ImagenLucha = new ImageIcon("resources/Ambientes/Lucha.jpg").getImage();
        ImagenPrado = new ImageIcon("resources/Ambientes/Prado.jpg").getImage();
        ImagenSetas = new ImageIcon("resources/Ambientes/Setas.jpg").getImage();
        ImagenSiniestro = new ImageIcon("resources/Ambientes/Siniestro.jpg").getImage();

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






    }
}
