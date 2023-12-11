package Logica.ManejoDeColocacion;
/**
 * Clase que se encarga de la colocacion de objetos, el cual activa un booleano cuando se está colocando el objeto
 * y que contiene las coordenadas de los click hechos por el usuario para saber si hizo click dentro de una zona de interés
 * */
abstract public class Colocar {
    private boolean colocar;
    private int x, y;

    public Colocar() {
        colocar = false;
    }
    public void setActivado(){
        colocar = true;
    }
    public void setDesativado(){
        colocar = false;
    }
    public boolean estado(){return colocar;}

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}
