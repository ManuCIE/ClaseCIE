package semana2;

import escurso.Factura;

public class PrincipalFactura {
    public static void main(String[] args) {

        Factura f = new Factura();
        f.importe = 100;
        System.out.println(f.importe);
        System.out.println(f.calcularIVA());
        System.out.println(f.calcularconIVA());
    }

}
