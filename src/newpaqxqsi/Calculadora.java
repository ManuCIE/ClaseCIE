package newpaqxqsi;

public class Calculadora {

    private double a;
    private double b;

    public Calculadora(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double Plus() {
        return a + b;
    }

    public double Subs() {
        return a - b;
    }

    public double By() {
        return a * b;
    }

    public double Div() {
        return a / b;
    }
}
