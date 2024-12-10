package ejs0512;

//array con textos o cadenas > imprimir la cadena de mayor longitud
public class ej01GPT {

    public static void main(String[] args) {

        String[] frases = new String[] { "¿Hola qué tal?", "Bien, ¿y tú?", "Ahí andamos." };
        String fraseMasLarga = "";
        int longitudMaxima = 0;

        // Índice inicial
        int i = 0;

        // Bucle while para recorrer el array
        while (i < frases.length) {
            // Compara la longitud de la frase actual con la máxima longitud encontrada
            if (frases[i].length() > longitudMaxima) {
                fraseMasLarga = frases[i];
                longitudMaxima = frases[i].length();
            }
            i++; // Incrementa el índice
        }

        // Imprime la frase más larga
        System.out.println("La frase más larga es: " + fraseMasLarga);
    }
}