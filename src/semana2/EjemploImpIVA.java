package semana2;

import java.util.Scanner;

public class EjemploImpIVA {

    public static void main(String[] args) {

        System.out.println("Importe de la factura: ");
        Scanner sc = new Scanner(System.in);
        int importe = sc.nextInt();
        System.out.println(importe);
        double importeIVA = importe * 1.21;
        System.out.println("Importe con IVA: " + importeIVA);
        double importeReten = importe * 0.15;
        System.out.println("Retencion = " + importeReten);
        sc.close();
    }

}
