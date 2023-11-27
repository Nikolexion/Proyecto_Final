package Logica_Grafica;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class PanelPrincipal extends JPanel {
    PanelAnimal panelAnimal;
    PanelHabitat panelHabitat;
    PanelMenuVert panelMenuVert;
    PanelMenuHorz panelMenuHorz;

    public PanelPrincipal() {
        panelHabitat = new PanelHabitat();
        panelMenuVert = new PanelMenuVert();
        panelMenuHorz = new PanelMenuHorz();
        this.setSize(1800,880);
        JFrame frame = new JFrame();
        frame.setSize(1800,880);
        frame.add(this);
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setExtendedState(frame.MAXIMIZED_BOTH);
        add(panelMenuVert.listaAgua);
        add(panelMenuVert.listaBosque);


        addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                panelHabitat.clicked(e);
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




    }
}
