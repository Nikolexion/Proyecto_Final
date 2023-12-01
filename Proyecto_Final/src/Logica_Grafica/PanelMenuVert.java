package Logica_Grafica;

import Logica.Inventario;
import Logica.ManejoDeColocacion.ColocarComida;
import Logica.Comidas.Pokocho;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PanelMenuVert extends JPanel {
    JComboBox<String> listaAgua,listaBosque,listaCielo,listaCueva,listaElectrico,listaHielo,listaHumedal,listaLava,listaLucha,listaPrado,
                        listaSetas,listaSiniestro;
    JToggleButton comprarPokocho, comprarFrambu, comprarPinia, comprarLatano;
    ColocarComida colocarComida;
    Inventario inventario;
    private Image menu;
    public PanelMenuVert() {
        this.iniciarListas();
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

        comprarPokocho = new JToggleButton();
        comprarPokocho.setBounds(25, 515,98,123);
        ImageIcon imagenPokocho= new ImageIcon("resources/Pokocho.png");
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
}
