package Logica;public class Main {
    public static void main(String[] args) {
        Habitat habitat = new Habitat();
        String[] pkmn = {"Pikachu", "Oddish", "Mudkip", "Lotad", "Charmander"};
        if (habitat.aceptaPkmn("Lotad")) {
            System.out.println("Pokemon aceptado");
        } else {
            System.out.println("Pokemon rechazado");
        }
    }
}
