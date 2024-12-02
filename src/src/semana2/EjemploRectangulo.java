package semana2;

import escurso.Rectangulo;

public class EjemploRectangulo {

    public static void main(String[] args) {

        Rectangulo r = new Rectangulo();
        r.l = 12.5;
        r.l2 = 18.7;
        System.out.println(r.calcularArea());
        System.out.println(r.calcularPeri());
    }

}
