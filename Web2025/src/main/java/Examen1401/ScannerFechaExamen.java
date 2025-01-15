package Examen1401;

import java.util.Calendar;
import java.util.Scanner;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.text.ParseException;

public class ScannerFechaExamen {
	public static void main(String[] args) {
		System.out.println("Introduzca su fecha de nacimiento (formato dd-MM-yyyy):");
		Scanner sc = new Scanner(System.in);
		String f = sc.next();
		SimpleDateFormat ff = new SimpleDateFormat("dd-MM-yyyy");
		Calendar calendario = Calendar.getInstance();
		try {
			Date fecha = ff.parse(f);

			calendario.setTime(fecha);

			int año = calendario.get(Calendar.YEAR);

			System.out.println("Fecha ingresada: " + fecha);
			System.out.println("Año de nacimiento: " + año);
		} catch (ParseException e) {

			System.out.println("Error: El formato de la fecha es incorrecto.");
		} finally {
			sc.close();
		}
		
		//SELECT * FROM Libro Where Autor = 'AquiPonesElAutorQueQuieresBuscar';
	}
}
