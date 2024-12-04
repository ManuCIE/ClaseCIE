package semana2;

import java.util.Scanner;

import escurso.Cuadrado;

public class EjCuadrado {
    public static void main(String[] args) {

        Cuadrado lado = new Cuadrado();
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce valor para lado del cuadrado: ");
        double l = sc.nextInt();
        lado.setL1(l);
        double area = lado.getL1() * lado.getL2();
        System.out.println("Los lados del cuadrado son: " + lado.getL1() + " y " + lado.getL2());
        System.out.println("El área del cuadrado es: " + area);
        sc.close();
    }
}
