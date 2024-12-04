package semana2;

import java.util.Scanner;

import escurso.Bombilla;

//REVISARRR!!!!!

public class Potbombilla {
    public static void main(String[] args) {
        Bombilla b = new Bombilla();
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce intensidad: ");
        int numero = sc.nextInt();
        b.setPwr(numero);
        System.out.println("La intensidad de la bombilla es: " + b.getPwr());
        b.increase();
        if (b.getPwr() == 3) {
            System.out.println("Intensidad máxima.");
        } else {
            System.out.println("Intensidad incrementada: " + b.getPwr());
        }
        b.decrease();
        if (b.getPwr() == 0) {
            System.out.println("Intensidad mínima.");
        } else {
            System.out.println("Intensidad disminuida: " + b.getPwr());
        }
        sc.close();
    }
}