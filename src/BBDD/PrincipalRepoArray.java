package BBDD;

import java.util.ArrayList;

public class PrincipalRepoArray {

    public static void main(String[] args) {

        PersonaRepoOk repo = new PersonaRepoOk();

        ArrayList<Persona> lista = repo.buscarTodos();

        for (Persona p : lista) {

            System.out.println(p.getNombre());
            System.out.println(p.getApellidos());
            System.out.println(p.getEdad());

        }

    }

}