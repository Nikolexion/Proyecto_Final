package Logica_Grafica;

import Logica.Excepciones.HabitatNoPermitePokemon;
import Logica.ManejoDeColocacion.ColocarComida;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class PanelPrincipal extends JPanel {
    PanelHabitat panelHabitat;
    PanelMenuVert panelMenuVert;
    PanelMenuHorz panelMenuHorz;
    ColocarComida colocarComida;

    public PanelPrincipal() {
        colocarComida = ColocarComida.getInstance();
        panelHabitat = new PanelHabitat();
        panelMenuVert = PanelMenuVert.getInstance();
        panelMenuHorz = new PanelMenuHorz();
        this.setSize(1800,880);
        JFrame frame = new JFrame();
        frame.setSize(1800,880);
        frame.add(this);
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setExtendedState(frame.MAXIMIZED_BOTH);
        frame.setBackground(Color.WHITE);
        add(panelMenuVert.listaAgua);
        add(panelMenuVert.listaBosque);
        add(panelMenuVert.listaCielo);
        add(panelMenuVert.listaCueva);
        add(panelMenuVert.listaElectrico);
        add(panelMenuVert.listaHielo);
        add(panelMenuVert.listaHumedal);
        add(panelMenuVert.listaLava);
        add(panelMenuVert.listaLucha);
        add(panelMenuVert.listaPrado);
        add(panelMenuVert.listaSetas);
        add(panelMenuVert.listaSiniestro);
        add(panelMenuVert.comprarPokocho);
        add(panelMenuVert.comprarFrambu);
        add(panelMenuVert.comprarPinia);
        add(panelMenuVert.comprarLatano);


        addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                try {
                    panelHabitat.clicked(e);
                } catch (HabitatNoPermitePokemon ex) {
                    throw new RuntimeException(ex);
                }
                repaint();
            }
        });


    }
    @Override
    public void paint(Graphics g){
        super.paint(g);
        panelHabitat.paint(g);
        panelMenuHorz.paint(g);
        panelMenuVert.paint(g);
        panelMenuVert.listaAgua.setBounds(25,35,100,30);
        panelMenuVert.listaBosque.setBounds(25,75,100,30);
        panelMenuVert.listaCielo.setBounds(25,115,100,30);
        panelMenuVert.listaCueva.setBounds(25,155,100,30);
        panelMenuVert.listaElectrico.setBounds(25,195,100,30);
        panelMenuVert.listaHielo.setBounds(25,235,100,30);
        panelMenuVert.listaHumedal.setBounds(25,275,100,30);
        panelMenuVert.listaLava.setBounds(25,315,100,30);
        panelMenuVert.listaLucha.setBounds(25,355,100,30);
        panelMenuVert.listaPrado.setBounds(25,395,100,30);
        panelMenuVert.listaSetas.setBounds(25,435,100,30);
        panelMenuVert.listaSiniestro.setBounds(25,475,100,30);
        panelMenuVert.comprarPokocho.setBounds(25, 515,98,123);
        panelMenuVert.comprarFrambu.setBounds(150,515,98,123);
        panelMenuVert.comprarPinia.setBounds(25,655,98,123);
        panelMenuVert.comprarLatano.setBounds(150,655,98,123);


    }
}
