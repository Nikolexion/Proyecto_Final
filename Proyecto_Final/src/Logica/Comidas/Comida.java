package Logica.Comidas;

public abstract class Comida {
    private boolean Comido;
    public Comida() {
        this.Comido = false;
    }
    abstract void comer();
}
