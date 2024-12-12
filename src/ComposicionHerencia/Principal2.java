package ComposicionHerencia;

import java.util.ArrayList;

public class Principal2 {
    public static void main(String[] args) {

        Turista t1 = new Turista("Leorio");

        Maleta m1 = new Maleta("Samsonite", 35);
        Maleta m2 = new Maleta("Benzi", 18);
        t1.setMaleta(m1);
        t1.setMaleta2(m2);

        System.out.println("Turista: " + t1.getNombre() + ".");
        System.out.println("Maleta: " + m1.getPeso() + ". Peso: " + m1.getPeso() + ".");
        System.out.println("Maleta: " + m2.getModelo() + ". Peso: " + m2.getPeso() + ".");
        System.out.println("El peso total es: " + t1.sumaPeso() + ".");

        System.out.println(t1.sumaPeso(4));
        System.out.println(t1.sumaPeso("ligera"));

        TuristaVerdad tVip = new TuristaVerdad("Ganondorf");
        Maleta mVip = new Maleta("CHANEL", 40);
        Maleta mVip2 = new Maleta("LV", 23);
        Maleta mVip3 = new Maleta("KENZO", 18);
        tVip.addMaleta(mVip);
        tVip.addMaleta(mVip2);
        tVip.addMaleta(mVip3);

        ArrayList<Maleta> maletas = tVip.getMaletas();

        System.out.println("Turista:" + (tVip.getNombre()));
        for (int i = 0; i < maletas.size(); i++) {
            Maleta mPantalla = maletas.get(i);
            System.out.println("Marca: " + mPantalla.getModelo() + ". Peso: " + mPantalla.getPeso());

        }
        System.out.println("Impresión mismo recorrido del ArrayList con bucle 'for each':");
        //for each: para Clase Maleta recorre su contenido en 'maletas':
        for (Maleta m : maletas) {
            System.out.println("Marca: " + m.getModelo() + ". Peso: " + m.getPeso());
        }

    }

}
