package BBDD;

import java.util.ArrayList;

public class PrincipalFRepoArray {

    public static void main(String[] args) {

        FacturaRepoOk repo = new FacturaRepoOk();

        ArrayList<Factura> lista = repo.buscarTodos();

        for (Factura f : lista) {
            System.out.println();
            System.out.println("************");
            System.out.println();
            System.out.println("Nº Fact: " + f.getNumFact());
            System.out.println("Concepto: " + f.getConcepto());
            System.out.println("Importe = " + f.getImporte());

        }

    }

}