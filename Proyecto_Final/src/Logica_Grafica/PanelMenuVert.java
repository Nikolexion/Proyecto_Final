package Logica_Grafica;

import Logica.Comidas.*;
import Logica.Inventario;
import Logica.ManejoDeColocacion.ColocarComida;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PanelMenuVert extends JPanel implements EventListener {
    private static PanelMenuVert panelMenuVert;
    JComboBox<String> listaAgua,listaBosque,listaCielo,listaCueva,listaElectrico,listaHielo,listaHumedal,listaLava,listaLucha,listaPrado,
                        listaSetas,listaSiniestro;
    JToggleButton comprarPokocho, comprarFrambu, comprarPinia, comprarLatano;
    ColocarComida colocarComida;
    Inventario inventario;
    ImageIcon imagenLatano,imagenPinia,imagenFrambu,imagenPokocho;
    private Image menu;
    private  PanelMenuVert() {
        this.iniciarListas();
        this.iniciarComidas();
        inventario = new Inventario();
        colocarComida = ColocarComida.getInstance();
    }
    public void paint(Graphics g){
        super.paint(g);
        menu = new ImageIcon("resources/MenuBackground.png").getImage();
//        g.drawImage(menu,0,0,250,880,this);


    }
    private void iniciarListas(){
        String[] pkmnsAgua = {"Squirtle","Wartortle", "Blastoise", "Magikarp", "Gyarados", "Lapras", "Omanyte", "Omastar",
                "Totodile", "Croconaw", "Feraligatr", "Suicune", "Kyogre"};
        listaAgua = new JComboBox<>(pkmnsAgua);
        listaAgua.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                clickListas(e,0);
            }
        });
        this.add(listaAgua);

        String[] pkmnsBosque = {"Chikorita", "Bayleef", "Meganium","Odish", "Gloom", "Vileplume","Treecko", "Grovyle", "Sceptile",
                "Bulbasaur", "Ivysaur", "Venusaur", "Snivy", "Servine", "Serperior", "Sudowoodo"};
        listaBosque = new JComboBox<>(pkmnsBosque);
        listaBosque.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                clickListas(e,1);
            }
        });
        String[] pkmnsCielo = {"Pidgey", "Pidgeotto", "Pidgeot", "Dratini", "Dragonair", "Dragonite", "Lugia", "Ho-Oh","Swablu", "Altaria",
                "Bagon", "Shelgon", "Salamence", "Rayquaza"};
        listaCielo = new JComboBox<>(pkmnsCielo);
        listaCielo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                clickListas(e,2);
            }
        });

        String[] pkmnsCueva = {"Diglet", "Dugtrio", "Geodude", "Graveler", "Golem", "Registeel", "Nosepass", "Aron", "Lairon", "Aggron",
                "Groudon", "Regirock"};
        listaCueva = new JComboBox<>(pkmnsCueva);
        listaCueva.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                clickListas(e,3);
            }
        });

        String[] pkmnsElectrico = {"Pikachu", "Raichu", "Magnemite", "Magneton", "Magnezone", "Voltrob", "Electrode", "Raikou", "Zapdos"};
        listaElectrico = new JComboBox<>(pkmnsElectrico);
        listaElectrico.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                clickListas(e,4);
            }
        });

        String[] pkmnsHielo = {"Articuno", "Snorunt", "Glalie", "Spheal", "Sealeo", "Walrein", "Regice", "Vanillite", "Vanillish", "Vanilluxe"};
        listaHielo = new JComboBox<>(pkmnsHielo);
        listaHielo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                clickListas(e,5);
            }
        });

        String[] pkmnsHumedal = {"Mudkip", "Marshtomp", "Swampert", "Lotad", "Lombre", "Ludicolo", "Wooper", "Quagsire", "Relicanth", "Psyduck",
                "Golduck"};
        listaHumedal = new JComboBox<>(pkmnsHumedal);
        listaHumedal.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                clickListas(e,6);
            }
        });

        String[] pkmnsLava = {"Charmander", "Charmeleon", "Charizard", "Vulpix", "Ninetales", "Torchic", "Combusken", "Blaziken",
                "Moltres", "Cyndaquil", "Quilava", "Typhlosion","Entei"};
        listaLava = new JComboBox<>(pkmnsLava);
        listaLava.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                clickListas(e,7);
            }
        });

        String[] pkmnsLucha = {"Mankey", "Primeape", "Hitmonlee", "Hitmonchan", "Machop", "Machoke", "Machamp", "Makuhita", "Hariyama"};
        listaLucha = new JComboBox<>(pkmnsLucha);
        listaLucha.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                clickListas(e,8);
            }
        });

        String[] pkmnsPrado = {"Snorlax", "Mew", "Mewtwo", "Celebi", "Zigzagoon", "Linoone", "Ralts", "Kirlia", "Gardevoir"};
        listaPrado = new JComboBox<>(pkmnsPrado);
        listaPrado.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                clickListas(e,9);
            }
        });

        String[] pkmnsSetas = {"Shroomish", "Breelom", "Koffing", "Weezing", "Jigglypuff", "Igglytuff", "Paras", "Parasect", "Ekans", "Arbok"};
        listaSetas = new JComboBox<>(pkmnsSetas);
        listaSetas.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                clickListas(e,10);
            }
        });

        String[] pkmnsSiniestro = {"Misdreavus", "Gastly", "Haunter", "Gengar", "Exeggute", "Exeggcutor", "Cubone", "Marowak", "Duskull", "Dusclops",
                "Shuppet", "Banette"};
        listaSiniestro = new JComboBox<>(pkmnsSiniestro);
        listaSiniestro.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                clickListas(e,11);
            }
        });


    }
    public void iniciarComidas(){
        comprarPokocho = new JToggleButton();
        comprarPokocho.setBounds(25, 515,98,123);
        imagenPokocho = new ImageIcon("resources/Pokocho.png");
        imagenPokocho = new ImageIcon(imagenPokocho.getImage().getScaledInstance(comprarPokocho.getWidth(),comprarPokocho.getHeight(),Image.SCALE_SMOOTH));
        ImageIcon imagenPokochoOFF= new ImageIcon("resources/PokochoOFF.png");
        imagenPokochoOFF = new ImageIcon(imagenPokochoOFF.getImage().getScaledInstance(comprarPokocho.getWidth(),comprarPokocho.getHeight(),Image.SCALE_SMOOTH));
        comprarPokocho.setContentAreaFilled(false);
        comprarPokocho.setBorderPainted(false);

        ImageIcon finalImagenPokochoOFF = imagenPokochoOFF;
        ImageIcon finalImagenPokocho = imagenPokocho;
        comprarPokocho.setIcon(imagenPokocho);
        comprarPokocho.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (comprarPokocho.isSelected()) {
                    inventario.addComida(new Pokocho());
                    colocarComida.setComida(inventario.getComida());
                    comprarPokocho.setIcon(finalImagenPokochoOFF);
                } else {
                    comprarPokocho.setIcon(finalImagenPokocho);
                    colocarComida.setDesativado();
                }
            }
        });

        comprarFrambu = new JToggleButton();
        comprarFrambu.setBounds(150,515,98,123);
        imagenFrambu = new ImageIcon("resources/Baya_Frambu.png");
        imagenFrambu = new ImageIcon(imagenFrambu.getImage().getScaledInstance(comprarFrambu.getWidth(),comprarFrambu.getHeight(),Image.SCALE_SMOOTH));
        ImageIcon imagenFrambuOFF = new ImageIcon("resources/Baya_FrambuOFF.png");
        imagenFrambuOFF = new ImageIcon(imagenFrambuOFF.getImage().getScaledInstance(comprarFrambu.getWidth(),comprarFrambu.getHeight(),Image.SCALE_SMOOTH));
        comprarFrambu.setContentAreaFilled(false);
        comprarFrambu.setBorderPainted(false);

        ImageIcon finalimagenFrambu = imagenFrambu;
        ImageIcon finalimagenFrambuOFF = imagenFrambuOFF;
        comprarFrambu.setIcon(imagenFrambu);
        comprarFrambu.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (comprarFrambu.isSelected()){
                    inventario.addComida(new Frambu());
                    colocarComida.setComida(inventario.getComida());
                    comprarFrambu.setIcon(finalimagenFrambuOFF);
                } else {
                    comprarFrambu.setIcon(finalimagenFrambu);
                    colocarComida.setDesativado();
                }
            }
        });

        comprarPinia = new JToggleButton();
        comprarPinia.setBounds(25,655,98,123);
        imagenPinia = new ImageIcon("resources/Baya_Pinia.png");
        imagenPinia = new ImageIcon(imagenPinia.getImage().getScaledInstance(comprarPinia.getWidth(),comprarPinia.getHeight(),Image.SCALE_SMOOTH));
        ImageIcon imagenPiniaOFF = new ImageIcon("resources/Baya_PiniaOFF.png");
        imagenPiniaOFF = new ImageIcon(imagenPiniaOFF.getImage().getScaledInstance(comprarPinia.getWidth(),comprarPinia.getHeight(),Image.SCALE_SMOOTH));
        comprarPinia.setContentAreaFilled(false);
        comprarPinia.setBorderPainted(false);

        ImageIcon finalimagenPinia = imagenPinia;
        ImageIcon finalimagenPiniaOFF = imagenPiniaOFF;
        comprarPinia.setIcon(imagenPinia);
        comprarPinia.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (comprarPinia.isSelected()){
                    inventario.addComida(new Pinia());
                    colocarComida.setComida(inventario.getComida());
                    comprarPinia.setIcon(finalimagenPiniaOFF);
                } else {
                    comprarPinia.setIcon(finalimagenPinia);
                    colocarComida.setDesativado();
                }

            }
        });

        comprarLatano = new JToggleButton();
        comprarLatano.setBounds(150,655,98,123);
        imagenLatano = new ImageIcon("resources/Baya_Latano.png");
        imagenLatano = new ImageIcon(imagenLatano.getImage().getScaledInstance(comprarLatano.getWidth(),comprarLatano.getHeight(),Image.SCALE_SMOOTH));
        ImageIcon imagenLatanoOFF = new ImageIcon("resources/Baya_LatanoOFF.png");
        imagenLatanoOFF = new ImageIcon(imagenLatanoOFF.getImage().getScaledInstance(comprarLatano.getWidth(),comprarLatano.getHeight(),Image.SCALE_SMOOTH));
        comprarLatano.setContentAreaFilled(false);
        comprarLatano.setBorderPainted(false);

        ImageIcon finalimagenLatano = imagenLatano;
        ImageIcon finalimagenLatanoOFF = imagenLatanoOFF;
        comprarLatano.setIcon(imagenLatano);
        comprarLatano.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (comprarLatano.isSelected()) {
                    inventario.addComida(new Latano());
                    colocarComida.setComida(inventario.getComida());
                    comprarLatano.setIcon(finalimagenLatanoOFF);
                } else {
                    comprarLatano.setIcon(finalimagenLatano);
                    colocarComida.setDesativado();
                }
            }
        });
    }
    private void clickListas(ActionEvent e, int nroLista){
        switch (nroLista){
            case 0:


                break;
            case 1:

                break;
            case 2:

                break;
            case 3:

                break;
            case 4:

                break;
            case 5:

                break;
            case  6:

                break;
            case 7:

                break;
            case 8:

                break;
            case 9:

                break;
            case 10:

                break;
            case 11:

                break;
        }
    }

    @Override
    public void update() {
        comprarPokocho.setSelected(false);
        comprarPokocho.setIcon(imagenPokocho);

        comprarFrambu.setSelected(false);
        comprarFrambu.setIcon(imagenFrambu);

        comprarPinia.setSelected(false);
        comprarPinia.setIcon(imagenPinia);

        comprarLatano.setSelected(false);
        comprarLatano.setIcon(imagenLatano);
    }
    public static PanelMenuVert getInstance(){
        if (panelMenuVert == null){
            panelMenuVert = new PanelMenuVert();
        }
        return panelMenuVert;
    }
}
