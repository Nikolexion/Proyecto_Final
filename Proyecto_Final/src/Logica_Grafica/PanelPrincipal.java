package Logica_Grafica;

import javax.swing.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class PanelPrincipal extends JPanel {
    PanelAnimal panelAnimal;
    PanelHabitat panelHabitat;

    public PanelPrincipal() {
        this.setSize(1800,880);

        JFrame frame = new JFrame();
        frame.setSize(1800,880);
        frame.add(this);
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setExtendedState(frame.MAXIMIZED_BOTH);
        panelHabitat = new PanelHabitat();

        addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                panelHabitat.clicked(e);
            }
        });

    }
}
