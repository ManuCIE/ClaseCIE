package escurso;

import java.util.Scanner;
import newpaqxqsi.Factura;

public class EjFactura0412 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca Nº Factura e Importe: ");
        Factura f = new Factura(sc.nextDouble(), sc.nextDouble());
        System.out.print("Nº Factura: ");
        System.out.println(f.getnF());
        System.out.print("Importe: ");
        System.out.println(f.getImporte());
        System.out.print("PVP: ");
        System.out.println(f.PVP());
        System.out.print("IVA: ");
        System.out.println(f.IVA());        
        sc.close();
    }
}