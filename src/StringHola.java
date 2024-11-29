public class StringHola {
    public static void main(String[] args) {

        String cadena = "Hello there!";
        System.out.println(cadena);
        System.out.println(cadena.length());
        System.out.println(cadena.charAt(0));
        // aqui arriba y abajo estamos sacando el primer char de 2 maneras diferentes
        char caracter1 = cadena.charAt(0);
        System.out.println(caracter1);
        // aqui sacamos todos los char
        for (int i = 0; i < cadena.length(); i++) {
            char allchars = cadena.charAt(i);
            System.out.print(allchars);

        }
        System.out.println(" ");
        System.out.println("********************");

        // aqui queremos sacar los char al revés
        for (int i = cadena.length() - 1; i >= 0; i--) {
            System.out.print(cadena.charAt(i));
        }

    }
}