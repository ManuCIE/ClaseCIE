package semana2;

import escurso.Cuadrado;

import java.util.Scanner;

public class EjCuadrado {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Cuadrado c1 = new Cuadrado(sc.nextDouble());

        System.out.println(c1.area());

        sc.close();

    }
}
