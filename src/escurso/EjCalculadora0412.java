package escurso;

import newpaqxqsi.Calculadora;
import java.util.Scanner;

public class EjCalculadora0412 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Calculadora c = new Calculadora(sc.nextDouble(), sc.nextDouble());
        System.out.println("Resta = " + c.Subs());
        System.out.println("Suma = " + c.Plus());
        System.out.println("Multiplicación = " + c.By());
        System.out.println("División = " + c.Div());
        sc.close();
    }

}
