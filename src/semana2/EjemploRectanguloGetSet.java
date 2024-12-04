package semana2;

import escurso.RectanguloGetterSetter;

public class EjemploRectanguloGetSet {

    public static void main(String[] args) {

        RectanguloGetterSetter r = new RectanguloGetterSetter();
        RectanguloGetterSetter r2 = new RectanguloGetterSetter();
        RectanguloGetterSetter r3 = new RectanguloGetterSetter();
        r.setL(12);
        r.setL2(18);
        r2.setL(15);
        r2.setL2(18);
        r3.setL(5);
        r3.setL2(8);
        double sumarea = 0;
        RectanguloGetterSetter[] lista = new RectanguloGetterSetter[] { r, r2, r3 };
        for (int i = 0; i < lista.length; i++) {
            System.out.println("El área del Rectángulo es = " + lista[i].calcularArea());
            System.out.println("El perímetro del Rectángulo es = " + lista[i].calcularPeri());
            sumarea = sumarea + lista[i].calcularArea();

        }
        System.out.println("La suma de todas las áreas es = " + sumarea);
    }

}
