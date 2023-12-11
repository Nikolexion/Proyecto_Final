/**
 * Clase de testing unitario para la clase Habitat y sus metodos mas relevantes: addPokemon ya que prueba
 * permitePokemon en si misma, getPokemon y permiteComida
 */

import Logica.Comidas.*;
import Logica.DetallePokemon;
import Logica.Excepciones.HabitatNoPermitePokemon;
import Logica.Habitat.*;
import Logica.Pokemon;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class HabitatTest {
    @Test
    public void testPruebaPermitePokemonAgua(){
        Agua agua = new Agua();

        Pokemon squirtle = new Pokemon(DetallePokemon.SQUIRTLE);
        Pokemon oddish = new Pokemon(DetallePokemon.ODDISH);
        Pokemon pidgey = new Pokemon(DetallePokemon.PIDGEY);
        Pokemon geodude = new Pokemon(DetallePokemon.GEODUDE);
        Pokemon pikachu = new Pokemon(DetallePokemon.PIKACHU);
        Pokemon articuno = new Pokemon(DetallePokemon.ARTICUNO);
        Pokemon lotad = new Pokemon(DetallePokemon.LOTAD);
        Pokemon charmander = new Pokemon(DetallePokemon.CHARMANDER);
        Pokemon machop = new Pokemon(DetallePokemon.MACHOP);
        Pokemon mew = new Pokemon(DetallePokemon.MEW);
        Pokemon ekans = new Pokemon(DetallePokemon.EKANS);
        Pokemon haunter = new Pokemon(DetallePokemon.HAUNTER);

        assertTrue(agua.permitePokemon(squirtle));
        assertFalse(agua.permitePokemon(oddish));
        assertFalse(agua.permitePokemon(pidgey));
        assertFalse(agua.permitePokemon(geodude));
        assertFalse(agua.permitePokemon(pikachu));
        assertFalse(agua.permitePokemon(articuno));
        assertFalse(agua.permitePokemon(lotad));
        assertFalse(agua.permitePokemon(charmander));
        assertFalse(agua.permitePokemon(machop));
        assertFalse(agua.permitePokemon(mew));
        assertFalse(agua.permitePokemon(ekans));
        assertFalse(agua.permitePokemon(haunter));
    }

    @Test
    public void testPruebaPermitePokemonBosque(){
        Bosque bosque = new Bosque();

        Pokemon squirtle = new Pokemon(DetallePokemon.SQUIRTLE);
        Pokemon oddish = new Pokemon(DetallePokemon.ODDISH);
        Pokemon pidgey = new Pokemon(DetallePokemon.PIDGEY);
        Pokemon geodude = new Pokemon(DetallePokemon.GEODUDE);
        Pokemon pikachu = new Pokemon(DetallePokemon.PIKACHU);
        Pokemon articuno = new Pokemon(DetallePokemon.ARTICUNO);
        Pokemon lotad = new Pokemon(DetallePokemon.LOTAD);
        Pokemon charmander = new Pokemon(DetallePokemon.CHARMANDER);
        Pokemon machop = new Pokemon(DetallePokemon.MACHOP);
        Pokemon mew = new Pokemon(DetallePokemon.MEW);
        Pokemon ekans = new Pokemon(DetallePokemon.EKANS);
        Pokemon haunter = new Pokemon(DetallePokemon.HAUNTER);

        assertFalse(bosque.permitePokemon(squirtle));
        assertTrue(bosque.permitePokemon(oddish));
        assertFalse(bosque.permitePokemon(pidgey));
        assertFalse(bosque.permitePokemon(geodude));
        assertFalse(bosque.permitePokemon(pikachu));
        assertFalse(bosque.permitePokemon(articuno));
        assertFalse(bosque.permitePokemon(lotad));
        assertFalse(bosque.permitePokemon(charmander));
        assertFalse(bosque.permitePokemon(machop));
        assertFalse(bosque.permitePokemon(mew));
        assertFalse(bosque.permitePokemon(ekans));
        assertFalse(bosque.permitePokemon(haunter));
    }

    @Test
    public void testPruebaPermitePokemonCielo(){
        Cielo cielo = new Cielo();

        Pokemon squirtle = new Pokemon(DetallePokemon.SQUIRTLE);
        Pokemon oddish = new Pokemon(DetallePokemon.ODDISH);
        Pokemon pidgey = new Pokemon(DetallePokemon.PIDGEY);
        Pokemon geodude = new Pokemon(DetallePokemon.GEODUDE);
        Pokemon pikachu = new Pokemon(DetallePokemon.PIKACHU);
        Pokemon articuno = new Pokemon(DetallePokemon.ARTICUNO);
        Pokemon lotad = new Pokemon(DetallePokemon.LOTAD);
        Pokemon charmander = new Pokemon(DetallePokemon.CHARMANDER);
        Pokemon machop = new Pokemon(DetallePokemon.MACHOP);
        Pokemon mew = new Pokemon(DetallePokemon.MEW);
        Pokemon ekans = new Pokemon(DetallePokemon.EKANS);
        Pokemon haunter = new Pokemon(DetallePokemon.HAUNTER);

        assertFalse(cielo.permitePokemon(squirtle));
        assertFalse(cielo.permitePokemon(oddish));
        assertTrue(cielo.permitePokemon(pidgey));
        assertFalse(cielo.permitePokemon(geodude));
        assertFalse(cielo.permitePokemon(pikachu));
        assertFalse(cielo.permitePokemon(articuno));
        assertFalse(cielo.permitePokemon(lotad));
        assertFalse(cielo.permitePokemon(charmander));
        assertFalse(cielo.permitePokemon(machop));
        assertFalse(cielo.permitePokemon(mew));
        assertFalse(cielo.permitePokemon(ekans));
        assertFalse(cielo.permitePokemon(haunter));
    }

    @Test
    public void testPruebaPermitePokemonCueva(){
        Cueva cueva = new Cueva();

        Pokemon squirtle = new Pokemon(DetallePokemon.SQUIRTLE);
        Pokemon oddish = new Pokemon(DetallePokemon.ODDISH);
        Pokemon pidgey = new Pokemon(DetallePokemon.PIDGEY);
        Pokemon geodude = new Pokemon(DetallePokemon.GEODUDE);
        Pokemon pikachu = new Pokemon(DetallePokemon.PIKACHU);
        Pokemon articuno = new Pokemon(DetallePokemon.ARTICUNO);
        Pokemon lotad = new Pokemon(DetallePokemon.LOTAD);
        Pokemon charmander = new Pokemon(DetallePokemon.CHARMANDER);
        Pokemon machop = new Pokemon(DetallePokemon.MACHOP);
        Pokemon mew = new Pokemon(DetallePokemon.MEW);
        Pokemon ekans = new Pokemon(DetallePokemon.EKANS);
        Pokemon haunter = new Pokemon(DetallePokemon.HAUNTER);

        assertFalse(cueva.permitePokemon(squirtle));
        assertFalse(cueva.permitePokemon(oddish));
        assertFalse(cueva.permitePokemon(pidgey));
        assertTrue(cueva.permitePokemon(geodude));
        assertFalse(cueva.permitePokemon(pikachu));
        assertFalse(cueva.permitePokemon(articuno));
        assertFalse(cueva.permitePokemon(lotad));
        assertFalse(cueva.permitePokemon(charmander));
        assertFalse(cueva.permitePokemon(machop));
        assertFalse(cueva.permitePokemon(mew));
        assertFalse(cueva.permitePokemon(ekans));
        assertFalse(cueva.permitePokemon(haunter));
    }

    @Test
    public void testPruebaPermitePokemonElectrico(){
        Electrico electrico = new Electrico();

        Pokemon squirtle = new Pokemon(DetallePokemon.SQUIRTLE);
        Pokemon oddish = new Pokemon(DetallePokemon.ODDISH);
        Pokemon pidgey = new Pokemon(DetallePokemon.PIDGEY);
        Pokemon geodude = new Pokemon(DetallePokemon.GEODUDE);
        Pokemon pikachu = new Pokemon(DetallePokemon.PIKACHU);
        Pokemon articuno = new Pokemon(DetallePokemon.ARTICUNO);
        Pokemon lotad = new Pokemon(DetallePokemon.LOTAD);
        Pokemon charmander = new Pokemon(DetallePokemon.CHARMANDER);
        Pokemon machop = new Pokemon(DetallePokemon.MACHOP);
        Pokemon mew = new Pokemon(DetallePokemon.MEW);
        Pokemon ekans = new Pokemon(DetallePokemon.EKANS);
        Pokemon haunter = new Pokemon(DetallePokemon.HAUNTER);

        assertFalse(electrico.permitePokemon(squirtle));
        assertFalse(electrico.permitePokemon(oddish));
        assertFalse(electrico.permitePokemon(pidgey));
        assertFalse(electrico.permitePokemon(geodude));
        assertTrue(electrico.permitePokemon(pikachu));
        assertFalse(electrico.permitePokemon(articuno));
        assertFalse(electrico.permitePokemon(lotad));
        assertFalse(electrico.permitePokemon(charmander));
        assertFalse(electrico.permitePokemon(machop));
        assertFalse(electrico.permitePokemon(mew));
        assertFalse(electrico.permitePokemon(ekans));
        assertFalse(electrico.permitePokemon(haunter));
    }

    @Test
    public void testPruebaPermitePokemonHielo(){
        Hielo hielo = new Hielo();

        Pokemon squirtle = new Pokemon(DetallePokemon.SQUIRTLE);
        Pokemon oddish = new Pokemon(DetallePokemon.ODDISH);
        Pokemon pidgey = new Pokemon(DetallePokemon.PIDGEY);
        Pokemon geodude = new Pokemon(DetallePokemon.GEODUDE);
        Pokemon pikachu = new Pokemon(DetallePokemon.PIKACHU);
        Pokemon articuno = new Pokemon(DetallePokemon.ARTICUNO);
        Pokemon lotad = new Pokemon(DetallePokemon.LOTAD);
        Pokemon charmander = new Pokemon(DetallePokemon.CHARMANDER);
        Pokemon machop = new Pokemon(DetallePokemon.MACHOP);
        Pokemon mew = new Pokemon(DetallePokemon.MEW);
        Pokemon ekans = new Pokemon(DetallePokemon.EKANS);
        Pokemon haunter = new Pokemon(DetallePokemon.HAUNTER);

        assertFalse(hielo.permitePokemon(squirtle));
        assertFalse(hielo.permitePokemon(oddish));
        assertFalse(hielo.permitePokemon(pidgey));
        assertFalse(hielo.permitePokemon(geodude));
        assertFalse(hielo.permitePokemon(pikachu));
        assertTrue(hielo.permitePokemon(articuno));
        assertFalse(hielo.permitePokemon(lotad));
        assertFalse(hielo.permitePokemon(charmander));
        assertFalse(hielo.permitePokemon(machop));
        assertFalse(hielo.permitePokemon(mew));
        assertFalse(hielo.permitePokemon(ekans));
        assertFalse(hielo.permitePokemon(haunter));
    }

    @Test
    public void testPruebaPermitePokemonHumedal(){
        Humedal humedal = new Humedal();

        Pokemon squirtle = new Pokemon(DetallePokemon.SQUIRTLE);
        Pokemon oddish = new Pokemon(DetallePokemon.ODDISH);
        Pokemon pidgey = new Pokemon(DetallePokemon.PIDGEY);
        Pokemon geodude = new Pokemon(DetallePokemon.GEODUDE);
        Pokemon pikachu = new Pokemon(DetallePokemon.PIKACHU);
        Pokemon articuno = new Pokemon(DetallePokemon.ARTICUNO);
        Pokemon lotad = new Pokemon(DetallePokemon.LOTAD);
        Pokemon charmander = new Pokemon(DetallePokemon.CHARMANDER);
        Pokemon machop = new Pokemon(DetallePokemon.MACHOP);
        Pokemon mew = new Pokemon(DetallePokemon.MEW);
        Pokemon ekans = new Pokemon(DetallePokemon.EKANS);
        Pokemon haunter = new Pokemon(DetallePokemon.HAUNTER);

        assertFalse(humedal.permitePokemon(squirtle));
        assertFalse(humedal.permitePokemon(oddish));
        assertFalse(humedal.permitePokemon(pidgey));
        assertFalse(humedal.permitePokemon(geodude));
        assertFalse(humedal.permitePokemon(pikachu));
        assertFalse(humedal.permitePokemon(articuno));
        assertTrue(humedal.permitePokemon(lotad));
        assertFalse(humedal.permitePokemon(charmander));
        assertFalse(humedal.permitePokemon(machop));
        assertFalse(humedal.permitePokemon(mew));
        assertFalse(humedal.permitePokemon(ekans));
        assertFalse(humedal.permitePokemon(haunter));
    }

    @Test
    public void testPruebaPermitePokemonLava(){
        Lava lava = new Lava();

        Pokemon squirtle = new Pokemon(DetallePokemon.SQUIRTLE);
        Pokemon oddish = new Pokemon(DetallePokemon.ODDISH);
        Pokemon pidgey = new Pokemon(DetallePokemon.PIDGEY);
        Pokemon geodude = new Pokemon(DetallePokemon.GEODUDE);
        Pokemon pikachu = new Pokemon(DetallePokemon.PIKACHU);
        Pokemon articuno = new Pokemon(DetallePokemon.ARTICUNO);
        Pokemon lotad = new Pokemon(DetallePokemon.LOTAD);
        Pokemon charmander = new Pokemon(DetallePokemon.CHARMANDER);
        Pokemon machop = new Pokemon(DetallePokemon.MACHOP);
        Pokemon mew = new Pokemon(DetallePokemon.MEW);
        Pokemon ekans = new Pokemon(DetallePokemon.EKANS);
        Pokemon haunter = new Pokemon(DetallePokemon.HAUNTER);

        assertFalse(lava.permitePokemon(squirtle));
        assertFalse(lava.permitePokemon(oddish));
        assertFalse(lava.permitePokemon(pidgey));
        assertFalse(lava.permitePokemon(geodude));
        assertFalse(lava.permitePokemon(pikachu));
        assertFalse(lava.permitePokemon(articuno));
        assertFalse(lava.permitePokemon(lotad));
        assertTrue(lava.permitePokemon(charmander));
        assertFalse(lava.permitePokemon(machop));
        assertFalse(lava.permitePokemon(mew));
        assertFalse(lava.permitePokemon(ekans));
        assertFalse(lava.permitePokemon(haunter));
    }

    @Test
    public void testPruebaPermitePokemonLucha(){
        Lucha lucha = new Lucha();

        Pokemon squirtle = new Pokemon(DetallePokemon.SQUIRTLE);
        Pokemon oddish = new Pokemon(DetallePokemon.ODDISH);
        Pokemon pidgey = new Pokemon(DetallePokemon.PIDGEY);
        Pokemon geodude = new Pokemon(DetallePokemon.GEODUDE);
        Pokemon pikachu = new Pokemon(DetallePokemon.PIKACHU);
        Pokemon articuno = new Pokemon(DetallePokemon.ARTICUNO);
        Pokemon lotad = new Pokemon(DetallePokemon.LOTAD);
        Pokemon charmander = new Pokemon(DetallePokemon.CHARMANDER);
        Pokemon machop = new Pokemon(DetallePokemon.MACHOP);
        Pokemon mew = new Pokemon(DetallePokemon.MEW);
        Pokemon ekans = new Pokemon(DetallePokemon.EKANS);
        Pokemon haunter = new Pokemon(DetallePokemon.HAUNTER);

        assertFalse(lucha.permitePokemon(squirtle));
        assertFalse(lucha.permitePokemon(oddish));
        assertFalse(lucha.permitePokemon(pidgey));
        assertFalse(lucha.permitePokemon(geodude));
        assertFalse(lucha.permitePokemon(pikachu));
        assertFalse(lucha.permitePokemon(articuno));
        assertFalse(lucha.permitePokemon(lotad));
        assertFalse(lucha.permitePokemon(charmander));
        assertTrue(lucha.permitePokemon(machop));
        assertFalse(lucha.permitePokemon(mew));
        assertFalse(lucha.permitePokemon(ekans));
        assertFalse(lucha.permitePokemon(haunter));
    }

    @Test
    public void testPruebaPermitePokemonPrado(){
        Prado prado = new Prado();
        Setas setas = new Setas();
        Siniestro siniestro = new Siniestro();

        Pokemon squirtle = new Pokemon(DetallePokemon.SQUIRTLE);
        Pokemon oddish = new Pokemon(DetallePokemon.ODDISH);
        Pokemon pidgey = new Pokemon(DetallePokemon.PIDGEY);
        Pokemon geodude = new Pokemon(DetallePokemon.GEODUDE);
        Pokemon pikachu = new Pokemon(DetallePokemon.PIKACHU);
        Pokemon articuno = new Pokemon(DetallePokemon.ARTICUNO);
        Pokemon lotad = new Pokemon(DetallePokemon.LOTAD);
        Pokemon charmander = new Pokemon(DetallePokemon.CHARMANDER);
        Pokemon machop = new Pokemon(DetallePokemon.MACHOP);
        Pokemon mew = new Pokemon(DetallePokemon.MEW);
        Pokemon ekans = new Pokemon(DetallePokemon.EKANS);
        Pokemon haunter = new Pokemon(DetallePokemon.HAUNTER);

        assertFalse(prado.permitePokemon(squirtle));
        assertFalse(prado.permitePokemon(oddish));
        assertFalse(prado.permitePokemon(pidgey));
        assertFalse(prado.permitePokemon(geodude));
        assertFalse(prado.permitePokemon(pikachu));
        assertFalse(prado.permitePokemon(articuno));
        assertFalse(prado.permitePokemon(lotad));
        assertFalse(prado.permitePokemon(charmander));
        assertFalse(prado.permitePokemon(machop));
        assertTrue(prado.permitePokemon(mew));
        assertFalse(prado.permitePokemon(ekans));
        assertFalse(prado.permitePokemon(haunter));
    }

    @Test
    public void testPruebaPermitePokemonSetas(){
        Setas setas = new Setas();
        Siniestro siniestro = new Siniestro();

        Pokemon squirtle = new Pokemon(DetallePokemon.SQUIRTLE);
        Pokemon oddish = new Pokemon(DetallePokemon.ODDISH);
        Pokemon pidgey = new Pokemon(DetallePokemon.PIDGEY);
        Pokemon geodude = new Pokemon(DetallePokemon.GEODUDE);
        Pokemon pikachu = new Pokemon(DetallePokemon.PIKACHU);
        Pokemon articuno = new Pokemon(DetallePokemon.ARTICUNO);
        Pokemon lotad = new Pokemon(DetallePokemon.LOTAD);
        Pokemon charmander = new Pokemon(DetallePokemon.CHARMANDER);
        Pokemon machop = new Pokemon(DetallePokemon.MACHOP);
        Pokemon mew = new Pokemon(DetallePokemon.MEW);
        Pokemon ekans = new Pokemon(DetallePokemon.EKANS);
        Pokemon haunter = new Pokemon(DetallePokemon.HAUNTER);

        assertFalse(setas.permitePokemon(squirtle));
        assertFalse(setas.permitePokemon(oddish));
        assertFalse(setas.permitePokemon(pidgey));
        assertFalse(setas.permitePokemon(geodude));
        assertFalse(setas.permitePokemon(pikachu));
        assertFalse(setas.permitePokemon(articuno));
        assertFalse(setas.permitePokemon(lotad));
        assertFalse(setas.permitePokemon(charmander));
        assertFalse(setas.permitePokemon(machop));
        assertFalse(setas.permitePokemon(mew));
        assertTrue(setas.permitePokemon(ekans));
        assertFalse(setas.permitePokemon(haunter));
    }

    @Test
    public void testPruebaPermitePokemonSiniestro(){
        Siniestro siniestro = new Siniestro();

        Pokemon squirtle = new Pokemon(DetallePokemon.SQUIRTLE);
        Pokemon oddish = new Pokemon(DetallePokemon.ODDISH);
        Pokemon pidgey = new Pokemon(DetallePokemon.PIDGEY);
        Pokemon geodude = new Pokemon(DetallePokemon.GEODUDE);
        Pokemon pikachu = new Pokemon(DetallePokemon.PIKACHU);
        Pokemon articuno = new Pokemon(DetallePokemon.ARTICUNO);
        Pokemon lotad = new Pokemon(DetallePokemon.LOTAD);
        Pokemon charmander = new Pokemon(DetallePokemon.CHARMANDER);
        Pokemon machop = new Pokemon(DetallePokemon.MACHOP);
        Pokemon mew = new Pokemon(DetallePokemon.MEW);
        Pokemon ekans = new Pokemon(DetallePokemon.EKANS);
        Pokemon haunter = new Pokemon(DetallePokemon.HAUNTER);

        assertFalse(siniestro.permitePokemon(squirtle));
        assertFalse(siniestro.permitePokemon(oddish));
        assertFalse(siniestro.permitePokemon(pidgey));
        assertFalse(siniestro.permitePokemon(geodude));
        assertFalse(siniestro.permitePokemon(pikachu));
        assertFalse(siniestro.permitePokemon(articuno));
        assertFalse(siniestro.permitePokemon(lotad));
        assertFalse(siniestro.permitePokemon(charmander));
        assertFalse(siniestro.permitePokemon(machop));
        assertFalse(siniestro.permitePokemon(mew));
        assertFalse(siniestro.permitePokemon(ekans));
        assertTrue(siniestro.permitePokemon(haunter));
    }

    @Test
    public void testPruebaAddPokemonIncorrectoAgua(){

        assertThrows(HabitatNoPermitePokemon.class, () -> {
            Agua agua = new Agua();

            Pokemon squirtle = new Pokemon(DetallePokemon.SQUIRTLE);
            Pokemon oddish = new Pokemon(DetallePokemon.ODDISH);
            Pokemon pidgey = new Pokemon(DetallePokemon.PIDGEY);
            Pokemon geodude = new Pokemon(DetallePokemon.GEODUDE);
            Pokemon pikachu = new Pokemon(DetallePokemon.PIKACHU);
            Pokemon articuno = new Pokemon(DetallePokemon.ARTICUNO);
            Pokemon lotad = new Pokemon(DetallePokemon.LOTAD);
            Pokemon charmander = new Pokemon(DetallePokemon.CHARMANDER);
            Pokemon machop = new Pokemon(DetallePokemon.MACHOP);
            Pokemon mew = new Pokemon(DetallePokemon.MEW);
            Pokemon ekans = new Pokemon(DetallePokemon.EKANS);
            Pokemon haunter = new Pokemon(DetallePokemon.HAUNTER);

            agua.addPokemon(oddish);
            agua.addPokemon(pidgey);
            agua.addPokemon(geodude);
            agua.addPokemon(pikachu);
            agua.addPokemon(articuno);
            agua.addPokemon(lotad);
            agua.addPokemon(charmander);
            agua.addPokemon(machop);
            agua.addPokemon(mew);
            agua.addPokemon(ekans);
            agua.addPokemon(haunter);
        });
    }

    @Test
    public void testPruebaAddPokemonIncorrectoBosque(){

        assertThrows(HabitatNoPermitePokemon.class, () -> {
            Bosque bosque = new Bosque();

            Pokemon squirtle = new Pokemon(DetallePokemon.SQUIRTLE);
            Pokemon oddish = new Pokemon(DetallePokemon.ODDISH);
            Pokemon pidgey = new Pokemon(DetallePokemon.PIDGEY);
            Pokemon geodude = new Pokemon(DetallePokemon.GEODUDE);
            Pokemon pikachu = new Pokemon(DetallePokemon.PIKACHU);
            Pokemon articuno = new Pokemon(DetallePokemon.ARTICUNO);
            Pokemon lotad = new Pokemon(DetallePokemon.LOTAD);
            Pokemon charmander = new Pokemon(DetallePokemon.CHARMANDER);
            Pokemon machop = new Pokemon(DetallePokemon.MACHOP);
            Pokemon mew = new Pokemon(DetallePokemon.MEW);
            Pokemon ekans = new Pokemon(DetallePokemon.EKANS);
            Pokemon haunter = new Pokemon(DetallePokemon.HAUNTER);

            bosque.addPokemon(squirtle);
            bosque.addPokemon(pidgey);
            bosque.addPokemon(geodude);
            bosque.addPokemon(pikachu);
            bosque.addPokemon(articuno);
            bosque.addPokemon(lotad);
            bosque.addPokemon(charmander);
            bosque.addPokemon(machop);
            bosque.addPokemon(mew);
            bosque.addPokemon(ekans);
            bosque.addPokemon(haunter);
        });
    }

    @Test
    public void testPruebaAddPokemonIncorrectoCielo(){

        assertThrows(HabitatNoPermitePokemon.class, () -> {
            Cielo cielo = new Cielo();

            Pokemon squirtle = new Pokemon(DetallePokemon.SQUIRTLE);
            Pokemon oddish = new Pokemon(DetallePokemon.ODDISH);
            Pokemon pidgey = new Pokemon(DetallePokemon.PIDGEY);
            Pokemon geodude = new Pokemon(DetallePokemon.GEODUDE);
            Pokemon pikachu = new Pokemon(DetallePokemon.PIKACHU);
            Pokemon articuno = new Pokemon(DetallePokemon.ARTICUNO);
            Pokemon lotad = new Pokemon(DetallePokemon.LOTAD);
            Pokemon charmander = new Pokemon(DetallePokemon.CHARMANDER);
            Pokemon machop = new Pokemon(DetallePokemon.MACHOP);
            Pokemon mew = new Pokemon(DetallePokemon.MEW);
            Pokemon ekans = new Pokemon(DetallePokemon.EKANS);
            Pokemon haunter = new Pokemon(DetallePokemon.HAUNTER);

            cielo.addPokemon(oddish);
            cielo.addPokemon(squirtle);
            cielo.addPokemon(geodude);
            cielo.addPokemon(pikachu);
            cielo.addPokemon(articuno);
            cielo.addPokemon(lotad);
            cielo.addPokemon(charmander);
            cielo.addPokemon(machop);
            cielo.addPokemon(mew);
            cielo.addPokemon(ekans);
            cielo.addPokemon(haunter);
        });
    }

    @Test
    public void testPruebaAddPokemonIncorrectoCueva(){

        assertThrows(HabitatNoPermitePokemon.class, () -> {
            Cueva cueva = new Cueva();

            Pokemon squirtle = new Pokemon(DetallePokemon.SQUIRTLE);
            Pokemon oddish = new Pokemon(DetallePokemon.ODDISH);
            Pokemon pidgey = new Pokemon(DetallePokemon.PIDGEY);
            Pokemon geodude = new Pokemon(DetallePokemon.GEODUDE);
            Pokemon pikachu = new Pokemon(DetallePokemon.PIKACHU);
            Pokemon articuno = new Pokemon(DetallePokemon.ARTICUNO);
            Pokemon lotad = new Pokemon(DetallePokemon.LOTAD);
            Pokemon charmander = new Pokemon(DetallePokemon.CHARMANDER);
            Pokemon machop = new Pokemon(DetallePokemon.MACHOP);
            Pokemon mew = new Pokemon(DetallePokemon.MEW);
            Pokemon ekans = new Pokemon(DetallePokemon.EKANS);
            Pokemon haunter = new Pokemon(DetallePokemon.HAUNTER);

            cueva.addPokemon(oddish);
            cueva.addPokemon(squirtle);
            cueva.addPokemon(pidgey);
            cueva.addPokemon(pikachu);
            cueva.addPokemon(articuno);
            cueva.addPokemon(lotad);
            cueva.addPokemon(charmander);
            cueva.addPokemon(machop);
            cueva.addPokemon(mew);
            cueva.addPokemon(ekans);
            cueva.addPokemon(haunter);
        });
    }

    @Test
    public void testPruebaAddPokemonIncorrectoElectrico(){

        assertThrows(HabitatNoPermitePokemon.class, () -> {
            Electrico electrico = new Electrico();

            Pokemon squirtle = new Pokemon(DetallePokemon.SQUIRTLE);
            Pokemon oddish = new Pokemon(DetallePokemon.ODDISH);
            Pokemon pidgey = new Pokemon(DetallePokemon.PIDGEY);
            Pokemon geodude = new Pokemon(DetallePokemon.GEODUDE);
            Pokemon pikachu = new Pokemon(DetallePokemon.PIKACHU);
            Pokemon articuno = new Pokemon(DetallePokemon.ARTICUNO);
            Pokemon lotad = new Pokemon(DetallePokemon.LOTAD);
            Pokemon charmander = new Pokemon(DetallePokemon.CHARMANDER);
            Pokemon machop = new Pokemon(DetallePokemon.MACHOP);
            Pokemon mew = new Pokemon(DetallePokemon.MEW);
            Pokemon ekans = new Pokemon(DetallePokemon.EKANS);
            Pokemon haunter = new Pokemon(DetallePokemon.HAUNTER);

            electrico.addPokemon(oddish);
            electrico.addPokemon(squirtle);
            electrico.addPokemon(pidgey);
            electrico.addPokemon(geodude);
            electrico.addPokemon(articuno);
            electrico.addPokemon(lotad);
            electrico.addPokemon(charmander);
            electrico.addPokemon(machop);
            electrico.addPokemon(mew);
            electrico.addPokemon(ekans);
            electrico.addPokemon(haunter);
        });
    }

    @Test
    public void testPruebaAddPokemonIncorrectoHielo(){

        assertThrows(HabitatNoPermitePokemon.class, () -> {
            Hielo hielo = new Hielo();

            Pokemon squirtle = new Pokemon(DetallePokemon.SQUIRTLE);
            Pokemon oddish = new Pokemon(DetallePokemon.ODDISH);
            Pokemon pidgey = new Pokemon(DetallePokemon.PIDGEY);
            Pokemon geodude = new Pokemon(DetallePokemon.GEODUDE);
            Pokemon pikachu = new Pokemon(DetallePokemon.PIKACHU);
            Pokemon articuno = new Pokemon(DetallePokemon.ARTICUNO);
            Pokemon lotad = new Pokemon(DetallePokemon.LOTAD);
            Pokemon charmander = new Pokemon(DetallePokemon.CHARMANDER);
            Pokemon machop = new Pokemon(DetallePokemon.MACHOP);
            Pokemon mew = new Pokemon(DetallePokemon.MEW);
            Pokemon ekans = new Pokemon(DetallePokemon.EKANS);
            Pokemon haunter = new Pokemon(DetallePokemon.HAUNTER);

            hielo.addPokemon(oddish);
            hielo.addPokemon(squirtle);
            hielo.addPokemon(pidgey);
            hielo.addPokemon(geodude);
            hielo.addPokemon(pikachu);
            hielo.addPokemon(lotad);
            hielo.addPokemon(charmander);
            hielo.addPokemon(machop);
            hielo.addPokemon(mew);
            hielo.addPokemon(ekans);
            hielo.addPokemon(haunter);
        });
    }

    @Test
    public void testPruebaAddPokemonIncorrectoHumedal(){

        assertThrows(HabitatNoPermitePokemon.class, () -> {
            Humedal humedal = new Humedal();

            Pokemon squirtle = new Pokemon(DetallePokemon.SQUIRTLE);
            Pokemon oddish = new Pokemon(DetallePokemon.ODDISH);
            Pokemon pidgey = new Pokemon(DetallePokemon.PIDGEY);
            Pokemon geodude = new Pokemon(DetallePokemon.GEODUDE);
            Pokemon pikachu = new Pokemon(DetallePokemon.PIKACHU);
            Pokemon articuno = new Pokemon(DetallePokemon.ARTICUNO);
            Pokemon lotad = new Pokemon(DetallePokemon.LOTAD);
            Pokemon charmander = new Pokemon(DetallePokemon.CHARMANDER);
            Pokemon machop = new Pokemon(DetallePokemon.MACHOP);
            Pokemon mew = new Pokemon(DetallePokemon.MEW);
            Pokemon ekans = new Pokemon(DetallePokemon.EKANS);
            Pokemon haunter = new Pokemon(DetallePokemon.HAUNTER);

            humedal.addPokemon(oddish);
            humedal.addPokemon(squirtle);
            humedal.addPokemon(pidgey);
            humedal.addPokemon(geodude);
            humedal.addPokemon(pikachu);
            humedal.addPokemon(articuno);
            humedal.addPokemon(charmander);
            humedal.addPokemon(machop);
            humedal.addPokemon(mew);
            humedal.addPokemon(ekans);
            humedal.addPokemon(haunter);
        });
    }

    @Test
    public void testPruebaAddPokemonIncorrectoLava(){

        assertThrows(HabitatNoPermitePokemon.class, () -> {
            Lava lava = new Lava();

            Pokemon squirtle = new Pokemon(DetallePokemon.SQUIRTLE);
            Pokemon oddish = new Pokemon(DetallePokemon.ODDISH);
            Pokemon pidgey = new Pokemon(DetallePokemon.PIDGEY);
            Pokemon geodude = new Pokemon(DetallePokemon.GEODUDE);
            Pokemon pikachu = new Pokemon(DetallePokemon.PIKACHU);
            Pokemon articuno = new Pokemon(DetallePokemon.ARTICUNO);
            Pokemon lotad = new Pokemon(DetallePokemon.LOTAD);
            Pokemon charmander = new Pokemon(DetallePokemon.CHARMANDER);
            Pokemon machop = new Pokemon(DetallePokemon.MACHOP);
            Pokemon mew = new Pokemon(DetallePokemon.MEW);
            Pokemon ekans = new Pokemon(DetallePokemon.EKANS);
            Pokemon haunter = new Pokemon(DetallePokemon.HAUNTER);

            lava.addPokemon(oddish);
            lava.addPokemon(squirtle);
            lava.addPokemon(pidgey);
            lava.addPokemon(geodude);
            lava.addPokemon(pikachu);
            lava.addPokemon(articuno);
            lava.addPokemon(lotad);
            lava.addPokemon(machop);
            lava.addPokemon(mew);
            lava.addPokemon(ekans);
            lava.addPokemon(haunter);
        });
    }

    @Test
    public void testPruebaAddPokemonIncorrectoLucha(){

        assertThrows(HabitatNoPermitePokemon.class, () -> {
            Lucha lucha = new Lucha();

            Pokemon squirtle = new Pokemon(DetallePokemon.SQUIRTLE);
            Pokemon oddish = new Pokemon(DetallePokemon.ODDISH);
            Pokemon pidgey = new Pokemon(DetallePokemon.PIDGEY);
            Pokemon geodude = new Pokemon(DetallePokemon.GEODUDE);
            Pokemon pikachu = new Pokemon(DetallePokemon.PIKACHU);
            Pokemon articuno = new Pokemon(DetallePokemon.ARTICUNO);
            Pokemon lotad = new Pokemon(DetallePokemon.LOTAD);
            Pokemon charmander = new Pokemon(DetallePokemon.CHARMANDER);
            Pokemon machop = new Pokemon(DetallePokemon.MACHOP);
            Pokemon mew = new Pokemon(DetallePokemon.MEW);
            Pokemon ekans = new Pokemon(DetallePokemon.EKANS);
            Pokemon haunter = new Pokemon(DetallePokemon.HAUNTER);

            lucha.addPokemon(oddish);
            lucha.addPokemon(squirtle);
            lucha.addPokemon(pidgey);
            lucha.addPokemon(geodude);
            lucha.addPokemon(pikachu);
            lucha.addPokemon(articuno);
            lucha.addPokemon(lotad);
            lucha.addPokemon(charmander);
            lucha.addPokemon(mew);
            lucha.addPokemon(ekans);
            lucha.addPokemon(haunter);
        });
    }

    @Test
    public void testPruebaAddPokemonIncorrectoPrado(){

        assertThrows(HabitatNoPermitePokemon.class, () -> {
            Prado prado = new Prado();

            Pokemon squirtle = new Pokemon(DetallePokemon.SQUIRTLE);
            Pokemon oddish = new Pokemon(DetallePokemon.ODDISH);
            Pokemon pidgey = new Pokemon(DetallePokemon.PIDGEY);
            Pokemon geodude = new Pokemon(DetallePokemon.GEODUDE);
            Pokemon pikachu = new Pokemon(DetallePokemon.PIKACHU);
            Pokemon articuno = new Pokemon(DetallePokemon.ARTICUNO);
            Pokemon lotad = new Pokemon(DetallePokemon.LOTAD);
            Pokemon charmander = new Pokemon(DetallePokemon.CHARMANDER);
            Pokemon machop = new Pokemon(DetallePokemon.MACHOP);
            Pokemon mew = new Pokemon(DetallePokemon.MEW);
            Pokemon ekans = new Pokemon(DetallePokemon.EKANS);
            Pokemon haunter = new Pokemon(DetallePokemon.HAUNTER);

            prado.addPokemon(oddish);
            prado.addPokemon(squirtle);
            prado.addPokemon(pidgey);
            prado.addPokemon(geodude);
            prado.addPokemon(pikachu);
            prado.addPokemon(articuno);
            prado.addPokemon(lotad);
            prado.addPokemon(charmander);
            prado.addPokemon(machop);
            prado.addPokemon(ekans);
            prado.addPokemon(haunter);
        });
    }

    @Test
    public void testPruebaAddPokemonIncorrectoSetas(){

        assertThrows(HabitatNoPermitePokemon.class, () -> {
            Setas setas = new Setas();

            Pokemon squirtle = new Pokemon(DetallePokemon.SQUIRTLE);
            Pokemon oddish = new Pokemon(DetallePokemon.ODDISH);
            Pokemon pidgey = new Pokemon(DetallePokemon.PIDGEY);
            Pokemon geodude = new Pokemon(DetallePokemon.GEODUDE);
            Pokemon pikachu = new Pokemon(DetallePokemon.PIKACHU);
            Pokemon articuno = new Pokemon(DetallePokemon.ARTICUNO);
            Pokemon lotad = new Pokemon(DetallePokemon.LOTAD);
            Pokemon charmander = new Pokemon(DetallePokemon.CHARMANDER);
            Pokemon machop = new Pokemon(DetallePokemon.MACHOP);
            Pokemon mew = new Pokemon(DetallePokemon.MEW);
            Pokemon ekans = new Pokemon(DetallePokemon.EKANS);
            Pokemon haunter = new Pokemon(DetallePokemon.HAUNTER);

            setas.addPokemon(oddish);
            setas.addPokemon(squirtle);
            setas.addPokemon(pidgey);
            setas.addPokemon(geodude);
            setas.addPokemon(pikachu);
            setas.addPokemon(articuno);
            setas.addPokemon(lotad);
            setas.addPokemon(charmander);
            setas.addPokemon(machop);
            setas.addPokemon(mew);
            setas.addPokemon(haunter);
        });
    }

    @Test
    public void testPruebaAddPokemonIncorrectoSiniestro(){

        assertThrows(HabitatNoPermitePokemon.class, () -> {
            Siniestro siniestro = new Siniestro();

            Pokemon squirtle = new Pokemon(DetallePokemon.SQUIRTLE);
            Pokemon oddish = new Pokemon(DetallePokemon.ODDISH);
            Pokemon pidgey = new Pokemon(DetallePokemon.PIDGEY);
            Pokemon geodude = new Pokemon(DetallePokemon.GEODUDE);
            Pokemon pikachu = new Pokemon(DetallePokemon.PIKACHU);
            Pokemon articuno = new Pokemon(DetallePokemon.ARTICUNO);
            Pokemon lotad = new Pokemon(DetallePokemon.LOTAD);
            Pokemon charmander = new Pokemon(DetallePokemon.CHARMANDER);
            Pokemon machop = new Pokemon(DetallePokemon.MACHOP);
            Pokemon mew = new Pokemon(DetallePokemon.MEW);
            Pokemon ekans = new Pokemon(DetallePokemon.EKANS);
            Pokemon haunter = new Pokemon(DetallePokemon.HAUNTER);

            siniestro.addPokemon(oddish);
            siniestro.addPokemon(squirtle);
            siniestro.addPokemon(pidgey);
            siniestro.addPokemon(geodude);
            siniestro.addPokemon(pikachu);
            siniestro.addPokemon(articuno);
            siniestro.addPokemon(lotad);
            siniestro.addPokemon(charmander);
            siniestro.addPokemon(machop);
            siniestro.addPokemon(mew);
            siniestro.addPokemon(ekans);
        });
    }

    @Test
    public void testPruebaPermiteComida(){
        Agua agua = new Agua();

        Frambu frambu = new Frambu();
        Latano latano = new Latano();
        Pinia pinia = new Pinia();
        Pokocho pokocho = new Pokocho();

        assertTrue(agua.permiteComida(pinia));
        assertFalse(agua.permiteComida(latano));
        assertFalse(agua.permiteComida(frambu));
        assertFalse(agua.permiteComida(pokocho));

    }
}
