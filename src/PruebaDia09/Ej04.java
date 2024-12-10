package PruebaDia09;

public class Ej04 {
    public static void main(String[] args) {
        String frase = "Hola me llamo Pepe y soy informático.";
        System.out.println("Frase: " + frase);
        int letrae = 0;
        for (int i = 0; i < frase.length(); i++) {
            if (frase.charAt(i) == 'e') {
                letrae++;
            }

        }
        System.out.println("Nº de letras 'e' = " + letrae);
    }
}
