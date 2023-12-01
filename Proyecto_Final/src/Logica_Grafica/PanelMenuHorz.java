package Logica_Grafica;

import javax.swing.*;
import java.awt.*;

public class PanelMenuHorz extends JPanel {

    private Image menu;
    public PanelMenuHorz() {

    }
    public void paint(Graphics g){
        super.paint(g);
        menu = new ImageIcon("resources/MenuBackground.png").getImage();
//        g.drawImage(menu,0,630,1700,180,this);

    }
}
