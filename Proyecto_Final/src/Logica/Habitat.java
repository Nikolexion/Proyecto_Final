package Logica;

import java.util.ArrayList;

public class Habitat {
    private ArrayList<String> aceptaPkmn;
    public Habitat() {
        aceptaPkmn = new ArrayList<>();
    }
    public void addPkmn(String[] nuevoPkmn){
        for (int i = 0; i < nuevoPkmn.length; i++){
            aceptaPkmn.add(nuevoPkmn[i]);
        }
    }
    public boolean aceptaPkmn(String pkmn){
        for (int i = 0; i < aceptaPkmn.size(); i++){
            if (pkmn.equals(aceptaPkmn.get(i))){
                return true;
            }
        }
        return false;
    }
}
