package Examen1401;

import java.util.ArrayList;

public class ArrayList010Examen {
	public static void main(String[] args) {

		ArrayList<Integer> notas = new ArrayList<Integer>();
		notas.add(10);
		notas.add(8);
		notas.add(7);
		notas.add(2);
		notas.add(9);
		notas.add(4);
		notas.add(6);

		int numpass = 0;
		int bruto = 0;
		int media = 0;

		for (int i = 0; i < notas.size(); i++) {

			if (notas.get(i) >= 5) {
				numpass++;
				bruto = bruto + notas.get(i);
				media = bruto / numpass;
			} else {
				
			}
			System.out.println("Nº niños aprobados: " + numpass);
		}
		System.out.println("La media es: " + media);
	}

}
