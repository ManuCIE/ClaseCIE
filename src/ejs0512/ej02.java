package ejs0512;

import java.util.Scanner;

public class ej02 {
    public static void main(String[] args) {
        // crear una clase Alumno con propiedad nota
        // Nota es int
        // Constructor recibe nota
        // Creamos un método que imprime Suspenso Aprobado Bien Notable o Sobresaliente
        // Metodoes imprimirnota

        Scanner sc = new Scanner(System.in);

        Nota n = new Nota(sc.nextInt());
        System.out.println(n.getNota());
        System.out.println(n.txtnota);
        sc.close();
    }

}
