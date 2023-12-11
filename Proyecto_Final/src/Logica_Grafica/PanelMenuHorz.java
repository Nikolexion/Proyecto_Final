package Logica_Grafica;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
/**
 * Panel encargado del menu horizontal, donde se encuentra una guia de uso, alertas de comida y mas
 * */
public class PanelMenuHorz extends JPanel {

    private Image menu;
    public JComboBox<String> listaHabitats;
    public PanelMenuHorz() {
        iniciarLista();
    }
    public void paint(Graphics g){
        super.paint(g);
        menu = new ImageIcon("resources/MenuBackground.png").getImage();
//        g.drawImage(menu,0,630,1700,180,this);
        g.setColor(Color.CYAN);
        g.fillRect(260,623,940,170);
        g.setColor(Color.black);
        g.drawString("Seleccione el habitat que quiere añadir",1210,640);
        g.drawString("Selecciones un pokemon desde las listas a la izquierda, luego haga click en el habitat",280,640);
        g.drawString("que desee agregarlo(tenga en cuenta que los pokemon de agua solo pueden ir con los pokemon de agua y asi",
                280,655);
        g.drawString("con todos los demas), luego agregue comida haciendo click en las comidas abajo a la izquierda y depues",
                280,670);
        g.drawString("click en el habitat que quiere alimentar. Los habitat tienen un maximo de 5 pokemon.",280,685);

    }
    public void iniciarLista(){
        String[] habitats = {"Habitat Agua", "Habitat Bosque", "Habitat Cielo", "Habitat Cueva", "Habitat Electrico", "Habitat Hielo",
                    "Habitat Humedal", "Habitat Lava", "Habitat Lucha", "Habitat Prado", "Habitat Setas", "Habitat Siniestro"};
        listaHabitats = new JComboBox<>(habitats);
        listaHabitats.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                click(listaHabitats.getSelectedIndex());
            }
        });
    }
    public void click(int index){
        switch (index){
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
            case 6:

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
