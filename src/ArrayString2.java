public class ArrayString2 {
    public static void main(String[] args) {

        String cadena = "Hola qué x tal estás";
        System.out.println("Frase: " + cadena);
        int consonantes = 0;
        int vocales = 0;
        for (int i = 0; i < cadena.length(); i++) {
            if (cadena.charAt(i) == 'a' || cadena.charAt(i) == 'á' || cadena.charAt(i) == 'e' || cadena.charAt(i) == 'é'
                    || cadena.charAt(i) == 'i' || cadena.charAt(i) == 'í'
                    || cadena.charAt(i) == 'o' || cadena.charAt(i) == 'ó' || cadena.charAt(i) == 'u'
                    || cadena.charAt(i) == 'ú'

            ) {
                vocales++;
            } else if (cadena.charAt(i) != ' ')
                ;
            consonantes++;
        }

        System.out.println("Vocales = " + vocales);
        System.out.println("Consonantes = " + consonantes);
    }
}
