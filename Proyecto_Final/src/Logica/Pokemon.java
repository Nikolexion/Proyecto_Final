package Logica;

import Logica.Comidas.Comida;
import Logica.Habitat.Habitat;
import Logica.State.*;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
import java.util.Timer;
import java.util.TimerTask;

public class Pokemon {
    private String nombre;
    private Image image;
    private Tipo tipo;
    private EstadoPokemon estadoActual;
    private boolean estaNormal, estaHambriento, estaMuerto, estaComiendo;
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

        iniciarTimer();
    }
    private void iniciarTimer() {
        timer = new Timer();
        timer.scheduleAtFixedRate(new TimerTask() {
            int segundosTranscurridos = 0;

            @Override
            public void run() {
                segundosTranscurridos++;
                actualizarEstado(segundosTranscurridos);
            }
        }, 1000, 1000); // Ejecutar cada segundo
    }
    private void actualizarEstado(int segundosTranscurridos) {
        if (segundosTranscurridos >= 0 && segundosTranscurridos <= 10) {
            cambiarEstado(new EstadoNormal(this));
            estaNormal = true;
            estaHambriento = false;
            estaMuerto = false;
            estaComiendo = false;
        } else if (segundosTranscurridos > 10 && segundosTranscurridos <= 20) {
            cambiarEstado(new EstadoHambriento(this));
            estaNormal = false;
            estaHambriento = true;
            estaMuerto = false;
        } else {
            cambiarEstado(new EstadoMuerto(this));
            estaNormal = false;
            estaHambriento = false;
            estaMuerto = true;
            timer.cancel(); // Detener el temporizador si el Pokemon muere
        }
    }
    public void refrescarEstado() {
        estadoActual.actuar();
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
    public boolean isEstaComiendo(){
        return estaComiendo;
    }

    public boolean isEstaMuerto() {
        return estaMuerto;
    }

    public EstadoPokemon getEstadoActual() {
        return estadoActual;
    }
    public void cambiarEstado(EstadoPokemon nuevoEstado){
        this.estadoActual = nuevoEstado;
    }
    public void comer(Comida comida){
        if (comida != null){
            setNoComiendo();
            cambiarEstado(new EstadoNormal(this));
            timer.cancel();
            iniciarTimer();
        }
    }
    public void setEstaComiendo(){
        estaComiendo = true;
    }
    public void setNoComiendo(){
        estaComiendo = false;
    }

//    public void cambiarEstado(EstadoPokemon nuevoEstado) {
//        if(getTiempoEstadoHambriento() > MS_PARA_CAMBIAR_ESTADO*2){
//            this.estadoActual = new EstadoMuerto(this);
//            return;
//        }
//        if(MS_PARA_CAMBIAR_ESTADO < getTiempoEstadoHambriento() && getTiempoEstadoHambriento() <= MS_PARA_CAMBIAR_ESTADO*2){
//            this.estadoActual = new EstadoHambriento(this);
//            return;
//        }
//        this.estadoActual = new EstadoNormal(this);
//    }

    public void actuar() {
        estadoActual.actuar();
    }
    //    public long getTiempoEstadoHambriento(){
//        return tiempoActualEstadoHambriento - tiempoInicialEstadoHambriento;
//    }
//    public void iniciaEstadoHambriento(){
//        tiempoInicialEstadoHambriento = System.currentTimeMillis();
//        tiempoActualEstadoHambriento = tiempoInicialEstadoHambriento;
//    }
    public void setCoords(int x, int y){
        this.x = x;
        this.y = y;
        Random random = new Random();
        xpkmn = x +random.nextInt(210);
        ypkmn = y + random.nextInt(110);
    }
}