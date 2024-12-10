package PruebaDia09;

public class Ej02 {

    public static void main(String[] args) {

        Double[] lista = new Double[] { 0.0, 2.0, 6.0, 3.0, 9.0 };
        int i = 0;
        double valor = 0;
        double suma = 0;
        while (i < lista.length) {
            valor = lista[i];
            System.out.println("Valor: " + valor);
            suma = lista[i] + suma;
            i++;
            System.out.println("Suma: " + suma);
        }

    }

}
