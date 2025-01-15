package Examen1401;

import java.util.ArrayList;

public class ArrayListExamen {
	public static void main(String[] args) {
		ArrayList<String> frase = new ArrayList<String>();
		frase.add("Hola");
		frase.add("qué");
		frase.add("tal");
		frase.add("estás");

		for (int i = frase.size() - 1; i >= 0; i--) {
			System.out.println(frase.get(i));

		}

	}
}