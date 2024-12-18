package BBDD;

import java.util.Scanner;

public class PrincipalInsertPersona {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        PersonaRepoNueva repo = new PersonaRepoNueva();
        Persona p = new Persona(sc.nextLine(), sc.nextLine(), sc.nextInt());
        repo.insertar(p);
        sc.close();
    }
}
