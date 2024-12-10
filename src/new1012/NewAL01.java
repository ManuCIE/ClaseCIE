package new1012;

import java.util.ArrayList;

public class NewAL01 {

    public static void main(String[] args) {
        ArrayList<Integer> lista = new ArrayList<Integer>();
        lista.add(2);
        lista.add(8);
        lista.add(5);
        lista.add(6);
        lista.add(12);
        System.out.println(lista.get(0));
        System.out.println(lista);
        System.out.println(lista.size());

        for (int i = 0; i < lista.size(); i++) {
            System.out.println("Posición " + i + " de la lista es = " + lista.get(i));
        }
        int vMax = 0;
        for (int i = 0; i < lista.size(); i++) {

            if (vMax < lista.get(i)) {
                vMax = lista.get(i);
            }
        }

        System.out.println("El valor más alto es = " + vMax);

        System.out.println("La lista al revés: ");

        for (int i = lista.size() - 1; i >= 0; i--) {
            System.out.println(lista.get(i));
        }

    }

}
