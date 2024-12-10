package PruebaDia09;

import java.util.Scanner;

public class Ej03ordenador {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean ordenador = false;
        String estado = "";
        if (ordenador != false) {
            estado = "encendido.";
        } else
            estado = "apagado.";
        System.out.println("El ordenador está " + estado);
        System.out.println("Introduzca 0 para apagar o cualquier otro nº para encender:");
        int boton = sc.nextInt();
        if (boton != 0) {
            estado = "encendido";

        } else
            estado = "apagado";

        System.out.println("Has " + estado + " el ordenador.");
        sc.close();
    }
}
