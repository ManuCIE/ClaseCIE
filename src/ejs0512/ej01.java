package ejs0512;

//array con textos o cadenas > imprimir la cadena de mayor longitud
public class ej01 {

    public static void main(String[] args) {

        String[] frases = new String[] { "¿Hola qué tal?", "Bien, ¿y tú?", "Ahí andamos." };
        int i = 0;
        int letras = 0;
        int posicion = 0;
        while (i < frases.length) {

            System.out.println(frases[i]);
            System.out.println(frases[i].length());

            if (letras < frases[i].length()) {
                letras = frases[i].length();
                posicion = i;
            }
            i++;
        }

        System.out.println("Mayor nº de letras: " + letras);
        System.out.println("La palabra es: : " + frases[posicion]);
    }
}
