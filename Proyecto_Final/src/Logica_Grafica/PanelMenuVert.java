package Logica_Grafica;

import Logica.Comidas.*;
import Logica.DetallePokemon;
import Logica.Inventario;
import Logica.ManejoDeColocacion.ColocarComida;
import Logica.Pokemon;

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
    Pokemon pkmn1, pkmn2, pkmn3, pkmn4, pkmn5;
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

        String[] pkmnsBosque = {"Chikorita", "Bayleef", "Meganium","Odish", "Gloom","Bellossom", "Vileplume","Treecko", "Grovyle", "Sceptile",
                "Bulbasaur", "Ivysaur", "Venusaur", "Snivy", "Servine", "Serperior","Bonsly", "Sudowoodo"};
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

        String[] pkmnsCueva = {"Diglett", "Dugtrio", "Geodude", "Graveler", "Golem", "Registeel", "Nosepass","Probopass", "Aron", "Lairon", "Aggron",
                "Groudon", "Regirock"};
        listaCueva = new JComboBox<>(pkmnsCueva);
        listaCueva.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                clickListas(e,3);
            }
        });

        String[] pkmnsElectrico = {"Magnemite", "Magneton", "Magnezone","Pichu","Pikachu", "Raichu", "Voltrob", "Electrode", "Raikou", "Zapdos"};
        listaElectrico = new JComboBox<>(pkmnsElectrico);
        listaElectrico.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                clickListas(e,4);
            }
        });

        String[] pkmnsHielo = {"Articuno", "Snorunt", "Glalie","Froslass", "Spheal", "Sealeo", "Walrein", "Regice", "Vanillite",
                "Vanillish", "Vanilluxe"};
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

        String[] pkmnsLucha = {"Mankey", "Primeape","Annihilape", "Hitmonlee", "Hitmonchan", "Machop", "Machoke", "Machamp", "Makuhita", "Hariyama"};
        listaLucha = new JComboBox<>(pkmnsLucha);
        listaLucha.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                clickListas(e,8);
            }
        });

        String[] pkmnsPrado = {"Snorlax", "Mew", "Mewtwo", "Celebi", "Zigzagoon", "Linoone", "Ralts", "Kirlia","Gallade", "Gardevoir"};
        listaPrado = new JComboBox<>(pkmnsPrado);
        listaPrado.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                clickListas(e,9);
            }
        });

        String[] pkmnsSetas = {"Shroomish", "Breelom", "Koffing", "Weezing","Igglytuff","Jigglypuff","Wigglytuff", "Paras", "Parasect", "Ekans", "Arbok"};
        listaSetas = new JComboBox<>(pkmnsSetas);
        listaSetas.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                clickListas(e,10);
            }
        });

        String[] pkmnsSiniestro = {"Gastly", "Haunter", "Gengar","Misdreavus","Mismagius", "Exeggcute", "Exeggcutor", "Cubone", "Marowak", "Duskull",
                "Dusclops","Dusknoir", "Shuppet", "Banette"};
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
                switch (listaAgua.getSelectedIndex()){
                    case 0:
                        System.out.println(listaAgua.getSelectedIndex());
                        pkmn1 = new Pokemon(DetallePokemon.SQUIRTLE);
                        break;
                    case 1:
                        pkmn1 = new Pokemon(DetallePokemon.WARTORTLE);
                        break;
                    case 2:
                        pkmn1 = new Pokemon(DetallePokemon.BLASTOISE);
                        break;
                    case 3:
                        pkmn1 = new Pokemon(DetallePokemon.MAGIKARP);
                        break;
                    case 4:
                        pkmn1 = new Pokemon(DetallePokemon.GYARADOS);
                        break;
                    case 5:
                        pkmn1 = new Pokemon(DetallePokemon.LAPRAS);
                        break;
                    case 6:
                        pkmn1 = new Pokemon(DetallePokemon.OMANYTE);
                        break;
                    case 7:
                        pkmn1 = new Pokemon(DetallePokemon.OMASTAR);
                        break;
                    case 8:
                        pkmn1 = new Pokemon(DetallePokemon.TOTODILE);
                        break;
                    case 9:
                        pkmn1 = new Pokemon(DetallePokemon.CROCONAW);
                        break;
                    case 10:
                        pkmn1 = new Pokemon(DetallePokemon.FERALIGATR);
                        break;
                    case 11:
                        pkmn1 = new Pokemon(DetallePokemon.SUICUNE);
                        break;
                    case 12:
                        pkmn1 = new Pokemon(DetallePokemon.KYOGRE);
                        break;
                }
                break;

            case 1:
                switch (listaBosque.getSelectedIndex()) {
                    case 0:
                        pkmn1 = new Pokemon(DetallePokemon.CHIKORITA);
                        break;
                    case 1:
                        pkmn1 = new Pokemon(DetallePokemon.BAYLEEF);
                        break;
                    case 2:
                        pkmn1 = new Pokemon(DetallePokemon.MEGANIUM);
                        break;
                    case 3:
                        pkmn1 = new Pokemon(DetallePokemon.ODDISH);
                        break;
                    case 4:
                        pkmn1 = new Pokemon(DetallePokemon.GLOOM);
                        break;
                    case 5:
                        pkmn1 = new Pokemon(DetallePokemon.BELLOSSOM);
                        break;
                    case 6:
                        pkmn1 = new Pokemon(DetallePokemon.VILEPLUME);
                        break;
                    case 7:
                        pkmn1 = new Pokemon(DetallePokemon.TREECKO);
                        break;
                    case 8:
                        pkmn1 = new Pokemon(DetallePokemon.GROVYLE);
                        break;
                    case 9:
                        pkmn1 = new Pokemon(DetallePokemon.SCEPTILE);
                        break;
                    case 10:
                        pkmn1 = new Pokemon(DetallePokemon.BULBASAUR);
                        break;
                    case 11:
                        pkmn1 = new Pokemon(DetallePokemon.IVYSAUR);
                        break;
                    case 12:
                        pkmn1 = new Pokemon(DetallePokemon.VENUSAUR);
                        break;
                    case 13:
                        pkmn1 = new Pokemon(DetallePokemon.SNIVY);
                        break;
                    case 14:
                        pkmn1 = new Pokemon(DetallePokemon.SERVINE);
                        break;
                    case 15:
                        pkmn1 = new Pokemon(DetallePokemon.SERPERIOR);
                        break;
                    case 16:
                        pkmn1 = new Pokemon(DetallePokemon.BONSLY);
                        break;
                    case 17:
                        pkmn1 = new Pokemon(DetallePokemon.SUDOWOODO);
                        break;
                }
                break;
            case 2:
                switch (listaCielo.getSelectedIndex()) {
                    case 0:
                        pkmn1 = new Pokemon(DetallePokemon.PIDGEY);
                        break;
                    case 1:
                        pkmn1 = new Pokemon(DetallePokemon.PIDGEOTTO);
                        break;
                    case 2:
                        pkmn1 = new Pokemon(DetallePokemon.PIDGEOT);
                        break;
                    case 3:
                        pkmn1 = new Pokemon(DetallePokemon.DRATINI);
                        break;
                    case 4:
                        pkmn1 = new Pokemon(DetallePokemon.DRAGONAIR);
                        break;
                    case 5:
                        pkmn1 = new Pokemon(DetallePokemon.DRAGONITE);
                        break;
                    case 6:
                        pkmn1 = new Pokemon(DetallePokemon.LUGIA);
                        break;
                    case 7:
                        pkmn1 = new Pokemon(DetallePokemon.HO_OH);
                        break;
                    case 8:
                        pkmn1 = new Pokemon(DetallePokemon.SWABLU);
                        break;
                    case 9:
                        pkmn1 = new Pokemon(DetallePokemon.ALTARIA);
                        break;
                    case 10:
                        pkmn1 = new Pokemon(DetallePokemon.BAGON);
                        break;
                    case 11:
                        pkmn1 = new Pokemon(DetallePokemon.SHELGON);
                        break;
                    case 12:
                        pkmn1 = new Pokemon(DetallePokemon.SALAMENCE);
                        break;
                    case 13:
                        pkmn1 = new Pokemon(DetallePokemon.RAYQUAZA);
                        break;
                }

                break;
            case 3:
                switch (listaCueva.getSelectedIndex()) {
                    case 0:
                        pkmn1 = new Pokemon(DetallePokemon.DIGLETT);
                        break;
                    case 1:
                        pkmn1 = new Pokemon(DetallePokemon.DUGTRIO);
                        break;
                    case 2:
                        pkmn1 = new Pokemon(DetallePokemon.GEODUDE);
                        break;
                    case 3:
                        pkmn1 = new Pokemon(DetallePokemon.GRAVELER);
                        break;
                    case 4:
                        pkmn1 = new Pokemon(DetallePokemon.GOLEM);
                        break;
                    case 5:
                        pkmn1 = new Pokemon(DetallePokemon.REGISTEEL);
                        break;
                    case 6:
                        pkmn1 = new Pokemon(DetallePokemon.NOSEPASS);
                    case 7:
                        pkmn1 = new Pokemon(DetallePokemon.PROBOPASS);
                        break;
                    case 8:
                        pkmn1 = new Pokemon(DetallePokemon.ARON);
                        break;
                    case 9:
                        pkmn1 = new Pokemon(DetallePokemon.LAIRON);
                        break;
                    case 10:
                        pkmn1 = new Pokemon(DetallePokemon.AGGRON);
                        break;
                    case 11:
                        pkmn1 = new Pokemon(DetallePokemon.GROUDON);
                        break;
                    case 12:
                        pkmn1 = new Pokemon(DetallePokemon.REGIROCK);
                        break;
                }
                break;
            case 4:
                switch (listaElectrico.getSelectedIndex()) {
                    case 0:
                        pkmn1 = new Pokemon(DetallePokemon.MAGNEMITE);
                        break;
                    case 1:
                        pkmn1 = new Pokemon(DetallePokemon.MAGNETON);
                        break;
                    case 2:
                        pkmn1 = new Pokemon(DetallePokemon.MAGNEZONE);
                        break;
                    case 3:
                        pkmn1 = new Pokemon(DetallePokemon.PICHU);
                        break;
                    case 4:
                        pkmn1 = new Pokemon(DetallePokemon.PIKACHU);
                        break;
                    case 5:
                        pkmn1 = new Pokemon(DetallePokemon.RAICHU);
                        break;
                    case 6:
                        pkmn1 = new Pokemon(DetallePokemon.VOLTORB);
                        break;
                    case 7:
                        pkmn1 = new Pokemon(DetallePokemon.ELECTRODE);
                        break;
                    case 8:
                        pkmn1 = new Pokemon(DetallePokemon.RAIKOU);
                        break;
                    case 9:
                        pkmn1 = new Pokemon(DetallePokemon.ZAPDOS);
                        break;
                }
                break;
            case 5:
                switch (listaHielo.getSelectedIndex()) {
                    case 0:
                        pkmn1 = new Pokemon(DetallePokemon.ARTICUNO);
                        break;
                    case 1:
                        pkmn1 = new Pokemon(DetallePokemon.SNORUNT);
                        break;
                    case 2:
                        pkmn1 = new Pokemon(DetallePokemon.GLALIE);
                        break;
                    case 3:
                        pkmn1 = new Pokemon(DetallePokemon.FROSLASS);
                        break;
                    case 4:
                        pkmn1 = new Pokemon(DetallePokemon.SPHEAL);
                        break;
                    case 5:
                        pkmn1 = new Pokemon(DetallePokemon.SEALEO);
                        break;
                    case 6:
                        pkmn1 = new Pokemon(DetallePokemon.WALREIN);
                        break;
                    case 7:
                        pkmn1 = new Pokemon(DetallePokemon.REGICE);
                        break;
                    case 8:
                        pkmn1 = new Pokemon(DetallePokemon.VANILLITE);
                        break;
                    case 9:
                        pkmn1 = new Pokemon(DetallePokemon.VANILLISH);
                        break;
                    case 10:
                        pkmn1 = new Pokemon(DetallePokemon.VANILLUXE);
                        break;
                }
                break;
            case  6:
                switch (listaHumedal.getSelectedIndex()) {
                    case 0:
                        pkmn1 = new Pokemon(DetallePokemon.MUDKIP);
                        break;
                    case 1:
                        pkmn1 = new Pokemon(DetallePokemon.MARSHTOMP);
                        break;
                    case 2:
                        pkmn1 = new Pokemon(DetallePokemon.SWAMPERT);
                        break;
                    case 3:
                        pkmn1 = new Pokemon(DetallePokemon.LOTAD);
                        break;
                    case 4:
                        pkmn1 = new Pokemon(DetallePokemon.LOMBRE);
                        break;
                    case 5:
                        pkmn1 = new Pokemon(DetallePokemon.LUDICOLO);
                        break;
                    case 6:
                        pkmn1 = new Pokemon(DetallePokemon.WOOPER);
                        break;
                    case 7:
                        pkmn1 = new Pokemon(DetallePokemon.QUAGSIRE);
                        break;
                    case 8:
                        pkmn1 = new Pokemon(DetallePokemon.RELICANTH);
                        break;
                    case 9:
                        pkmn1 = new Pokemon(DetallePokemon.PSYDUCK);
                        break;
                    case 10:
                        pkmn1 = new Pokemon(DetallePokemon.GOLDUCK);
                        break;
                }
                break;
            case 7:
                switch (listaLava.getSelectedIndex()) {
                    case 0:
                        pkmn1 = new Pokemon(DetallePokemon.CHARMANDER);
                        break;
                    case 1:
                        pkmn1 = new Pokemon(DetallePokemon.CHARMELEON);
                        break;
                    case 2:
                        pkmn1 = new Pokemon(DetallePokemon.CHARIZARD);
                        break;
                    case 3:
                        pkmn1 = new Pokemon(DetallePokemon.VULPIX);
                        break;
                    case 4:
                        pkmn1 = new Pokemon(DetallePokemon.NINETALES);
                        break;
                    case 5:
                        pkmn1 = new Pokemon(DetallePokemon.TORCHIC);
                        break;
                    case 6:
                        pkmn1 = new Pokemon(DetallePokemon.COMBUSKEN);
                        break;
                    case 7:
                        pkmn1 = new Pokemon(DetallePokemon.BLAZIKEN);
                        break;
                    case 8:
                        pkmn1 = new Pokemon(DetallePokemon.MOLTRES);
                        break;
                    case 9:
                        pkmn1 = new Pokemon(DetallePokemon.CYNDAQUIL);
                        break;
                    case 10:
                        pkmn1 = new Pokemon(DetallePokemon.QUILAVA);
                        break;
                    case 11:
                        pkmn1 = new Pokemon(DetallePokemon.TYPHLOSION);
                        break;
                    case 12:
                        pkmn1 = new Pokemon(DetallePokemon.ENTEI);
                        break;
                }
                break;
            case 8:
                switch (listaLucha.getSelectedIndex()) {
                    case 0:
                        pkmn1 = new Pokemon(DetallePokemon.MANKEY);
                        break;
                    case 1:
                        pkmn1 = new Pokemon(DetallePokemon.PRIMEAPE);
                        break;
                    case 2:
                        pkmn1 = new Pokemon(DetallePokemon.ANNIHILAPE);
                        break;
                    case 3:
                        pkmn1 = new Pokemon(DetallePokemon.HITMONLEE);
                        break;
                    case 4:
                        pkmn1 = new Pokemon(DetallePokemon.HITMONCHAN);
                        break;
                    case 5:
                        pkmn1 = new Pokemon(DetallePokemon.MACHOP);
                        break;
                    case 6:
                        pkmn1 = new Pokemon(DetallePokemon.MACHOKE);
                        break;
                    case 7:
                        pkmn1 = new Pokemon(DetallePokemon.MACHAMP);
                        break;
                    case 8:
                        pkmn1 = new Pokemon(DetallePokemon.MAKUHITA);
                        break;
                    case 9:
                        pkmn1 = new Pokemon(DetallePokemon.HARIYAMA);
                        break;
                }
                break;
            case 9:
                switch (listaPrado.getSelectedIndex()) {
                    case 0:
                        pkmn1 = new Pokemon(DetallePokemon.SNORLAX);
                        break;
                    case 1:
                        pkmn1 = new Pokemon(DetallePokemon.MEW);
                        break;
                    case 2:
                        pkmn1 = new Pokemon(DetallePokemon.MEWTWO);
                        break;
                    case 3:
                        pkmn1 = new Pokemon(DetallePokemon.CELEBI);
                        break;
                    case 4:
                        pkmn1 = new Pokemon(DetallePokemon.ZIGZAGOON);
                        break;
                    case 5:
                        pkmn1 = new Pokemon(DetallePokemon.LINOONE);
                        break;
                    case 6:
                        pkmn1 = new Pokemon(DetallePokemon.RALTS);
                        break;
                    case 7:
                        pkmn1 = new Pokemon(DetallePokemon.KIRLIA);
                        break;
                    case 8:
                        pkmn1 = new Pokemon(DetallePokemon.GALLADE);
                        break;
                    case 9:
                        pkmn1 = new Pokemon(DetallePokemon.GARDEVOIR);
                        break;
                }
                break;
            case 10:
                switch (listaSetas.getSelectedIndex()) {
                    case 0:
                        pkmn1 = new Pokemon(DetallePokemon.SHROOMISH);
                        break;
                    case 1:
                        pkmn1 = new Pokemon(DetallePokemon.BRELOOM);
                        break;
                    case 2:
                        pkmn1 = new Pokemon(DetallePokemon.KOFFING);
                        break;
                    case 3:
                        pkmn1 = new Pokemon(DetallePokemon.WEEZING);
                        break;
                    case 4:
                        pkmn1 = new Pokemon(DetallePokemon.IGGLYBUFF);
                        break;
                    case 5:
                        pkmn1 = new Pokemon(DetallePokemon.JIGGLYPUFF);
                        break;
                    case 6:
                        pkmn1 = new Pokemon(DetallePokemon.WIGGLYTUFF);
                        break;
                    case 7:
                        pkmn1 = new Pokemon(DetallePokemon.PARAS);
                        break;
                    case 8:
                        pkmn1 = new Pokemon(DetallePokemon.PARASECT);
                        break;
                    case 9:
                        pkmn1 = new Pokemon(DetallePokemon.EKANS);
                        break;
                    case 10:
                        pkmn1 = new Pokemon(DetallePokemon.ARBOK);
                        break;
                }
                break;
            case 11:
                switch (listaSiniestro.getSelectedIndex()) {
                    case 0:
                        pkmn1 = new Pokemon(DetallePokemon.GASTLY);
                        break;
                    case 1:
                        pkmn1 = new Pokemon(DetallePokemon.HAUNTER);
                        break;
                    case 2:
                        pkmn1 = new Pokemon(DetallePokemon.GENGAR);
                        break;
                    case 3:
                        pkmn1 = new Pokemon(DetallePokemon.MISDREAVUS);
                        break;
                    case 4:
                        pkmn1 = new Pokemon(DetallePokemon.MISMAGIUS);
                        break;
                    case 5:
                        pkmn1 = new Pokemon(DetallePokemon.EXEGGCUTE);
                        break;
                    case 6:
                        pkmn1 = new Pokemon(DetallePokemon.EXEGGCUTOR);
                        break;
                    case 7:
                        pkmn1 = new Pokemon(DetallePokemon.CUBONE);
                        break;
                    case 8:
                        pkmn1 = new Pokemon(DetallePokemon.MAROWAK);
                        break;
                    case 9:
                        pkmn1 = new Pokemon(DetallePokemon.DUSKULL);
                        break;
                    case 10:
                        pkmn1 = new Pokemon(DetallePokemon.DUSCLOPS);
                        break;
                    case 11:
                        pkmn1 = new Pokemon(DetallePokemon.DUSKNOIR);
                        break;
                    case 12:
                        pkmn1 = new Pokemon(DetallePokemon.SHUPPET);
                        break;
                    case 13:
                        pkmn1 = new Pokemon(DetallePokemon.BANETTE);
                        break;
                }
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
