package escurso;

public class Factura {

    public double importe;

    public double calcularIVA() {
        return importe * 0.21;
    }

    public double calcularconIVA() {
        return importe * 1.21;
    }

}
