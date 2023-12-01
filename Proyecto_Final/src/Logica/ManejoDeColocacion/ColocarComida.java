package Logica.ManejoDeColocacion;

import Logica.Comidas.Comida;

public class ColocarComida extends Colocar{
    private static ColocarComida instance;
    private Comida comidaActual;
    private ColocarComida() {
        super();
    }
    public static ColocarComida getInstance(){
        if (instance == null){
            instance = new ColocarComida();
        }
        return instance;
    }

    public void setComida(Comida comida) {
        this.setActivado();
        comidaActual = comida;
    }

    public Comida queComida(){
        return comidaActual;
    }

}
