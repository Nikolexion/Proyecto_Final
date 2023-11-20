package Logica;

import java.util.Random;
public class RandomNum {

    public int generarNumeroRandom(int cotaSuperior) {
        Random random = new Random();
        int numeroRandom = random.nextInt(cotaSuperior);

        if (numeroRandom < 0) {
            numeroRandom = -numeroRandom;
        }

        return numeroRandom;
    }
}
