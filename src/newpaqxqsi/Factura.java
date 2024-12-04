package newpaqxqsi;

public class Factura {
    private double nF;
    private double importe;

    public double getnF() {
        return nF;
    }

    public void setnF(double nF) {
        this.nF = nF;
    }

    public double getImporte() {
        return importe;
    }

    public void setImporte(double importe) {
        this.importe = importe;
    }

    public Factura(double nF, double importe) {
        this.nF = nF;
        this.importe = importe;
    }

    public double PVP() {
        return importe * 1.21;
    }

    public double IVA() {
        return PVP() - importe;
    }
}
