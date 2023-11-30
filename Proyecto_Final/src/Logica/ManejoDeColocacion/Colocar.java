package Logica.ManejoDeColocacion;

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
