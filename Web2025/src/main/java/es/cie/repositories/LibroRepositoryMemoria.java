package es.cie.repositories;

import java.util.ArrayList;
import java.util.List;

import es.cie.negocio.Libro;

public class LibroRepositoryMemoria implements LibroRepository {

	private static List<Libro> lista = new ArrayList<Libro>();

	static {
		lista.add(new Libro("1", "Mano del mono de jade", "Bugra Elipson", 237));
		lista.add(new Libro("2", "Cumbres Borrascosas", "Emily Brontë", 763));
		lista.add(new Libro("3", "Ruen The Demon", "Anna Faris", 401));
		lista.add(new Libro("4", "Peppa Pig: Charcos Pisados", "Lily Lougirth", 63));
		lista.add(new Libro("5", "El problema de los tres cuerpos", "Elque Loescribió", 559));
		lista.add(new Libro("6", "Nacidos de la Bruma: El Imperio Final", "Brandon Sanderson", 763));
		lista.add(new Libro("7", "Noches Blancas", "Feódor Dostoievsky", 237));
	}

	@Override
	public List<Libro> buscarTodos() {
		return lista;
	}

	@Override
	public List<Libro> buscarPorTitulo(String titulo) {

		List<Libro> listaNueva = new ArrayList<Libro>();
		for (Libro l : lista) {
			String tituloLibro = l.getTitulo();
			if (tituloLibro.toLowerCase().contains(titulo.toLowerCase())) {
				listaNueva.add(l);
			}
		}
		return listaNueva;

	}

	@Override
	public List<Libro> buscarPorAutor(String autor) {

		List<Libro> listaNueva = new ArrayList<Libro>();
		for (Libro l : lista) {
			String autorLibro = l.getAutor();
			if (autorLibro.toLowerCase().contains(autor.toLowerCase())) {
				listaNueva.add(l);
			}
		}
		return listaNueva;
	}
}
