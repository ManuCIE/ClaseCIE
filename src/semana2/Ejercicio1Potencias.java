package semana2;

import java.util.Scanner;

public class Ejercicio1Potencias {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double n = 0;
        double potencia = 0;
        System.out.println("Introduzca la potencia: ");
        double elevado = sc.nextInt();
        while (n < 10) {
            n++;
            potencia = Math.pow(n, elevado);
            System.out.println("La potencia de " + n + " elevado a " + elevado + " es: " + potencia);

        }
        sc.close();
    }

}