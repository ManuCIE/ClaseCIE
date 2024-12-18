package BBDD;

public class Factura {

    private int numFact;
    private double importe;
    private String concepto;

    public int getNumFact() {
        return numFact;
    }

    public void setNumFact(int numFact) {
        this.numFact = numFact;
    }

    public double getImporte() {
        return importe;
    }

    public void setImporte(double importe) {
        this.importe = importe;
    }

    public String getConcepto() {
        return concepto;
    }

    public void setConcepto(String concepto) {
        this.concepto = concepto;
    }

    public Factura(int numFact, String concepto, double importe) {
        this.numFact = numFact;
        this.concepto = concepto;
        this.importe = importe;

    }

    public Factura(int numFact) {
        this.numFact = numFact;
    }

}
