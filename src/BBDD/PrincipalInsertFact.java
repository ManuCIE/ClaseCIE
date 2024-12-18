package BBDD;

import java.util.Scanner;

public class PrincipalInsertFact {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        FacturaRepoNueva repo = new FacturaRepoNueva();
        Factura f = new Factura(sc.nextInt(), sc.next(), sc.nextDouble());
        repo.insertar(f);
        sc.close();
    }
}
