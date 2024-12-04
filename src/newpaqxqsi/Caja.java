package newpaqxqsi;

public class Caja {

    private double largo;
    private double alto;
    private double fondo;

    public double getLargo() {
        return largo;
    }

    public void setLargo(double largo) {
        this.largo = largo;
    }

    public double getAlto() {
        return alto;
    }

    public void setAlto(double alto) {
        this.alto = alto;
    }

    public double getFondo() {
        return fondo;
    }

    public void setFondo(double fondo) {
        this.fondo = fondo;
    }

    public Caja(double largo, double alto, double fondo) {
        this.largo = largo;
        this.alto = alto;
        this.fondo = fondo;
    }

    public double Volumen() {

        return largo * alto * fondo;
    }

    public double Litros() {
        return Volumen() / 1000;
    }

}
