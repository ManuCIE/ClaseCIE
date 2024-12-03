package semana2;

public class Ejercicio2 {
    public static void main(String[] args) {
        String frase = "Hola amigos qué tal estás";
        System.out.println("Las vocales de la frase > " + frase + ", son: ");
        for (int i = 0; i < frase.length(); i++) {

            if (frase.charAt(i) == 'a' || frase.charAt(i) == 'á' || frase.charAt(i) == 'e' || frase.charAt(i) == 'é'
                    || frase.charAt(i) == 'o' || frase.charAt(i) == 'ó'
                    || frase.charAt(i) == 'u' || frase.charAt(i) == 'ú')
                System.out.print(frase.charAt(i) + ", ");
        }
    }

}
