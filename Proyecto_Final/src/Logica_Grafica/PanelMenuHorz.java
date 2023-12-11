package Logica_Grafica;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
/**
 * Panel encargado del menu horizontal, donde se encuentra una guia de uso, alertas de comida y mas
 * */
public class PanelMenuHorz extends JPanel {
    public PanelMenuHorz() {
    }
    public void paint(Graphics g){
        super.paint(g);
        g.setColor(Color.CYAN);
        g.fillRect(260,623,940,170);
        g.setColor(Color.black);
        g.drawString("Seleccione el habitat que quiere añadir",1210,640);
        g.drawString("Seleccione un pokemon desde las listas a la izquierda, luego haga click en el habitat",280,640);
        g.drawString("que desee agregarlo(tenga en cuenta que los pokemon de agua solo pueden ir con los pokemon de agua y asi",
                280,655);
        g.drawString("con todos los demas), luego agregue comida haciendo click en las comidas abajo a la izquierda y depues",
                280,670);
        g.drawString("click en el habitat que quiere alimentar. Los habitat tienen un maximo de 5 pokemon.",280,685);

    }

}
