package semana2;

public class Ejercicio2 {
    public static void main(String[] args) {
        String frase = "Hola amigos qué tal estás";
        System.out.println("Las vocales de la frase '" + frase + "', son: ");
        for (int i = 0; i < frase.length(); i++) {
            char letra = frase.charAt(i);
            if (letra == 'a' || letra == 'á' || letra == 'e' || letra == 'é' || letra == 'i' || letra == 'í'
                    || letra == 'o' || letra == 'ó' || letra == 'u' || letra == 'ú')
                System.out.print(letra + ", ");
        }
    }

}
