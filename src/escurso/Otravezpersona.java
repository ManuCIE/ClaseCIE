package escurso;

import newpaqxqsi.Persona;

public class Otravezpersona {
    public static void main(String[] args) {

        Persona p = new Persona("Pedro", 10);
        Persona p2 = new Persona("Nuño", 20);

        System.out.println(p.getNombre());
        System.out.println(p.getEdad());

        System.out.println(p2.getNombre());
        System.out.println(p2.getEdad());
    }
}
