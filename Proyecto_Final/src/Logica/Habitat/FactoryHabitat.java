package Logica.Habitat;

import javax.swing.*;
import java.awt.*;

public class FactoryHabitat {
    public Habitat crearHabitat(String tipo) {
        switch (tipo.toLowerCase()) {
            case "agua":
                return new Agua();
            case "bosque":
                return new Bosque();
            case "cielo":
                return new Cielo();
            case "cueva":
                return new Cueva();
            case "electrico":
                return new Electrico();
            case "hielo":
                return new Hielo();
            case "humedal":
                return new Humedal();
            case "lava":
                return new Lava();
            case "lucha":
                return new Lucha();
            case "prado":
                return new Prado();
            case "setas":
                return new Setas();
            case "siniestro":
                return new Siniestro();
            default:
                throw new IllegalArgumentException("Tipo de habitat desconocido: " + tipo);
        }
    }
}

