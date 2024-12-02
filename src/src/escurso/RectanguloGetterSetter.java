package escurso;

public class RectanguloGetterSetter {

    private double l;
    private double l2;

    public double getL() {
        return l;
    }

    public void setL(double l) {
        if (l>0)
        this.l = l;
    }

    public double getL2() {
        return l2;
    }

    public void setL2(double l2) {
        if (l>0)
        this.l2 = l2;
    }

    public double calcularArea() {
        return l * l2;
    }

    public double calcularPeri() {

        return 2*l + 2*l2;
    }

}
