package escurso;

import newpaqxqsi.Caja;
import java.util.Scanner;

public class EjCaja0412 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca Alto, Largo y Fondo en cm: ");
        Caja c = new Caja(sc.nextDouble(), sc.nextDouble(), sc.nextDouble());
        System.out.println("El volumen del prisma es: ");
        System.out.print(c.Volumen() + " cm^3 ó " + c.Litros() + " litros");
        sc.close();
    }

}
