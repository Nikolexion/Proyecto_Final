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
    }
}
