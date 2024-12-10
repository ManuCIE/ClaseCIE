package PruebaDia09;

public class Ej05 {

    public static void main(String[] args) {

        int[] numeros = new int[] { 32, 140, 20, 620, 82 };
        int numerogrande = 0;
        for (int i = 0; i < numeros.length; i++) {
            if (numerogrande < numeros[i])
                numerogrande = numeros[i];
            System.out.println(numeros[i]);

        }
        System.out.println("El nº más grande del Array es: " + numerogrande);

    }

}
