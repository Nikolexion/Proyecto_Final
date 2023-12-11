package Logica_Grafica;

import Logica.Comidas.Comedero;
import Logica.Excepciones.HabitatNoPermitePokemon;
import Logica.ManejoDeColocacion.ColocarComida;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.util.Objects;
/**
 * Panel encargado de administrar todos los paneles habitats e hilar la logica entre habitats, pokemones y comida
 * */
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
                if (colocarComida.queComida().getEnumComidas().getNombre().equals("Pinia")){
                    comederoAgua.addComida(colocarComida.queComida());
                    System.out.println("Comida agregada");
                    colocarComida.setDesativado();
                    repaint();
                    panelMenuVert.update();
                } else {
                    errorComida();
                    colocarComida.setDesativado();
                    panelMenuVert.update();
                }
            }else {
                try {
                    HabitatAgua.agua.addPokemon(panelMenuVert.pkmn1);
                } catch (Exception exception){
                    errorPokemon();
                }
                panelMenuVert.pkmn1 = null;
                for (int i = 0; i < HabitatAgua.agua.getSize(); i++){
                    HabitatAgua.agua.getPokemon(i).setCoords(HabitatAgua.x, HabitatAgua.y);
                }
                System.out.println("Agua");
                repaint();
            }

        } else if (ZonaBosque.contienePunto(e.getX(),e.getY())) {
            if (colocarComida.estado()){
                if (colocarComida.queComida().getEnumComidas().getNombre().equals("Latano")){
                    comederoBosque.addComida(colocarComida.queComida());
                    System.out.println("Comida agregada");
                    colocarComida.setDesativado();
                    repaint();
                    panelMenuVert.update();
                } else {
                    errorComida();
                    colocarComida.setDesativado();
                    panelMenuVert.update();
                }
            }else {
                try {
                    HabitatBosque.bosque.addPokemon(panelMenuVert.pkmn1);
                } catch (Exception exception){
                    errorPokemon();
                }
                for (int i = 0; i < HabitatBosque.bosque.getSize(); i++){
                    HabitatBosque.bosque.getPokemon(i).setCoords(HabitatBosque.x, HabitatBosque.y);
                }
                panelMenuVert.pkmn1 = null;
                System.out.println("Bosque");
            }
        } else if (ZonaCielo.contienePunto(e.getX(),e.getY())){
            if (colocarComida.estado()){
                if (colocarComida.queComida().getEnumComidas().getNombre().equals("Latano")){
                    comederoCielo.addComida(colocarComida.queComida());
                    System.out.println("Comida agregada");
                    colocarComida.setDesativado();
                    repaint();
                    panelMenuVert.update();
                } else {
                    errorComida();
                    colocarComida.setDesativado();
                    panelMenuVert.update();
                }
            }else {
                try {
                    HabitatCielo.cielo.addPokemon(panelMenuVert.pkmn1);
                } catch (Exception exception){
                    errorPokemon();
                }
                for (int i = 0; i < HabitatCielo.cielo.getSize(); i++){
                    HabitatCielo.cielo.getPokemon(i).setCoords(HabitatCielo.x, HabitatCielo.y);
                }
                panelMenuVert.pkmn1 = null;
                System.out.println("Cielo");
            }
        } else if (ZonaCueva.contienePunto(e.getX(),e.getY())) {
            if (colocarComida.estado()){
                if (colocarComida.queComida().getEnumComidas().getNombre().equals("Pokocho")){
                    comederoCueva.addComida(colocarComida.queComida());
                    System.out.println("Comida agregada");
                    colocarComida.setDesativado();
                    repaint();
                    panelMenuVert.update();
                } else {
                    errorComida();
                    colocarComida.setDesativado();
                    panelMenuVert.update();
                }
            }else {
                try {
                    HabitatCueva.cueva.addPokemon(panelMenuVert.pkmn1);
                } catch (Exception exception){
                    errorPokemon();
                }
                for (int i = 0; i < HabitatCueva.cueva.getSize(); i++){
                    HabitatCueva.cueva.getPokemon(i).setCoords(HabitatCueva.x, HabitatCueva.y);
                }
                panelMenuVert.pkmn1 = null;
                System.out.println("Cueva");
            }
        } else if (ZonaElectrico.contienePunto(e.getX(),e.getY())) {
            if (colocarComida.estado()){
                if (colocarComida.queComida().getEnumComidas().getNombre().equals("Pinia")){
                    comederoElectrico.addComida(colocarComida.queComida());
                    System.out.println("Comida agregada");
                    colocarComida.setDesativado();
                    repaint();
                    panelMenuVert.update();
                } else {
                    errorComida();
                    colocarComida.setDesativado();
                    panelMenuVert.update();
                }
            }else {
                try {
                    HabitatElectrico.electrico.addPokemon(panelMenuVert.pkmn1);
                } catch (Exception exception){
                    errorPokemon();
                }
                for (int i = 0; i < HabitatElectrico.electrico.getSize(); i++){
                    HabitatElectrico.electrico.getPokemon(i).setCoords(HabitatElectrico.x, HabitatElectrico.y);
                }
                panelMenuVert.pkmn1 = null;
                System.out.println("Electrico");
            }
        } else if (ZonaHielo.contienePunto(e.getX(),e.getY())) {
            if (colocarComida.estado()){
                if (colocarComida.queComida().getEnumComidas().getNombre().equals("Frambu")){
                    comederoHielo.addComida(colocarComida.queComida());
                    System.out.println("Comida agregada");
                    colocarComida.setDesativado();
                    repaint();
                    panelMenuVert.update();
                } else {
                    errorComida();
                    colocarComida.setDesativado();
                    panelMenuVert.update();
                }
            }else {
                try {
                    HabitatHielo.hielo.addPokemon(panelMenuVert.pkmn1);
                } catch (Exception exception){
                    errorPokemon();
                }
                for (int i = 0; i < HabitatHielo.hielo.getSize(); i++){
                    HabitatHielo.hielo.getPokemon(i).setCoords(HabitatHielo.x, HabitatHielo.y);
                }
                panelMenuVert.pkmn1 = null;
                System.out.println("Hielo");
            }
        } else if (ZonaHumedal.contienePunto(e.getX(),e.getY())) {
            if (colocarComida.estado()){
                if (colocarComida.queComida().getEnumComidas().getNombre().equals("Pinia")){
                    comederoHumedal.addComida(colocarComida.queComida());
                    System.out.println("Comida agregada");
                    colocarComida.setDesativado();
                    repaint();
                    panelMenuVert.update();
                } else {
                    errorComida();
                    colocarComida.setDesativado();
                    panelMenuVert.update();
                }
            }else {
                try {
                    HabitatHumedal.humedal.addPokemon(panelMenuVert.pkmn1);
                } catch (Exception exception){
                    errorPokemon();
                }
                for (int i = 0; i < HabitatHumedal.humedal.getSize(); i++){
                    HabitatHumedal.humedal.getPokemon(i).setCoords(HabitatHumedal.x, HabitatHumedal.y);
                }
                panelMenuVert.pkmn1 = null;
                System.out.println("Humedal");
            }
        } else if (ZonaLava.contienePunto(e.getX(),e.getY())) {
            if (colocarComida.estado()){
                if (colocarComida.queComida().getEnumComidas().getNombre().equals("Pokocho")){
                    comederoLava.addComida(colocarComida.queComida());
                    System.out.println("Comida agregada");
                    colocarComida.setDesativado();
                    repaint();
                    panelMenuVert.update();
                } else {
                    errorComida();
                    colocarComida.setDesativado();
                    panelMenuVert.update();
                }
            }else {
                try {
                    HabitatLava.lava.addPokemon(panelMenuVert.pkmn1);
                } catch (Exception exception){
                    errorPokemon();
                }
                for (int i = 0; i < HabitatLava.lava.getSize(); i++){
                    HabitatLava.lava.getPokemon(i).setCoords(HabitatLava.x, HabitatLava.y);
                }
                panelMenuVert.pkmn1 = null;
                System.out.println("Lava");
            }
        } else if (ZonaLucha.contienePunto(e.getX(),e.getY())) {
            if (colocarComida.estado()){
                if (colocarComida.queComida().getEnumComidas().getNombre().equals("Latano")){
                    comederoLucha.addComida(colocarComida.queComida());
                    System.out.println("Comida agregada");
                    colocarComida.setDesativado();
                    repaint();
                    panelMenuVert.update();
                } else {
                    errorComida();
                    colocarComida.setDesativado();
                    panelMenuVert.update();
                }
            }else {
                try {
                    HabitatLucha.lucha.addPokemon(panelMenuVert.pkmn1);
                } catch (Exception exception){
                    errorPokemon();
                }
                for (int i = 0; i < HabitatLucha.lucha.getSize(); i++){
                    HabitatLucha.lucha.getPokemon(i).setCoords(HabitatLucha.x, HabitatLucha.y);
                }
                panelMenuVert.pkmn1 = null;
                System.out.println("Lucha");
            }
        } else if (ZonaPrado.contienePunto(e.getX(),e.getY())) {
            if (colocarComida.estado()){
                if (colocarComida.queComida().getEnumComidas().getNombre().equals("Frambu")){
                    comederoPrado.addComida(colocarComida.queComida());
                    System.out.println("Comida agregada");
                    colocarComida.setDesativado();
                    repaint();
                    panelMenuVert.update();
                } else {
                    errorComida();
                    colocarComida.setDesativado();
                    panelMenuVert.update();
                }
            }else {
                try {
                    HabitatPrado.prado.addPokemon(panelMenuVert.pkmn1);
                } catch (Exception exception){
                    errorPokemon();
                }
                for (int i = 0; i < HabitatPrado.prado.getSize(); i++){
                    HabitatPrado.prado.getPokemon(i).setCoords(HabitatPrado.x, HabitatPrado.y);
                }
                panelMenuVert.pkmn1 = null;
                System.out.println("Prado");
            }
        } else if (ZonaSetas.contienePunto(e.getX(),e.getY())) {
            if (colocarComida.estado()){
                if (colocarComida.queComida().getEnumComidas().getNombre().equals("Frambu")){
                    comederoSetas.addComida(colocarComida.queComida());
                    System.out.println("Comida agregada");
                    colocarComida.setDesativado();
                    repaint();
                    panelMenuVert.update();
                } else {
                    errorComida();
                    colocarComida.setDesativado();
                    panelMenuVert.update();
                }
            }else {
                try {
                    HabitatSetas.setas.addPokemon(panelMenuVert.pkmn1);
                } catch (Exception exception){
                    errorPokemon();
                }
                for (int i = 0; i < HabitatSetas.setas.getSize(); i++){
                    HabitatSetas.setas.getPokemon(i).setCoords(HabitatSetas.x, HabitatSetas.y);
                }
                panelMenuVert.pkmn1 = null;
                System.out.println("Setas");
            }
        } else if (ZonaSiniestro.contienePunto(e.getX(),e.getY())) {
            if (colocarComida.estado()){
                if (colocarComida.queComida().getEnumComidas().getNombre().equals("Pokocho")){
                    comederoSiniestro.addComida(colocarComida.queComida());
                    System.out.println("Comida agregada");
                    colocarComida.setDesativado();
                    repaint();
                    panelMenuVert.update();
                } else {
                    errorComida();
                    colocarComida.setDesativado();
                    panelMenuVert.update();
                }
            }else {
                try {
                    HabitatSiniestro.siniestro.addPokemon(panelMenuVert.pkmn1);
                } catch (Exception exception){
                    errorPokemon();
                }
                for (int i = 0; i < HabitatSiniestro.siniestro.getSize(); i++){
                    HabitatSiniestro.siniestro.getPokemon(i).setCoords(HabitatSiniestro.x, HabitatSiniestro.y);
                }
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
        flags(g);
        repaint();
    }
    public void update(){
        HabitatAgua.update();
        HabitatBosque.update();
        HabitatCielo.update();
        HabitatCueva.update();
        HabitatElectrico.update();
        HabitatHielo.update();
        HabitatHumedal.update();
        HabitatLava.update();
        HabitatLucha.update();
        HabitatPrado.update();
        HabitatSetas.update();
        HabitatSiniestro.update();
    }
    public void errorComida(){
        JOptionPane.showMessageDialog(PanelHabitat.this,"Este habitat no acepta esta comida","Advertencia",2);
    }
    public void errorPokemon(){
        JOptionPane.showMessageDialog(PanelHabitat.this,"Este habitat no acepta este pokemon","Advertencia",0);
    }
    public void flags(Graphics g){
        boolean[] flagsActivas = {HabitatAgua.flag,HabitatBosque.flag, HabitatCielo.flag, HabitatCueva.flag, HabitatElectrico.flag, HabitatHielo.flag,
                HabitatHumedal.flag, HabitatLava.flag, HabitatLucha.flag, HabitatPrado.flag, HabitatSetas.flag, HabitatSiniestro.flag};
        String[] habitats = {"Falta comida en Habitat Agua", "Falta comida en Habitat Bosque", "Falta comida en Habitat Cielo",
                "Falta comida en Habitat Cueva", "Falta comida en Habitat Electrico", "Falta comida en Habitat Hielo",
                "Falta comida en Habitat Humedal", "Falta comida en Habitat Lava", "Falta comida en Habitat Lucha",
                "Falta comida en Habitat Prado", "Falta comida en Habitat Setas", "Falta comida en Habitat Siniestro"};

        int mensajesMostrados = 0;

        for (int i = 0; i < flagsActivas.length; i++) {
            if (flagsActivas[i]) {
                g.drawString(habitats[i], 1210, 20 * mensajesMostrados + 695);
                mensajesMostrados++;

                // Mostrar hasta 5 mensajes a la vez
                if (mensajesMostrados >= 5) {
                    break;
                }
            }
        }
    }


}
