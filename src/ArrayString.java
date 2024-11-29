public class ArrayString {
    public static void main(String[] args) {

        String[] lista = new String[] { "Hola", "qué", "tal", "estás", "?" };
        for (int i = 0; i < lista.length; i++) {

            for (int j = 0; j < lista[i].length(); j++) {
                char caracter = lista[i].charAt(j);
                System.out.println(caracter);
            }
        }

    }
}
