    package Logica.Comidas;

    import javax.swing.*;
    import java.awt.*;

    public class Pokocho extends Comida{
        private boolean Comido;
        private Image image;
        public Pokocho() {
            this.Comido = false;
            image = new ImageIcon("resources/Pokocho.png").getImage();
        }

        @Override
        public void comer() {
            this.Comido = true;
        }

        public Image getImage() {
            return image;
        }
    }
