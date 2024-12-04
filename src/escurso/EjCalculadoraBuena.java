package escurso;

import java.util.Scanner;

import newpaqxqsi.CalculadoraBuena;

public class EjCalculadoraBuena {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Numero 1: ");
        double n1 = sc.nextDouble();
        System.out.println("Numero 2: ");
        double n2 = sc.nextDouble();
        System.out.println("La suma es = " + CalculadoraBuena.sumar(n1, n2));
        System.out.println("La resta es = " + CalculadoraBuena.restar(n1, n2));
        System.out.println("La división es = " + CalculadoraBuena.div(n1, n2));
        System.out.println("La multiplicación es = " + CalculadoraBuena.mult(n1, n2));
        System.out.println(Math.pow(n1, n2));
        sc.close();
    }
}
