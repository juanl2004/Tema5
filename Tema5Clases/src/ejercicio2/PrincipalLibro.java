package ejercicio2;

public class PrincipalLibro {

	public static void main(String[] args) {

		// Creamos un objeto Libro con paramentros de entrada.
		Libro libr = new Libro("Harry Potter y la Piedra Filosofal", "J.K. Rowling", 1, 0);

		// Realizamos un préstamo.
		System.out.println("Intentando realizar un préstamo...");
		if (libr.prestamo()) {
			System.out.println("Préstamo realizado con éxito.");
		} else {
			System.out.println("No se pudo realizar el préstamo. No hay ejemplares disponibles.");
		}
		System.out.println();

		// Devolvemos un ejemplar.
		System.out.println("Intentando devolver un ejemplar...");
		if (libr.devolucion()) {
			System.out.println("Devolución realizada con éxito.");
		} else {
			System.out.println("No se pudo realizar la devolución. No hay ejemplares prestados.");
		}
		System.out.println();

		// Mostramos la información del libro después de realizar las operaciones.
		System.out.println("Información actualizada del libro:");
		System.out.println("Título: " + libr.getTitulo());
		System.out.println("Autor: " + libr.getAutor());
		System.out.println("Ejemplares disponibles: " + libr.getEjemplaresL());
		System.out.println("Ejemplares prestados: " + libr.getEjemplaresP());

	}

}
