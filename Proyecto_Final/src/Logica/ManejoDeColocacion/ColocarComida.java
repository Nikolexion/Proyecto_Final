package Logica.ManejoDeColocacion;

import Logica.Comidas.Comida;
/**
 * Clase que se encarga de la colocacion de la comida, el cual activa un booleano cuando se está colocando algun tipo de comida
 * y que contiene las coordenadas de los click hechos por el usuario para saber si hizo click dentro de una zona
 * */
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
