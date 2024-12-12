package ComposicionHerencia;

import java.util.ArrayList;

public class TuristaVerdad extends SuperTurista {

    private ArrayList<Maleta> maletas = new ArrayList<Maleta>();

    public ArrayList<Maleta> getMaletas() {
        return maletas;
    }

    public void setMaletas(ArrayList<Maleta> maletas) {
        this.maletas = maletas;
    }

    public TuristaVerdad(String nombre) {
        this.setNombre(nombre);
    }

    public void addMaleta(Maleta maletita) {
        maletas.add(maletita);

    }

}
