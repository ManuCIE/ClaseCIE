package semana2;

import escurso.Rectangulo;

public class EjemploRectanguloArray {

    public static void main(String[] args) {

        Rectangulo r = new Rectangulo();
        Rectangulo r2 = new Rectangulo();
        Rectangulo r3 = new Rectangulo();
        r.l = 12;
        r.l2 = 18;
        r2.l = 15;
        r2.l2 = 18;
        r3.l = 5;
        r3.l2 = 8;
        double sumarea = 0;
        Rectangulo[] lista = new Rectangulo[] { r, r2, r3 };
        for (int i = 0; i < lista.length; i++) {
            System.out.println("El área del Rectángulo es = " + lista[i].calcularArea());
            System.out.println("El perímetro del Rectángulo es = " + lista[i].calcularPeri());
            sumarea = sumarea + lista[i].calcularArea();

        }
        System.out.println("La suma de todas las áreas es = " + sumarea);
    }

}
