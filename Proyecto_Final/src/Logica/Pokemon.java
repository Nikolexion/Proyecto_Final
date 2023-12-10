package Logica;

import Logica.Habitat.Habitat;
import Logica.State.*;

import javax.swing.*;
import java.awt.*;
import java.util.Random;
import java.util.Timer;
import java.util.TimerTask;

public class Pokemon {
    private final long MS_PARA_CAMBIAR_ESTADO;
    private String nombre;
    private Image image;
    private Tipo tipo;
    private EstadoPokemon estadoActual;
    private boolean estaNormal, estaHambriento, estaMuerto;
    private Timer timer;
    private long tiempoInicialMs, tiempoActualMs;
    private long tiempoInicialEstadoNormal, tiempoActualEstadoNormal;
    private long tiempoInicialEstadoHambriento, tiempoActualEstadoHambriento;
    public float x, y, xpkmn, ypkmn;

    public Pokemon (DetallePokemon pokemon){
        this.nombre = pokemon.getNombre();
        this.tipo = pokemon.getTipo();
        this.image = pokemon.getImagen();
        this.estadoActual = new EstadoNormal(this);
        this.MS_PARA_CAMBIAR_ESTADO = 10000;
        tiempoInicialMs = System.currentTimeMillis();
        tiempoActualMs = tiempoInicialMs;
    }

    public void refrescarEstado() {
        estadoActual.actuar();
        tiempoActualMs = System.currentTimeMillis();
    }

    public String getNombre() {
        return nombre;
    }
    public Tipo getTipo(){
        return tipo;
    }
    public Image getImage() {
        return image;
    }

    public boolean isEstaNormal() {
        return estaNormal;
    }

    public boolean isEstaHambriento() {
        return estaHambriento;
    }

    public boolean isEstaMuerto() {
        return estaMuerto;
    }

    public EstadoPokemon getEstadoActual() {
        return estadoActual;
    }

    public void cambiarEstado(EstadoPokemon nuevoEstado) {
        if(getTiempoEstadoHambriento() > MS_PARA_CAMBIAR_ESTADO*2){
            this.estadoActual = new EstadoMuerto(this);
            return;
        }
        if(MS_PARA_CAMBIAR_ESTADO < getTiempoEstadoHambriento() && getTiempoEstadoHambriento() <= MS_PARA_CAMBIAR_ESTADO*2){
            /*todo: casos de hambre debe pasar a buscar comida y después de buscar si encuentra comida, se resetea,
               si no, se muere */
            this.estadoActual = new EstadoHambriento(this);
        }
        this.estadoActual = new EstadoNormal(this);
    }
    public void actuar() {
        estadoActual.actuar();
    }
    public long getTiempoEstadoHambriento(){
        return tiempoActualEstadoHambriento - tiempoInicialEstadoHambriento;
    }
    public void iniciaEstadoHambriento(){
        tiempoInicialEstadoHambriento = System.currentTimeMillis();
        tiempoActualEstadoHambriento = tiempoInicialEstadoHambriento;
    }
    public void setCoords(int x, int y){
        this.x = x;
        this.y = y;
        Random random = new Random();
        xpkmn = x +random.nextInt(210);
        ypkmn = y + random.nextInt(110);
    }
}
