package semana2;

import escurso.Cpersona;

public class Principal {
    public static void main(String[] args) {
        Cpersona p1 = new Cpersona();
        p1.edad = 50;
        p1.nombre = "Cecilio";

        Cpersona p2 = new Cpersona();
        p2.edad = 1;
        p2.nombre = "Catalina";

        // es un array así que llevará corchetes []
        // Cpersona[] lista (o el nombre que quieras) = new (nueva estructura)
        // Cpersona[]
        // y ahora entre llaves las variables que queremos que formen parte del Array
        // que hemos creado {}

        Cpersona[] lista = new Cpersona[] { p1, p2 };

        for (int i = 0; i < lista.length; i++) {
            System.out.println("Nombre: " + lista[i].nombre);
            System.out.println("Edad: " + lista[i].edad);

        }
        System.out.println("***********************************");
        int suma = 0;
        for (int i = 0; i < lista.length; i++) {
            suma = suma + lista[i].edad;

        }
        System.out.println("La edad total es = " + suma);
        System.out.println("La media de edades es = " + suma / lista.length);
    }
}