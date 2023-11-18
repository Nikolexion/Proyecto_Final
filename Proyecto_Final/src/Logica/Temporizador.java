package Logica;

import java.util.Timer;
import java.util.TimerTask;

public class Temporizador {
    Timer timer;
    public Temporizador(){
    }
    public void setTemporizador(int tiempo){
        timer = new Timer();
        timer.schedule(new StopTask(), tiempo * 1000);
    }
    class StopTask extends TimerTask {
        public void run(){

        }
    }
}
