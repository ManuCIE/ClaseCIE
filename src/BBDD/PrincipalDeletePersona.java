package BBDD;

import java.util.Scanner;

public class PrincipalDeletePersona {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        PersonaRepoNueva repo = new PersonaRepoNueva();
        Persona p = new Persona(sc.nextLine());
        repo.delete(p);
        sc.close();
    }
}
