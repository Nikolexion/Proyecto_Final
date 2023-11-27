package Logica_Grafica;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PanelMenuVert extends JPanel {
    JComboBox<String> listaAgua,listaBosque,listaCielo,listaCueva,listaElectrico,listaHielo,listaHumedal,listaLava,listaLucha,listaPrado,
                        listaSetas,listaSiniestro;
    private Image menu;
    public PanelMenuVert() {
        this.iniciarListas();
        String[] habitats = {"Squirtle","Wartortle", "Blastoise", "Magikarp", "Gyarados", "Lapras", "Omanyte", "Omastar",
                "Totodile", "Croconaw", "Feraligatr", "Suicune", "Kyogre"};

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
                System.out.println(listaAgua.getSelectedItem());
                System.out.println(listaAgua.getSelectedIndex());
            }
        });
        this.add(listaAgua);

        String[] pkmnsBosque = {"Chikorita", "Bayleef", "Meganium","Odish", "Gloom", "Vileplume","Treecko", "Grovyle", "Sceptile",
                "Bulbasaur", "Ivysaur", "Venusaur", "Snivy", "Servine", "Serperior", "Sudowoodo"};
        listaBosque = new JComboBox<>(pkmnsBosque);
        listaBosque.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println(listaBosque.getSelectedItem());
                System.out.println(listaBosque.getSelectedIndex());
            }
        });
        String[] pkmnsCielo = {"Pidgey", "Pidgeotto", "Pidgeot", "Dratini", "Dragonair", "Dragonite", "Lugia", "Ho-Oh","Swablu", "Altaria",
                "Bagon", "Shelgon", "Salamence", "Rayquaza"};
        listaCielo = new JComboBox<>(pkmnsCielo);
        listaCielo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });

        String[] pkmnsCueva = {"Diglet", "Dugtrio", "Geodude", "Graveler", "Golem", "Registeel", "Nosepass", "Aron", "Lairon", "Aggron",
                "Groudon", "Regirock"};
        listaCueva = new JComboBox<>(pkmnsCueva);
        listaCueva.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });

        String[] pkmnsElectrico = {"Pikachu", "Raichu", "Magnemite", "Magneton", "Magnezone", "Voltrob", "Electrode", "Raikou", "Zapdos"};
        listaElectrico = new JComboBox<>(pkmnsElectrico);
        listaElectrico.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });

        String[] pkmnsHielo = {"Articuno", "Snorunt", "Glalie", "Spheal", "Sealeo", "Walrein", "Regice", "Vanillite", "Vanillish", "Vanilluxe"};
        listaHielo = new JComboBox<>(pkmnsHielo);
        listaHielo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });

        String[] pkmnsHumedal = {"Mudkip", "Marshtomp", "Swampert", "Lotad", "Lombre", "Ludicolo", "Wooper", "Quagsire", "Relicanth", "Psyduck",
                "Golduck"};
        listaHumedal = new JComboBox<>(pkmnsHumedal);
        listaHumedal.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });

        String[] pkmnsLava = {"Charmander", "Charmeleon", "Charizard", "Vulpix", "Ninetales", "Torchic", "Combusken", "Blaziken",
                "Moltres", "Cyndaquil", "Quilava", "Typhlosion","Entei"};
        listaLava = new JComboBox<>(pkmnsLava);
        listaLava.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });

        String[] pkmnsLucha = {"Mankey", "Primeape", "Hitmonlee", "Hitmonchan", "Machop", "Machoke", "Machamp", "Makuhita", "Hariyama"};
        listaLucha = new JComboBox<>(pkmnsLucha);
        listaLucha.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });

        String[] pkmnsPrado = {"Snorlax", "Mew", "Mewtwo", "Celebi", "Zigzagoon", "Linoone", "Ralts", "Kirlia", "Gardevoir"};
        listaPrado = new JComboBox<>(pkmnsPrado);
        listaPrado.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });

        String[] pkmnsSetas = {"Shroomish", "Breelom", "Koffing", "Weezing", "Jigglypuff", "Igglytuff", "Paras", "Parasect", "Ekans", "Arbok"};
        listaSetas = new JComboBox<>(pkmnsSetas);
        listaSetas.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });

        String[] pkmnsSiniestro = {"Misdreavus", "Gastly", "Haunter", "Gengar", "Exeggute", "Exeggcutor", "Cubone", "Marowak", "Duskull", "Dusclops",
                "Shuppet", "Banette"};
        listaSiniestro = new JComboBox<>(pkmnsSiniestro);
        listaSiniestro.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
    }
}
