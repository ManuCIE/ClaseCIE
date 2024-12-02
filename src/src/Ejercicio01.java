public class Ejercicio01 {
    public static void main(String[] args) {

        String frase = "La x marca el lugar";
        

        for (int i = 0; i < frase.length(); i++) {
            char caracter = frase.charAt(i);
            if (caracter == 'x') {
                System.out.println("La x está en la posición: " + i);
            }
        }

        // resolucion cecilio:
        for (int j = 0; j < frase.length(); j++) {
            if (frase.charAt(j) == 'x')
                System.out.println("La x está en la posición: " + j);
        }

    }
}
