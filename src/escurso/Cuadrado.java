package escurso;

public class Cuadrado {

    private double lado;
   
    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }
    public double getLado2() {
        return lado;
    }

    public void setLado2(double lado) {
        this.lado = lado;
    }

    public Cuadrado(double lado) {
        this.lado = lado;
    }

    public double area() {
        return lado * lado;
    }

}
