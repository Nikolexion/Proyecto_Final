package Logica_Grafica;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;

public class PanelHabitat extends JPanel {
    HabitatAgua HabitatAgua;
    HabitatBosque HabitatBosque;
    HabitatCielo HabitatCielo;
    HabitatCueva HabitatCueva;
    HabitatElectrico HabitatElectrico;
    HabitatHielo HabitatHielo;
    HabitatHumedal HabitatHumedal;
    HabitatLava HabitatLava;
    HabitatLucha HabitatLucha;
    HabitatPrado HabitatPrado;
    HabitatSetas HabitatSetas;
    HabitatSiniestro HabitatSiniestro;
    Zona ZonaAgua, ZonaBosque, ZonaCielo, ZonaCueva, ZonaFabrica, ZonaHielo, ZonaHumedal, ZonaLava, ZonaLucha, ZonaPrado, ZonaSetas, ZonaSiniestro;
    Image ImagenAgua, ImagenBosque, ImagenCielo, ImagenCueva, ImagenFabrica, ImagenHielo, ImagenHumedal, ImagenLava, ImagenLucha, ImagenPrado, ImagenSetas, ImagenSiniestro;
    public PanelHabitat() {
        IniciarHabitats();
        IniciarZonas();
    }
    public void clicked(MouseEvent e){

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
    }
    public void IniciarZonas(){
        JButton botonAgua = new JButton();
        ZonaAgua = new Zona(300,30,300,300,botonAgua);
        add(botonAgua);
        JButton botonBosque = new JButton();


    }
    public void paint(Graphics g){
        super.paint(g);
        ImagenAgua = new ImageIcon().getImage();
    }
}
