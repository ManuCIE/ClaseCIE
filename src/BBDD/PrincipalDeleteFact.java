package BBDD;

import java.util.Scanner;

public class PrincipalDeleteFact {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        FacturaRepoNueva repo = new FacturaRepoNueva();
        Factura f = new Factura(sc.nextInt());
        repo.delete(f);
        sc.close();
    }
}
