package ejercicio2;

/**
 * Esta clase representa el flujo de libros en una biblioteca.
 */
public class Libro {

	/**
	 * Atributo para almacenar el titulo del libro.
	 */
	private String titulo = "";

	/**
	 * Atributo para almacenar el autor del libro.
	 */
	private String autor = "";

	/**
	 * Atributo que almacena el número de ejemplares del libro.
	 */
	private int ejemplaresL;

	/**
	 * Atributo que almacena el número de ejemplares del libro prestado.
	 */
	private int ejemplaresP;

	/**
	 * Constructor sin parámetros.
	 */
	public Libro() {

	}

	 /**
     * Constructor con parámetros.
     *
     * @param titulo      El título del libro.
     * @param autor       El autor del libro.
     * @param ejemplaresL El número total de ejemplares del libro.
     * @param ejemplaresP El número de ejemplares del libro prestado.
     */
	public Libro(String titulo, String autor, int ejemplaresL, int ejemplaresP) {
		this.titulo = titulo;
		this.autor = autor;
		this.ejemplaresL = ejemplaresL;
		this.ejemplaresP = ejemplaresP;
	}

	  /**
     * Obtiene el título del libro.
     *
     * @return El título del libro.
     */
    public String getTitulo() {
        return titulo;
    }

    /**
     * Establece el título del libro.
     *
     * @param titulo El título del libro.
     */
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    /**
     * Obtiene el autor del libro.
     *
     * @return El autor del libro.
     */
    public String getAutor() {
        return autor;
    }

    /**
     * Establece el autor del libro.
     *
     * @param autor El autor del libro.
     */
    public void setAutor(String autor) {
        this.autor = autor;
    }

    /**
     * Obtiene el número total de ejemplares del libro.
     *
     * @return El número total de ejemplares del libro.
     */
    public int getEjemplaresL() {
        return ejemplaresL;
    }

    /**
     * Establece el número total de ejemplares del libro.
     *
     * @param ejemplaresL El número total de ejemplares del libro.
     */
    public void setEjemplaresL(int ejemplaresL) {
        this.ejemplaresL = ejemplaresL;
    }

    /**
     * Obtiene el número de ejemplares del libro prestado.
     *
     * @return El número de ejemplares del libro prestado.
     */
    public int getEjemplaresP() {
        return ejemplaresP;
    }

    /**
     * Establece el número de ejemplares del libro prestado.
     *
     * @param ejemplaresP El número de ejemplares del libro prestado.
     */
    public void setEjemplaresP(int ejemplaresP) {
        this.ejemplaresP = ejemplaresP;
    }

    /**
     * Metodo que se encarga de realizar un préstamo de un ejemplar del libro.
     *
     * @return true si se ha realizado el préstamo, false si no se ha realizado.
     */
	public boolean prestamo() {
		boolean prestamo = false;

		// Comprobamos si hay ejemplares disponibles para prestar.
		if (ejemplaresL - ejemplaresP > 0) {
			// Significa que quedan ejemplares y se incrementa.
			ejemplaresP++;
			// Actualizamos el prestramo a true.
			prestamo = true;
		}

		// Devolvemos si se puede o no hacer el prestamo.
		return prestamo;
	}

	/**
     * Comprobamos si se puede devolver un ejemplar del libro prestado.
     *
     * @return true si se ha realizado la devolución, false si no se ha realizado.
     */
	public boolean devolucion() {
		boolean devolucion = false;

		// Comprobamos si hay ejemplares prestados que se pueden devolver.
		if (ejemplaresP > 0) {
			// Si es así, se decrementa en 1 para reflejar la devolución.
			ejemplaresP--;
			// Actualizamos devolución a true.
			devolucion = true;
		}
		// Devolvemos si se ha podido realizar la devolución o no.
		return devolucion;
	}
}
